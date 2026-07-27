package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C07277y extends AbstractC1978j4 {
    public final /* synthetic */ C07257w A00;
    public final /* synthetic */ AbstractC2008jh A01;
    public final /* synthetic */ C07147l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07277y(C07257w c07257w, boolean z8, boolean z9, C07147l c07147l, AbstractC2008jh abstractC2008jh) {
        super(z8);
        this.A00 = c07257w;
        this.A03 = z9;
        this.A02 = c07147l;
        this.A01 = abstractC2008jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1978j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1978j4
    public final void A01(boolean z8) {
        C1839gi c1839gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1839gi c1839gi2;
        C1839gi c1839gi3;
        c1839gi = this.A00.A04;
        if (!C1289Up.A1t(c1839gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c1839gi2 = this.A00.A04;
                c1839gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C07257w c07257w = this.A00;
        c1839gi3 = this.A00.A04;
        c07257w.A06 = AbstractC1624dD.A01(c1839gi3, this.A02, 0, new C2017jq(this));
    }
}
