package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class jdm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ldm b;
    public final /* synthetic */ fem c;

    public /* synthetic */ jdm(ldm ldmVar, fem femVar, int i) {
        this.a = i;
        this.b = ldmVar;
        this.c = femVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ldm ldmVar = this.b;
        int i2 = 1;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(4677411, new jdm(ldmVar, this.c, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    lvf a = ovf.a(ldmVar.A().p, oq5Var2);
                    String str = (String) gld.M(ldmVar.A().n, oq5Var2).getValue();
                    k4k k4kVar = (k4k) gld.M((xdr) ldmVar.A().q.d, oq5Var2).getValue();
                    j0q j0qVar = (j0q) ldmVar.A().q.e;
                    tmb x = ldmVar.x();
                    int i3 = lvf.f;
                    ngg.e(str, k4kVar, a, j0qVar, this.c, x, oq5Var2, 262656);
                    rzf.j(ldmVar.A().r, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
