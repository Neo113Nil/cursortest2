package com.instagram.common.viewpoint.core;

import com.anythink.basead.ui.f.d;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1390Xw {
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) + d.f11586b);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -78, -77, -82, -62, -71, -63, -22, -7, -16, -16, 3, -9, -25, -10, -23, -23, -14};
    }

    static {
        A01();
    }
}
