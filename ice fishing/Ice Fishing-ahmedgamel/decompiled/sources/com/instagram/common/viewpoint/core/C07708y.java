package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07708y extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2420qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, 26, 9, 14, 20, -7, 23, 6, 8, 16, -59, 28, 23, 14, 25, 10, -59, 11, 6, 14, 17, 10, 9, -33, -59};
    }

    public C07708y(int i, C2420qI c2420qI, boolean z6) {
        super(A00(0, 25, 91) + i);
        this.A02 = z6;
        this.A00 = i;
        this.A01 = c2420qI;
    }
}
