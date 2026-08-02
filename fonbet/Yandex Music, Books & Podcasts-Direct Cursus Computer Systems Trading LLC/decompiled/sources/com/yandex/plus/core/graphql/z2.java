package com.yandex.plus.core.graphql;

import com.yandex.plus.core.graphql.fragment.n7;

/* loaded from: classes4.dex */
public final class z2 {
    public final String a;
    public final n7 b;

    public z2(String str, n7 n7Var) {
        this.a = str;
        this.b = n7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return this.a.equals(z2Var.a) && this.b.equals(z2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Member(__typename=" + this.a + ", familyMember=" + this.b + ')';
    }
}
