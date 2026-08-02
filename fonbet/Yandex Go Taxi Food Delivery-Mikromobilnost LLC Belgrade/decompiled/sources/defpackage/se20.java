package defpackage;

/* loaded from: classes8.dex */
public final class se20 {
    public final oe20 a;
    public final oe20 b;
    public final oe20 c;
    public final oe20 d;

    public se20(oe20 oe20Var, oe20 oe20Var2, oe20 oe20Var3, oe20 oe20Var4) {
        this.a = oe20Var;
        this.b = oe20Var2;
        this.c = oe20Var3;
        this.d = oe20Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se20)) {
            return false;
        }
        se20 se20Var = (se20) obj;
        return this.a.equals(se20Var.a) && this.b.equals(se20Var.b) && this.c.equals(se20Var.c) && this.d.equals(se20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedRect(leftTop=" + this.a + ", rightTop=" + this.b + ", rightBottom=" + this.c + ", leftBottom=" + this.d + ')';
    }
}
