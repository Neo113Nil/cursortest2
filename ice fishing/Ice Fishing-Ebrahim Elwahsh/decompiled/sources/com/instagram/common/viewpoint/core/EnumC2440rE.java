package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.rE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2440rE {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{86, 95, 101, 86, 99, -51, -32, -47, -36, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
    }
}
