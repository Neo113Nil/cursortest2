package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class WG extends WC {

    /* renamed from: b, reason: collision with root package name */
    public final XG f29127b;

    /* renamed from: c, reason: collision with root package name */
    public final C3128du f29128c;

    public WG(XG xg, C3128du c3128du) {
        this.f29127b = xg;
        this.f29128c = c3128du;
    }

    public static WG i(XG xg, C3128du c3128du) {
        if (xg.f29291a == ((C3263gK) c3128du.f30647u).f31325a.length) {
            return new WG(xg, c3128du);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f29127b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return null;
    }
}
