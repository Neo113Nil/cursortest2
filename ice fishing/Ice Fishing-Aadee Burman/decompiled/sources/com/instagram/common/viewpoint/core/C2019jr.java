package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2019jr implements SM {
    public final /* synthetic */ C07267w A00;
    public final /* synthetic */ boolean A01;

    public C2019jr(C07267w c07267w, boolean z3) {
        this.A00 = c07267w;
        this.A01 = z3;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        C1840gi c1840gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1840gi c1840gi2;
        NQ nq;
        c1840gi = this.A00.A04;
        if (!C1290Up.A1t(c1840gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C07267w c07267w = this.A00;
        c1840gi2 = this.A00.A04;
        nq = this.A00.A03;
        c07267w.A06 = AbstractC1625dD.A01(c1840gi2, (C07157l) nq, 0, new C2020js(this));
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
