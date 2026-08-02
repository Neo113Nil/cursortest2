package defpackage;

/* loaded from: classes4.dex */
public final class lyn implements gyn {
    public static final lyn a = new lyn();

    @Override // defpackage.gyn
    public final eu7 a(eu7 eu7Var) {
        eu7Var.getClass();
        return c(eu7Var);
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
        return this == obj || (obj instanceof lyn);
    }

    public final int hashCode() {
        return 2071401215;
    }

    public final String toString() {
        return "RepeatModeNone";
    }
}
