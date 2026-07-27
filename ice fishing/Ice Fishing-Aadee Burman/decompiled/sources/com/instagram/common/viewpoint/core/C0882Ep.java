package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0882Ep extends AbstractRunnableC1327Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0877Ek A02;

    public C0882Ep(C0877Ek c0877Ek, int i, int i6) {
        this.A02 = c0877Ek;
        this.A00 = i;
        this.A01 = i6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C0865Dy(this.A00, this.A01));
    }
}
