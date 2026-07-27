package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC1810gE {
    public final /* synthetic */ C1708ea A00;

    public F8(C1708ea c1708ea) {
        this.A00 = c1708ea;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1810gE
    public final void AHA() {
        InterfaceC1381Yh interfaceC1381Yh;
        InterfaceC1381Yh interfaceC1381Yh2;
        ZU zu;
        interfaceC1381Yh = this.A00.A02;
        if (interfaceC1381Yh == null) {
            return;
        }
        interfaceC1381Yh2 = this.A00.A02;
        zu = this.A00.A03;
        interfaceC1381Yh2.A4j(zu.A94());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1810gE
    public final void AHC(C1812gG c1812gG) {
        InterfaceC1381Yh interfaceC1381Yh;
        C1840gi c1840gi;
        InterfaceC1381Yh interfaceC1381Yh2;
        ZU zu;
        C1840gi c1840gi2;
        InterfaceC1381Yh interfaceC1381Yh3;
        ZU zu2;
        interfaceC1381Yh = this.A00.A02;
        if (interfaceC1381Yh == null) {
            return;
        }
        if (c1812gG == null || !c1812gG.A00()) {
            c1840gi = this.A00.A01;
            c1840gi.A0F().ABv();
            interfaceC1381Yh2 = this.A00.A02;
            zu = this.A00.A03;
            interfaceC1381Yh2.A4j(zu.A94());
            return;
        }
        c1840gi2 = this.A00.A01;
        c1840gi2.A0F().ABw();
        interfaceC1381Yh3 = this.A00.A02;
        zu2 = this.A00.A03;
        interfaceC1381Yh3.A4j(zu2.A95());
    }
}
