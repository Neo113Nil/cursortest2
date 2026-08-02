package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d3m implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3m b;

    public /* synthetic */ d3m(e3m e3mVar, int i) {
        this.a = i;
        this.b = e3mVar;
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
                e3m e3mVar = this.b;
                e3mVar.k.getClass();
                jf0.a(new qzm[0], pd.t(new qzm[0]), false, ild.C(-1463669179, new d3m(e3mVar, 1), hq5Var), hq5Var, 0, 4);
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
                pm0.a(null, ild.C(-1306748900, new d3m(this.b, 2), hq5Var2), hq5Var2, 48, 1);
                return Unit.a;
            default:
                e3m e3mVar2 = this.b;
                dl dlVar = e3mVar2.k;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                lf5 lf5Var = (lf5) dlVar.b.getValue();
                w2m w2mVar = (w2m) dlVar.a.getValue();
                t requireActivity = e3mVar2.requireActivity();
                requireActivity.getClass();
                tmb x = e3mVar2.x();
                cvl cvlVar = e3mVar2.j;
                w2mVar.getClass();
                cvlVar.getClass();
                oq5 oq5Var4 = (oq5) hq5Var3;
                boolean h = oq5Var4.h(cvlVar) | oq5Var4.h(w2mVar);
                Object K = oq5Var4.K();
                kjn kjnVar = gq5.a;
                if (h || K == kjnVar) {
                    K = new v2m(cvlVar, w2mVar, 1);
                    oq5Var4.k0(K);
                }
                Function1 function1 = (Function1) K;
                oq5Var4.a0(419377738);
                kfu a = rpg.a(oq5Var4);
                if (a == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(m3m.class), a, null, k5r.g(m3m.class, new p97(1), function1), a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var4);
                oq5Var4.p(false);
                m3m m3mVar = (m3m) R;
                boolean f = oq5Var4.f(m3mVar) | oq5Var4.f(requireActivity);
                Object K2 = oq5Var4.K();
                if (f || K2 == kjnVar) {
                    K2 = new a3m(requireActivity, m3mVar, x, (nmj) w2mVar.a.a.getValue());
                    oq5Var4.k0(K2);
                }
                gut.c(lf5Var, (a3m) K2, hq5Var3, 0);
                return Unit.a;
        }
    }
}
