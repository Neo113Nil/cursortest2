package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC1830gE {
    public final /* synthetic */ C1728ea A00;

    public F8(C1728ea c1728ea) {
        this.A00 = c1728ea;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1830gE
    public final void AHA() {
        InterfaceC1401Yh interfaceC1401Yh;
        InterfaceC1401Yh interfaceC1401Yh2;
        ZU zu;
        interfaceC1401Yh = this.A00.A02;
        if (interfaceC1401Yh == null) {
            return;
        }
        interfaceC1401Yh2 = this.A00.A02;
        zu = this.A00.A03;
        interfaceC1401Yh2.A4j(zu.A94());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1830gE
    public final void AHC(C1832gG c1832gG) {
        InterfaceC1401Yh interfaceC1401Yh;
        C1860gi c1860gi;
        InterfaceC1401Yh interfaceC1401Yh2;
        ZU zu;
        C1860gi c1860gi2;
        InterfaceC1401Yh interfaceC1401Yh3;
        ZU zu2;
        interfaceC1401Yh = this.A00.A02;
        if (interfaceC1401Yh == null) {
            return;
        }
        if (c1832gG == null || !c1832gG.A00()) {
            c1860gi = this.A00.A01;
            c1860gi.A0F().ABv();
            interfaceC1401Yh2 = this.A00.A02;
            zu = this.A00.A03;
            interfaceC1401Yh2.A4j(zu.A94());
            return;
        }
        c1860gi2 = this.A00.A01;
        c1860gi2.A0F().ABw();
        interfaceC1401Yh3 = this.A00.A02;
        zu2 = this.A00.A03;
        interfaceC1401Yh3.A4j(zu2.A95());
    }
}
