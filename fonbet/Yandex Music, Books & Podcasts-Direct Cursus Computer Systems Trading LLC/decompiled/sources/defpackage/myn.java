package defpackage;

/* loaded from: classes4.dex */
public final class myn implements gyn {
    public static final myn a = new myn();

    @Override // defpackage.gyn
    public final eu7 a(eu7 eu7Var) {
        eu7Var.getClass();
        if (eu7Var.f()) {
            return eu7Var;
        }
        return null;
    }

    @Override // defpackage.gyn
    public final eu7 b(eu7 eu7Var) {
        eu7Var.getClass();
        if (eu7Var.g()) {
            return n7w.A(eu7Var, eu7Var.e());
        }
        return null;
    }

    @Override // defpackage.gyn
    public final eu7 c(eu7 eu7Var) {
        eu7Var.getClass();
        if (eu7Var.a.f(eu7Var.b.a + 1)) {
            return n7w.A(eu7Var, eu7Var.d());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof myn);
    }

    public final int hashCode() {
        return -764463681;
    }

    public final String toString() {
        return "RepeatModeOne";
    }
}
