package defpackage;

/* loaded from: classes4.dex */
public final class u14 implements c24 {
    public final q91 a;
    public final u51 b;

    public u14(q91 q91Var, u51 u51Var) {
        this.a = q91Var;
        this.b = u51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u14)) {
            return false;
        }
        u14 u14Var = (u14) obj;
        return this.a.equals(u14Var.a) && this.b.equals(u14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Artist(uiData=" + this.a + ", artist=" + this.b + ")";
    }
}
