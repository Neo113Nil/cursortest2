package com.yandex.plus.core.graphql;

/* loaded from: classes4.dex */
public final class v2 {
    public final String a;
    public final com.yandex.plus.core.graphql.fragment.u b;

    public v2(String str, com.yandex.plus.core.graphql.fragment.u uVar) {
        this.a = str;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.a.equals(v2Var.a) && this.b.equals(v2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Avatar(__typename=" + this.a + ", avatar=" + this.b + ')';
    }
}
