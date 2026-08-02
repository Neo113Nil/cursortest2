package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1901hN extends WP {
    public final /* synthetic */ C1900hM A00;

    public C1901hN(C1900hM c1900hM) {
        this.A00 = c1900hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C1221Rd c1221Rd;
        C1221Rd c1221Rd2;
        C1221Rd c1221Rd3;
        c1221Rd = this.A00.A01;
        if (c1221Rd.A06() != null) {
            c1221Rd2 = this.A00.A01;
            AdListener A06 = c1221Rd2.A06();
            c1221Rd3 = this.A00.A01;
            A06.onLoggingImpression(c1221Rd3.A07());
        }
    }
}
