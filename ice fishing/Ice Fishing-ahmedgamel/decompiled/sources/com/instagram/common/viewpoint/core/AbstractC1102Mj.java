package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC1102Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, 28, 19, 3, 16, 9, 18, 17, 36, 27, 11, 30, 17, 16, 21, 30};
    }

    public static long A00(InterfaceC1103Mk interfaceC1103Mk) {
        return interfaceC1103Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC1103Mk interfaceC1103Mk) {
        String A6j = interfaceC1103Mk.A6j(A02(7, 9, 119), null);
        if (A6j == null) {
            return null;
        }
        return Uri.parse(A6j);
    }
}
