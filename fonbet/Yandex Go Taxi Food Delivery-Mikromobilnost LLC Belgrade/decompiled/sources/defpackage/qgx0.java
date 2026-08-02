package defpackage;

/* loaded from: classes2.dex */
public final class qgx0 {
    public final String a;
    public final ws60 b;

    public qgx0(String str, ws60 ws60Var) {
        this.a = str;
        this.b = ws60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgx0)) {
            return false;
        }
        qgx0 qgx0Var = (qgx0) obj;
        return this.a.equals(qgx0Var.a) && this.b.equals(qgx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plan(__typename=" + this.a + ", offerPlan=" + this.b + ')';
    }
}
