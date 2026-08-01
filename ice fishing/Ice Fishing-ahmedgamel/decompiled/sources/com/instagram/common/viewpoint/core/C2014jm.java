package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2014jm extends AbstractRunnableC1327Wc {
    public static byte[] A01;
    public final /* synthetic */ C2013jl A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C2014jm(C2013jl c2013jl) {
        this.A00 = c2013jl;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        C1840gi c1840gi;
        AbstractC1486ay abstractC1486ay;
        C2015jn c2015jn;
        c1840gi = this.A00.A03;
        c1840gi.A0F().AKw();
        abstractC1486ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c2015jn = this.A00.A00;
        abstractC1486ay.loadUrl(append.append(c2015jn.A03()).toString());
    }
}
