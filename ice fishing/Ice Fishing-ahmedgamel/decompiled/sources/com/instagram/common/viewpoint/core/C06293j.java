package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06293j extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 104, 110, 103, 104, 98, 106, 99, 98, 38, 96, 105, 116, 107, 103, 114, 60, 38};
    }

    public C06293j(C06283i c06283i) {
        super(A00(0, 18, 51) + c06283i);
    }
}
