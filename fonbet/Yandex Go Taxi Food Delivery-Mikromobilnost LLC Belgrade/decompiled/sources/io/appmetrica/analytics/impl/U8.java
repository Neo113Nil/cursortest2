package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes9.dex */
public final class U8 extends I6 {
    public List d;
    public String e;
    public Boolean f;

    public final void a(List<String> list) {
        this.d = list;
    }

    public final String c() {
        return this.e;
    }

    public final List<String> d() {
        return this.d;
    }

    public final Boolean e() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.impl.I6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.d + ", mApiKey='" + this.e + "', dataSendingEnabled=" + this.f + "} " + super.toString();
    }

    public final void a(String str) {
        this.e = str;
    }

    public final void a(Boolean bool) {
        this.f = bool;
    }
}
