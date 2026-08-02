package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1886h8 extends WP {
    public final /* synthetic */ C1883h5 A00;
    public final /* synthetic */ C1332Vm A01;

    public C1886h8(C1883h5 c1883h5, C1332Vm c1332Vm) {
        this.A00 = c1883h5;
        this.A01 = c1332Vm;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        S6 s62;
        S6 s63;
        s62 = this.A00.A01;
        if (s62.A00() != null) {
            s63 = this.A00.A01;
            s63.A00().onAdError(XE.A00(this.A01));
        }
    }
}
