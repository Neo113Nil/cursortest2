package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class q83 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s83 b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ q83(s83 s83Var, rp7 rp7Var, int i) {
        this.a = i;
        this.b = s83Var;
        this.c = rp7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                s83 s83Var = this.b;
                rp7 rp7Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-788549268, new q83(s83Var, rp7Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                s83 s83Var2 = this.b;
                rp7 rp7Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        xbc xbcVar = (xbc) s83Var2.o.getValue();
                        x83 x83Var = (x83) s83Var2.k.getValue();
                        p83 p83Var = (p83) s83Var2.m.getValue();
                        oda odaVar = new oda(s83Var2.d().a, s83Var2.j);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        v83 v83Var = new v83(xbcVar, x83Var, p83Var, rp7Var2, odaVar, (g0l) qdcVar.C(I), s83Var2.d(), s83Var2.j);
                        oq5Var2.k0(v83Var);
                        K = v83Var;
                    }
                    bkp.J((v83) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
