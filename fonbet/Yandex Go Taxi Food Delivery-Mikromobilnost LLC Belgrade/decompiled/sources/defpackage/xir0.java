package defpackage;

/* loaded from: classes10.dex */
public final class xir0 {
    public final byk0 a;
    public final byk0 b;
    public final byk0 c;

    public xir0(int i) {
        byk0 c = cyk0.c(4.0f);
        byk0 c2 = cyk0.c(4.0f);
        byk0 c3 = cyk0.c(0.0f);
        this.a = c;
        this.b = c2;
        this.c = c3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xir0)) {
            return false;
        }
        xir0 xir0Var = (xir0) obj;
        return jl40.l(this.a, xir0Var.a) && jl40.l(this.b, xir0Var.b) && jl40.l(this.c, xir0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public xir0() {
        this(0);
    }
}
