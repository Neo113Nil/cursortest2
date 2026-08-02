package defpackage;

/* loaded from: classes3.dex */
public final class n06 {
    public final o06 a;
    public final o06 b;

    public n06(o06 o06Var, o06 o06Var2) {
        this.a = o06Var;
        this.b = o06Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n06)) {
            return false;
        }
        n06 n06Var = (n06) obj;
        return this.a.equals(n06Var.a) && this.b.equals(n06Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConcertTabConfig(header=" + this.a + ", footer=" + this.b + ")";
    }
}
