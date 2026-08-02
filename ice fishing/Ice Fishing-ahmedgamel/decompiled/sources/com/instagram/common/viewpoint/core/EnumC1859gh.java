package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1859gh {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, 68, 92, 75, 70, 67, 78, 10, 89, 79, 88, 92, 79, 88, 10, 88, 79, 89, 90, 69, 68, 89, 79, 16, 10, 15, 89, 40, 38, 38, 51, 110, 125, 100, 100, 90, 84, 84, 65};
    }

    static {
        A02();
    }

    EnumC1859gh(String str) {
        this.A00 = str;
    }

    public static EnumC1859gh A00(String str) {
        for (EnumC1859gh enumC1859gh : values()) {
            if (enumC1859gh.A00.equals(str)) {
                return enumC1859gh;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}
