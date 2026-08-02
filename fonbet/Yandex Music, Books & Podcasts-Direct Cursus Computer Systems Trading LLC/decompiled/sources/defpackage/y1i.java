package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class y1i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1i b;
    public final /* synthetic */ b2i c;

    public /* synthetic */ y1i(z1i z1iVar, b2i b2iVar, int i) {
        this.a = i;
        this.b = z1iVar;
        this.c = b2iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        z1i z1iVar = this.b;
        int i2 = 1;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-771607674, new y1i(z1iVar, this.c, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    lvf a = ovf.a(z1iVar.A().p, oq5Var2);
                    boolean booleanValue = ((Boolean) gld.M(z1iVar.A().n, oq5Var2).getValue()).booleanValue();
                    k4k k4kVar = (k4k) gld.M((xdr) z1iVar.A().q.d, oq5Var2).getValue();
                    j0q j0qVar = (j0q) z1iVar.A().q.e;
                    tmb x = z1iVar.x();
                    int i3 = lvf.f;
                    q7g.f(k4kVar, a, booleanValue, j0qVar, this.c, x, oq5Var2, 262208);
                    rzf.j(z1iVar.A().r, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
