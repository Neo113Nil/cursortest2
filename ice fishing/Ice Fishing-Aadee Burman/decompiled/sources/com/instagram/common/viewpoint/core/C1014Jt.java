package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1014Jt implements InterfaceC1518bU {
    public final /* synthetic */ C1003Ji A00;

    public C1014Jt(C1003Ji c1003Ji) {
        this.A00 = c1003Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1518bU
    public final void ADY() {
        VI vi;
        AbstractC1092Mt abstractC1092Mt;
        C1557c7 c1557c7;
        C1517bT c1517bT;
        C1517bT c1517bT2;
        C1557c7 c1557c72;
        AbstractC1092Mt abstractC1092Mt2;
        vi = this.A00.A0Y;
        vi.A04(VH.A0J, null);
        abstractC1092Mt = this.A00.A0W;
        if (abstractC1092Mt != null) {
            C1003Ji c1003Ji = this.A00;
            abstractC1092Mt2 = this.A00.A0W;
            c1003Ji.A0m(((AnonymousClass85) abstractC1092Mt2).A0M().toString());
        }
        c1557c7 = this.A00.A0b;
        if (c1557c7.A0D() != null) {
            c1557c72 = this.A00.A0b;
            c1557c72.A0D().ACQ();
        }
        c1517bT = this.A00.A09;
        if (c1517bT != null) {
            c1517bT2 = this.A00.A09;
            c1517bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
