package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class r50 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ r50(s50 s50Var, rp7 rp7Var, int i) {
        this.a = i;
        this.b = s50Var;
        this.c = rp7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                rp7 rp7Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1863520561, new r50(s50Var, rp7Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                s50 s50Var2 = this.b;
                rp7 rp7Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        xbc xbcVar = (xbc) s50Var2.o.getValue();
                        e60 e60Var = (e60) s50Var2.k.getValue();
                        f50 f50Var = (f50) s50Var2.m.getValue();
                        oda odaVar = new oda(s50Var2.d().a, s50Var2.j);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        a60 a60Var = new a60(xbcVar, e60Var, f50Var, rp7Var2, odaVar, (g0l) qdcVar.C(I), s50Var2.d(), s50Var2.j);
                        oq5Var2.k0(a60Var);
                        K = a60Var;
                    }
                    p50.b((a60) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
