package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class aha implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cha b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ aha(cha chaVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = chaVar;
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
                    pd.b(new qzm[0], false, ild.C(-224851298, new aha(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    cha chaVar = this.b;
                    if (K == kjnVar) {
                        K = new eha((xbc) chaVar.o.getValue(), (gha) chaVar.k.getValue(), (wga) chaVar.m.getValue(), this.c);
                        oq5Var2.k0(K);
                    }
                    n7w.n((eha) K, chaVar.requireArguments().getInt("arg.initial_tab"), oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
