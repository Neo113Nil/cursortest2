package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.pJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3736pJ extends KJ {

    /* renamed from: b, reason: collision with root package name */
    public final C3574mJ f33376b;

    /* renamed from: c, reason: collision with root package name */
    public final C3791qK f33377c;

    /* renamed from: d, reason: collision with root package name */
    public final C3791qK f33378d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f33379e;

    public C3736pJ(C3574mJ c3574mJ, C3791qK c3791qK, C3791qK c3791qK2, Integer num) {
        this.f33376b = c3574mJ;
        this.f33377c = c3791qK;
        this.f33378d = c3791qK2;
        this.f33379e = num;
    }

    public static C3736pJ k(C3520lJ c3520lJ, C3791qK c3791qK, Integer num) {
        C3791qK a9;
        C3574mJ c3574mJ = new C3574mJ(c3520lJ);
        C3520lJ c3520lJ2 = C3520lJ.f32563e;
        boolean equals = c3520lJ.equals(c3520lJ2);
        String str = c3520lJ.f32564a;
        if (!equals && num == null) {
            throw new GeneralSecurityException(D.y.o(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c3520lJ.equals(c3520lJ2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        byte[] bArr = c3791qK.f33687a;
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(D.y.j(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (c3520lJ == c3520lJ2) {
            a9 = AbstractC3571mG.f32676a;
        } else if (c3520lJ == C3520lJ.f32561c || c3520lJ == C3520lJ.f32562d) {
            a9 = AbstractC3571mG.a(num.intValue());
        } else {
            if (c3520lJ != C3520lJ.f32560b) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            a9 = AbstractC3571mG.b(num.intValue());
        }
        return new C3736pJ(c3574mJ, c3791qK, a9, num);
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f33376b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f33379e;
    }

    @Override // com.google.android.gms.internal.ads.KJ
    public final C3791qK j() {
        return this.f33378d;
    }
}
