package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class x7s implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7s b;

    public /* synthetic */ x7s(p7s p7sVar, int i) {
        this.a = i;
        this.b = p7sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = 1;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                s9f[] s9fVarArr = z7s.e;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(790549225, new x7s(this.b, i), oq5Var), oq5Var, 432, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                s9f[] s9fVarArr2 = z7s.e;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    p7s p7sVar = this.b;
                    boolean h = oq5Var2.h(p7sVar);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        vuq vuqVar = new vuq(0, p7sVar, p7s.class, "reloadScreen", "reloadScreen()V", 0, 27);
                        oq5Var2.k0(vuqVar);
                        K = vuqVar;
                    }
                    Function0 function0 = (Function0) ((h9f) K);
                    boolean h2 = oq5Var2.h(p7sVar);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == kjnVar) {
                        vuq vuqVar2 = new vuq(0, p7sVar, p7s.class, "onChangeAccount", "onChangeAccount()V", 0, 28);
                        oq5Var2.k0(vuqVar2);
                        K2 = vuqVar2;
                    }
                    qwp.q(function0, null, (Function0) ((h9f) K2), oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
