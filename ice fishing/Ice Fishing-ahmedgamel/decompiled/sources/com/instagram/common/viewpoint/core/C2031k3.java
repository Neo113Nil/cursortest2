package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2031k3 extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C2030k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2031k3(C2030k2 c2030k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c2030k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        C1785fp c1785fp;
        C1785fp c1785fp2;
        C1785fp c1785fp3;
        this.A00.A00.A0A();
        c1785fp = this.A00.A00.A0B;
        if (c1785fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c1785fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c1785fp2);
            c1785fp3 = this.A00.A00.A0B;
            c1785fp3.A0U();
        }
    }
}
