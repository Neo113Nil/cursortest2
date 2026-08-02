package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class pv4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv4 b;

    public /* synthetic */ pv4(rv4 rv4Var, int i) {
        this.a = i;
        this.b = rv4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-69679318, new pv4(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                rv4 rv4Var = this.b;
                ybf ybfVar = rv4Var.r;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        tv4 tv4Var = new tv4((xbc) rv4Var.s.getValue(), (xv4) ybfVar.getValue(), (mv4) rv4Var.m.getValue(), (gv4) rv4Var.t.getValue(), (muv) rv4Var.p.getValue(), (dvv) rv4Var.q.getValue(), rv4Var.g.m(), rv4Var.k);
                        oq5Var2.k0(tv4Var);
                        K = tv4Var;
                    }
                    tv4 tv4Var2 = (tv4) K;
                    yci a = a.a(vci.a, "collection_artists_screen");
                    kfh d = ug3.d(b2c.b, false);
                    int i = oq5Var2.P;
                    androidx.compose.runtime.internal.a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, a);
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
                    saf.e(tv4Var2, oq5Var2, 0);
                    oq5Var2.p(true);
                    rzf.j(((xv4) ybfVar.getValue()).n, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
