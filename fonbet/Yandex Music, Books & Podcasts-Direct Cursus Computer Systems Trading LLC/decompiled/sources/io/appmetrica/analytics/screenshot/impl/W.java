package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes5.dex */
public final class W {
    public final C0937e a;
    public final a0 b;
    public final C0948p c;

    public W() {
        this(new C0937e(), new a0(), new C0948p());
    }

    public final C0937e a() {
        return this.a;
    }

    public final C0948p b() {
        return this.c;
    }

    public final a0 c() {
        return this.b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    public W(C0937e c0937e, a0 a0Var, C0948p c0948p) {
        this.a = c0937e;
        this.b = a0Var;
        this.c = c0948p;
    }
}
