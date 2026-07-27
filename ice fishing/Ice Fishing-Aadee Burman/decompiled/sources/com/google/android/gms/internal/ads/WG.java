package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class WG extends WC {

    /* renamed from: b, reason: collision with root package name */
    public final XG f28329b;

    /* renamed from: c, reason: collision with root package name */
    public final C3105du f28330c;

    public WG(XG xg, C3105du c3105du) {
        this.f28329b = xg;
        this.f28330c = c3105du;
    }

    public static WG i(XG xg, C3105du c3105du) {
        if (xg.f28511a == ((C3240gK) c3105du.f29859u).f30559a.length) {
            return new WG(xg, c3105du);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f28329b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return null;
    }
}
