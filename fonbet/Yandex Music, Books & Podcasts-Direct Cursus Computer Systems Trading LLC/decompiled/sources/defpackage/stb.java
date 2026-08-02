package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class stb implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xxk b;
    public final /* synthetic */ cjc c;
    public final /* synthetic */ kub d;
    public final /* synthetic */ sdr e;

    public /* synthetic */ stb(cjc cjcVar, kub kubVar, xxk xxkVar, sdr sdrVar) {
        this.c = cjcVar;
        this.d = kubVar;
        this.b = xxkVar;
        this.e = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yci o = a.o(vci.a, 20, 0.0f, 2);
                    cjc cjcVar = this.c;
                    boolean f = oq5Var.f(cjcVar);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (f || K == kjnVar) {
                        K = new wf3(cjcVar, 14);
                        oq5Var.k0(K);
                    }
                    yci s = wyf.s(o, (Function0) K);
                    v7l v7lVar = (v7l) this.e.getValue();
                    kub kubVar = this.d;
                    boolean h = oq5Var.h(kubVar);
                    Object K2 = oq5Var.K();
                    if (h || K2 == kjnVar) {
                        o57 o57Var = new o57(1, kubVar, kub.class, "onSeek", "onSeek(F)V", 0, 22);
                        oq5Var.k0(o57Var);
                        K2 = o57Var;
                    }
                    c9g.l(this.b, v7lVar, (Function1) ((h9f) K2), s, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xxk xxkVar = this.b;
                    if (xxkVar.d) {
                        oq5Var2.Z(656901852);
                        etn.l(es5.n.a(xof.a), ild.C(-1297182261, new stb(this.c, this.d, xxkVar, this.e), oq5Var2), oq5Var2, 56);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(657618603);
                        eta.p(vci.a, 32, oq5Var2, false);
                    }
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ stb(xxk xxkVar, poi poiVar, kub kubVar, sdr sdrVar) {
        this.b = xxkVar;
        this.c = poiVar;
        this.d = kubVar;
        this.e = sdrVar;
    }
}
