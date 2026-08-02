package defpackage;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;

/* loaded from: classes6.dex */
public final class u670 {
    public final yvf0 a;
    public final jc00 b;
    public final mf4 c;
    public final ra00 d;

    public u670(yvf0 yvf0Var, jc00 jc00Var, mf4 mf4Var, ra00 ra00Var) {
        this.a = yvf0Var;
        this.b = jc00Var;
        this.c = mf4Var;
        this.d = ra00Var;
    }

    public final boolean a(bov0 bov0Var, sls slsVar, tls tlsVar, sls slsVar2) {
        ijv0 ijv0Var;
        if (bov0Var != null && (ijv0Var = bov0Var.c) != null) {
            ziv0 ziv0Var = ziv0.a;
            boolean equals = ijv0Var.equals(ziv0Var);
            yvf0 yvf0Var = this.a;
            ra00 ra00Var = this.d;
            jc00 jc00Var = this.b;
            Object obj = nph.a;
            mf4 mf4Var = this.c;
            if (equals) {
                ic00 ic00Var = ((kc00) jc00Var).a;
                ic00Var.getClass();
                if (ic00Var instanceof hc00) {
                    if (!mf4Var.a()) {
                        ra00Var.c.e((qa00) yvf0Var.get(), obj);
                    }
                    return true;
                }
            }
            if (ijv0Var.equals(ziv0Var)) {
                return mf4Var.a();
            }
            if (ijv0Var instanceof fjv0) {
                lsw lswVar = ((fjv0) ijv0Var).b;
                if (lswVar != null) {
                    obj = new rph(lswVar);
                }
                ra00Var.c.e((qa00) yvf0Var.get(), obj);
                return true;
            }
            ic00 ic00Var2 = ((kc00) jc00Var).a;
            ic00Var2.getClass();
            boolean z = ic00Var2 instanceof hc00;
            bjv0 bjv0Var = bjv0.a;
            if (z && (ijv0Var.equals(djv0.a) || ijv0Var.equals(bjv0Var))) {
                slsVar2.invoke();
                return true;
            }
            ic00 ic00Var3 = ((kc00) jc00Var).a;
            ic00Var3.getClass();
            if ((ic00Var3 instanceof hc00) && ijv0Var.equals(gjv0.a)) {
                khv0 khv0Var = bov0Var.b;
                ra00Var.c.e((qa00) yvf0Var.get(), new pph(khv0Var instanceof ehv0 ? AdditionalAction.PREORDER : khv0Var instanceof chv0 ? AdditionalAction.ORDER_TO_ANOTHER : AdditionalAction.NONE));
                return true;
            }
            if (ijv0Var.equals(bjv0Var)) {
                slsVar.invoke();
                return false;
            }
            if (ijv0Var.equals(cjv0.a)) {
                tlsVar.invoke(new vm30(0));
                return true;
            }
            if (ijv0Var instanceof ejv0) {
                tlsVar.invoke(new zm30(((ejv0) ijv0Var).a, pj40.c));
                return true;
            }
        }
        return false;
    }
}
