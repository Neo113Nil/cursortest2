package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class kpp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lpp b;

    public /* synthetic */ kpp(lpp lppVar, int i) {
        this.a = i;
        this.b = lppVar;
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
                    pd.b(new qzm[0], false, ild.C(1245020247, new kpp(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        lpp lppVar = this.b;
                        t requireActivity = lppVar.requireActivity();
                        requireActivity.getClass();
                        K = new mpp(requireActivity, (zm4) lppVar.k.getValue(), (jpp) lppVar.l.getValue());
                        oq5Var2.k0(K);
                    }
                    szf.n((mpp) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
