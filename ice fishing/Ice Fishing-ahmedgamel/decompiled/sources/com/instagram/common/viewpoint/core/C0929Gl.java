package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0929Gl implements InterfaceC1374Ya {
    public final /* synthetic */ AbstractC0927Gj A00;

    public C0929Gl(AbstractC0927Gj abstractC0927Gj) {
        this.A00 = abstractC0927Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1374Ya
    public final void ACl(AbstractC1375Yb abstractC1375Yb) {
        if (abstractC1375Yb.getToolbarActionMode() == 8) {
            this.A00.A0g();
            return;
        }
        this.A00.A07.A04(VH.A07, null);
        if (this.A00.A0l()) {
            return;
        }
        this.A00.A05.A0F().AB0();
        this.A00.A0A.A4j(this.A00.A0B.A7w());
    }
}
