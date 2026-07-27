package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.i.a;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC1327Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        boolean z3;
        C1589cd c1589cd;
        z3 = this.A00.A0Y;
        if (!z3) {
            c1589cd = this.A00.A0K;
            YB.A0F(1000, c1589cd);
        }
        this.A00.postDelayed(this, a.f7883f);
    }
}
