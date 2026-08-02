package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class sw5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw5 b;

    public /* synthetic */ sw5(uw5 uw5Var, int i) {
        this.a = i;
        this.b = uw5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                uw5 uw5Var = this.b;
                uw5Var.j.getClass();
                jf0.a(new qzm[0], pd.t(new qzm[0]), false, ild.C(229081836, new sw5(uw5Var, 1), hq5Var), hq5Var, 0, 4);
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                pm0.a(null, ild.C(2008432757, new sw5(this.b, 2), hq5Var2), hq5Var2, 48, 1);
                return Unit.a;
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                uw5 uw5Var2 = this.b;
                t requireActivity = uw5Var2.requireActivity();
                requireActivity.getClass();
                oq5 oq5Var4 = (oq5) hq5Var3;
                boolean f = oq5Var4.f(requireActivity);
                Object K = oq5Var4.K();
                Object obj3 = gq5.a;
                if (f || K == obj3) {
                    K = new tw5(requireActivity);
                    oq5Var4.k0(K);
                }
                tw5 tw5Var = (tw5) K;
                cx5 cx5Var = (cx5) uw5Var2.j.a.getValue();
                tmb x = uw5Var2.x();
                dzf viewLifecycleOwner = uw5Var2.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                cx5Var.getClass();
                tw5Var.getClass();
                boolean h = oq5Var4.h(cx5Var);
                Object K2 = oq5Var4.K();
                if (h || K2 == obj3) {
                    K2 = new at5(1, cx5Var);
                    oq5Var4.k0(K2);
                }
                Function1 function1 = (Function1) K2;
                oq5Var4.a0(419377738);
                kfu a = rpg.a(oq5Var4);
                if (a == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(nx5.class), a, null, k5r.g(nx5.class, new p97(1), function1), a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var4);
                oq5Var4.p(false);
                nx5 nx5Var = (nx5) R;
                nmj nmjVar = (nmj) cx5Var.a.a.getValue();
                boolean f2 = oq5Var4.f(F) | oq5Var4.f(tw5Var) | oq5Var4.f(nx5Var) | oq5Var4.f(nmjVar) | oq5Var4.f(x);
                Object K3 = oq5Var4.K();
                if (f2 || K3 == obj3) {
                    Object ww5Var = new ww5(F, tw5Var, nx5Var, nmjVar, x);
                    oq5Var4.k0(ww5Var);
                    K3 = ww5Var;
                }
                bcx.e((ww5) K3, oq5Var4, 0);
                return Unit.a;
        }
    }
}
