package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1881hN extends WP {
    public final /* synthetic */ C1880hM A00;

    public C1881hN(C1880hM c1880hM) {
        this.A00 = c1880hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C1201Rd c1201Rd;
        C1201Rd c1201Rd2;
        C1201Rd c1201Rd3;
        c1201Rd = this.A00.A01;
        if (c1201Rd.A06() != null) {
            c1201Rd2 = this.A00.A01;
            AdListener A06 = c1201Rd2.A06();
            c1201Rd3 = this.A00.A01;
            A06.onLoggingImpression(c1201Rd3.A07());
        }
    }
}
