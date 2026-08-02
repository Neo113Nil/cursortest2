package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.f0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1754f0 implements InterfaceC1271Tc {
    public final T8 A00;

    public C1754f0(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void A4I(Throwable th) {
        TX.A0E(th);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void AA3(String str) {
        VL.A08(this.A00, str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void AA4(String str) {
        VL.A09(this.A00, str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void ABC(String str, int i, C1273Te c1273Te) {
        TX.A06(this.A00, str, i, c1273Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void ABD(String str, int i, C1273Te c1273Te) {
        TX.A06(this.A00, str, i, c1273Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void ABo(long j6, long j9, long j10, long j11, int i, Exception exc) {
        AbstractC1277Ti.A03(this.A00, j6, j9, j10, j11, i, exc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void ABz(String str, int i, C1273Te c1273Te) {
        TX.A07(this.A00, str, i, c1273Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void ACA(String str, int i, C1273Te c1273Te) {
        TX.A08(this.A00, str, i, c1273Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1271Tc
    public final void ACP() {
        this.A00.A04().ACP();
    }
}
