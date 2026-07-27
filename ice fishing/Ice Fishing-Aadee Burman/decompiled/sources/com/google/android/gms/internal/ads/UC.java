package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.IOException;
import java.io.StringReader;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public abstract class UC {
    public static int a(long j6) {
        int i = (int) j6;
        AbstractC2772Sd.A(((long) i) == j6, "Out of range: %s", j6);
        return i;
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static Date c(long j6) {
        return new Date((j6 - 2082844800) * 1000);
    }

    public static boolean d(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 31 || !(i == 26 || i == 27)) {
            return i6 >= 33 && i == 30;
        }
        return true;
    }

    public static boolean e(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i6 = i + 1;
            if (!Character.isSurrogate(charAt)) {
                i = i6;
            } else {
                if (Character.isLowSurrogate(charAt) || i6 == length || !Character.isLowSurrogate(str.charAt(i6))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static byte[] f(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i6 = i + i;
            int digit = Character.digit(str.charAt(i6), 16);
            int digit2 = Character.digit(str.charAt(i6 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static byte[] g(byte[] bArr, byte[] bArr2) {
        long i = i(0, bArr) & 67108863;
        int i6 = 3;
        long i9 = (i(3, bArr) >> 2) & 67108611;
        long i10 = (i(6, bArr) >> 4) & 67092735;
        long i11 = (i(9, bArr) >> 6) & 66076671;
        long i12 = (i(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i13 = 0;
        while (true) {
            int length = bArr2.length;
            if (i13 >= length) {
                long j13 = j6 + (j9 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j10 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j11 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = ((j17 >> 26) * 5) + j12;
                long j20 = j19 >> 26;
                long j21 = j19 & 67108863;
                long j22 = j21 + 5;
                long j23 = (j9 & 67108863) + j20;
                long j24 = j23 + (j22 >> 26);
                long j25 = j14 + (j24 >> 26);
                long j26 = j16 + (j25 >> 26);
                long j27 = (j18 + (j26 >> 26)) - 67108864;
                long j28 = j27 >> 63;
                long j29 = ~j28;
                long j30 = (j23 & j28) | (j24 & 67108863 & j29);
                long j31 = (j14 & j28) | (j25 & 67108863 & j29);
                long j32 = (j16 & j28) | (j26 & 67108863 & j29);
                long j33 = (j18 & j28) | (j27 & j29);
                long i14 = i(16, bArr) + (((j21 & j28) | (j22 & 67108863 & j29) | (j30 << 26)) & 4294967295L);
                long i15 = i(20, bArr) + (((j30 >> 6) | (j31 << 20)) & 4294967295L);
                long i16 = i(24, bArr);
                long i17 = i(28, bArr) + (((j32 >> 18) | (j33 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                l(i14 & 4294967295L, bArr4, 0);
                long j34 = i15 + (i14 >> 32);
                l(j34 & 4294967295L, bArr4, 4);
                long j35 = i16 + (((j31 >> 12) | (j32 << 14)) & 4294967295L) + (j34 >> 32);
                l(j35 & 4294967295L, bArr4, 8);
                l((i17 + (j35 >> 32)) & 4294967295L, bArr4, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i13);
            System.arraycopy(bArr2, i13, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long j36 = i12 * 5;
            long j37 = i11 * 5;
            long j38 = i10 * 5;
            long i18 = j12 + (i(0, bArr3) & 67108863);
            long i19 = j9 + ((i(i6, bArr3) >> 2) & 67108863);
            long i20 = j6 + ((i(6, bArr3) >> 4) & 67108863);
            long i21 = j10 + ((i(9, bArr3) >> 6) & 67108863);
            long j39 = i9;
            long i22 = j11 + (((i(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j40 = i19 * i;
            long j41 = i19 * j39;
            long j42 = i20 * i;
            long j43 = i19 * i10;
            long j44 = i20 * j39;
            long j45 = i21 * i;
            long j46 = i19 * i11;
            long j47 = i20 * i10;
            long j48 = i21 * j39;
            long j49 = i22 * i;
            long j50 = (i9 * 5 * i22) + (i21 * j38) + (i20 * j37) + (i19 * j36) + (i18 * i);
            long j51 = j50 & 67108863;
            long j52 = i21 * j37;
            long j53 = j38 * i22;
            long j54 = j53 + j52 + (i20 * j36) + (i18 * j39) + j40 + (j50 >> 26);
            long j55 = j37 * i22;
            long j56 = j55 + (i21 * j36) + (i18 * i10) + j41 + j42 + (j54 >> 26);
            long j57 = (i22 * j36) + (i18 * i11) + j43 + j44 + j45 + (j56 >> 26);
            long j58 = (i18 * i12) + j46 + j47 + j48 + j49 + (j57 >> 26);
            long j59 = ((j58 >> 26) * 5) + j51;
            j9 = (j54 & 67108863) + (j59 >> 26);
            i13 += 16;
            j6 = j56 & 67108863;
            j10 = j57 & 67108863;
            j11 = j58 & 67108863;
            j12 = j59 & 67108863;
            i9 = j39;
            i6 = 3;
        }
    }

    public static int h(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    public static long i(int i, byte[] bArr) {
        int i6 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i9 << 8) | i6 | (i10 << 16)) & 4294967295L;
    }

    public static AbstractC3508lK j(String str) {
        try {
            return NF.k(new C4155xK(new StringReader(str)));
        } catch (NumberFormatException e9) {
            throw new IOException(e9);
        }
    }

    public static Executor k(final Executor executor, final HD hd) {
        executor.getClass();
        return executor == GD.f24952n ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.TD
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e9) {
                    hd.e(e9);
                }
            }
        };
    }

    public static void l(long j6, byte[] bArr, int i) {
        for (int i6 = 0; i6 < 4; i6++) {
            bArr[i + i6] = (byte) (255 & j6);
            j6 >>= 8;
        }
    }

    public static int m(byte b9, byte b10, byte b11, byte b12) {
        return (b9 << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public static int[] n(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof TC) {
            TC tc = (TC) abstractCollection;
            return Arrays.copyOfRange(tc.f27704n, tc.f27705u, tc.f27706v);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List o(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new TC(0, length, iArr);
    }

    public static Integer p(String str) {
        byte b9;
        Long valueOf;
        byte b10;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i = charAt == '-' ? 1 : 0;
            if (i != str.length()) {
                int i6 = i + 1;
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    b9 = VC.f28098a[charAt2];
                } else {
                    byte[] bArr = VC.f28098a;
                    b9 = -1;
                }
                if (b9 >= 0 && b9 < 10) {
                    long j6 = -b9;
                    while (true) {
                        if (i6 < str.length()) {
                            int i9 = i6 + 1;
                            char charAt3 = str.charAt(i6);
                            if (charAt3 < 128) {
                                b10 = VC.f28098a[charAt3];
                            } else {
                                byte[] bArr2 = VC.f28098a;
                                b10 = -1;
                            }
                            if (b10 < 0 || b10 >= 10 || j6 < -922337203685477580L) {
                                break;
                            }
                            long j9 = j6 * 10;
                            long j10 = b10;
                            if (j9 < Long.MIN_VALUE + j10) {
                                break;
                            }
                            j6 = j9 - j10;
                            i6 = i9;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j6);
                        } else if (j6 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j6);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }
}
