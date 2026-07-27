package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.mx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2195mx implements HY {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    public C2195mx(long j6, long j9, int i, int i6, boolean z3) {
        this.A05 = j6;
        this.A04 = j9;
        this.A01 = i6 == -1 ? 1 : i6;
        this.A00 = i;
        this.A06 = z3;
        if (j6 == -1) {
            this.A02 = -1L;
            this.A03 = b.f6382b;
        } else {
            this.A02 = j6 - j9;
            this.A03 = A01(j6, j9, i);
        }
    }

    private long A00(long j6) {
        long positionOffset = this.A01;
        long j9 = ((this.A00 * j6) / 8000000) / positionOffset;
        long positionOffset2 = this.A01;
        long positionOffset3 = j9 * positionOffset2;
        if (this.A02 != -1) {
            positionOffset3 = Math.min(positionOffset3, this.A02 - this.A01);
        }
        long positionOffset4 = Math.max(positionOffset3, 0L);
        long positionOffset5 = this.A04;
        return positionOffset5 + positionOffset4;
    }

    public static long A01(long j6, long j9, int i) {
        return ((Math.max(0L, j6 - j9) * 8) * 1000000) / i;
    }

    public final long A02(long j6) {
        return A01(j6, this.A04, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j6) {
        if (this.A02 == -1 && !this.A06) {
            return new HX(new HZ(0L, this.A04));
        }
        long A00 = A00(j6);
        long A02 = A02(A00);
        HZ seekPoint = new HZ(A02, A00);
        if (this.A02 == -1 || A02 >= j6 || this.A01 + A00 >= this.A05) {
            return new HX(seekPoint);
        }
        long seekTimeUs = this.A01 + A00;
        long secondSeekPosition = A02(seekTimeUs);
        return new HX(seekPoint, new HZ(secondSeekPosition, seekTimeUs));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return this.A02 != -1 || this.A06;
    }
}
