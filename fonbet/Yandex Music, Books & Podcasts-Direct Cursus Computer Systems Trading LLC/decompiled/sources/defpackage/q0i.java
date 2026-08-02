package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class q0i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0i b;
    public final /* synthetic */ v0i c;

    public /* synthetic */ q0i(s0i s0iVar, v0i v0iVar, int i) {
        this.a = i;
        this.b = s0iVar;
        this.c = v0iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        s0i s0iVar = this.b;
        int i2 = 1;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(512977765, new q0i(s0iVar, this.c, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    lvf a = ovf.a(s0iVar.A().p, oq5Var2);
                    k4k k4kVar = (k4k) gld.M((xdr) s0iVar.A().q.d, oq5Var2).getValue();
                    boolean booleanValue = ((Boolean) gld.M(s0iVar.A().n, oq5Var2).getValue()).booleanValue();
                    j0q j0qVar = (j0q) s0iVar.A().q.e;
                    tmb x = s0iVar.x();
                    int i3 = lvf.f;
                    y5g.b(k4kVar, a, booleanValue, j0qVar, this.c, x, oq5Var2, 262208);
                    rzf.j(s0iVar.A().r, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
