package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7667a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7668b;

    public C0948n(boolean z2, long j2) {
        this.f7667a = z2;
        this.f7668b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0948n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C0948n c0948n = (C0948n) obj;
        return this.f7667a == c0948n.f7667a && this.f7668b == c0948n.f7668b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7668b) + (Boolean.hashCode(this.f7667a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f7667a + ", delaySeconds=" + this.f7668b + ')';
    }

    public C0948n(H h2) {
        this(h2.b(), h2.a());
    }
}
