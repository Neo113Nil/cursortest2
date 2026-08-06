package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f3975a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3976b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3977c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3979e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f3980f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f3981g;

    public D(String str, boolean z2, String str2, boolean z3, int i2, byte[] bArr, Map map) {
        this.f3975a = str;
        this.f3976b = z2;
        this.f3977c = str2;
        this.f3978d = z3;
        this.f3979e = i2;
        this.f3980f = bArr;
        this.f3981g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f3975a + "', isCompleted=" + this.f3976b + ", url=" + this.f3977c + ", responseCodeIsValid=" + this.f3978d + ", responseCode=" + this.f3979e + ", responseBody=" + this.f3980f + ", responseHeaders=" + this.f3981g + ')';
    }
}
