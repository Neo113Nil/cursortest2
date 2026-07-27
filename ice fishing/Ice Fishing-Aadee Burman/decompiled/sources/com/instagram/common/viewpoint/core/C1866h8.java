package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1866h8 extends WP {
    public final /* synthetic */ C1863h5 A00;
    public final /* synthetic */ C1312Vm A01;

    public C1866h8(C1863h5 c1863h5, C1312Vm c1312Vm) {
        this.A00 = c1863h5;
        this.A01 = c1312Vm;
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
