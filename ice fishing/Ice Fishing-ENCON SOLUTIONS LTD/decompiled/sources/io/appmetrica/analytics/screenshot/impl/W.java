package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C0939e f7615a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f7616b;

    /* renamed from: c, reason: collision with root package name */
    public final C0950p f7617c;

    public W(C0939e c0939e, a0 a0Var, C0950p c0950p) {
        this.f7615a = c0939e;
        this.f7616b = a0Var;
        this.f7617c = c0950p;
    }

    public final C0939e a() {
        return this.f7615a;
    }

    public final C0950p b() {
        return this.f7617c;
    }

    public final a0 c() {
        return this.f7616b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f7615a + ", serviceCaptorConfig=" + this.f7616b + ", contentObserverCaptorConfig=" + this.f7617c + ')';
    }

    public W() {
        this(new C0939e(), new a0(), new C0950p());
    }
}
