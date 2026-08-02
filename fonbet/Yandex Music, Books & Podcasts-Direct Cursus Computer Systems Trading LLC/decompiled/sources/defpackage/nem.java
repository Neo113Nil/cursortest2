package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class nem implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qem b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ nem(qem qemVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = qemVar;
        this.c = rp7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(443424039, new nem(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        qem qemVar = this.b;
                        K = new sem((xbc) qemVar.o.getValue(), (uem) qemVar.k.getValue(), (jem) qemVar.m.getValue(), this.c);
                        oq5Var2.k0(K);
                    }
                    ivf.m((sem) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
