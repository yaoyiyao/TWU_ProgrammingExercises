/**
 * Created by Administrator on 2016/2/25.
 */
/**
 * Created by Administrator on 2016/2/24.
 */
import java.util.*;

public class Triangle {
    public static void main(String[] args){
//        drawHorizontalLine();
//        drawVerticalLine();
//        drawRightTriangle();
//        drawIsoscelesTriangle();
//        drawDiamond();
        drawDiamondWithName();
    }

    //draw a horizontal line
    public static void drawHorizontalLine(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of horizontal u want:");
        int asteriskNum = input.nextInt();
        for(int i=0;i<asteriskNum;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //draw a vertical line
    public static void drawVerticalLine(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of vertical u want:");
        int asteriskNum = input.nextInt();
        for(int i=0;i<asteriskNum;i++){
            System.out.println("*");
        }
    }

    //draw a right triangle
    public static void drawRightTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of triangle u want:");
        int asteriskNum = input.nextInt();
        for(int i=0;i<asteriskNum;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //draw isosceles triangle
    public static void drawIsoscelesTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of isosceles triangle u want:");
        int asteriskNum = input.nextInt();
        for(int i=0;i<asteriskNum;i++){
            for(int j=0;j<(asteriskNum-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //draw diamond
    public static void drawDiamond(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of diamond triangle u want:");
        int asteriskNum = input.nextInt();
        for(int i=0;i<(2*asteriskNum-1);i++) {
            if (i < asteriskNum) {
                for (int j = 0; j < (asteriskNum - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<=(i-asteriskNum+1);j++){
                    System.out.print(" ");
                }
                for(int k=0;k<(2*(asteriskNum-i)+3);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    //draw diamond with name
    public static void drawDiamondWithName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of diamond triangle u want:");
        int asteriskNum = input.nextInt();
        for(int i=0;i<(2*asteriskNum-1);i++) {
            if (i < asteriskNum-1) {
                for (int j = 0; j < (asteriskNum - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i == asteriskNum - 1){
                System.out.println("yxfeng");
            }
            else{
                for(int j=0;j<=(i-asteriskNum+1);j++){
                    System.out.print(" ");
                }
                for(int k=0;k<(2*(asteriskNum-i)+3);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

