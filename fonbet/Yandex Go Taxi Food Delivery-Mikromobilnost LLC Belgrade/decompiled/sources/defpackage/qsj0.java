package defpackage;

/* loaded from: classes13.dex */
public final class qsj0 {
    public static tx90 a(erw erwVar, tu5 tu5Var) {
        tx90 tx90Var;
        y931 y931Var = ((b90) erwVar).f;
        if (y931Var.equals(v931.a)) {
            tx90Var = tu5Var.f;
        } else {
            if (!(y931Var instanceof w931)) {
                w511.b();
                return null;
            }
            tx90Var = ((w931) y931Var).a;
            if (tx90Var == null) {
                tx90Var = tu5Var.f;
            }
        }
        if (tx90Var != null) {
            return tx90Var;
        }
        ny61.g("Unknown or absent profile null");
        return null;
    }
}
