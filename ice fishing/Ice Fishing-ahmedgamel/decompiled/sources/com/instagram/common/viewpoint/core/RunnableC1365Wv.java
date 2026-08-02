package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1365Wv implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1860gi A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -50, -51, -58, -1, -3, 6, -3, 10, 1, -5};
    }

    public RunnableC1365Wv(C1860gi c1860gi) {
        this.A00 = c1860gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            C1273Te otsl = new C1273Te(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A08().ABD(A00(4, 7, 44), AbstractC1272Td.A1Y, otsl);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
