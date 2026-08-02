package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pt5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt5 b;

    public /* synthetic */ pt5(qt5 qt5Var, int i) {
        this.a = i;
        this.b = qt5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qt5 qt5Var = this.b;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                qt5Var.j.getClass();
                jf0.a(new qzm[0], pd.t(new qzm[0]), false, ild.C(2007973713, new pt5(qt5Var, 1), hq5Var), hq5Var, 0, 4);
            default:
                qt5 qt5Var2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean f = oq5Var3.f((xt5) qt5Var2.l.getValue());
                Object K = oq5Var3.K();
                if (f || K == gq5.a) {
                    ot5 ot5Var = (ot5) qt5Var2.m.getValue();
                    t requireActivity = qt5Var2.requireActivity();
                    requireActivity.getClass();
                    xt5 xt5Var = (xt5) qt5Var2.l.getValue();
                    ot5Var.getClass();
                    nmj nmjVar = (nmj) ((jyr) ot5Var.a.e).getValue();
                    mt5 mt5Var = new mt5(requireActivity);
                    rmb G = xt5Var.G();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    K = new ut5(mt5Var, requireActivity, xt5Var, G, xt5Var.H(), nmjVar, ((q36) ((byb) qdcVar.C(I)).b(q36.class)).h());
                    oq5Var3.k0(K);
                }
                vut.h((ut5) K, oq5Var3, 0);
                break;
        }
        return Unit.a;
    }
}
