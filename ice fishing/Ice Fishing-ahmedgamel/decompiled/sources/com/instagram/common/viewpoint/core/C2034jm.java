package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2034jm extends AbstractRunnableC1347Wc {
    public static byte[] A01;
    public final /* synthetic */ C2033jl A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C2034jm(C2033jl c2033jl) {
        this.A00 = c2033jl;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1860gi c1860gi;
        AbstractC1506ay abstractC1506ay;
        C2035jn c2035jn;
        c1860gi = this.A00.A03;
        c1860gi.A0F().AKw();
        abstractC1506ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c2035jn = this.A00.A00;
        abstractC1506ay.loadUrl(append.append(c2035jn.A03()).toString());
    }
}
