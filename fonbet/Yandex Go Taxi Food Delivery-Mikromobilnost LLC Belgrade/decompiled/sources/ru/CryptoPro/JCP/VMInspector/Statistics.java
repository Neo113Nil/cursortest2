package ru.CryptoPro.JCP.VMInspector;

import defpackage.b64;
import defpackage.g8e;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class Statistics {
    public static final String DEFAULT_FILE_NAME = "/bio_stat.dat";
    public static final double HI2_1 = 3.8415d;
    public static final double HI2_15 = 24.9958d;
    public static final double HI2_255 = 293.0d;
    public static final double HI2_3 = 7.8147d;
    public static final int KILO = 1024;
    public static final double SIGMA3_MAX = 0.5182d;
    public static final double SIGMA3_MIN = 0.4818d;

    public static void description(int[] iArr, int i, PrintStream printStream) {
        int length = i / iArr.length;
        int i2 = iArr[0];
        int i3 = i2;
        for (int i4 : iArr) {
            if (i4 > i2) {
                i2 = i4;
            }
            if (i4 < i3) {
                i3 = i4;
            }
        }
        printStream.getClass();
        int i5 = 0;
        while (i5 < iArr.length) {
            int i6 = 0;
            while (i6 < 8 && i5 < iArr.length) {
                int i7 = iArr[i5];
                i6++;
                i5++;
            }
        }
    }

    public static int[] getBigramStat(byte[] bArr, int i, int i2) {
        int[] iArr = new int[4];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3 + i];
            int i4 = b & 3;
            iArr[i4] = iArr[i4] + 1;
            int i5 = (b >> 2) & 3;
            iArr[i5] = iArr[i5] + 1;
            int i6 = (b >> 4) & 3;
            iArr[i6] = iArr[i6] + 1;
            int i7 = (b >> 6) & 3;
            iArr[i7] = iArr[i7] + 1;
        }
        return iArr;
    }

    public static int[] getByteStat(byte[] bArr, int i, int i2) {
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3 + i] & 255;
            iArr[i4] = iArr[i4] + 1;
        }
        return iArr;
    }

    public static int[] getHalfByteStat(byte[] bArr, int i, int i2) {
        int[] iArr = new int[16];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3 + i];
            int i4 = b & PKIBody._CCP;
            iArr[i4] = iArr[i4] + 1;
            int i5 = (b >> 4) & 15;
            iArr[i5] = iArr[i5] + 1;
        }
        return iArr;
    }

    public static int[] getPoleStat(byte[] bArr, int i, int i2) {
        int[] iArr = new int[2];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = (bArr[i3 + i] >> i4) & 1;
                iArr[i5] = iArr[i5] + 1;
            }
        }
        return iArr;
    }

    public static int[] getSignStat(byte[] bArr, int i, int i2) {
        int[] iArr = new int[2];
        int[] iArr2 = {0, 1, 1, 0};
        byte b = bArr[(i + i2) - 1];
        int i3 = 0;
        while (i3 < i2) {
            byte b2 = bArr[i3 + i];
            int i4 = iArr2[((b & 1) << 1) | ((b2 & DerValue.TAG_CONTEXT) >>> 7)];
            iArr[i4] = iArr[i4] + 1;
            for (int i5 = 0; i5 < 7; i5++) {
                int i6 = iArr2[(b2 >>> i5) & 3];
                iArr[i6] = iArr[i6] + 1;
            }
            i3++;
            b = b2;
        }
        return iArr;
    }

    public static double hi2Count(int[] iArr, int i) {
        int length = i / iArr.length;
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = g8e.d(i3, length, i3 - length, i2);
        }
        return i2 / length;
    }

    public static void main(String[] strArr) throws IOException {
        System.out.getClass();
        String str = "/bio_stat.dat";
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    str = strArr[0];
                }
            } catch (Exception unused) {
                System.out.getClass();
            }
        }
        proc(str);
        System.out.getClass();
        System.out.getClass();
    }

    public static void proc(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        statistics(Array.readFile(str), new PrintStream(byteArrayOutputStream));
        PrintStream printStream = System.out;
        byteArrayOutputStream.toString();
        printStream.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(b64.j(str, Depends.TEXT_EXT));
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
    }

    public static void statistics(byte[] bArr, PrintStream printStream) {
        int length = bArr.length;
        printStream.getClass();
        int[] byteStat = getByteStat(bArr, 0, bArr.length);
        description(byteStat, bArr.length, printStream);
        hi2Count(byteStat, bArr.length);
        int[] halfByteStat = getHalfByteStat(bArr, 0, bArr.length);
        description(halfByteStat, bArr.length * 2, printStream);
        hi2Count(halfByteStat, bArr.length * 2);
        int[] bigramStat = getBigramStat(bArr, 0, bArr.length);
        description(bigramStat, bArr.length * 4, printStream);
        hi2Count(bigramStat, bArr.length * 4);
        int[] signStat = getSignStat(bArr, 0, bArr.length);
        description(signStat, bArr.length * 8, printStream);
        hi2Count(signStat, bArr.length * 8);
        double length2 = signStat[1] / (bArr.length * 8);
        if (length2 >= 0.4818d) {
            int i = (length2 > 0.5182d ? 1 : (length2 == 0.5182d ? 0 : -1));
        }
        int[] poleStat = getPoleStat(bArr, 0, bArr.length);
        description(poleStat, bArr.length * 8, printStream);
        hi2Count(poleStat, bArr.length * 8);
        double length3 = poleStat[1] / (bArr.length * 8);
        if (length3 >= 0.4818d) {
            int i2 = (length3 > 0.5182d ? 1 : (length3 == 0.5182d ? 0 : -1));
        }
        for (int i3 = 0; i3 < bArr.length; i3 += 1024) {
            hi2Count(getPoleStat(bArr, i3, 1024), 8192);
        }
        for (int i4 = 0; i4 < bArr.length; i4 += 1024) {
            hi2Count(getSignStat(bArr, i4, 1024), 8192);
        }
    }
}
