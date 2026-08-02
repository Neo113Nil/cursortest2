package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2051k3 extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C2050k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2051k3(C2050k2 c2050k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c2050k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1805fp c1805fp;
        C1805fp c1805fp2;
        C1805fp c1805fp3;
        this.A00.A00.A0A();
        c1805fp = this.A00.A00.A0B;
        if (c1805fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c1805fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c1805fp2);
            c1805fp3 = this.A00.A00.A0B;
            c1805fp3.A0U();
        }
    }
}
