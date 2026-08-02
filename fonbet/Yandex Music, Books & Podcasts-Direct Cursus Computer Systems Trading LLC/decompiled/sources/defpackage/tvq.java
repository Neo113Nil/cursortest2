package defpackage;

import androidx.fragment.app.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class tvq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uvq b;

    public /* synthetic */ tvq(uvq uvqVar, int i) {
        this.a = i;
        this.b = uvqVar;
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
                uvq uvqVar = this.b;
                uvqVar.j.getClass();
                jf0.a(new qzm[0], pd.t(new qzm[0]), true, ild.C(-634375120, new tvq(uvqVar, 1), hq5Var), hq5Var, 3456, 0);
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
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new LinkedHashMap();
                    oq5Var3.k0(K);
                }
                Map map = (Map) K;
                uvq uvqVar2 = this.b;
                rvq rvqVar = (rvq) uvqVar2.l.getValue();
                qwq qwqVar = (qwq) uvqVar2.n.getValue();
                cvo k = uvqVar2.getK();
                tmb tmbVar = (tmb) uvqVar2.m.getValue();
                kxi d = uvqVar2.d();
                z2m z2mVar = uvqVar2.j;
                t requireActivity = uvqVar2.requireActivity();
                requireActivity.getClass();
                kxi d2 = uvqVar2.d();
                z2mVar.getClass();
                tao taoVar = new tao();
                taoVar.a = requireActivity;
                taoVar.b = d2;
                bdt I = hag.I(oq7.class);
                l18 l18Var = l18.b;
                taoVar.d = l18Var.b(I, true);
                taoVar.c = l18Var.b(hag.I(vyk.class), true);
                taoVar.e = l18Var.b(hag.I(z5l.class), true);
                rvqVar.getClass();
                k.getClass();
                tmbVar.getClass();
                boolean f = oq5Var3.f(qwqVar) | oq5Var3.f(k) | oq5Var3.f(tmbVar) | oq5Var3.f(d) | oq5Var3.f(taoVar);
                Object K2 = oq5Var3.K();
                if (f || K2 == kjnVar) {
                    K2 = new nvq(d, k, tmbVar, qwqVar, rvqVar.a, taoVar, ot0.F(qwqVar));
                    oq5Var3.k0(K2);
                }
                etn.l(vvq.a.a(map), ild.C(-261003024, new hon(28, (hvq) K2, uvqVar2), oq5Var3), oq5Var3, 56);
        }
        return Unit.a;
    }
}
