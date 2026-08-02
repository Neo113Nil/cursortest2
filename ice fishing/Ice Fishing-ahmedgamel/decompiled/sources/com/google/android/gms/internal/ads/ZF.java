package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ZF extends WC {

    /* renamed from: b, reason: collision with root package name */
    public final C4120wG f29641b;

    public ZF(C4120wG c4120wG) {
        this.f29641b = c4120wG;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final AbstractC3848rE b() {
        C4120wG c4120wG = this.f29641b;
        return new YF(c4120wG.f35587a, c4120wG.f35591e);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f29641b.f35592f;
    }

    public final C3263gK i() {
        C4120wG c4120wG = this.f29641b;
        if (c4120wG.f35591e.equals(C3956tE.f35018f)) {
            return C3263gK.a(new byte[0]);
        }
        C3956tE c3956tE = C3956tE.f35016d;
        C3956tE c3956tE2 = c4120wG.f35591e;
        boolean equals = c3956tE2.equals(c3956tE);
        Integer num = c4120wG.f35592f;
        if (equals) {
            return AbstractC3367iG.b(num.intValue());
        }
        if (c3956tE2.equals(C3956tE.f35017e) || c3956tE2.equals(C3956tE.f35019g)) {
            return AbstractC3367iG.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
