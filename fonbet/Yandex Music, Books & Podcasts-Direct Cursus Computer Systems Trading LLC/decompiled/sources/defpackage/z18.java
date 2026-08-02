package defpackage;

/* loaded from: classes.dex */
public final class z18 {
    public final boolean a;
    public final boolean b;
    public final a9p c;
    public final boolean d;
    public final boolean e;

    public z18(int i) {
        a9p a9pVar = a9p.a;
        this.a = true;
        this.b = true;
        this.c = a9pVar;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z18)) {
            return false;
        }
        z18 z18Var = (z18) obj;
        return this.a == z18Var.a && this.b == z18Var.b && this.c == z18Var.c && this.d == z18Var.d && this.e == z18Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.e((this.c.hashCode() + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
