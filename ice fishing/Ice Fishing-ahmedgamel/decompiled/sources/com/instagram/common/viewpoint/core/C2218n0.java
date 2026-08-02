package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.n0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2218n0 implements HY {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final InterfaceC0961Gx A06;

    public C2218n0(InterfaceC0961Gx interfaceC0961Gx, long j6, long j9, long j10, long j11, long j12, long j13) {
        this.A06 = interfaceC0961Gx;
        this.A03 = j6;
        this.A05 = j9;
        this.A02 = j10;
        this.A04 = j11;
        this.A01 = j12;
        this.A00 = j13;
    }

    public final long A05(long j6) {
        return this.A06.AKQ(j6);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j6) {
        return new HX(new HZ(j6, C0960Gw.A05(this.A06.AKQ(j6), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
