package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7629a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7630b;

    public a0(boolean z2, long j2) {
        this.f7629a = z2;
        this.f7630b = j2;
    }

    public final long a() {
        return this.f7630b;
    }

    public final boolean b() {
        return this.f7629a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f7629a + ", delaySeconds=" + this.f7630b + ')';
    }

    public a0() {
        this(new P().f7605a, new P().f7606b);
    }
}
