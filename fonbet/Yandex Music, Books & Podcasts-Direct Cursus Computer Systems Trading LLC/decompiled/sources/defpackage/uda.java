package defpackage;

import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class uda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vda b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ uda(vda vdaVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = vdaVar;
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
                    pd.b(new qzm[0], false, ild.C(1636595891, new uda(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        vda vdaVar = this.b;
                        yda ydaVar = new yda((xbc) vdaVar.m.getValue(), mm6Var, (aea) vdaVar.l.getValue(), (sda) vdaVar.o.getValue(), this.c);
                        oq5Var2.k0(ydaVar);
                        K2 = ydaVar;
                    }
                    qwp.r((yda) K2, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
