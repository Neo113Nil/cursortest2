package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network/classes2.dex */
public final class Y1 {
    public static byte[] A00;
    public static String[] A01 = {"kzsYhm9LKsU0BkYF5GBD4cHOfO5I2S", "FiiX6q", "juV27aOscABEXHLMFQmBucT", "1EXxaj", "f1sOyyKe81qkTfSynlEtElAllv4GRKo", "lzeqJRba", "GXB72S", "F9UQYukVDOEwI1lxcupNtKixpZh4OtVr"};
    public static final Y0 A02 = null;

    public static String A04(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{c.f16475b, 75, 86, 3, 23, 8, 20, 21, 18, 16, 50, 61, 116, 39, 115, 53, 60, 33, 62, 50, 39, 115, 39, 58, 62, 54, 125};
    }

    static {
        A08();
    }

    public static long A00() {
        if (A02 != null) {
            return A02.A5n();
        }
        return System.currentTimeMillis();
    }

    public static long A01(long j9) {
        return A02(j9, System.currentTimeMillis());
    }

    public static long A02(long j9, long j10) {
        if (j9 == -1) {
            return -1L;
        }
        return j10 - j9;
    }

    public static String A03(double d2) {
        try {
            return String.format(Locale.US, A04(0, 4, 115), Double.valueOf(d2));
        } catch (Exception e6) {
            String simpleName = Y1.class.getSimpleName();
            if (A01[3].length() == 20) {
                Exception e9 = new RuntimeException();
                throw e9;
            }
            A01[0] = "ylDYykVZ0MQgZWbzvTC4Y0QCoTAruV";
            Log.e(simpleName, A04(9, 18, 69), e6);
            return A04(4, 5, 48);
        }
    }

    public static String A05(long j9) {
        return String.valueOf(A01(j9));
    }

    @Deprecated
    public static String A06(long j9) {
        return A03(j9 / 1000.0d);
    }

    public static String A07(long j9) {
        return Long.toString(j9);
    }
}
