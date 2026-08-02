package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class u8i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8i b;

    public /* synthetic */ u8i(v8i v8iVar, int i) {
        this.a = i;
        this.b = v8iVar;
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
                    pd.b(new qzm[0], false, ild.C(695093390, new u8i(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    v8i v8iVar = this.b;
                    if (K == kjnVar) {
                        K = new w8i((b9i) v8iVar.l.getValue(), v8iVar.n);
                        oq5Var2.k0(K);
                    }
                    rvf.f((w8i) K, v8iVar.x(), oq5Var2, 64);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
