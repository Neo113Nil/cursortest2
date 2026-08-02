package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0949Gl implements InterfaceC1394Ya {
    public final /* synthetic */ AbstractC0947Gj A00;

    public C0949Gl(AbstractC0947Gj abstractC0947Gj) {
        this.A00 = abstractC0947Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1394Ya
    public final void ACl(AbstractC1395Yb abstractC1395Yb) {
        if (abstractC1395Yb.getToolbarActionMode() == 8) {
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
