package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.i.a;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0961Hs extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C5F A00;

    public C0961Hs(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C1588cd c1588cd;
        c1588cd = this.A00.A0H;
        YB.A0F(1000, c1588cd);
        this.A00.postDelayed(this, a.f8040f);
    }
}
