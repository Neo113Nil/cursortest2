package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* loaded from: classes2.dex */
public final class YI {

    /* renamed from: c, reason: collision with root package name */
    public static final YI f28664c = new YI("NIST_P256", MF.f26274a);

    /* renamed from: d, reason: collision with root package name */
    public static final YI f28665d = new YI("NIST_P384", MF.f26275b);

    /* renamed from: e, reason: collision with root package name */
    public static final YI f28666e = new YI("NIST_P521", MF.f26276c);

    /* renamed from: a, reason: collision with root package name */
    public final String f28667a;

    /* renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f28668b;

    public YI(String str, ECParameterSpec eCParameterSpec) {
        this.f28667a = str;
        this.f28668b = eCParameterSpec;
    }

    public final String toString() {
        return this.f28667a;
    }
}
