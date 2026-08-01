package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1984jB implements SM {
    public final /* synthetic */ C1118Nu A00;

    public C1984jB(C1118Nu c1118Nu) {
        this.A00 = c1118Nu;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        InterfaceC1117Nt interfaceC1117Nt;
        interfaceC1117Nt = this.A00.A04;
        interfaceC1117Nt.ACp();
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        InterfaceC1117Nt interfaceC1117Nt;
        interfaceC1117Nt = this.A00.A04;
        interfaceC1117Nt.ACo(AdError.CACHE_ERROR);
    }
}
