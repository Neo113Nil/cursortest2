package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;

/* loaded from: classes9.dex */
public final class X {
    public final V1 a;
    public final C0933c b;

    public X(V1 v1, C0933c c0933c) {
        this.a = v1;
        this.b = c0933c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!X.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        X x = (X) obj;
        return jl40.l(this.a, x.a) && jl40.l(this.b, x.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConditionalArguments(precondition=" + this.a + ", arguments=" + this.b + ')';
    }
}
