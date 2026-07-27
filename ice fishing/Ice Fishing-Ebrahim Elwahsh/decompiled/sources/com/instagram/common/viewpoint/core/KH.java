package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.i.a;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC1326Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        boolean z8;
        C1588cd c1588cd;
        z8 = this.A00.A0Y;
        if (!z8) {
            c1588cd = this.A00.A0K;
            YB.A0F(1000, c1588cd);
        }
        this.A00.postDelayed(this, a.f8040f);
    }
}
