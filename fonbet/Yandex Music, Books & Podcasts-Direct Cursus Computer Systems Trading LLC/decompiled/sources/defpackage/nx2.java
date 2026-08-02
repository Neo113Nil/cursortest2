package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class nx2 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rx2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nx2(rx2 rx2Var, boolean z, int i) {
        this.a = i;
        this.b = rx2Var;
        this.c = z;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                bci bciVar = (bci) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    pd.b(new qzm[0], false, ild.C(-1124856675, new oc1(bciVar, this.b, this.c, 5), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Unit unit = Unit.a;
                    rx2 rx2Var = this.b;
                    boolean h = oq5Var2.h(rx2Var);
                    Object K = oq5Var2.K();
                    if (h || K == gq5.a) {
                        K = new ox2(rx2Var, null, 1);
                        oq5Var2.k0(K);
                    }
                    gld.w(oq5Var2, unit, (Function2) K);
                    up6.e(rx2Var, this.c, true, oq5Var2, 384);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
