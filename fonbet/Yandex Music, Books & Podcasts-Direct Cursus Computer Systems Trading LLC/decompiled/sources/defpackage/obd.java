package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class obd extends oyc {
    public final /* synthetic */ int a;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        Object N;
        switch (this.a) {
            case 0:
                String str = (String) ouj.i(list, 0);
                boolean l = l();
                es6 es6Var = (es6) g06Var.b;
                if (l) {
                    Object obj = list.get(1);
                    obj.getClass();
                    N = es6Var.N(str, (String) obj);
                } else {
                    N = es6Var.N(str, "global");
                }
                if (N != null) {
                    return N;
                }
                ghh.J(c(), list, "Missing value.", null);
                throw null;
            default:
                String str2 = (String) ouj.i(list, 0);
                ssb ssbVar = new ssb(3, this, list);
                boolean l2 = l();
                es6 es6Var2 = (es6) g06Var.b;
                if (!l2) {
                    return j(es6Var2.N(str2, "global"), ssbVar);
                }
                Object obj2 = list.get(1);
                obj2.getClass();
                return j(es6Var2.N(str2, (String) obj2), ssbVar);
        }
    }

    @Override // defpackage.oyc
    public final boolean f() {
        switch (this.a) {
        }
        return false;
    }

    public Object j(Object obj, ssb ssbVar) {
        if (obj == null) {
            obj = null;
        }
        return obj == null ? ssbVar.invoke() : obj;
    }

    public Object k(List list) {
        list.getClass();
        Object obj = list.get(l() ? 2 : 1);
        obj.getClass();
        return obj;
    }

    public boolean l() {
        switch (this.a) {
        }
        return false;
    }
}
