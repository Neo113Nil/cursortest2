package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1151Pc implements InterfaceC1207Rk {
    public final /* synthetic */ PZ A00;

    public C1151Pc(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1207Rk
    public final boolean AAI() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
