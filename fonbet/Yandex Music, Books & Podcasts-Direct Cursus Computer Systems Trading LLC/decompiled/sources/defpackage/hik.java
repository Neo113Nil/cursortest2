package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class hik implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jik b;

    public /* synthetic */ hik(jik jikVar, int i) {
        this.a = i;
        this.b = jikVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new wik((gjk) this.b.l.getValue());
                    oq5Var2.k0(K);
                }
                hag.d((wik) K, oq5Var2, 0);
            default:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                qs5 qs5Var = djk.a;
                jik jikVar = this.b;
                etn.l(qs5Var.a(jikVar.j), ild.C(-1877434923, new hik(jikVar, 0), hq5Var), hq5Var, 56);
        }
        return Unit.a;
    }
}
