package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class jh {
    public final com.yandex.plus.core.graphql.type.u0 a;
    public final ArrayList b;

    public jh(com.yandex.plus.core.graphql.type.u0 u0Var, ArrayList arrayList) {
        this.a = u0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        return this.a == jhVar.a && this.b.equals(jhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnifyingPredicate(type=");
        sb.append(this.a);
        sb.append(", nodeIds=");
        return k5r.o(sb, this.b, ')');
    }
}
