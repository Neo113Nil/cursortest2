package io.appmetrica.analytics.idsync.impl;

import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes4.dex */
public final class E {
    public final String a;
    public final long b;
    public final A c;

    public E(String str, long j, A a) {
        this.a = str;
        this.b = j;
        this.c = a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e = (E) obj;
        return jl40.l(this.a, e.a) && this.b == e.b && this.c == e.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RequestState(type=" + this.a + ", lastAttempt=" + this.b + ", lastAttemptResult=" + this.c + ')';
    }
}
