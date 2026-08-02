package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2262ni implements InterfaceC0912Ez {
    public long A00;
    public long A01;
    public C2262ni A02;
    public C0911Ey A03;

    public C2262ni(long j6, int i) {
        A02(j6, i);
    }

    public final int A00(long j6) {
        return ((int) (j6 - this.A01)) + this.A03.A00;
    }

    public final C2262ni A01() {
        this.A03 = null;
        C2262ni c2262ni = this.A02;
        this.A02 = null;
        return c2262ni;
    }

    public final void A02(long j6, int i) {
        AbstractC06443y.A08(this.A03 == null);
        this.A01 = j6;
        this.A00 = i + j6;
    }

    public final void A03(C0911Ey c0911Ey, C2262ni c2262ni) {
        this.A03 = c0911Ey;
        this.A02 = c2262ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0912Ez
    public final C0911Ey A6u() {
        return (C0911Ey) AbstractC06443y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0912Ez
    public final C2262ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
