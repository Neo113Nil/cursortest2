package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class z3f {
    public abstract Object a(l7f l7fVar);

    public final Object b(String str) {
        hi3 hi3Var = new hi3();
        hi3Var.S0(str);
        l7f l7fVar = new l7f(hi3Var);
        Object a = a(l7fVar);
        if (l7fVar.peek() == 10) {
            return a;
        }
        throw new wp3("JSON document was not fully consumed.");
    }

    public final tgj c() {
        return this instanceof tgj ? (tgj) this : new tgj(this);
    }

    public final String d(Object obj) {
        hi3 hi3Var = new hi3();
        try {
            e(new n7f(hi3Var), obj);
            return hi3Var.G0();
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }

    public abstract void e(n7f n7fVar, Object obj);
}
