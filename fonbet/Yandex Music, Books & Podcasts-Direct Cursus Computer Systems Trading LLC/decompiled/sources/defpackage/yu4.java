package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class yu4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jac b;

    public /* synthetic */ yu4(jac jacVar, int i) {
        this.a = i;
        this.b = jacVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(491869934, new yu4(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                jac jacVar = this.b;
                ybf ybfVar = (ybf) jacVar.e;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = new pu4((xbc) ((jyr) jacVar.g).getValue(), (ru4) ybfVar.getValue(), (ju4) ((jyr) jacVar.f).getValue(), (rmb) ((jyr) jacVar.d).getValue());
                        oq5Var2.k0(K);
                    }
                    pu4 pu4Var = (pu4) K;
                    yci a = a.a(vci.a, "collection_albums_screen");
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
                    qld.e(pu4Var, oq5Var2, 0);
                    rzf.j(((ru4) ybfVar.getValue()).n, null, oq5Var2, 0, 2);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
