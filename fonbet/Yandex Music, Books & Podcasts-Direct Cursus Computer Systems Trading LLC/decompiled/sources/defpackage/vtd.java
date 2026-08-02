package defpackage;

/* loaded from: classes5.dex */
public final class vtd {
    public static final pn3 d;
    public static final pn3 e;
    public static final pn3 f;
    public static final pn3 g;
    public static final pn3 h;
    public final pn3 a;
    public final pn3 b;
    public final int c;

    static {
        pn3 pn3Var = pn3.d;
        d = ovn.C(":status");
        e = ovn.C(":method");
        f = ovn.C(":path");
        g = ovn.C(":scheme");
        h = ovn.C(":authority");
        ovn.C(":host");
        ovn.C(":version");
    }

    public vtd(pn3 pn3Var, pn3 pn3Var2) {
        this.a = pn3Var;
        this.b = pn3Var2;
        this.c = pn3Var2.d() + pn3Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vtd) {
            vtd vtdVar = (vtd) obj;
            if (this.a.equals(vtdVar.a) && this.b.equals(vtdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return ouj.o(this.a.u(), ": ", this.b.u());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vtd(String str, String str2) {
        this(ovn.C(str), ovn.C(str2));
        pn3 pn3Var = pn3.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vtd(pn3 pn3Var, String str) {
        this(pn3Var, ovn.C(str));
        pn3 pn3Var2 = pn3.d;
    }
}
