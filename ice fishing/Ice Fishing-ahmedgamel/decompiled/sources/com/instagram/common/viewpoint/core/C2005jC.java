package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2005jC implements O3 {
    public final /* synthetic */ C1138Nu A00;

    public C2005jC(C1138Nu c1138Nu) {
        this.A00 = c1138Nu;
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFF(AdError adError) {
        InterfaceC1137Nt interfaceC1137Nt;
        interfaceC1137Nt = this.A00.A04;
        interfaceC1137Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFG() {
        InterfaceC1137Nt interfaceC1137Nt;
        interfaceC1137Nt = this.A00.A04;
        interfaceC1137Nt.ACp();
    }
}
