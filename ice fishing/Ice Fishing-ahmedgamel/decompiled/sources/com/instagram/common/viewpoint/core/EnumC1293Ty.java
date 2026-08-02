package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ty, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1293Ty {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{98, 107, 104, 98, 106, -108, -104, -101, -99, -112, -98, -98, -108, -102, -103, -69, -82, -70, -66, -82, -68, -67};
    }

    static {
        A01();
    }
}
