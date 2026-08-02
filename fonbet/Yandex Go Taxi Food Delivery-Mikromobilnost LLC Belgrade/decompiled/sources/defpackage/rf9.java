package defpackage;

/* loaded from: classes.dex */
public final class rf9 {
    public final uo5 a;
    public final tls b;
    public final qar c;
    public final boolean d;

    public rf9(uo5 uo5Var, qar qarVar, tls tlsVar, boolean z) {
        this.a = uo5Var;
        this.b = tlsVar;
        this.c = qarVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf9)) {
            return false;
        }
        rf9 rf9Var = (rf9) obj;
        return this.a.equals(rf9Var.a) && this.b.equals(rf9Var.b) && jl40.l(this.c, rf9Var.c) && this.d == rf9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ly3.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", animationSpec=");
        sb.append(this.c);
        sb.append(", clip=");
        return unr0.u(sb, this.d, ')');
    }
}
