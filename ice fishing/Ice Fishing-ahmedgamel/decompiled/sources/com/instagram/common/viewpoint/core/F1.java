package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C0907Eu A00;

    public F1(C0907Eu c0907Eu) {
        this.A00 = c0907Eu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1734eg c1734eg;
        C0897Ek c0897Ek;
        E4 e42;
        EA ea;
        c1734eg = this.A00.A03;
        c1734eg.A07();
        c0897Ek = this.A00.A04;
        UM<UN, UL> eventBus = c0897Ek.getEventBus();
        e42 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e42, ea);
    }
}
