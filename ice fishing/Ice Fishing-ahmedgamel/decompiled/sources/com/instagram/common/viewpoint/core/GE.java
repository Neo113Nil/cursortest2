package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GE implements InterfaceC1670dx {
    public final /* synthetic */ C4V A00;

    public GE(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1670dx
    public final void A9l() {
        AbstractC1553c3 abstractC1553c3;
        AbstractC1553c3 abstractC1553c32;
        abstractC1553c3 = this.A00.A02;
        if (abstractC1553c3 instanceof C6H) {
            abstractC1553c32 = this.A00.A02;
            ((C6H) abstractC1553c32).A1X();
            VI.A02(VH.A0e, null, ((AbstractC0927Gj) this.A00).A03.A2E(), ((AbstractC0927Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1670dx
    public final void AJz() {
        AbstractC1553c3 abstractC1553c3;
        AbstractC1553c3 abstractC1553c32;
        C4L c4l;
        abstractC1553c3 = this.A00.A02;
        if (abstractC1553c3 instanceof C6H) {
            abstractC1553c32 = this.A00.A02;
            c4l = this.A00.A0N;
            ((C6H) abstractC1553c32).A1b(c4l);
            VI.A02(VH.A0e, null, ((AbstractC0927Gj) this.A00).A03.A2E(), ((AbstractC0927Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1670dx
    public final void AKE() {
        AbstractC1553c3 abstractC1553c3;
        AbstractC1553c3 abstractC1553c32;
        this.A00.A0e();
        abstractC1553c3 = this.A00.A02;
        if (abstractC1553c3 instanceof C6H) {
            abstractC1553c32 = this.A00.A02;
            ((C6H) abstractC1553c32).getAdDetailsView().setVisibility(8);
        }
    }
}
