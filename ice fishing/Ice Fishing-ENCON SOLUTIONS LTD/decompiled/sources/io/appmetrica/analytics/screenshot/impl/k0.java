package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f7657a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f7658b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f7659c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f7657a = h0Var;
        this.f7658b = l0Var;
        this.f7659c = i0Var;
    }

    public final h0 a() {
        return this.f7657a;
    }

    public final i0 b() {
        return this.f7659c;
    }

    public final l0 c() {
        return this.f7658b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f7657a + ", serviceCaptorConfig=" + this.f7658b + ", contentObserverCaptorConfig=" + this.f7659c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(W w2) {
        this(r2, r3, r5 != null ? new i0(r5) : null);
        C0939e a2 = w2.a();
        h0 h0Var = a2 != null ? new h0(a2) : null;
        a0 c2 = w2.c();
        l0 l0Var = c2 != null ? new l0(c2) : null;
        C0950p b2 = w2.b();
    }
}
