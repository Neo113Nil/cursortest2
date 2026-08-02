package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class yz91 {
    public static final Object a = new Object();

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            ny61.g("The key length in bytes must be 32.");
            return null;
        }
        long b = b(0, bArr) & 67108863;
        int i = 3;
        long b2 = (b(3, bArr) >> 2) & 67108611;
        long b3 = (b(6, bArr) >> 4) & 67092735;
        long b4 = (b(9, bArr) >> 6) & 66076671;
        long b5 = (b(12, bArr) >> 8) & 1048575;
        long j = b2 * 5;
        long j2 = b3 * 5;
        long j3 = b4 * 5;
        long j4 = b5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long b6 = j9 + (b(0, bArr3) & 67108863);
            long b7 = j5 + ((b(i, bArr3) >> 2) & 67108863);
            long b8 = j6 + ((b(6, bArr3) >> 4) & 67108863);
            long b9 = j7 + ((b(9, bArr3) >> 6) & 67108863);
            long j10 = b2;
            long b10 = j8 + (((b(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j11 = (b10 * j) + (b9 * j2) + (b8 * j3) + (b7 * j4) + (b6 * b);
            long j12 = (b10 * j2) + (b9 * j3) + (b8 * j4) + (b7 * b) + (b6 * j10);
            long j13 = (b10 * j3) + (b9 * j4) + (b8 * b) + (b7 * j10) + (b6 * b3);
            long j14 = (b10 * j4) + (b9 * b) + (b8 * j10) + (b7 * b3) + (b6 * b4);
            long j15 = b9 * j10;
            long j16 = b10 * b;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (b8 * b3) + (b7 * b4) + (b6 * b5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            b2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j51 = ((j47 >> 6) | (j48 << 20)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j52 = ((j48 >> 12) | (j49 << 14)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b11 = b(16, bArr) + j50;
        long j54 = b11 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b12 = b(20, bArr) + j51 + (b11 >> 32);
        long j55 = b12 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b13 = b(24, bArr) + j52 + (b12 >> 32);
        long j56 = b13 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b14 = (b(28, bArr) + j53 + (b13 >> 32)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        byte[] bArr4 = new byte[16];
        d(j54, 0, bArr4);
        d(j55, 4, bArr4);
        d(j56, 8, bArr4);
        d(b14, 12, bArr4);
        return bArr4;
    }

    public static long b(int i, byte[] bArr) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
    }

    public static final void c(z22 z22Var, li3 li3Var, boolean z) {
        if (z22Var == null) {
            return;
        }
        boolean z2 = true;
        switch (li3Var.c) {
            case 8:
                z2 = false;
                break;
        }
        if (!z2 || z) {
            ((a) z22Var).a(li3Var);
        }
    }

    public static void d(long j, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static final void e() {
        throw new UnsupportedOperationException();
    }
}
