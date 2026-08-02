package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class dr6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ er6 b;

    public /* synthetic */ dr6(er6 er6Var, int i) {
        this.a = i;
        this.b = er6Var;
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
                er6 er6Var = this.b;
                er6Var.g.getClass();
                jf0.a(new qzm[0], pd.t(new qzm[0]), false, ild.C(-196857363, new dr6(er6Var, 1), hq5Var), hq5Var, 0, 4);
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                er6 er6Var2 = this.b;
                cvl cvlVar = er6Var2.h;
                w2m w2mVar = (w2m) er6Var2.g.a.getValue();
                cvl cvlVar2 = er6Var2.h;
                w2mVar.getClass();
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h = oq5Var3.h(cvlVar2) | oq5Var3.h(w2mVar);
                Object K = oq5Var3.K();
                Object obj3 = gq5.a;
                if (h || K == obj3) {
                    K = new v2m(cvlVar2, w2mVar, 0);
                    oq5Var3.k0(K);
                }
                Function1 function1 = (Function1) K;
                oq5Var3.a0(419377738);
                kfu a = rpg.a(oq5Var3);
                if (a == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(lr6.class), a, null, k5r.g(lr6.class, new p97(1), function1), a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var3);
                oq5Var3.p(false);
                lr6 lr6Var = (lr6) R;
                boolean f = oq5Var3.f(lr6Var);
                Object K2 = oq5Var3.K();
                if (f || K2 == obj3) {
                    K2 = new kr6(lr6Var);
                    oq5Var3.k0(K2);
                }
                kr6 kr6Var = (kr6) K2;
                boolean h2 = oq5Var3.h(er6Var2);
                Object K3 = oq5Var3.K();
                if (h2 || K3 == obj3) {
                    K3 = new yg6(4, er6Var2);
                    oq5Var3.k0(K3);
                }
                Function0 function0 = (Function0) K3;
                boolean h3 = oq5Var3.h(er6Var2);
                Object K4 = oq5Var3.K();
                if (h3 || K4 == obj3) {
                    K4 = new at5(12, er6Var2);
                    oq5Var3.k0(K4);
                }
                ksw.s(cvlVar, kr6Var, function0, (Function1) K4, oq5Var3, 0);
                return Unit.a;
        }
    }
}
