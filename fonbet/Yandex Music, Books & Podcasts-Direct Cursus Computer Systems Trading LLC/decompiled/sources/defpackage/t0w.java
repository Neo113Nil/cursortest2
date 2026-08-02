package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class t0w implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0w b;

    public /* synthetic */ t0w(v0w v0wVar, int i) {
        this.a = i;
        this.b = v0wVar;
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
                    pd.b(new qzm[0], true, ild.C(1664559361, new t0w(this.b, 2), oq5Var), oq5Var, 432, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    uwf.f((l1w) this.b.m.getValue(), oq5Var2, 8);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    pm0.a(null, ild.C(-1817330102, new t0w(this.b, 3), oq5Var3), oq5Var3, 48, 1);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                oq5 oq5Var4 = (oq5) hq5Var;
                if (oq5Var4.P(intValue & 1, (intValue & 3) != 2)) {
                    v0w v0wVar = this.b;
                    v0wVar.A(ild.C(-1305273299, new t0w(v0wVar, 1), oq5Var4), oq5Var4, 6);
                } else {
                    oq5Var4.S();
                }
                break;
        }
        return Unit.a;
    }
}
