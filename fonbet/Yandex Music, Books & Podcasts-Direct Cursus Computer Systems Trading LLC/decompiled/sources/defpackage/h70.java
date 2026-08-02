package defpackage;

/* loaded from: classes3.dex */
public final class h70 {
    public final g70 a;

    public h70(g70 g70Var) {
        c70 c70Var = c70.a;
        this.a = g70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h70) || this.a != ((h70) obj).a) {
            return false;
        }
        c70 c70Var = c70.a;
        return true;
    }

    public final int hashCode() {
        return c70.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Screen(screen=" + this.a + ", type=" + c70.b + ")";
    }
}
