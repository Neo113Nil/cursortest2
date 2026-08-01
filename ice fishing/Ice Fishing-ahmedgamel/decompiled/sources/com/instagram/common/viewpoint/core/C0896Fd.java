package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0896Fd implements InterfaceC1208Rk {
    public final /* synthetic */ C1202Re A00;
    public final /* synthetic */ C4T A01;

    public C0896Fd(C4T c4t, C1202Re c1202Re) {
        this.A01 = c4t;
        this.A00 = c1202Re;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1208Rk
    public final boolean AAI() {
        boolean A0j;
        boolean A0k;
        if (!this.A01.A0i()) {
            A0j = this.A01.A0j();
            if (A0j) {
                return true;
            }
            A0k = this.A01.A0k();
            return A0k;
        }
        this.A01.A0h(this.A00);
        return true;
    }
}
