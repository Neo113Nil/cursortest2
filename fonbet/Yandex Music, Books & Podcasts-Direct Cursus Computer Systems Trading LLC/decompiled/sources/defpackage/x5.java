package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class x5 implements t9f {
    public final /* synthetic */ int a;

    public /* synthetic */ x5(int i) {
        this.a = i;
    }

    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(int i, Object obj);

    public abstract Iterator d(Object obj);

    @Override // defpackage.t9f
    public Object deserialize(eg7 eg7Var) {
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                return f(eg7Var);
            default:
                if (!(eg7Var instanceof s4f)) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                System.currentTimeMillis();
                s4f s4fVar = (s4f) eg7Var;
                w4f f = s4fVar.f();
                System.currentTimeMillis();
                w1g.w(s4fVar.d()).k(new h8k());
                return g(s4fVar.d(), f);
        }
    }

    public abstract int e(Object obj);

    public Object f(eg7 eg7Var) {
        eg7Var.getClass();
        Object a = a();
        int b = b(a);
        tq5 c = eg7Var.c(getDescriptor());
        if (!c.m()) {
            while (true) {
                int w = c.w(getDescriptor());
                if (w == -1) {
                    break;
                }
                i(c, w + b, a);
            }
        } else {
            int s = c.s(getDescriptor());
            c(s, a);
            h(c, a, b, s);
        }
        c.b(getDescriptor());
        return k(a);
    }

    public abstract Object g(x3f x3fVar, w4f w4fVar);

    public abstract void h(tq5 tq5Var, Object obj, int i, int i2);

    public abstract void i(tq5 tq5Var, int i, Object obj);

    public abstract Object j(Object obj);

    public abstract Object k(Object obj);

    @Override // defpackage.t9f
    public void serialize(l6b l6bVar, Object obj) {
        throw new zhp("Serialization is not supported by ".concat(getClass().getSimpleName()));
    }
}
