package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1231Si {
    public static InterfaceC1232Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 18);
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
        synchronized (C1231Si.class) {
            if (A00 == null) {
                return;
            }
            C1253Te c1253Te = new C1253Te(A00.AIb());
            c1253Te.A05(1);
            C1836ge A002 = T7.A00();
            if (A002 != null) {
                A002.A08().ABC(A00(0, 9, 49), 3401, c1253Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j6) {
        if (j6 > 0) {
            A00 = new C1849gr();
            new C1233Sk(j6);
        }
    }
}
