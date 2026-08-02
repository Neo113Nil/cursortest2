package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class voq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bpq b;
    public final /* synthetic */ nnq c;
    public final /* synthetic */ qnq d;
    public final /* synthetic */ hgp e;
    public final /* synthetic */ yci f;
    public final /* synthetic */ sdr g;
    public final /* synthetic */ fvf h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ eoe j;
    public final /* synthetic */ q0k k;
    public final /* synthetic */ q0k l;

    public /* synthetic */ voq(bpq bpqVar, nnq nnqVar, qnq qnqVar, hgp hgpVar, yci yciVar, sdr sdrVar, fvf fvfVar, Function0 function0, eoe eoeVar, q0k q0kVar, q0k q0kVar2, int i) {
        this.a = i;
        this.b = bpqVar;
        this.c = nnqVar;
        this.d = qnqVar;
        this.e = hgpVar;
        this.f = yciVar;
        this.g = sdrVar;
        this.h = fvfVar;
        this.i = function0;
        this.j = eoeVar;
        this.k = q0kVar;
        this.l = q0kVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pm0.a(null, ild.C(-570408346, new voq(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, 1), oq5Var), oq5Var, 48, 1);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    List d0 = etn.d0(this.b.a, this.c, this.d, oq5Var2);
                    hgp hgpVar = this.e;
                    xqq xqqVar = (xqq) hgpVar.c;
                    qnq qnqVar = (qnq) hgpVar.b;
                    Object K = oq5Var2.K();
                    Object obj3 = gq5.a;
                    if (K == obj3) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    boolean f = oq5Var2.f(qnqVar) | oq5Var2.f(xqqVar);
                    Object K2 = oq5Var2.K();
                    if (f || K2 == obj3) {
                        mm6Var.getClass();
                        xqqVar.getClass();
                        K2 = new mrf(mm6Var, qnqVar, xqqVar);
                        oq5Var2.k0(K2);
                    }
                    krf krfVar = (krf) K2;
                    yci c = d.c(this.f, 1.0f);
                    sdr sdrVar = this.g;
                    boolean f2 = oq5Var2.f(sdrVar);
                    Object K3 = oq5Var2.K();
                    if (f2 || K3 == obj3) {
                        K3 = new a9q(sdrVar, 8);
                        oq5Var2.k0(K3);
                    }
                    irf.u(d0, krfVar, a.a(wyf.s(c, (Function0) K3), "landing_skeleton_list"), null, null, this.h, null, ((jx7) oq5Var2.j(es5.h)).L(uwf.i(oq5Var2)), this.i, ghh.C(ghh.C(ghh.C(ghh.C(this.j, this.k), this.l), zs4.g(oq5Var2)), ogp.A(oq5Var2)), 0.0f, 2, oq5Var2, 0, 48, 1112);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
