package defpackage;

/* loaded from: classes3.dex */
public final class q06 implements r06 {
    public final m16 a;
    public final w06 b;

    public q06(m16 m16Var, w06 w06Var) {
        this.a = m16Var;
        this.b = w06Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q06)) {
            return false;
        }
        q06 q06Var = (q06) obj;
        return this.a.equals(q06Var.a) && this.b.equals(q06Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(headerState=" + this.a + ", footerState=" + this.b + ")";
    }
}
