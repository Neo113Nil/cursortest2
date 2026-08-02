package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1275Tg extends AbstractRunnableC1347Wc {
    public static byte[] A01;
    public final /* synthetic */ WD A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-81, -78, -90, -92, -81, -94, -73, -85, -75, -78, -73, -73, -81, -88};
    }

    public C1275Tg(WD wd) {
        this.A00 = wd;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1860gi c1860gi;
        c1860gi = this.A00.A05;
        c1860gi.A08().AA3(A00(0, 14, 26));
    }
}
