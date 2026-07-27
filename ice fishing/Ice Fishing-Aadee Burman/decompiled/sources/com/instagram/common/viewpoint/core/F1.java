package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C0887Eu A00;

    public F1(C0887Eu c0887Eu) {
        this.A00 = c0887Eu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        C1714eg c1714eg;
        C0877Ek c0877Ek;
        E4 e42;
        EA ea;
        c1714eg = this.A00.A03;
        c1714eg.A07();
        c0877Ek = this.A00.A04;
        UM<UN, UL> eventBus = c0877Ek.getEventBus();
        e42 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e42, ea);
    }
}
