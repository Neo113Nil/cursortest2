package com.yandex.plus.core.graphql;

import com.yandex.plus.core.graphql.fragment.v8;

/* loaded from: classes4.dex */
public final class o2 {
    public final String a;
    public final v8 b;

    public o2(String str, v8 v8Var) {
        this.a = str;
        this.b = v8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.a.equals(o2Var.a) && this.b.equals(o2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalStart(__typename=" + this.a + ", invoice=" + this.b + ')';
    }
}
