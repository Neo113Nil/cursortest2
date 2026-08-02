package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class fzl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gzl b;

    public /* synthetic */ fzl(gzl gzlVar, int i) {
        this.a = i;
        this.b = gzlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                gzl gzlVar = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-285067434, new fzl(gzlVar, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                gzl gzlVar2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    vci vciVar = vci.a;
                    kfh d = ug3.d(b2c.b, false);
                    int i = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, d, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var2, i, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        n0m n0mVar = (n0m) gzlVar2.k.getValue();
                        t requireActivity = gzlVar2.requireActivity();
                        requireActivity.getClass();
                        exl A = gzlVar2.A();
                        kxi d2 = gzlVar2.d();
                        tmb tmbVar = (tmb) ((zxl) gzlVar2.j.getValue()).b.getValue();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(kyl.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        cyl cylVar = new cyl(n0mVar, requireActivity, A, d2, tmbVar, (kyl) qdcVar.C(I), mm6Var);
                        oq5Var2.k0(cylVar);
                        K2 = cylVar;
                    }
                    g0g.f((cyl) K2, gzlVar2.x(), oq5Var2, 64);
                    rzf.j(((n0m) gzlVar2.k.getValue()).J0, null, oq5Var2, 0, 2);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
