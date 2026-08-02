package defpackage;

/* loaded from: classes.dex */
public final class vwi {
    public final jgg0 a;
    public final int b;
    public final int c;

    public vwi(jgg0 jgg0Var, int i, int i2) {
        jhe0.a(jgg0Var, "Null dependency anInterface.");
        this.a = jgg0Var;
        this.b = i;
        this.c = i2;
    }

    public static vwi a(jgg0 jgg0Var) {
        return new vwi(jgg0Var, 1, 0);
    }

    public static vwi b(Class cls) {
        return new vwi(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vwi)) {
            return false;
        }
        vwi vwiVar = (vwi) obj;
        return this.a.equals(vwiVar.a) && this.b == vwiVar.b && this.c == vwiVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                ny61.f(oyr.i(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return oyr.t(sb, str, "}");
    }

    public vwi(int i, int i2, Class cls) {
        this(jgg0.a(cls), i, i2);
    }
}
