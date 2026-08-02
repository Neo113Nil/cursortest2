package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1996j1 extends AbstractRunnableC1347Wc {
    public final /* synthetic */ AbstractC1995j0 A00;
    public final /* synthetic */ C1332Vm A01;

    public C1996j1(AbstractC1995j0 abstractC1995j0, C1332Vm c1332Vm) {
        this.A00 = abstractC1995j0;
        this.A01 = c1332Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
