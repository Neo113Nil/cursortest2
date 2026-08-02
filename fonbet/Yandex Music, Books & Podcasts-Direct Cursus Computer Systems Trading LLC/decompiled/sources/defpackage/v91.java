package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class v91 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ka1 b;
    public final /* synthetic */ yi1 c;
    public final /* synthetic */ q0d d;
    public final /* synthetic */ gvd e;
    public final /* synthetic */ pbu f;
    public final /* synthetic */ tvd g;
    public final /* synthetic */ hab h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ dib j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ yci l;

    public /* synthetic */ v91(ka1 ka1Var, yi1 yi1Var, q0d q0dVar, gvd gvdVar, pbu pbuVar, tvd tvdVar, hab habVar, Function0 function0, dib dibVar, Function0 function02, yci yciVar, int i) {
        this.b = ka1Var;
        this.c = yi1Var;
        this.d = q0dVar;
        this.e = gvdVar;
        this.f = pbuVar;
        this.g = tvdVar;
        this.h = habVar;
        this.i = function0;
        this.j = dibVar;
        this.k = function02;
        this.l = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        aqi M;
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
                q0d q0dVar = this.d;
                vdr state = q0dVar != null ? q0dVar.getState() : null;
                if (state == null) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-236365865);
                    oq5Var2.p(false);
                    M = null;
                } else {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(-700361366);
                    M = gld.M(state, oq5Var3);
                    oq5Var3.p(false);
                }
                a1d a1dVar = M != null ? (a1d) M.getValue() : null;
                long j = d85.m;
                oq5 oq5Var4 = (oq5) hq5Var;
                long j2 = ((dq0) oq5Var4.j(eq0.a)).b.a;
                yci d = d.d(this.l, 1.0f);
                gvd gvdVar = this.e;
                boolean f = oq5Var4.f(gvdVar);
                Object K = oq5Var4.K();
                kjn kjnVar = gq5.a;
                if (f || K == kjnVar) {
                    K = new u91(gvdVar, 0);
                    oq5Var4.k0(K);
                }
                yci a = a.a(androidx.compose.ui.draw.a.a(d, (Function1) K), "entity_header");
                Object K2 = oq5Var4.K();
                if (K2 == kjnVar) {
                    K2 = new zs0(16);
                    oq5Var4.k0(K2);
                }
                q5g.k(nfp.b(a, false, (Function1) K2), null, j, j2, null, 0.0f, ild.C(-311390250, new w91(this.g, a1dVar, this.i, q0dVar, this.b, this.h, this.f, this.k, gvdVar, this.c, this.j), oq5Var4), oq5Var4, 1573248, 50);
            default:
                ((Integer) obj2).getClass();
                leu.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v91(q0d q0dVar, yci yciVar, gvd gvdVar, tvd tvdVar, Function0 function0, ka1 ka1Var, hab habVar, pbu pbuVar, Function0 function02, yi1 yi1Var, dib dibVar) {
        this.d = q0dVar;
        this.l = yciVar;
        this.e = gvdVar;
        this.g = tvdVar;
        this.i = function0;
        this.b = ka1Var;
        this.h = habVar;
        this.f = pbuVar;
        this.k = function02;
        this.c = yi1Var;
        this.j = dibVar;
    }
}
