package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC1809gE {
    public final /* synthetic */ C1707ea A00;

    public F8(C1707ea c1707ea) {
        this.A00 = c1707ea;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1809gE
    public final void AHA() {
        InterfaceC1380Yh interfaceC1380Yh;
        InterfaceC1380Yh interfaceC1380Yh2;
        ZU zu;
        interfaceC1380Yh = this.A00.A02;
        if (interfaceC1380Yh == null) {
            return;
        }
        interfaceC1380Yh2 = this.A00.A02;
        zu = this.A00.A03;
        interfaceC1380Yh2.A4j(zu.A94());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1809gE
    public final void AHC(C1811gG c1811gG) {
        InterfaceC1380Yh interfaceC1380Yh;
        C1839gi c1839gi;
        InterfaceC1380Yh interfaceC1380Yh2;
        ZU zu;
        C1839gi c1839gi2;
        InterfaceC1380Yh interfaceC1380Yh3;
        ZU zu2;
        interfaceC1380Yh = this.A00.A02;
        if (interfaceC1380Yh == null) {
            return;
        }
        if (c1811gG == null || !c1811gG.A00()) {
            c1839gi = this.A00.A01;
            c1839gi.A0F().ABv();
            interfaceC1380Yh2 = this.A00.A02;
            zu = this.A00.A03;
            interfaceC1380Yh2.A4j(zu.A94());
            return;
        }
        c1839gi2 = this.A00.A01;
        c1839gi2.A0F().ABw();
        interfaceC1380Yh3 = this.A00.A02;
        zu2 = this.A00.A03;
        interfaceC1380Yh3.A4j(zu2.A95());
    }
}
