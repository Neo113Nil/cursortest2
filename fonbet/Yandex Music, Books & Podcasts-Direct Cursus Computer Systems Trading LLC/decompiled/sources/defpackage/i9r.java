package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class i9r implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g9r b;
    public final /* synthetic */ plv c;
    public final /* synthetic */ List d;
    public final /* synthetic */ wn5 e;

    public /* synthetic */ i9r(g9r g9rVar, wn5 wn5Var, List list, plv plvVar) {
        this.b = g9rVar;
        this.e = wn5Var;
        this.d = list;
        this.c = plvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    skd skdVar = skd.a;
                    ukd z = o5g.z(skdVar);
                    g9r g9rVar = this.b;
                    float f = g9rVar.d;
                    float f2 = g9rVar.f;
                    ukd z2 = ngg.z(z, f - f2);
                    ukd z3 = ngg.z(skdVar, f2);
                    wn5 wn5Var = this.e;
                    boolean f3 = oq5Var.f(wn5Var);
                    List list = this.d;
                    boolean f4 = f3 | oq5Var.f(list) | oq5Var.h(g9rVar);
                    plv plvVar = this.c;
                    boolean h = f4 | oq5Var.h(plvVar);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        i50 i50Var = new i50(list, wn5Var, g9rVar, plvVar, 23);
                        oq5Var.k0(i50Var);
                        K = i50Var;
                    }
                    s7g.j(z2, z3, (Function1) K, oq5Var, 6);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                q7g.p(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(3073));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i9r(g9r g9rVar, plv plvVar, List list, wn5 wn5Var, int i) {
        this.b = g9rVar;
        this.c = plvVar;
        this.d = list;
        this.e = wn5Var;
    }
}
