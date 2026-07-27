package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3185fJ extends AbstractC4262zJ {

    /* renamed from: b, reason: collision with root package name */
    public final C3293hJ f30241b;

    /* renamed from: c, reason: collision with root package name */
    public final C3105du f30242c;

    public C3185fJ(C3293hJ c3293hJ, C3105du c3105du) {
        this.f30241b = c3293hJ;
        this.f30242c = c3105du;
    }

    public static C3185fJ j(C3293hJ c3293hJ, C3105du c3105du) {
        C3240gK c3240gK = (C3240gK) c3105du.f29859u;
        if (c3240gK.f30559a.length != 32) {
            int length = c3240gK.f30559a.length;
            throw new GeneralSecurityException(D.y.m(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (Arrays.equals(c3293hJ.f30757c.b(), MA.l(MA.v(c3240gK.b())))) {
            return new C3185fJ(c3293hJ, c3105du);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final AbstractC3825rE b() {
        return this.f30241b.f30756b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4262zJ
    public final /* synthetic */ AJ i() {
        return this.f30241b;
    }
}
