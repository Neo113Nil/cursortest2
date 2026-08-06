package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7592a;

    /* renamed from: b, reason: collision with root package name */
    public final W f7593b;

    public J(boolean z2, W w2) {
        this.f7592a = z2;
        this.f7593b = w2;
    }

    public final W a() {
        return this.f7593b;
    }

    public final boolean b() {
        return this.f7592a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f7592a + ", config=" + this.f7593b + ')';
    }

    public J() {
        this(new S().f7612a, new W());
    }
}
