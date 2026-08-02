package defpackage;

/* loaded from: classes2.dex */
public final class uhe0 implements eie0 {
    public final String a;
    public final cie0 b;

    public uhe0(String str, cie0 cie0Var) {
        this.a = str;
        this.b = cie0Var;
    }

    public final String a() {
        return this.a;
    }

    public final cie0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhe0)) {
            return false;
        }
        uhe0 uhe0Var = (uhe0) obj;
        return jl40.l(this.a, uhe0Var.a) && this.b.equals(uhe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Contains(argName=" + this.a + ", value=" + this.b + ')';
    }
}
