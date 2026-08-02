package defpackage;

/* loaded from: classes3.dex */
public final class mf7 implements pf7 {
    public final String a;
    public final jp0 b;

    public mf7(String str, jp0 jp0Var) {
        this.a = str;
        this.b = jp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf7)) {
            return false;
        }
        mf7 mf7Var = (mf7) obj;
        return this.a.equals(mf7Var.a) && this.b.equals(mf7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Details(errorsAndWarningsOverview=" + this.a + ", hotReload=" + this.b + ')';
    }
}
