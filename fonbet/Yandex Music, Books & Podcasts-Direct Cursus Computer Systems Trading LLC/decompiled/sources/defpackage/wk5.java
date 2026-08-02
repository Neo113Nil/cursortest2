package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class wk5 extends a8 {
    public final Object a;
    public int b;
    public final /* synthetic */ xk5 c;

    public wk5(xk5 xk5Var, int i) {
        this.c = xk5Var;
        Object obj = xk5.j;
        this.a = xk5Var.k()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        xk5 xk5Var = this.c;
        if (i != -1 && i < xk5Var.size()) {
            if (hdg.S(obj, xk5Var.k()[this.b])) {
                return;
            }
        }
        Object obj2 = xk5.j;
        this.b = xk5Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        xk5 xk5Var = this.c;
        Map c = xk5Var.c();
        if (c != null) {
            return c.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return xk5Var.l()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        xk5 xk5Var = this.c;
        Map c = xk5Var.c();
        Object obj2 = this.a;
        if (c != null) {
            return c.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            xk5Var.put(obj2, obj);
            return null;
        }
        Object obj3 = xk5Var.l()[i];
        xk5Var.l()[this.b] = obj;
        return obj3;
    }
}
