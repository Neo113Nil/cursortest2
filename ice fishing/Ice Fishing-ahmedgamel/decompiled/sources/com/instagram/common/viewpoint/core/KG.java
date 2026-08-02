package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KG implements InterfaceC1551bh {
    public final /* synthetic */ KE A00;

    public KG(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1551bh
    public final void ACt() {
        C1577c7 c1577c7;
        C1577c7 c1577c72;
        c1577c7 = this.A00.A0J;
        AbstractC2025jd A05 = c1577c7.A05();
        c1577c72 = this.A00.A0J;
        A05.A2H(c1577c72.A0C());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1551bh
    public final void AEm() {
        this.A00.A0Y = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1551bh
    public final void AEn() {
        this.A00.A0Y = true;
    }
}
