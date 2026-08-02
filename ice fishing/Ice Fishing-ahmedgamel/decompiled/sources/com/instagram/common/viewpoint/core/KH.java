package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.i.a;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC1347Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        boolean z6;
        C1609cd c1609cd;
        z6 = this.A00.A0Y;
        if (!z6) {
            c1609cd = this.A00.A0K;
            YB.A0F(1000, c1609cd);
        }
        this.A00.postDelayed(this, a.f8669f);
    }
}
