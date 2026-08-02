package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.i.a;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0982Hs extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C5F A00;

    public C0982Hs(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1609cd c1609cd;
        c1609cd = this.A00.A0H;
        YB.A0F(1000, c1609cd);
        this.A00.postDelayed(this, a.f8669f);
    }
}
