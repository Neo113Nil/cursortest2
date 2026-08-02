package defpackage;

/* loaded from: classes.dex */
public abstract class x2o {
    public abstract void a(ull0 ull0Var, Object obj);

    public abstract String b();

    public final int c(oll0 oll0Var, Object obj) {
        if (obj == null) {
            return 0;
        }
        ull0 T0 = oll0Var.T0(b());
        try {
            a(T0, obj);
            T0.q();
            gwk0.m(T0, null);
            return jx81.x(oll0Var);
        } finally {
        }
    }
}
