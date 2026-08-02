package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1251Si {
    public static InterfaceC1252Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C1251Si.class) {
            if (A00 == null) {
                return;
            }
            C1273Te c1273Te = new C1273Te(A00.AIb());
            c1273Te.A05(1);
            C1856ge A002 = T7.A00();
            if (A002 != null) {
                A002.A08().ABC(A00(0, 9, 49), 3401, c1273Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j6) {
        if (j6 > 0) {
            A00 = new C1869gr();
            new C1253Sk(j6);
        }
    }
}
