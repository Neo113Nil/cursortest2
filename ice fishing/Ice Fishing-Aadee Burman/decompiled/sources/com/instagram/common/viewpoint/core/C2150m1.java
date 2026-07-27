package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.m1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2150m1 implements HY {
    public final /* synthetic */ C2149m0 A00;

    public C2150m1(C2149m0 c2149m0) {
        this.A00 = c2149m0;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        AbstractC0996Jb abstractC0996Jb;
        long j6;
        abstractC0996Jb = this.A00.A0B;
        j6 = this.A00.A07;
        return abstractC0996Jb.A05(j6);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j6) {
        AbstractC0996Jb abstractC0996Jb;
        long j9;
        long j10;
        long targetGranule;
        long targetGranule2;
        long j11;
        long j12;
        abstractC0996Jb = this.A00.A0B;
        long A06 = abstractC0996Jb.A06(j6);
        j9 = this.A00.A09;
        j10 = this.A00.A08;
        targetGranule = this.A00.A09;
        long j13 = (j10 - targetGranule) * A06;
        targetGranule2 = this.A00.A07;
        j11 = this.A00.A09;
        j12 = this.A00.A08;
        long estimatedPosition = C5C.A0T((j9 + (j13 / targetGranule2)) - 30000, j11, j12 - 1);
        return new HX(new HZ(j6, estimatedPosition));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
