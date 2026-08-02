package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class w91 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ dib b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ w91(tvd tvdVar, a1d a1dVar, Function0 function0, q0d q0dVar, ka1 ka1Var, hab habVar, pbu pbuVar, Function0 function02, gvd gvdVar, yi1 yi1Var, dib dibVar) {
        this.e = tvdVar;
        this.f = a1dVar;
        this.c = function0;
        this.g = q0dVar;
        this.h = ka1Var;
        this.i = habVar;
        this.j = pbuVar;
        this.d = function02;
        this.k = gvdVar;
        this.l = yi1Var;
        this.b = dibVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        wn5 wn5Var;
        boolean f;
        Object K;
        switch (this.a) {
            case 0:
                tvd tvdVar = (tvd) this.e;
                a1d a1dVar = (a1d) this.f;
                q0d q0dVar = (q0d) this.g;
                ka1 ka1Var = (ka1) this.h;
                hab habVar = (hab) this.i;
                pbu pbuVar = (pbu) this.j;
                gvd gvdVar = (gvd) this.k;
                yi1 yi1Var = (yi1) this.l;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f2 = oq5Var2.f(tvdVar);
                Object K2 = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (f2 || K2 == kjnVar) {
                    K2 = new nr(tvdVar, 6);
                    oq5Var2.k0(K2);
                }
                yci s = wyf.s(vci.a, (Function0) K2);
                if (a1dVar instanceof z0d) {
                    z0d z0dVar = (z0d) a1dVar;
                    if (z0dVar.e.size() > 1 && z0dVar.f) {
                        oq5Var2.Z(502720762);
                        wn5Var = ild.C(-2144572995, new x3(18, a1dVar, q0dVar, s), oq5Var2);
                        oq5Var2.p(false);
                        wn5 wn5Var2 = wn5Var;
                        oq5Var2.Z(505537980);
                        wn5 C = ild.C(1650666092, new x3(19, this.c, q0dVar, pbuVar), oq5Var2);
                        oq5Var2.p(false);
                        boolean z = ka1Var.d.length() <= 0;
                        float f3 = 114;
                        wn5 C2 = ild.C(422757819, new xk(10, ka1Var, s, this.d), oq5Var2);
                        wn5 C3 = ild.C(2085008942, new x91(q0dVar, a1dVar, ka1Var, gvdVar, pbuVar, yi1Var, tvdVar, this.b, 0), oq5Var2);
                        wn5 C4 = ild.C(-716774036, new x3(20, s, ka1Var, yi1Var), oq5Var2);
                        f = oq5Var2.f(tvdVar);
                        K = oq5Var2.K();
                        if (!f || K == kjnVar) {
                            K = new nr(tvdVar, 7);
                            oq5Var2.k0(K);
                        }
                        wdp.S(C2, null, habVar, null, C3, wn5Var2, C4, C, null, (Function0) K, z, f3, 0.0f, 0.0f, oq5Var2, 1597446, 384, 26890);
                    }
                }
                oq5Var2.Z(503421920);
                oq5Var2.p(false);
                wn5Var = null;
                wn5 wn5Var22 = wn5Var;
                oq5Var2.Z(505537980);
                wn5 C5 = ild.C(1650666092, new x3(19, this.c, q0dVar, pbuVar), oq5Var2);
                oq5Var2.p(false);
                if (ka1Var.d.length() <= 0) {
                }
                float f32 = 114;
                wn5 C22 = ild.C(422757819, new xk(10, ka1Var, s, this.d), oq5Var2);
                wn5 C32 = ild.C(2085008942, new x91(q0dVar, a1dVar, ka1Var, gvdVar, pbuVar, yi1Var, tvdVar, this.b, 0), oq5Var2);
                wn5 C42 = ild.C(-716774036, new x3(20, s, ka1Var, yi1Var), oq5Var2);
                f = oq5Var2.f(tvdVar);
                K = oq5Var2.K();
                if (!f) {
                }
                K = new nr(tvdVar, 7);
                oq5Var2.k0(K);
                wdp.S(C22, null, habVar, null, C32, wn5Var22, C42, C5, null, (Function0) K, z, f32, 0.0f, 0.0f, oq5Var2, 1597446, 384, 26890);
                break;
            default:
                ((Integer) obj2).getClass();
                xl1.a((k4k) this.e, (lvf) this.f, (tmb) this.g, this.b, this.c, this.d, (Function0) this.h, (Function2) this.i, (Function2) this.j, (Function0) this.k, (ml1) this.l, (hq5) obj, rvf.R(577));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w91(k4k k4kVar, lvf lvfVar, tmb tmbVar, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function2 function22, Function0 function04, ml1 ml1Var, int i) {
        this.e = k4kVar;
        this.f = lvfVar;
        this.g = tmbVar;
        this.b = dibVar;
        this.c = function0;
        this.d = function02;
        this.h = function03;
        this.i = function2;
        this.j = function22;
        this.k = function04;
        this.l = ml1Var;
    }
}
