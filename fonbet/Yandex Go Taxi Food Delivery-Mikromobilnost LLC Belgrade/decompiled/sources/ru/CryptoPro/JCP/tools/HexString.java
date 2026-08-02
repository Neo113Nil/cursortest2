package ru.CryptoPro.JCP.tools;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.w511;
import java.io.PrintStream;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes4.dex */
public class HexString {
    public static final char CHAR_COMMA = ',';
    public static final char CHAR_SPACE = ' ';
    public static final char CR = '\n';
    public static final char LF = '\r';
    public static final String STR_0x = "0x";
    public static final String STR_COMMA = ",";
    public static final String STR_CR = "\n\r";
    public static final String STR_SPACE = " ";
    public static final String STR_byte0x = "(byte)0x";
    public static final char[] CHARS_0x = {MoneyInputEditView.DEFAULT_VALUE, 'x'};
    public static final char[] CHARS_byte0x = {'(', 'b', 'y', 't', 'e', ')', MoneyInputEditView.DEFAULT_VALUE, 'x'};
    public static final char[] HEX = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] hex = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte decodeHexByte(String str) {
        char[] charArray = str.toCharArray();
        int hexDigit = getHexDigit(charArray[0]);
        if (hexDigit == -1) {
            w511.q();
            return (byte) 0;
        }
        int hexDigit2 = getHexDigit(charArray[1]);
        if (hexDigit2 != -1) {
            return (byte) ((hexDigit << 4) + hexDigit2);
        }
        w511.q();
        return (byte) 0;
    }

    public static byte[] decodeHexBytes(String str) {
        String[] split = str.split(" ");
        int length = split.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = decodeHexByte(split[i].trim());
        }
        return bArr;
    }

    public static byte[] decodeHexBytesNoSpaces(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 2;
            bArr[i] = decodeHexByte(str.substring(i2, i3));
            i++;
            i2 = i3;
        }
        return bArr;
    }

    public static int decodeHexInt(String str) {
        char[] charArray = str.toCharArray();
        if (charArray.length != 8) {
            w511.q();
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            int hexDigit = getHexDigit(charArray[i2]);
            if (hexDigit == -1) {
                w511.q();
                return 0;
            }
            i = (i << 4) + hexDigit;
        }
        return i;
    }

    public static int[] decodeHexInts(String str) {
        String[] split = str.split(" ");
        int length = split.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = decodeHexInt(split[i].trim());
        }
        return iArr;
    }

    public static int getHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - MoneyInputEditView.DEFAULT_VALUE;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static void printByteArray(PrintStream printStream, byte[] bArr) {
        printStream.getClass();
        int i = 0;
        while (i < (bArr.length >> 3)) {
            for (int i2 = 0; i2 < 8; i2++) {
                printHexByte(printStream, bArr[(i << 3) + i2]);
            }
            i++;
        }
        if ((bArr.length & 7) != 0) {
            for (int i3 = 0; i3 < (bArr.length & 7); i3++) {
                printHexByte(printStream, bArr[(i << 3) + i3]);
            }
        }
    }

    public static void printHexByte(PrintStream printStream, byte b) {
        char[] cArr = HEX;
        char c = cArr[(b >>> 4) & 15];
        char c2 = cArr[b & PKIBody._CCP];
        printStream.getClass();
    }

    public static void printIntArray(PrintStream printStream, int[] iArr) {
        printStream.getClass();
        for (int i = 0; i < (iArr.length >> 3); i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                toHex(iArr[(i << 3) + i2]);
            }
        }
    }

    public static void toHex(int[] iArr, int i, int i2, char[] cArr, int i3) {
        if (cArr.length < ((i2 * 9) + i3) - 1) {
            w511.q();
            return;
        }
        int i4 = 0;
        while (i4 < i2) {
            for (int i5 = 0; i5 < 8; i5++) {
                cArr[i3 + i5] = HEX[(iArr[i4 + i] >>> (28 - (i5 * 4))) & 15];
            }
            if (i4 < i2 - 1) {
                cArr[i3 + 8] = CHAR_SPACE;
            }
            i4++;
            i3 += 9;
        }
    }

    public static void toHexLow(int[] iArr, int i, int i2, char[] cArr, int i3) {
        if (cArr.length < ((i2 * 9) + i3) - 1) {
            w511.q();
            return;
        }
        int i4 = 0;
        while (i4 < i2) {
            for (int i5 = 0; i5 < 8; i5++) {
                cArr[i3 + i5] = hex[(iArr[i4 + i] >>> (28 - (i5 * 4))) & 15];
            }
            if (i4 < i2 - 1) {
                cArr[i3 + 8] = CHAR_SPACE;
            }
            i4++;
            i3 += 9;
        }
    }

    public static void toHexNoSpaces(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if (cArr.length < (i2 * 2) + i3) {
            w511.q();
            return;
        }
        int i4 = 0;
        while (i4 < i2) {
            char[] cArr2 = HEX;
            byte b = bArr[i4 + i];
            cArr[i3] = cArr2[(b >>> 4) & 15];
            cArr[i3 + 1] = cArr2[b & PKIBody._CCP];
            i4++;
            i3 += 2;
        }
    }

    public static String toHexNoSpaces(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        toHexNoSpaces(bArr, 0, bArr.length, cArr, 0);
        return new String(cArr);
    }

    public static String toHex(int i) {
        char[] cArr = new char[8];
        toHex(i, cArr, 0);
        return new String(cArr);
    }

    public static String toHexLow(int i) {
        char[] cArr = new char[8];
        toHexLow(i, cArr, 0);
        return new String(cArr);
    }

    public static String toHex(byte[] bArr) {
        if (bArr.length == 0) {
            return "NULL";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        toHex(bArr, 0, bArr.length, cArr, 0);
        return new String(cArr);
    }

    public static String toHexLow(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 3) - 1];
        toHexLow(bArr, 0, bArr.length, cArr, 0);
        return new String(cArr);
    }

    public static String toHex(byte[] bArr, int i, int i2) {
        char[] cArr = new char[(i2 * 3) - 1];
        toHex(bArr, i, i2, cArr, 0);
        return new String(cArr);
    }

    public static String toHexLow(byte[] bArr, int i, int i2) {
        char[] cArr = new char[(i2 * 3) - 1];
        toHexLow(bArr, i, i2, cArr, 0);
        return new String(cArr);
    }

    public static String toHex(int[] iArr) {
        if (iArr.length == 0) {
            return "NULL";
        }
        char[] cArr = new char[(iArr.length * 9) - 1];
        toHex(iArr, 0, iArr.length, cArr, 0);
        return new String(cArr);
    }

    public static String toHexLow(int[] iArr) {
        char[] cArr = new char[(iArr.length * 9) - 1];
        toHexLow(iArr, 0, iArr.length, cArr, 0);
        return new String(cArr);
    }

    public static String toHex(int[] iArr, int i, int i2) {
        char[] cArr = new char[(i2 * 9) - 1];
        toHex(iArr, i, i2, cArr, 0);
        return new String(cArr);
    }

    public static String toHexLow(int[] iArr, int i, int i2) {
        char[] cArr = new char[(i2 * 9) - 1];
        toHexLow(iArr, i, i2, cArr, 0);
        return new String(cArr);
    }

    public static void toHex(byte b, char[] cArr, int i) {
        if (cArr.length < i + 2) {
            w511.q();
            return;
        }
        char[] cArr2 = HEX;
        cArr[i] = cArr2[(b >>> 4) & 15];
        cArr[i + 1] = cArr2[b & PKIBody._CCP];
    }

    public static void toHexLow(byte b, char[] cArr, int i) {
        if (cArr.length < i + 2) {
            w511.q();
            return;
        }
        char[] cArr2 = hex;
        cArr[i] = cArr2[(b >>> 4) & 15];
        cArr[i + 1] = cArr2[b & PKIBody._CCP];
    }

    public static void toHex(int i, char[] cArr, int i2) {
        if (cArr.length < i2 + 8) {
            w511.q();
            return;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            cArr[i2 + i3] = HEX[i >>> 28];
            i <<= 4;
        }
    }

    public static void toHexLow(int i, char[] cArr, int i2) {
        if (cArr.length < i2 + 8) {
            w511.q();
            return;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            cArr[i2 + i3] = hex[i >>> 28];
            i <<= 4;
        }
    }

    public static void toHex(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if (cArr.length < ((i2 * 3) + i3) - 1) {
            w511.q();
            return;
        }
        int i4 = 0;
        while (i4 < i2) {
            char[] cArr2 = HEX;
            byte b = bArr[i4 + i];
            cArr[i3] = cArr2[(b >>> 4) & 15];
            cArr[i3 + 1] = cArr2[b & PKIBody._CCP];
            if (i4 < i2 - 1) {
                cArr[i3 + 2] = CHAR_SPACE;
            }
            i4++;
            i3 += 3;
        }
    }

    public static void toHexLow(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if (cArr.length < ((i2 * 3) + i3) - 1) {
            w511.q();
            return;
        }
        int i4 = 0;
        while (i4 < i2) {
            char[] cArr2 = hex;
            byte b = bArr[i4 + i];
            cArr[i3] = cArr2[(b >>> 4) & 15];
            cArr[i3 + 1] = cArr2[b & PKIBody._CCP];
            if (i4 < i2 - 1) {
                cArr[i3 + 2] = CHAR_SPACE;
            }
            i4++;
            i3 += 3;
        }
    }

    public static void toHex(byte[] bArr, char[] cArr, int i) {
        toHex(bArr, 0, bArr.length, cArr, i);
    }

    public static void toHexLow(byte[] bArr, char[] cArr, int i) {
        toHexLow(bArr, 0, bArr.length, cArr, i);
    }

    public static String toHex(byte b) {
        char[] cArr = new char[2];
        toHex(b, cArr, 0);
        return new String(cArr);
    }

    public static String toHexLow(byte b) {
        char[] cArr = new char[2];
        toHexLow(b, cArr, 0);
        return new String(cArr);
    }

    public static void toHex(int[] iArr, char[] cArr, int i) {
        toHex(iArr, 0, iArr.length, cArr, i);
    }

    public static void toHexLow(int[] iArr, char[] cArr, int i) {
        toHexLow(iArr, 0, iArr.length, cArr, i);
    }
}
