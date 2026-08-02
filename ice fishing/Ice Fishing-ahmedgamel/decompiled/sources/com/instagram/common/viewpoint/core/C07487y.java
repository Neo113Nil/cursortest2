package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C07487y extends AbstractC1999j4 {
    public final /* synthetic */ C07467w A00;
    public final /* synthetic */ AbstractC2029jh A01;
    public final /* synthetic */ C07357l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07487y(C07467w c07467w, boolean z6, boolean z9, C07357l c07357l, AbstractC2029jh abstractC2029jh) {
        super(z6);
        this.A00 = c07467w;
        this.A03 = z9;
        this.A02 = c07357l;
        this.A01 = abstractC2029jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1999j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1999j4
    public final void A01(boolean z6) {
        C1860gi c1860gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1860gi c1860gi2;
        C1860gi c1860gi3;
        c1860gi = this.A00.A04;
        if (!C1310Up.A1t(c1860gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c1860gi2 = this.A00.A04;
                c1860gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C07467w c07467w = this.A00;
        c1860gi3 = this.A00.A04;
        c07467w.A06 = AbstractC1645dD.A01(c1860gi3, this.A02, 0, new C2038jq(this));
    }
}
