package defpackage;

/* loaded from: classes10.dex */
public final class xa6 {
    public final float a;
    public final a6t0 b;

    public xa6(float f, a6t0 a6t0Var) {
        this.a = f;
        this.b = a6t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa6)) {
            return false;
        }
        xa6 xa6Var = (xa6) obj;
        return y7m.b(this.a, xa6Var.a) && this.b.equals(xa6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) y7m.c(this.a)) + ", brush=" + this.b + ')';
    }
}
