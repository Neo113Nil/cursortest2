package defpackage;

/* loaded from: classes5.dex */
public final class s76 {
    public final r76 a;
    public final sgr b;

    public s76(r76 r76Var, sgr sgrVar) {
        this.a = r76Var;
        o2g.O(sgrVar, "status is null");
        this.b = sgrVar;
    }

    public static s76 a(r76 r76Var) {
        o2g.J("state is TRANSIENT_ERROR. Use forError() instead", r76Var != r76.c);
        return new s76(r76Var, sgr.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s76)) {
            return false;
        }
        s76 s76Var = (s76) obj;
        return this.a.equals(s76Var.a) && this.b.equals(s76Var.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        sgr sgrVar = this.b;
        boolean g = sgrVar.g();
        r76 r76Var = this.a;
        if (g) {
            return r76Var.toString();
        }
        return r76Var + "(" + sgrVar + ")";
    }
}
