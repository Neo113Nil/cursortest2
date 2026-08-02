package defpackage;

/* loaded from: classes4.dex */
public final class kyn implements gyn {
    public static final kyn a = new kyn();

    @Override // defpackage.gyn
    public final eu7 a(eu7 eu7Var) {
        eu7Var.getClass();
        return c(eu7Var);
    }

    @Override // defpackage.gyn
    public final eu7 b(eu7 eu7Var) {
        eu7Var.getClass();
        cu7 cu7Var = eu7Var.a;
        if (cu7Var.g(eu7Var.b.a - 1)) {
            return n7w.A(eu7Var, eu7Var.e());
        }
        if (cu7Var.f > 0) {
            return n7w.A(eu7Var, u75.g(cu7Var.a.f()));
        }
        return null;
    }

    @Override // defpackage.gyn
    public final eu7 c(eu7 eu7Var) {
        eu7Var.getClass();
        cu7 cu7Var = eu7Var.a;
        if (cu7Var.g(eu7Var.b.a + 1)) {
            return n7w.A(eu7Var, eu7Var.d());
        }
        if (cu7Var.f > 0) {
            return n7w.A(eu7Var, 0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kyn);
    }

    public final int hashCode() {
        return -764477190;
    }

    public final String toString() {
        return "RepeatModeAll";
    }
}
