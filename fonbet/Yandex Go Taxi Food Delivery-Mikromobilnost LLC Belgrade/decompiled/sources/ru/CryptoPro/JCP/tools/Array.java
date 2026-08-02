package ru.CryptoPro.JCP.tools;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ny61;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.Key.KuznechikKeySpec;

/* loaded from: classes4.dex */
public class Array {
    public static final char[] HEX = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String STR_FORBIDDEN_OPERATION = "Operation cannot be performed";

    public static int[] addFollowingZeros(int[] iArr, int i) {
        int length = iArr.length;
        if (i < 0) {
            ny61.g("Cannot add negative amount of zeros");
            return null;
        }
        if (i == 0) {
            return copy(iArr);
        }
        int i2 = i + length;
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        Arrays.fill(iArr2, length, i2, 0);
        return iArr2;
    }

    public static String[] avoidRepeats(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        if (hashSet.size() == strArr.length) {
            return strArr;
        }
        Object[] array = hashSet.toArray();
        int length = array.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = (String) array[i];
        }
        return strArr2;
    }

    public static void byteOrder(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        for (int i = 0; i < bArr.length; i += 4) {
            byte b = bArr[i];
            int i2 = i + 3;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
            int i3 = i + 1;
            byte b2 = bArr[i3];
            int i4 = i + 2;
            bArr[i3] = bArr[i4];
            bArr[i4] = b2;
        }
    }

    public static byte[] byteOrderB(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i += 4) {
            int i2 = i + 3;
            bArr2[i] = bArr[i2];
            int i3 = i + 1;
            int i4 = i + 2;
            bArr2[i3] = bArr[i4];
            bArr2[i4] = bArr[i3];
            bArr2[i2] = bArr[i];
        }
        return bArr2;
    }

    public static int[] byteOrderI(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            iArr2[i] = ((i2 >>> 24) & 255) | ((i2 & 255) << 24) | (((i2 >>> 8) & 255) << 16) | (((i2 >>> 16) & 255) << 8);
        }
        return iArr2;
    }

    public static void clear(long[] jArr) {
        Arrays.fill(jArr, 0L);
    }

    public static boolean compare(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length < i + i3 || bArr2.length < i2 + i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i + i4] != bArr2[i2 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static void copy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || i < 0 || i2 < 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (bArr != bArr2) {
            copyRestricted(bArr, i, bArr2, i2, i3);
            return;
        }
        if (bArr == null) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (bArr2.length < i2 + i3 || bArr.length < i + i3) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (i < i2) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                bArr2[i4 + i2] = bArr[i4 + i];
            }
            return;
        }
        if (i > i2) {
            for (int i5 = 0; i5 < i3; i5++) {
                bArr2[i5 + i2] = bArr[i5 + i];
            }
        }
    }

    public static void copyRestricted(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || i < 0 || i2 < 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (bArr == null || bArr2 == null) {
            ny61.g(STR_FORBIDDEN_OPERATION);
        } else if (bArr.length < i + i3 || bArr2.length < i2 + i3) {
            ny61.g(STR_FORBIDDEN_OPERATION);
        } else {
            System.arraycopy(bArr, i, bArr2, i2, i3);
        }
    }

    public static byte[] getByteArrayFromBigInteger(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length > i && byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        if (byteArray.length >= i) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, 0, bArr2, 1, byteArray.length);
        return bArr2;
    }

    public static int getInt(byte[] bArr, int i) {
        int i2 = i + 3;
        if (i2 >= bArr.length || i < 0) {
            ny61.g("Wrong offset");
            return 0;
        }
        return ((bArr[i2] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | ((bArr[i + 2] << PKIBody._CKUANN) & 16711680) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280);
    }

    public static int getIntBE(byte[] bArr, int i) {
        int i2 = i + 3;
        if (i2 >= bArr.length || i < 0) {
            ny61.g("Wrong offset");
            return 0;
        }
        return ((bArr[i] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | (bArr[i2] & 255) | ((bArr[i + 2] << 8) & 65280) | ((bArr[i + 1] << PKIBody._CKUANN) & 16711680);
    }

    public static long getLong(byte[] bArr, int i) {
        if (i + 7 >= bArr.length || i < 0) {
            ny61.g("Wrong offset");
            return 0L;
        }
        return (((((bArr[r0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | (((bArr[i + 6] << PKIBody._CKUANN) & 16711680) | ((bArr[i + 4] & 255) | (65280 & (bArr[i + 5] << 8))))) << 32) & KuznechikKeySpec.C1_kuznyechik) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << PKIBody._CKUANN) & 16711680) | ((bArr[i + 3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
    }

    public static long getLongBE(byte[] bArr, int i) {
        int i2 = i + 7;
        if (i2 >= bArr.length || i < 0) {
            ny61.g("Wrong offset");
            return 0L;
        }
        return ((((((bArr[i] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | (((bArr[i + 3] & 255) | (65280 & (bArr[i + 2] << 8))) | ((bArr[i + 1] << PKIBody._CKUANN) & 16711680))) << 32) >>> 32) << 32) | ((((((bArr[i2] & 255) | ((bArr[i + 6] << 8) & 65280)) | ((bArr[i + 5] << PKIBody._CKUANN) & 16711680)) | ((bArr[i + 4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)) << 32) >>> 32);
    }

    public static short getShort(byte[] bArr, int i) {
        int i2 = i + 1;
        if (i2 >= bArr.length || i < 0) {
            ny61.g("Wrong offset");
            return (short) 0;
        }
        return (short) (((bArr[i2] << 8) & 65280) | (bArr[i] & 255));
    }

    public static void intOrder(int[] iArr) {
        for (int i = 0; i < (iArr.length >> 1); i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - 1) - i];
            iArr[(iArr.length - 1) - i] = i2;
        }
    }

    public static int[] intOrderI(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[(iArr.length - 1) - i];
        }
        return iArr2;
    }

    public static void invByteOrder(byte[] bArr) {
        for (int i = 0; i < (bArr.length >> 1); i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    public static void invByteOrderB(byte[] bArr, int i, int i2) {
        int i3 = ((i2 - i) + 1) / 2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            byte b = bArr[i5];
            int i6 = i2 - i4;
            bArr[i5] = bArr[i6];
            bArr[i6] = b;
        }
    }

    public static int[] invByteOrderI(int[] iArr) {
        int[] intOrderI = intOrderI(iArr);
        byteOrder(intOrderI);
        return intOrderI;
    }

    public static boolean isZero(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static char[] leftPart(char[] cArr, int i) {
        if (i == cArr.length) {
            return cArr;
        }
        if (i <= 0 || i > cArr.length) {
            ny61.g("Illegal index");
            return null;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, i);
        return cArr2;
    }

    public static double max(double[] dArr) {
        if (dArr.length == 0) {
            ny61.g("Zero length");
            return 0.0d;
        }
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    public static byte[] merge(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static double min(double[] dArr) {
        if (dArr.length == 0) {
            ny61.g("Zero length");
            return 0.0d;
        }
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            if (d2 < d) {
                d = d2;
            }
        }
        return d;
    }

    public static void outHex(PrintStream printStream, byte[] bArr) {
        HexString.toHex(bArr);
        printStream.getClass();
    }

    public static void printHexInt(PrintStream printStream, int i) {
        HexString.toHex(i);
        printStream.getClass();
    }

    public static byte[] readFile(File file) throws IOException {
        int read;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                int available = fileInputStream2.available();
                byte[] bArr = new byte[available];
                int i = 0;
                do {
                    read = fileInputStream2.read(bArr, i, available - i);
                    i += read;
                } while (read > 0);
                fileInputStream2.close();
                return bArr;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String[] removeElement(String[] strArr, int i) {
        if (i < 0 || i >= strArr.length || strArr.length == 0) {
            ny61.g("Illegal index");
            return null;
        }
        String[] strArr2 = new String[strArr.length - 1];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        System.arraycopy(strArr, i + 1, strArr2, i, (r0 - i) - 1);
        return strArr2;
    }

    public static byte[] rightPart(byte[] bArr, int i) {
        if (i == 0) {
            return bArr;
        }
        if (i < 0 || i >= bArr.length) {
            ny61.g("Illegal index");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr2, 0, bArr.length - i);
        return bArr2;
    }

    public static void separate(char[] cArr, char[] cArr2, char[] cArr3, int i) {
        if (i < 0 || i >= cArr.length) {
            ny61.g("Illegal index");
        } else if (cArr2.length != i || cArr3.length != cArr.length - i) {
            ny61.g("Illegal arrays");
        } else {
            System.arraycopy(cArr, 0, cArr2, 0, i);
            System.arraycopy(cArr, i, cArr3, 0, cArr.length - i);
        }
    }

    public static void shiftIntLeft(int[] iArr, int i) {
        if (i <= 0) {
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 < iArr.length - i) {
                iArr[i2] = iArr[i2 + i];
            } else {
                iArr[i2] = 0;
            }
        }
    }

    public static int[] shiftIntLeftNew(int[] iArr, int i) {
        if (i <= 0) {
            return copy(iArr);
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, i, iArr2, 0, iArr.length - i);
        Arrays.fill(iArr2, iArr.length - i, iArr.length, 0);
        return iArr2;
    }

    public static void storeInBeg(char[] cArr, char[] cArr2) {
        if (cArr.length >= cArr2.length) {
            System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        } else {
            ny61.g("Illegal arrays");
        }
    }

    public static void storeInEnd(char[] cArr, char[] cArr2) {
        if (cArr.length >= cArr2.length) {
            System.arraycopy(cArr2, 0, cArr, cArr.length - cArr2.length, cArr2.length);
        } else {
            ny61.g("Illegal arrays");
        }
    }

    public static byte[] toByteArray(long j) {
        return new byte[]{(byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 56) & 255)};
    }

    public static byte[] toByteArrayI(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static void toByteArrayXOR(byte[] bArr, int i, int[] iArr, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i3 << 2;
            int i5 = i4 + 3;
            int i6 = iArr[i3];
            bArr[i5 + i] = (byte) (bArr2[i5 + i2] ^ ((i6 >> 24) & 255));
            int i7 = i4 + 2;
            bArr[i7 + i] = (byte) (bArr2[i7 + i2] ^ ((i6 >> 16) & 255));
            int i8 = i4 + 1;
            bArr[i8 + i] = (byte) (bArr2[i8 + i2] ^ ((i6 >> 8) & 255));
            bArr[i4 + i] = (byte) (bArr2[i4 + i2] ^ (i6 & 255));
        }
    }

    public static String toHexLowString(byte[] bArr) {
        return HexString.toHexLow(bArr);
    }

    public static String toHexString(byte[] bArr, int i) {
        return HexString.toHex(bArr, i, bArr.length - i);
    }

    public static int[] toIntArray(short[] sArr) {
        if (sArr.length % 2 != 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return null;
        }
        int[] iArr = new int[sArr.length >> 1];
        for (int i = 0; i < (sArr.length >> 1); i++) {
            int i2 = i * 2;
            iArr[i] = (sArr[i2] & 65535) | ((sArr[i2 + 1] << 16) & (-65536));
        }
        return iArr;
    }

    public static int[] toIntArrayR(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return null;
        }
        byte[] invByteOrderB = invByteOrderB(bArr);
        int[] intArray = toIntArray(invByteOrderB);
        clear(invByteOrderB);
        return intArray;
    }

    public static short[] toShortArray(int[] iArr) {
        short[] sArr = new short[iArr.length << 1];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 2;
            int i3 = iArr[i];
            sArr[i2 + 1] = (short) ((i3 >> 16) & 65535);
            sArr[i2] = (short) (i3 & 65535);
        }
        return sArr;
    }

    public static void writeFile(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            ny61.g("Illegal parameters");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static void clear(char[] cArr) {
        Arrays.fill(cArr, (char) 0);
    }

    public static void clear(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    public static void outHex(PrintStream printStream, byte[] bArr, int i, int i2) {
        HexString.toHex(bArr, i, i2);
        printStream.getClass();
    }

    public static String toHexString(byte[] bArr) {
        return HexString.toHex(bArr);
    }

    public static void clear(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
    }

    public static String toHexString(int[] iArr) {
        return HexString.toHex(iArr);
    }

    public static void clear(short[] sArr) {
        Arrays.fill(sArr, (short) 0);
    }

    public static char[] merge(char[] cArr, char[] cArr2) {
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static int[] merge(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static String[] merge(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static int[] leftPart(int[] iArr, int i) {
        if (i == iArr.length) {
            return iArr;
        }
        if (i <= 0 || i > iArr.length) {
            ny61.g("Illegal index");
            return null;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static void writeFile(String str, byte[] bArr) throws IOException {
        writeFile(new File(str), bArr);
    }

    public static byte[] invByteOrderB(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - 1) - i];
        }
        return bArr2;
    }

    public static void invByteOrder(int[] iArr) {
        intOrderI(iArr);
        byteOrderI(iArr);
    }

    public static byte[] invByteOrderB(int[] iArr) {
        int[] intOrderI = intOrderI(iArr);
        byte[] byteArray = toByteArray(intOrderI);
        clear(intOrderI);
        return byteArray;
    }

    public static char[] rightPart(char[] cArr, int i) {
        if (i == 0) {
            return cArr;
        }
        if (i < 0 || i >= cArr.length) {
            ny61.g("Illegal index");
            return null;
        }
        char[] cArr2 = new char[cArr.length - i];
        System.arraycopy(cArr, i, cArr2, 0, cArr.length - i);
        return cArr2;
    }

    public static int[] rightPart(int[] iArr, int i) {
        if (i == 0) {
            return iArr;
        }
        if (i < 0 || i >= iArr.length) {
            ny61.g("Illegal index");
            return null;
        }
        int[] iArr2 = new int[iArr.length - i];
        System.arraycopy(iArr, i, iArr2, 0, iArr.length - i);
        return iArr2;
    }

    public static int max(int[] iArr) {
        if (iArr.length == 0) {
            ny61.g("Zero length");
            return 0;
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int min(int[] iArr) {
        if (iArr.length == 0) {
            ny61.g("Zero length");
            return 0;
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int[] xor(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            ny61.g("Illegal parameters");
            return null;
        }
        int[] iArr3 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[i] = iArr[i] ^ iArr2[i];
        }
        return iArr3;
    }

    public static boolean compare(byte[] bArr, byte[] bArr2) {
        return compare(bArr, bArr2, bArr.length);
    }

    public static boolean compare(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean compare(char[] cArr, char[] cArr2, int i) {
        if (cArr.length < i || cArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] toByteArrayI(long j) {
        byte[] byteArray = toByteArray(j);
        invByteOrder(byteArray);
        return byteArray;
    }

    public static boolean compare(int[] iArr, int[] iArr2) {
        return compare(iArr, iArr2, iArr.length);
    }

    public static void separate(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        if (i < 0 || i >= iArr.length) {
            ny61.g("Illegal index");
        } else if (iArr2.length != i || iArr3.length != iArr.length - i) {
            ny61.g("Illegal arrays");
        } else {
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(iArr, i, iArr3, 0, iArr.length - i);
        }
    }

    public static boolean compare(int[] iArr, int[] iArr2, int i) {
        if (iArr.length < i || iArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] readFile(String str) throws IOException {
        return readFile(new File(str));
    }

    public static void copyRestricted(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        if (i3 < 0 || i < 0 || i2 < 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (iArr == null || iArr2 == null) {
            ny61.g(STR_FORBIDDEN_OPERATION);
        } else if (iArr.length < i + i3 || iArr2.length < i2 + i3) {
            ny61.g(STR_FORBIDDEN_OPERATION);
        } else {
            System.arraycopy(iArr, i, iArr2, i2, i3);
        }
    }

    public static int byteOrder(int i) {
        return ((i >>> 24) & 255) | ((i & 255) << 24) | (((i >>> 8) & 255) << 16) | (((i >>> 16) & 255) << 8);
    }

    public static void byteOrder(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            iArr[i] = ((i2 >>> 24) & 255) | ((i2 & 255) << 24) | (((i2 >>> 8) & 255) << 16) | (((i2 >>> 16) & 255) << 8);
        }
    }

    public static int[] toIntArray(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return null;
        }
        int[] iArr = new int[bArr.length >> 2];
        toIntArray(iArr, bArr);
        return iArr;
    }

    public static void toIntArray(int[] iArr, byte[] bArr) {
        for (int i = 0; i < (bArr.length >> 2); i++) {
            iArr[i] = getInt(bArr, i << 2);
        }
    }

    public static void copy(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            ny61.g(STR_FORBIDDEN_OPERATION);
        }
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        if (i3 < 0 || i < 0 || i2 < 0) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (iArr != iArr2) {
            copyRestricted(iArr, i, iArr2, i2, i3);
            return;
        }
        if (iArr == null) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (iArr2.length < i2 + i3 || iArr.length < i + i3) {
            ny61.g(STR_FORBIDDEN_OPERATION);
            return;
        }
        if (i < i2) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                iArr2[i4 + i2] = iArr[i4 + i];
            }
            return;
        }
        if (i > i2) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5 + i2] = iArr[i5 + i];
            }
        }
    }

    public static void copy(int[] iArr, int[] iArr2) {
        if (iArr.length == iArr2.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        } else {
            ny61.g(STR_FORBIDDEN_OPERATION);
        }
    }

    public static void copy(long[] jArr, long[] jArr2) {
        if (jArr.length == jArr2.length) {
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        } else {
            ny61.g(STR_FORBIDDEN_OPERATION);
        }
    }

    public static byte[] copy(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] copy(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int[] copy(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static long[] copy(long[] jArr) {
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static void toByteArray(byte[] bArr, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 4;
            int i3 = iArr[i];
            bArr[i2 + 3] = (byte) ((i3 >> 24) & 255);
            bArr[i2 + 2] = (byte) ((i3 >> 16) & 255);
            bArr[i2 + 1] = (byte) ((i3 >> 8) & 255);
            bArr[i2] = (byte) (i3 & 255);
        }
    }

    public static byte[] toByteArray(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static void toByteArray(byte[] bArr, int i, int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i3 * 4;
            int i5 = iArr[i3 + i2];
            bArr[i4 + 3 + i] = (byte) ((i5 >> 24) & 255);
            bArr[i4 + 2 + i] = (byte) ((i5 >> 16) & 255);
            bArr[i4 + 1 + i] = (byte) ((i5 >> 8) & 255);
            bArr[i4 + i] = (byte) (i5 & 255);
        }
    }

    public static byte[] toByteArray(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 4;
            int i3 = iArr[i];
            bArr[i2 + 3] = (byte) ((i3 >> 24) & 255);
            bArr[i2 + 2] = (byte) ((i3 >> 16) & 255);
            bArr[i2 + 1] = (byte) ((i3 >> 8) & 255);
            bArr[i2] = (byte) (i3 & 255);
        }
        return bArr;
    }

    public static byte[] toByteArray(int[] iArr, int i, int i2) {
        byte[] bArr = new byte[i2 << 2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 4;
            int i5 = iArr[i3 + i];
            bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
            bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
            bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
            bArr[i4] = (byte) (i5 & 255);
        }
        return bArr;
    }
}
