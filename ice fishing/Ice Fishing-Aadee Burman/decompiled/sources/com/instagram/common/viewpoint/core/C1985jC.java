package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1985jC implements O3 {
    public final /* synthetic */ C1118Nu A00;

    public C1985jC(C1118Nu c1118Nu) {
        this.A00 = c1118Nu;
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFF(AdError adError) {
        InterfaceC1117Nt interfaceC1117Nt;
        interfaceC1117Nt = this.A00.A04;
        interfaceC1117Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFG() {
        InterfaceC1117Nt interfaceC1117Nt;
        interfaceC1117Nt = this.A00.A04;
        interfaceC1117Nt.ACp();
    }
}
