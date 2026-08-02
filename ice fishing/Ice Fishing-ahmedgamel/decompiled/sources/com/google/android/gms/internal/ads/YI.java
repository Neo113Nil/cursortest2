package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* loaded from: classes2.dex */
public final class YI {

    /* renamed from: c, reason: collision with root package name */
    public static final YI f29441c = new YI("NIST_P256", MF.f27065a);

    /* renamed from: d, reason: collision with root package name */
    public static final YI f29442d = new YI("NIST_P384", MF.f27066b);

    /* renamed from: e, reason: collision with root package name */
    public static final YI f29443e = new YI("NIST_P521", MF.f27067c);

    /* renamed from: a, reason: collision with root package name */
    public final String f29444a;

    /* renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f29445b;

    public YI(String str, ECParameterSpec eCParameterSpec) {
        this.f29444a = str;
        this.f29445b = eCParameterSpec;
    }

    public final String toString() {
        return this.f29444a;
    }
}
