package com.google.crypto.tink.internal;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.Arrays;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes9.dex */
public abstract class Curve25519 {
    public static final byte[][] BANNED_PUBLIC_KEYS = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, PnmConstants.PGM_TEXT_CODE, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, PSSSigner.TRAILER_IMPLICIT, -93, PnmConstants.PNM_PREFIX_BYTE, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};
    public static final int[] expandStart = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] expandShift = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] mask = {67108863, 33554431};
    public static final int[] shift = {26, 25};

    public static byte[] contract(long[] jArr) {
        long j;
        int[] iArr;
        int i;
        int[] iArr2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = 19;
            iArr = shift;
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j2 = copyOf[i4];
                int i5 = -((int) (((j2 >> 31) & j2) >> iArr[i4 & 1]));
                copyOf[i4] = j2 + (i5 << r15);
                i4++;
                copyOf[i4] = copyOf[i4] - i5;
            }
            long j3 = copyOf[9];
            copyOf[9] = j3 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j3 >> 31) & j3) >> 25))) * 19);
            i3++;
        }
        long j4 = copyOf[0];
        copyOf[0] = j4 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j4 >> 31) & j4) >> 26)));
        int i6 = 0;
        while (true) {
            iArr2 = mask;
            if (i6 >= 2) {
                break;
            }
            int i7 = i2;
            while (i7 < 9) {
                long j5 = copyOf[i7];
                int i8 = i7 & 1;
                int i9 = i2;
                int i10 = i6;
                int i11 = (int) (j5 >> iArr[i8]);
                copyOf[i7] = j5 & iArr2[i8];
                i7++;
                copyOf[i7] = copyOf[i7] + i11;
                i2 = i9;
                j = j;
                i6 = i10;
            }
            i6++;
        }
        int i12 = i2;
        copyOf[9] = copyOf[9] & 33554431;
        long j6 = (((int) (r2 >> 25)) * j) + copyOf[i12];
        copyOf[i12] = j6;
        int i13 = ~((((int) j6) - 67108845) >> 31);
        for (int i14 = 1; i14 < 10; i14++) {
            int i15 = ~(((int) copyOf[i14]) ^ iArr2[i14 & 1]);
            int i16 = i15 & (i15 << 16);
            int i17 = i16 & (i16 << 8);
            int i18 = i17 & (i17 << 4);
            int i19 = i18 & (i18 << 2);
            i13 &= (i19 & (i19 << 1)) >> 31;
        }
        copyOf[i12] = copyOf[i12] - (67108845 & i13);
        long j7 = 33554431 & i13;
        copyOf[1] = copyOf[1] - j7;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - (67108863 & i13);
            int i20 = i + 1;
            copyOf[i20] = copyOf[i20] - j7;
        }
        for (int i21 = i12; i21 < 10; i21++) {
            copyOf[i21] = copyOf[i21] << expandShift[i21];
        }
        byte[] bArr = new byte[32];
        for (int i22 = i12; i22 < 10; i22++) {
            int i23 = expandStart[i22];
            long j8 = bArr[i23];
            long j9 = copyOf[i22];
            bArr[i23] = (byte) (j8 | (j9 & 255));
            bArr[i23 + 1] = (byte) (bArr[r5] | ((j9 >> 8) & 255));
            bArr[i23 + 2] = (byte) (bArr[r5] | ((j9 >> 16) & 255));
            bArr[i23 + 3] = (byte) (bArr[r4] | ((j9 >> 24) & 255));
        }
        return bArr;
    }

    public static void mult(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        product(jArr4, jArr2, jArr3);
        reduceSizeByModularReduction(jArr4);
        reduceCoefficients(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void product(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr3[1] * j;
        long j3 = jArr2[1];
        long j4 = jArr3[0];
        jArr[1] = (j3 * j4) + j2;
        long j5 = jArr2[1];
        long j6 = jArr3[1];
        jArr[2] = (jArr2[2] * j4) + (jArr3[2] * j) + (j5 * 2 * j6);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        jArr[3] = (jArr2[3] * j4) + (jArr3[3] * j) + (j8 * j6) + (j5 * j7);
        long j9 = jArr3[3];
        long j10 = jArr2[3];
        jArr[4] = (jArr2[4] * j4) + (jArr3[4] * j) + (((j10 * j6) + (j5 * j9)) * 2) + (j8 * j7);
        long j11 = jArr3[4];
        long j12 = jArr2[4];
        jArr[5] = (jArr2[5] * j4) + (jArr3[5] * j) + (j12 * j6) + (j5 * j11) + (j10 * j7) + (j8 * j9);
        long j13 = jArr3[5];
        long j14 = jArr2[5];
        jArr[6] = (jArr2[6] * j4) + (jArr3[6] * j) + (j12 * j7) + (j8 * j11) + Request$Priority$EnumUnboxingLocalUtility.m(j14, j6, (j5 * j13) + (j10 * j9), 2L);
        long j15 = jArr3[6];
        long j16 = jArr2[6];
        jArr[7] = (jArr2[7] * j4) + (jArr3[7] * j) + (j16 * j6) + (j5 * j15) + (j14 * j7) + (j8 * j13) + (j12 * j9) + (j10 * j11);
        long j17 = jArr3[7];
        long j18 = (j5 * j17) + (j14 * j9) + (j10 * j13);
        long j19 = jArr2[7];
        long j20 = (((j19 * j6) + j18) * 2) + (j12 * j11);
        jArr[8] = (jArr2[8] * j4) + (jArr3[8] * j) + (j16 * j7) + (j8 * j15) + j20;
        long j21 = jArr3[8];
        long j22 = jArr2[8];
        jArr[9] = (jArr2[9] * j4) + (j * jArr3[9]) + (j22 * j6) + (j5 * j21) + (j19 * j7) + (j8 * j17) + (j16 * j9) + (j10 * j15) + (j14 * j11) + (j12 * j13);
        long j23 = j19 * j9;
        long j24 = j23 + (j10 * j17) + (j14 * j13);
        long j25 = jArr3[9];
        long j26 = jArr2[9];
        jArr[10] = (j22 * j7) + (j8 * j21) + (j16 * j11) + (j12 * j15) + Request$Priority$EnumUnboxingLocalUtility.m(j26, j6, (j5 * j25) + j24, 2L);
        long j27 = j8 * j25;
        jArr[11] = (j26 * j7) + j27 + (j22 * j9) + (j10 * j21) + (j19 * j11) + (j12 * j17) + (j16 * j13) + (j14 * j15);
        long j28 = j10 * j25;
        jArr[12] = (j22 * j11) + (j12 * j21) + (((j26 * j9) + j28 + (j19 * j13) + (j14 * j17)) * 2) + (j16 * j15);
        long j29 = j12 * j25;
        jArr[13] = (j26 * j11) + j29 + (j22 * j13) + (j14 * j21) + (j19 * j15) + (j16 * j17);
        jArr[14] = (j22 * j15) + (j16 * j21) + Request$Priority$EnumUnboxingLocalUtility.m(j26, j13, (j14 * j25) + (j19 * j17), 2L);
        long j30 = j16 * j25;
        jArr[15] = (j26 * j15) + j30 + (j22 * j17) + (j19 * j21);
        jArr[16] = (((j26 * j17) + (j19 * j25)) * 2) + (j22 * j21);
        jArr[17] = (j26 * j21) + (j22 * j25);
        jArr[18] = j26 * 2 * j25;
    }

    public static void reduceCoefficients(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void reduceSizeByModularReduction(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * 2;
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long m = Request$Priority$EnumUnboxingLocalUtility.m(j, j4, j3 * j3, 2L);
        long j5 = j3 * j4;
        long j6 = jArr2[3];
        long m2 = Request$Priority$EnumUnboxingLocalUtility.m(j, j6, j5, 2L);
        long j7 = jArr2[4];
        long j8 = (j2 * j7) + (j3 * 4 * j6) + (j4 * j4);
        long j9 = (j3 * j7) + (j4 * j6);
        long j10 = jArr2[5];
        long m3 = Request$Priority$EnumUnboxingLocalUtility.m(j, j10, j9, 2L);
        long j11 = jArr2[6];
        long j12 = ((j3 * 2 * j10) + (j * j11) + (j4 * j7) + (j6 * j6)) * 2;
        long j13 = (j4 * j10) + (j6 * j7) + (j3 * j11);
        long j14 = jArr2[7];
        long m4 = Request$Priority$EnumUnboxingLocalUtility.m(j, j14, j13, 2L);
        long j15 = jArr2[8];
        long j16 = (((((j6 * j10) + (j3 * j14)) * 2) + (j * j15) + (j4 * j11)) * 2) + (j7 * j7);
        long j17 = (j3 * j15) + (j4 * j14) + (j6 * j11) + (j7 * j10);
        long j18 = jArr2[9];
        long[] jArr3 = {j * j, j2 * j3, m, m2, j8, m3, j12, m4, j16, Request$Priority$EnumUnboxingLocalUtility.m(j, j18, j17, 2L), ((((j3 * j18) + (j6 * j14)) * 2) + (j4 * j15) + (j7 * j11) + (j10 * j10)) * 2, Request$Priority$EnumUnboxingLocalUtility.m(j4, j18, (j7 * j14) + (j10 * j11) + (j6 * j15), 2L), (((((j6 * j18) + (j10 * j14)) * 2) + (j7 * j15)) * 2) + (j11 * j11), Request$Priority$EnumUnboxingLocalUtility.m(j7, j18, (j10 * j15) + (j11 * j14), 2L), ((j10 * 2 * j18) + (j11 * j15) + (j14 * j14)) * 2, Request$Priority$EnumUnboxingLocalUtility.m(j11, j18, j14 * j15, 2L), (4 * j14 * j18) + (j15 * j15), j15 * 2 * j18, j18 * 2 * j18};
        reduceSizeByModularReduction(jArr3);
        reduceCoefficients(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void sub(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void sum(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static void swapConditional(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (((int) jArr2[i3]) ^ ((int) jArr[i3])) & i2;
            jArr[i3] = r1 ^ i4;
            jArr2[i3] = ((int) jArr2[i3]) ^ i4;
        }
    }
}
