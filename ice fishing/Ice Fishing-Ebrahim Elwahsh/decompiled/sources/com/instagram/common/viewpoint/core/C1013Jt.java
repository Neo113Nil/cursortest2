package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1013Jt implements InterfaceC1517bU {
    public final /* synthetic */ C1002Ji A00;

    public C1013Jt(C1002Ji c1002Ji) {
        this.A00 = c1002Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1517bU
    public final void ADY() {
        VI vi;
        AbstractC1091Mt abstractC1091Mt;
        C1556c7 c1556c7;
        C1516bT c1516bT;
        C1516bT c1516bT2;
        C1556c7 c1556c72;
        AbstractC1091Mt abstractC1091Mt2;
        vi = this.A00.A0Y;
        vi.A04(VH.A0J, null);
        abstractC1091Mt = this.A00.A0W;
        if (abstractC1091Mt != null) {
            C1002Ji c1002Ji = this.A00;
            abstractC1091Mt2 = this.A00.A0W;
            c1002Ji.A0m(((AnonymousClass85) abstractC1091Mt2).A0M().toString());
        }
        c1556c7 = this.A00.A0b;
        if (c1556c7.A0D() != null) {
            c1556c72 = this.A00.A0b;
            c1556c72.A0D().ACQ();
        }
        c1516bT = this.A00.A09;
        if (c1516bT != null) {
            c1516bT2 = this.A00.A09;
            c1516bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
