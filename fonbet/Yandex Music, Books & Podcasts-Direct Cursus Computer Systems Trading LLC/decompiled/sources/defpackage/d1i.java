package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d1i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1i b;
    public final /* synthetic */ i1i c;

    public /* synthetic */ d1i(f1i f1iVar, i1i i1iVar, int i) {
        this.a = i;
        this.b = f1iVar;
        this.c = i1iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        f1i f1iVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1967133019, new d1i(f1iVar, this.c, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ybf ybfVar = f1iVar.k;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    lvf a = ovf.a(((o1i) ybfVar.getValue()).l, oq5Var2);
                    k4k k4kVar = (k4k) gld.M((xdr) ((o1i) ybfVar.getValue()).m.d, oq5Var2).getValue();
                    j0q j0qVar = (j0q) ((o1i) ybfVar.getValue()).m.e;
                    tmb x = f1iVar.x();
                    int i3 = lvf.f;
                    p6g.b(k4kVar, a, j0qVar, this.c, x, oq5Var2, 32832);
                    rzf.j(((o1i) ybfVar.getValue()).n, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
