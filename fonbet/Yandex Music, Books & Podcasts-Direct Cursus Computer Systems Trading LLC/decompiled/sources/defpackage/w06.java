package defpackage;

/* loaded from: classes3.dex */
public final class w06 implements y06 {
    public final fs a;
    public final int b;

    public w06(fs fsVar, int i) {
        this.a = fsVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w06)) {
            return false;
        }
        w06 w06Var = (w06) obj;
        return this.a.equals(w06Var.a) && this.b == w06Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(concerts=" + this.a + ", concertsCount=" + this.b + ")";
    }
}
