package com.yandex.plus.core.graphql;

/* loaded from: classes4.dex */
public final class r2 {
    public final String a;
    public final com.yandex.plus.core.graphql.fragment.u b;

    public r2(String str, com.yandex.plus.core.graphql.fragment.u uVar) {
        this.a = str;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.a.equals(r2Var.a) && this.b.equals(r2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Avatar(__typename=" + this.a + ", avatar=" + this.b + ')';
    }
}
