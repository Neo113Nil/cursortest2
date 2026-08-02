package defpackage;

/* loaded from: classes10.dex */
public final class tt6 {
    public final ht6 a;
    public final int b;
    public final int c;

    public tt6(ht6 ht6Var, int i, int i2) {
        this.a = ht6Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt6)) {
            return false;
        }
        tt6 tt6Var = (tt6) obj;
        return jl40.l(this.a, tt6Var.a) && this.b == tt6Var.b && this.c == tt6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return oyr.s(sb, this.c, ')');
    }
}
