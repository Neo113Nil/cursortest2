package defpackage;

import androidx.compose.foundation.layout.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class nd1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ fvf c;
    public final /* synthetic */ eoe d;
    public final /* synthetic */ ea2 e;
    public final /* synthetic */ yi1 f;
    public final /* synthetic */ ha1 g;
    public final /* synthetic */ tvd h;
    public final /* synthetic */ ka1 i;
    public final /* synthetic */ q0d j;
    public final /* synthetic */ gvd k;

    public /* synthetic */ nd1(List list, fvf fvfVar, eoe eoeVar, ea2 ea2Var, yi1 yi1Var, ha1 ha1Var, tvd tvdVar, ka1 ka1Var, q0d q0dVar, gvd gvdVar, int i) {
        this.a = i;
        this.b = list;
        this.c = fvfVar;
        this.d = eoeVar;
        this.e = ea2Var;
        this.f = yi1Var;
        this.g = ha1Var;
        this.h = tvdVar;
        this.i = ka1Var;
        this.j = q0dVar;
        this.k = gvdVar;
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
                pm0.a(null, ild.C(-2133922323, new nd1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, 1), hq5Var), hq5Var, 48, 1);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                float i = uwf.i(hq5Var2);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int L = ((jx7) oq5Var3.j(es5.h)).L(i);
                Object K = oq5Var3.K();
                yi1 yi1Var = this.f;
                Object obj3 = gq5.a;
                if (K == obj3) {
                    K = new uj1(yi1Var.c.k);
                    oq5Var3.k0(K);
                }
                krf krfVar = (krf) K;
                yci c = d.c(vci.a, 1.0f);
                vm C = ghh.C(zs4.g(oq5Var3), ogp.A(oq5Var3));
                wn5 C2 = ild.C(1198328214, new pr((Object) this.g, this.h, (Object) this.i, (Object) yi1Var, (Object) this.j, this.k, 2), oq5Var3);
                fvf fvfVar = this.c;
                boolean f = oq5Var3.f(fvfVar);
                eoe eoeVar = this.d;
                boolean f2 = f | oq5Var3.f(eoeVar);
                Object K2 = oq5Var3.K();
                if (f2 || K2 == obj3) {
                    K2 = new od1(fvfVar, eoeVar, 0);
                    oq5Var3.k0(K2);
                }
                irf.u(this.b, krfVar, c, C2, (Function1) K2, fvfVar, this.e, L, null, C, 0.0f, 0, oq5Var3, 3504, 0, 3328);
        }
        return Unit.a;
    }
}
