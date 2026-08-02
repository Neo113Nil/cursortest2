package defpackage;

/* loaded from: classes3.dex */
public final class jg1 implements kg1 {
    public final qtn a;
    public final boolean b;
    public final thj c;

    public jg1(qtn qtnVar, boolean z, thj thjVar) {
        this.a = qtnVar;
        this.b = z;
        this.c = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg1)) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        return this.a.equals(jg1Var.a) && this.b == jg1Var.b && this.c.equals(jg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Success(uiDate=" + this.a + ", isPresaved=" + this.b + ", info=" + this.c + ")";
    }
}
