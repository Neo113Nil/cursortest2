package defpackage;

/* loaded from: classes5.dex */
public final class t02 extends k0 {
    public ca[] a;

    public static t02 t(s0 s0Var) {
        ca caVar;
        if (s0Var != null) {
            v0 E = v0.E(s0Var);
            t02 t02Var = new t02();
            if (E.size() >= 1) {
                t02Var.a = new ca[E.size()];
                for (int i = 0; i != E.size(); i++) {
                    ca[] caVarArr = t02Var.a;
                    d0 F = E.F(i);
                    n0 n0Var = ca.c;
                    if (F instanceof ca) {
                        caVar = (ca) F;
                    } else if (F != null) {
                        v0 E2 = v0.E(F);
                        ca caVar2 = new ca();
                        caVar2.a = null;
                        caVar2.b = null;
                        if (E2.size() != 2) {
                            xq0.x("wrong number of elements in sequence");
                            return null;
                        }
                        caVar2.a = n0.F(E2.F(0));
                        caVar2.b = y2d.t(E2.F(1));
                        caVar = caVar2;
                    } else {
                        caVar = null;
                    }
                    caVarArr[i] = caVar;
                }
                return t02Var;
            }
            xq0.x("sequence may not be empty");
        }
        return null;
    }

    @Override // defpackage.d0
    public final s0 n() {
        return new d07(this.a);
    }

    public final String toString() {
        return su4.o(new StringBuilder("AuthorityInformationAccess: Oid("), this.a[0].a.a, ")");
    }
}
