package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class uli implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vli b;

    public /* synthetic */ uli(vli vliVar, int i) {
        this.a = i;
        this.b = vliVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                vli vliVar = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1899473878, new uli(vliVar, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                vli vliVar2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    pm0.a(null, ild.C(-1357269715, new uli(vliVar2, 2), oq5Var2), oq5Var2, 48, 1);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                vli vliVar3 = this.b;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object K = oq5Var3.K();
                    if (K == gq5.a) {
                        t requireActivity = vliVar3.requireActivity();
                        requireActivity.getClass();
                        gmi gmiVar = (gmi) vliVar3.j.getValue();
                        tmb x = vliVar3.x();
                        tli tliVar = (tli) vliVar3.k.getValue();
                        t requireActivity2 = vliVar3.requireActivity();
                        requireActivity2.getClass();
                        kxi d = vliVar3.d();
                        tliVar.getClass();
                        hgp hgpVar = new hgp();
                        hgpVar.b = requireActivity2;
                        hgpVar.c = d;
                        hgpVar.a = btf.b(new dmg(22, hgpVar));
                        l18 l18Var = l18.b;
                        hgpVar.d = l18Var.b(hag.I(oq7.class), true);
                        hgpVar.e = l18Var.b(hag.I(z5l.class), true);
                        hgpVar.f = l18Var.b(hag.I(e.class), true);
                        hgpVar.g = l18Var.b(hag.I(vyk.class), true);
                        hgpVar.h = l18Var.b(hag.I(g64.class), true);
                        hgpVar.i = l18Var.b(hag.I(x0h.class), true);
                        nyf lifecycle = vliVar3.getLifecycle();
                        lifecycle.getClass();
                        qyf F = wyf.F(lifecycle);
                        pv9 pv9Var = new pv9(22, vliVar3);
                        kxi d2 = vliVar3.d();
                        cvo cvoVar = vliVar3.l;
                        l18 l18Var2 = l18.b;
                        bdt I = hag.I(k6l.class);
                        qdc qdcVar = l18Var2.a;
                        qdcVar.getClass();
                        k6l k6lVar = (k6l) qdcVar.C(I);
                        bdt I2 = hag.I(uwu.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        uwu uwuVar = (uwu) qdcVar2.C(I2);
                        bdt I3 = hag.I(d1h.class);
                        qdc qdcVar3 = l18Var2.a;
                        qdcVar3.getClass();
                        d1h d1hVar = (d1h) qdcVar3.C(I3);
                        bdt I4 = hag.I(qwu.class);
                        qdc qdcVar4 = l18Var2.a;
                        qdcVar4.getClass();
                        qwu qwuVar = (qwu) qdcVar4.C(I4);
                        bdt I5 = hag.I(lf5.class);
                        qdc qdcVar5 = l18Var2.a;
                        qdcVar5.getClass();
                        lf5 lf5Var = (lf5) qdcVar5.C(I5);
                        bdt I6 = hag.I(nmj.class);
                        qdc qdcVar6 = l18Var2.a;
                        qdcVar6.getClass();
                        nmj nmjVar = (nmj) qdcVar6.C(I6);
                        bdt I7 = hag.I(g0l.class);
                        qdc qdcVar7 = l18Var2.a;
                        qdcVar7.getClass();
                        rli rliVar = new rli(requireActivity, gmiVar, hgpVar, F, x, nmjVar, d2, k6lVar, uwuVar, d1hVar, qwuVar, lf5Var, pv9Var, cvoVar, new u5i(5), (g0l) qdcVar7.C(I7), new u5i(6));
                        oq5Var3.k0(rliVar);
                        K = rliVar;
                    }
                    q5g.c((rli) K, null, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
