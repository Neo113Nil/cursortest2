package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1743f9 {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{123, 118, 121, 122, -108, -124, -118, -119, -108, -124, -125, -108, -123, -127, 118, -114, -73, -68, -60, -63, -73, -80, -70, -77, -117, 126, -120, 126, 119, -127, 122};
    }

    static {
        A01();
    }
}
