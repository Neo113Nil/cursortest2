package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c6n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6n b;

    public /* synthetic */ c6n(d6n d6nVar, int i) {
        this.a = i;
        this.b = d6nVar;
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
                    pd.b(new qzm[0], false, ild.C(-378993327, new c6n(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        d6n d6nVar = this.b;
                        n6n n6nVar = (n6n) d6nVar.l.getValue();
                        a6n a6nVar = (a6n) d6nVar.j.getValue();
                        t requireActivity = d6nVar.requireActivity();
                        requireActivity.getClass();
                        a6nVar.getClass();
                        K = new t5n(n6nVar, new qzc(25, requireActivity), new dn9(d6nVar.g.m(), d6nVar.k));
                        oq5Var2.k0(K);
                    }
                    q5g.g((t5n) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
