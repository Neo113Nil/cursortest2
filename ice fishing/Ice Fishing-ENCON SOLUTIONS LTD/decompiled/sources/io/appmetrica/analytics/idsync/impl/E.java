package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f3982a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3984c;

    public E(String str, long j2, int i2) {
        this.f3982a = str;
        this.f3983b = j2;
        this.f3984c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e2 = (E) obj;
        return kotlin.jvm.internal.i.a(this.f3982a, e2.f3982a) && this.f3983b == e2.f3983b && this.f3984c == e2.f3984c;
    }

    public final int hashCode() {
        return A.a(this.f3984c) + ((Long.hashCode(this.f3983b) + (this.f3982a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f3982a + ", lastAttempt=" + this.f3983b + ", lastAttemptResult=" + z.b(this.f3984c) + ')';
    }
}
