package defpackage;

import com.yandex.plus.home.plaque.repository.api.model.Predicate$Compare$Type;

/* loaded from: classes2.dex */
public final class the0 implements eie0 {
    public final String a;
    public final Predicate$Compare$Type b;
    public final cie0 c;

    public the0(String str, Predicate$Compare$Type predicate$Compare$Type, cie0 cie0Var) {
        this.a = str;
        this.b = predicate$Compare$Type;
        this.c = cie0Var;
    }

    public final String a() {
        return this.a;
    }

    public final Predicate$Compare$Type b() {
        return this.b;
    }

    public final cie0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof the0)) {
            return false;
        }
        the0 the0Var = (the0) obj;
        return jl40.l(this.a, the0Var.a) && this.b == the0Var.b && this.c.equals(the0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Compare(argName=" + this.a + ", type=" + this.b + ", value=" + this.c + ')';
    }
}
