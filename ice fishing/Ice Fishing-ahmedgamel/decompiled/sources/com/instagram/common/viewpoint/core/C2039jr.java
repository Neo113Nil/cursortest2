package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2039jr implements SM {
    public final /* synthetic */ C07467w A00;
    public final /* synthetic */ boolean A01;

    public C2039jr(C07467w c07467w, boolean z6) {
        this.A00 = c07467w;
        this.A01 = z6;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        C1860gi c1860gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1860gi c1860gi2;
        NQ nq;
        c1860gi = this.A00.A04;
        if (!C1310Up.A1t(c1860gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C07467w c07467w = this.A00;
        c1860gi2 = this.A00.A04;
        nq = this.A00.A03;
        c07467w.A06 = AbstractC1645dD.A01(c1860gi2, (C07357l) nq, 0, new C2040js(this));
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
