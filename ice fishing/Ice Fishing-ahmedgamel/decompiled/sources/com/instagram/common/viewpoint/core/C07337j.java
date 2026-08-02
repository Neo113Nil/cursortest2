package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07337j extends AbstractC1995j0 {
    public C07337j(C1860gi c1860gi, O7 o72) {
        super(c1860gi, o72);
    }

    private C1993iy A00(Runnable runnable) {
        return new C1993iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final NQ A0I() {
        C2047jz successfullyLoadedAdapter = (C2047jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0P() {
        C2047jz interstitialAdapter = (C2047jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1995j0
    public final void A0R(N1 n12, C1291Tw c1291Tw, C1289Tu c1289Tu, O8 o82) {
        C2047jz c2047jz = (C2047jz) n12;
        C1994iz c1994iz = new C1994iz(this, o82, c2047jz);
        A0H().postDelayed(c1994iz, c1291Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2047jz.A0A(this.A0B, A00(c1994iz), o82, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
