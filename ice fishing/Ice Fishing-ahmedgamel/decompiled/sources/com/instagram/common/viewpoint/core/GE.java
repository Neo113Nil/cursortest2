package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GE implements InterfaceC1690dx {
    public final /* synthetic */ C4V A00;

    public GE(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1690dx
    public final void A9l() {
        AbstractC1573c3 abstractC1573c3;
        AbstractC1573c3 abstractC1573c32;
        abstractC1573c3 = this.A00.A02;
        if (abstractC1573c3 instanceof C6H) {
            abstractC1573c32 = this.A00.A02;
            ((C6H) abstractC1573c32).A1X();
            VI.A02(VH.A0e, null, ((AbstractC0947Gj) this.A00).A03.A2E(), ((AbstractC0947Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1690dx
    public final void AJz() {
        AbstractC1573c3 abstractC1573c3;
        AbstractC1573c3 abstractC1573c32;
        C4L c4l;
        abstractC1573c3 = this.A00.A02;
        if (abstractC1573c3 instanceof C6H) {
            abstractC1573c32 = this.A00.A02;
            c4l = this.A00.A0N;
            ((C6H) abstractC1573c32).A1b(c4l);
            VI.A02(VH.A0e, null, ((AbstractC0947Gj) this.A00).A03.A2E(), ((AbstractC0947Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1690dx
    public final void AKE() {
        AbstractC1573c3 abstractC1573c3;
        AbstractC1573c3 abstractC1573c32;
        this.A00.A0e();
        abstractC1573c3 = this.A00.A02;
        if (abstractC1573c3 instanceof C6H) {
            abstractC1573c32 = this.A00.A02;
            ((C6H) abstractC1573c32).getAdDetailsView().setVisibility(8);
        }
    }
}
