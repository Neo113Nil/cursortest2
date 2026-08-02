package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class fk3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk3 b;

    public /* synthetic */ fk3(gk3 gk3Var, int i) {
        this.a = i;
        this.b = gk3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                gk3 gk3Var = this.b;
                hk3 hk3Var = gk3Var.j;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                jf0.g(new qzm[0], ((Boolean) gld.O(hk3Var.a, hq5Var).getValue()).booleanValue(), hk3Var.b, hk3Var.c, ild.C(1379147843, new fk3(gk3Var, 1), hq5Var), hq5Var, 24576);
            default:
                gk3 gk3Var2 = this.b;
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
                    xj3 xj3Var = gk3Var2.k;
                    jfu viewModelStore = gk3Var2.getViewModelStore();
                    viewModelStore.getClass();
                    t requireActivity = gk3Var2.requireActivity();
                    requireActivity.getClass();
                    e00 e00Var = xj3Var.b;
                    ix6 ix6Var = new ix6(13, requireActivity);
                    vd vdVar = new vd(7, xj3Var, requireActivity, ix6Var);
                    lm4 a = ern.a(mk3.class);
                    wz wzVar = new wz(11, vdVar);
                    gs6 gs6Var = gs6.b;
                    gs6Var.getClass();
                    bjt bjtVar = new bjt(viewModelStore, wzVar, gs6Var);
                    String f = a.f();
                    if (f == null) {
                        xq0.x("Local and anonymous classes can not be ViewModels");
                        break;
                    } else {
                        mk3 mk3Var = (mk3) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                        bdt I = hag.I(q7l.class);
                        qdc qdcVar = e00Var.a;
                        qdcVar.getClass();
                        q7l q7lVar = (q7l) qdcVar.C(I);
                        bdt I2 = hag.I(ek3.class);
                        qdc qdcVar2 = e00Var.a;
                        qdcVar2.getClass();
                        dk3 dk3Var = new dk3(mk3Var, q7lVar, (ek3) qdcVar2.C(I2), ix6Var);
                        oq5Var3.k0(dk3Var);
                        K = dk3Var;
                    }
                }
                xv7.e((dk3) K, null, oq5Var3, 0);
        }
        return Unit.a;
    }
}
