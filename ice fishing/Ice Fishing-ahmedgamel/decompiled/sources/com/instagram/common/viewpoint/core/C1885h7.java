package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.h7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1885h7 extends WP {
    public final /* synthetic */ C1884h6 A00;

    public C1885h7(C1884h6 c1884h6) {
        this.A00 = c1884h6;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        S6 s62;
        S6 s63;
        s62 = this.A00.A01.A01;
        if (s62.A00() != null) {
            s63 = this.A00.A01.A01;
            s63.A00().onAdsLoaded();
        }
    }
}
