package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b2d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2d b;

    public /* synthetic */ b2d(c2d c2dVar, int i) {
        this.a = i;
        this.b = c2dVar;
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
                        break;
                    }
                }
                c2d c2dVar = this.b;
                jf0.a(new qzm[0], c2dVar.j, false, ild.C(1709163603, new b2d(c2dVar, 1), hq5Var), hq5Var, 0, 4);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K = oq5Var3.K();
                if (K == gq5.a) {
                    c2d c2dVar2 = this.b;
                    w1d w1dVar = c2dVar2.k;
                    jfu viewModelStore = c2dVar2.getViewModelStore();
                    viewModelStore.getClass();
                    t requireActivity = c2dVar2.requireActivity();
                    requireActivity.getClass();
                    w1dVar.getClass();
                    e00 e00Var = w1dVar.a;
                    e00Var.getClass();
                    ita itaVar = new ita(25, e00Var);
                    lm4 a = ern.a(t2d.class);
                    f2d f2dVar = new f2d(0, itaVar);
                    gs6 gs6Var = gs6.b;
                    gs6Var.getClass();
                    bjt bjtVar = new bjt(viewModelStore, f2dVar, gs6Var);
                    String f = a.f();
                    if (f == null) {
                        xq0.x("Local and anonymous classes can not be ViewModels");
                        break;
                    } else {
                        g2d g2dVar = new g2d((t2d) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f)), new h4b(requireActivity));
                        oq5Var3.k0(g2dVar);
                        K = g2dVar;
                    }
                }
                y2x.g((g2d) K, oq5Var3, 0);
        }
        return Unit.a;
    }
}
