package com.yandex.plus.core.graphql;

/* loaded from: classes4.dex */
public final class t2 {
    public final String a;
    public final r2 b;

    public t2(String str, r2 r2Var) {
        this.a = str;
        this.b = r2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.a.equals(t2Var.a) && this.b.equals(t2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "User(id=" + this.a + ", avatar=" + this.b + ')';
    }
}
