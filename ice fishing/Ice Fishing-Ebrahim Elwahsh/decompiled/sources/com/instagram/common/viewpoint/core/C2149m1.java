package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.m1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2149m1 implements HY {
    public final /* synthetic */ C2148m0 A00;

    public C2149m1(C2148m0 c2148m0) {
        this.A00 = c2148m0;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        AbstractC0995Jb abstractC0995Jb;
        long j9;
        abstractC0995Jb = this.A00.A0B;
        j9 = this.A00.A07;
        return abstractC0995Jb.A05(j9);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j9) {
        AbstractC0995Jb abstractC0995Jb;
        long j10;
        long j11;
        long targetGranule;
        long targetGranule2;
        long j12;
        long j13;
        abstractC0995Jb = this.A00.A0B;
        long A06 = abstractC0995Jb.A06(j9);
        j10 = this.A00.A09;
        j11 = this.A00.A08;
        targetGranule = this.A00.A09;
        long j14 = (j11 - targetGranule) * A06;
        targetGranule2 = this.A00.A07;
        j12 = this.A00.A09;
        j13 = this.A00.A08;
        long estimatedPosition = C5C.A0T((j10 + (j14 / targetGranule2)) - 30000, j12, j13 - 1);
        return new HX(new HZ(j9, estimatedPosition));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
