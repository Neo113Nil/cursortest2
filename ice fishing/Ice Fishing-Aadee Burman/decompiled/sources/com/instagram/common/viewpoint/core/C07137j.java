package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07137j extends AbstractC1975j0 {
    public C07137j(C1840gi c1840gi, O7 o72) {
        super(c1840gi, o72);
    }

    private C1973iy A00(Runnable runnable) {
        return new C1973iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1975j0
    public final NQ A0I() {
        C2027jz successfullyLoadedAdapter = (C2027jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1975j0
    public final void A0P() {
        C2027jz interstitialAdapter = (C2027jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1975j0
    public final void A0R(N1 n1, C1271Tw c1271Tw, C1269Tu c1269Tu, O8 o82) {
        C2027jz c2027jz = (C2027jz) n1;
        C1974iz c1974iz = new C1974iz(this, o82, c2027jz);
        A0H().postDelayed(c1974iz, c1271Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2027jz.A0A(this.A0B, A00(c1974iz), o82, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
