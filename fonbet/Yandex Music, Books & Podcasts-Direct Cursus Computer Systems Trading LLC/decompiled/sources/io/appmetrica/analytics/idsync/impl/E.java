package io.appmetrica.analytics.idsync.impl;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class E {
    public final String a;
    public final long b;
    public final int c;

    public E(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e = (E) obj;
        return Intrinsics.d(this.a, e.a) && this.b == e.b && this.c == e.c;
    }

    public final int hashCode() {
        return A.a(this.c) + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.a + ", lastAttempt=" + this.b + ", lastAttemptResult=" + z.b(this.c) + ')';
    }
}
