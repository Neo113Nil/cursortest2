package defpackage;

/* loaded from: classes.dex */
public abstract class y2o {
    public abstract void a(ull0 ull0Var, Object obj);

    public abstract String b();

    public final void c(oll0 oll0Var, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        ull0 T0 = oll0Var.T0(b());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    a(T0, obj);
                    T0.q();
                    T0.reset();
                }
            }
            gwk0.m(T0, null);
        } finally {
        }
    }

    public final void d(oll0 oll0Var, Object obj) {
        if (obj == null) {
            return;
        }
        ull0 T0 = oll0Var.T0(b());
        try {
            a(T0, obj);
            T0.q();
            gwk0.m(T0, null);
        } finally {
        }
    }

    public final long e(oll0 oll0Var, Object obj) {
        if (obj == null) {
            return -1L;
        }
        ull0 T0 = oll0Var.T0(b());
        try {
            a(T0, obj);
            T0.q();
            gwk0.m(T0, null);
            return jx81.t(oll0Var);
        } finally {
        }
    }
}
