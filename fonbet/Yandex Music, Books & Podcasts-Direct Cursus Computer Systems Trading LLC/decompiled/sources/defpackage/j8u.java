package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class j8u implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8u b;

    public /* synthetic */ j8u(l8u l8uVar, int i) {
        this.a = i;
        this.b = l8uVar;
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
                    pd.b(new qzm[0], true, ild.C(1775220995, new j8u(this.b, 1), oq5Var), oq5Var, 432, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    l8u l8uVar = this.b;
                    if (K == kjnVar) {
                        K = new h8u(l8uVar.B(), (d8u) l8uVar.m.getValue(), (jvo) l8uVar.n.getValue());
                        oq5Var2.k0(K);
                    }
                    gut.i((h8u) K, l8uVar.x(), oq5Var2, 64);
                    rzf.j(l8uVar.B().J, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
