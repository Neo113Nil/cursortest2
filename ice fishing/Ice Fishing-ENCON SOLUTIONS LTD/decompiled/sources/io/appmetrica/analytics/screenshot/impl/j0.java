package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7652a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f7653b;

    public j0(boolean z2, k0 k0Var) {
        this.f7652a = z2;
        this.f7653b = k0Var;
    }

    public final k0 a() {
        return this.f7653b;
    }

    public final boolean b() {
        return this.f7652a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f7652a + ", config=" + this.f7653b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(J j2) {
        this(r0, r3 != null ? new k0(r3) : null);
        boolean b2 = j2.b();
        W a2 = j2.a();
    }
}
