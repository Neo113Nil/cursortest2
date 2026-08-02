package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k3s implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3s b;
    public final /* synthetic */ v3s c;

    public /* synthetic */ k3s(l3s l3sVar, v3s v3sVar, int i) {
        this.a = i;
        this.b = l3sVar;
        this.c = v3sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        v3s v3sVar = this.c;
        l3s l3sVar = this.b;
        int i2 = 2;
        int i3 = 1;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1268555193, new k3s(l3sVar, v3sVar, i3), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    zwf.i(((dq0) oq5Var2.j(eq0.a)).b.a, ild.C(1121302138, new k3s(l3sVar, v3sVar, i2), oq5Var2), oq5Var2, 48);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    lvf a = ovf.a(l3sVar.A().r, oq5Var3);
                    k4k k4kVar = (k4k) szf.Q((xdr) l3sVar.A().s.d, oq5Var3).getValue();
                    String str = ((d3s) szf.Q(l3sVar.A().t, oq5Var3).getValue()).c;
                    j0q j0qVar = (j0q) l3sVar.A().s.e;
                    tmb x = l3sVar.x();
                    int i4 = lvf.f;
                    bfg.i(k4kVar, str, a, j0qVar, this.c, x, oq5Var3, 262656);
                    rzf.j(l3sVar.A().u, null, oq5Var3, 0, 2);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
