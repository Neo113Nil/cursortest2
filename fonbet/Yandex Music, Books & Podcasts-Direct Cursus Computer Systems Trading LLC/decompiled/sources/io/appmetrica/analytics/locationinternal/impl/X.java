package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jj4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class X {
    public final V1 a;
    public final C0856c b;

    public X(V1 v1, C0856c c0856c) {
        this.a = v1;
        this.b = c0856c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!X.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            X x = (X) obj;
            return Intrinsics.d(this.a, x.a) && Intrinsics.d(this.b, x.b);
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.locationinternal.impl.model.ConditionalArguments");
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConditionalArguments(precondition=" + this.a + ", arguments=" + this.b + ')';
    }
}
