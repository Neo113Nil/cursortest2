package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C07287y extends AbstractC1979j4 {
    public final /* synthetic */ C07267w A00;
    public final /* synthetic */ AbstractC2009jh A01;
    public final /* synthetic */ C07157l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07287y(C07267w c07267w, boolean z3, boolean z6, C07157l c07157l, AbstractC2009jh abstractC2009jh) {
        super(z3);
        this.A00 = c07267w;
        this.A03 = z6;
        this.A02 = c07157l;
        this.A01 = abstractC2009jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1979j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1979j4
    public final void A01(boolean z3) {
        C1840gi c1840gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1840gi c1840gi2;
        C1840gi c1840gi3;
        c1840gi = this.A00.A04;
        if (!C1290Up.A1t(c1840gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c1840gi2 = this.A00.A04;
                c1840gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C07267w c07267w = this.A00;
        c1840gi3 = this.A00.A04;
        c07267w.A06 = AbstractC1625dD.A01(c1840gi3, this.A02, 0, new C2018jq(this));
    }
}
