package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2013jm extends AbstractRunnableC1326Wc {
    public static byte[] A01;
    public final /* synthetic */ C2012jl A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C2013jm(C2012jl c2012jl) {
        this.A00 = c2012jl;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C1839gi c1839gi;
        AbstractC1485ay abstractC1485ay;
        C2014jn c2014jn;
        c1839gi = this.A00.A03;
        c1839gi.A0F().AKw();
        abstractC1485ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c2014jn = this.A00.A00;
        abstractC1485ay.loadUrl(append.append(c2014jn.A03()).toString());
    }
}
