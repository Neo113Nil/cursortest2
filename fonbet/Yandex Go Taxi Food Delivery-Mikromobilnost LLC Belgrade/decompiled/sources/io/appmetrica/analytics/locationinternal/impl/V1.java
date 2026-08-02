package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes9.dex */
public final class V1 {
    public final List a;
    public final List b;

    public V1(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!V1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        V1 v1 = (V1) obj;
        return jl40.l(this.a, v1.a) && jl40.l(this.b, v1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Precondition(chargeTypes=");
        sb.append(this.a);
        sb.append(", appStates=");
        return unr0.t(sb, this.b, ')');
    }
}
