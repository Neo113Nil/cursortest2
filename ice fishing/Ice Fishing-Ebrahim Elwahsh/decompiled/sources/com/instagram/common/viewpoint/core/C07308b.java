package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.8b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07308b implements InterfaceC2163mF {
    public long A00;
    public final long A01;
    public final C06324h A03 = new C06324h();
    public final C06324h A02 = new C06324h();

    public C07308b(long j9, long j10, long j11) {
        this.A00 = j9;
        this.A01 = j11;
        this.A03.A04(0L);
        this.A02.A04(j10);
    }

    public final void A00(long j9) {
        this.A00 = j9;
    }

    public final void A01(long j9, long j10) {
        if (A02(j9)) {
            return;
        }
        this.A03.A04(j9);
        this.A02.A04(j10);
    }

    public final boolean A02(long j9) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j9 - lastIndexedTimeUs < 100000;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2163mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j9) {
        int A0C = C5C.A0C(this.A03, j9, true, true);
        HZ hz = new HZ(this.A03.A03(A0C), this.A02.A03(A0C));
        if (hz.A01 != j9) {
            int targetIndex = this.A03.A02();
            if (A0C != targetIndex - 1) {
                int targetIndex2 = A0C + 1;
                long A03 = this.A03.A03(targetIndex2);
                int targetIndex3 = A0C + 1;
                HZ nextSeekPoint = new HZ(A03, this.A02.A03(targetIndex3));
                return new HX(hz, nextSeekPoint);
            }
        }
        return new HX(hz);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2163mF
    public final long A9H(long j9) {
        return this.A03.A03(C5C.A0C(this.A02, j9, true, true));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
