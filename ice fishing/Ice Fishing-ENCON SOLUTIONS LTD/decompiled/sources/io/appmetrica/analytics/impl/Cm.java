package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Cm {

    /* renamed from: a, reason: collision with root package name */
    public final int f4275a;

    public Cm(int i2) {
        this.f4275a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cm) && this.f4275a == ((Cm) obj).f4275a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4275a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f4275a + ')';
    }
}
