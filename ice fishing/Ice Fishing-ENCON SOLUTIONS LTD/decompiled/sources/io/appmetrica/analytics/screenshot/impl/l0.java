package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7662a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7663b;

    public l0(boolean z2, long j2) {
        this.f7662a = z2;
        this.f7663b = j2;
    }

    public final long a() {
        return this.f7663b;
    }

    public final boolean b() {
        return this.f7662a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f7662a + ", delaySeconds=" + this.f7663b + ')';
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
