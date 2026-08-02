package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2004jB implements SM {
    public final /* synthetic */ C1138Nu A00;

    public C2004jB(C1138Nu c1138Nu) {
        this.A00 = c1138Nu;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        InterfaceC1137Nt interfaceC1137Nt;
        interfaceC1137Nt = this.A00.A04;
        interfaceC1137Nt.ACp();
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        InterfaceC1137Nt interfaceC1137Nt;
        interfaceC1137Nt = this.A00.A04;
        interfaceC1137Nt.ACo(AdError.CACHE_ERROR);
    }
}
