package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c98 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d98 b;

    public /* synthetic */ c98(d98 d98Var, int i) {
        this.a = i;
        this.b = d98Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                d98 d98Var = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-974236866, new c98(d98Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                d98 d98Var2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
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
                    tmb x = d98Var2.x();
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        n98 n98Var = (n98) d98Var2.k.getValue();
                        v88 v88Var = (v88) d98Var2.l.getValue();
                        fnb fnbVar = d98Var2.d().a;
                        fnbVar.getClass();
                        nnk nnkVar = new nnk();
                        nnkVar.a = fnbVar;
                        nnkVar.b = qld.m();
                        kxi d2 = d98Var2.d();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        z88 z88Var = new z88(n98Var, v88Var, nnkVar, d2, (g0l) qdcVar.C(I), d98Var2.j);
                        oq5Var2.k0(z88Var);
                        K = z88Var;
                    }
                    saf.j((z88) K, x, oq5Var2, 64);
                    rzf.j(((n98) d98Var2.k.getValue()).o, null, oq5Var2, 0, 2);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
