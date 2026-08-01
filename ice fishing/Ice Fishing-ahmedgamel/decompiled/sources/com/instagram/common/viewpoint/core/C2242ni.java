package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2242ni implements InterfaceC0892Ez {
    public long A00;
    public long A01;
    public C2242ni A02;
    public C0891Ey A03;

    public C2242ni(long j6, int i) {
        A02(j6, i);
    }

    public final int A00(long j6) {
        return ((int) (j6 - this.A01)) + this.A03.A00;
    }

    public final C2242ni A01() {
        this.A03 = null;
        C2242ni c2242ni = this.A02;
        this.A02 = null;
        return c2242ni;
    }

    public final void A02(long j6, int i) {
        AbstractC06243y.A08(this.A03 == null);
        this.A01 = j6;
        this.A00 = i + j6;
    }

    public final void A03(C0891Ey c0891Ey, C2242ni c2242ni) {
        this.A03 = c0891Ey;
        this.A02 = c2242ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0892Ez
    public final C0891Ey A6u() {
        return (C0891Ey) AbstractC06243y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0892Ez
    public final C2242ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
