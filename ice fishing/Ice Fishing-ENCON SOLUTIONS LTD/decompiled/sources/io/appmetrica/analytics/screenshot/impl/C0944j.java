package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7651a;

    public C0944j(boolean z2) {
        this.f7651a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0944j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f7651a == ((C0944j) obj).f7651a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7651a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f7651a + ')';
    }

    public C0944j(C0959z c0959z) {
        this(c0959z.a());
    }
}
