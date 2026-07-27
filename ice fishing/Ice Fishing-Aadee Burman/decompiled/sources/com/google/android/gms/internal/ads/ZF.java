package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ZF extends WC {

    /* renamed from: b, reason: collision with root package name */
    public final C4097wG f28861b;

    public ZF(C4097wG c4097wG) {
        this.f28861b = c4097wG;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final AbstractC3825rE b() {
        C4097wG c4097wG = this.f28861b;
        return new YF(c4097wG.f34818a, c4097wG.f34822e);
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f28861b.f34823f;
    }

    public final C3240gK i() {
        C4097wG c4097wG = this.f28861b;
        if (c4097wG.f34822e.equals(C3933tE.f34232f)) {
            return C3240gK.a(new byte[0]);
        }
        C3933tE c3933tE = C3933tE.f34230d;
        C3933tE c3933tE2 = c4097wG.f34822e;
        boolean equals = c3933tE2.equals(c3933tE);
        Integer num = c4097wG.f34823f;
        if (equals) {
            return AbstractC3344iG.b(num.intValue());
        }
        if (c3933tE2.equals(C3933tE.f34231e) || c3933tE2.equals(C3933tE.f34233g)) {
            return AbstractC3344iG.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
