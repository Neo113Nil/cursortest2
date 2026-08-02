package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1034Jt implements InterfaceC1538bU {
    public final /* synthetic */ C1023Ji A00;

    public C1034Jt(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1538bU
    public final void ADY() {
        VI vi;
        AbstractC1112Mt abstractC1112Mt;
        C1577c7 c1577c7;
        C1537bT c1537bT;
        C1537bT c1537bT2;
        C1577c7 c1577c72;
        AbstractC1112Mt abstractC1112Mt2;
        vi = this.A00.A0Y;
        vi.A04(VH.A0J, null);
        abstractC1112Mt = this.A00.A0W;
        if (abstractC1112Mt != null) {
            C1023Ji c1023Ji = this.A00;
            abstractC1112Mt2 = this.A00.A0W;
            c1023Ji.A0m(((AnonymousClass85) abstractC1112Mt2).A0M().toString());
        }
        c1577c7 = this.A00.A0b;
        if (c1577c7.A0D() != null) {
            c1577c72 = this.A00.A0b;
            c1577c72.A0D().ACQ();
        }
        c1537bT = this.A00.A09;
        if (c1537bT != null) {
            c1537bT2 = this.A00.A09;
            c1537bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
