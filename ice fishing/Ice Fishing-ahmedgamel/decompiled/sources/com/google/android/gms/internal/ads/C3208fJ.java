package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3208fJ extends AbstractC4285zJ {

    /* renamed from: b, reason: collision with root package name */
    public final C3316hJ f31028b;

    /* renamed from: c, reason: collision with root package name */
    public final C3128du f31029c;

    public C3208fJ(C3316hJ c3316hJ, C3128du c3128du) {
        this.f31028b = c3316hJ;
        this.f31029c = c3128du;
    }

    public static C3208fJ j(C3316hJ c3316hJ, C3128du c3128du) {
        C3263gK c3263gK = (C3263gK) c3128du.f30647u;
        if (c3263gK.f31325a.length != 32) {
            int length = c3263gK.f31325a.length;
            throw new GeneralSecurityException(D.x.k(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (Arrays.equals(c3316hJ.f31523c.b(), MA.l(MA.v(c3263gK.b())))) {
            return new C3208fJ(c3316hJ, c3128du);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final AbstractC3848rE b() {
        return this.f31028b.f31522b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4285zJ
    public final /* synthetic */ AJ i() {
        return this.f31028b;
    }
}
