package com.yandex.plus.core.graphql;

/* loaded from: classes4.dex */
public final class a3 {
    public final String a;
    public final v2 b;
    public final x2 c;

    public a3(String str, v2 v2Var, x2 x2Var) {
        this.a = str;
        this.b = v2Var;
        this.c = x2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.a.equals(a3Var.a) && this.b.equals(a3Var.b) && this.c.equals(a3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "User(id=" + this.a + ", avatar=" + this.b + ", family=" + this.c + ')';
    }
}
