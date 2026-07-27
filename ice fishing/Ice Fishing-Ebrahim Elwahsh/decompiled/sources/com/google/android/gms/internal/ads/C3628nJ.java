package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.nJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3628nJ extends JJ {

    /* renamed from: b, reason: collision with root package name */
    public final C3736pJ f32847b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f32848c;

    public C3628nJ(C3736pJ c3736pJ, Mu mu) {
        this.f32847b = c3736pJ;
        this.f32848c = mu;
    }

    public static C3628nJ k(C3736pJ c3736pJ, Mu mu) {
        C3791qK c3791qK = (C3791qK) mu.f26395u;
        if (c3791qK.f33687a.length != 32) {
            int length = c3791qK.f33687a.length;
            throw new GeneralSecurityException(D.y.j(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (Arrays.equals(c3736pJ.f33377c.b(), AbstractC2655Lg.m(AbstractC2655Lg.p(c3791qK.b())))) {
            return new C3628nJ(c3736pJ, mu);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final AbstractC4000uE b() {
        return this.f32847b.f33376b;
    }

    @Override // com.google.android.gms.internal.ads.JJ
    public final /* synthetic */ KJ j() {
        return this.f32847b;
    }
}
