package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* renamed from: com.google.android.gms.internal.ads.gJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3252gJ {

    /* renamed from: c, reason: collision with root package name */
    public static final C3252gJ f30976c = new C3252gJ("NIST_P256", PF.f26886a);

    /* renamed from: d, reason: collision with root package name */
    public static final C3252gJ f30977d = new C3252gJ("NIST_P384", PF.f26887b);

    /* renamed from: e, reason: collision with root package name */
    public static final C3252gJ f30978e = new C3252gJ("NIST_P521", PF.f26888c);

    /* renamed from: a, reason: collision with root package name */
    public final String f30979a;

    /* renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f30980b;

    public C3252gJ(String str, ECParameterSpec eCParameterSpec) {
        this.f30979a = str;
        this.f30980b = eCParameterSpec;
    }

    public final String toString() {
        return this.f30979a;
    }
}
