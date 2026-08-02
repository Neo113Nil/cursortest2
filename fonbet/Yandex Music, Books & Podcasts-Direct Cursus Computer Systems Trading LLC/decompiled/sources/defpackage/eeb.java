package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class eeb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ feb b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ eeb(feb febVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = febVar;
        this.c = rp7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                feb febVar = this.b;
                rp7 rp7Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1163891530, new eeb(febVar, rp7Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                feb febVar2 = this.b;
                rp7 rp7Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        xbc xbcVar = (xbc) febVar2.o.getValue();
                        leb lebVar = (leb) febVar2.k.getValue();
                        beb bebVar = (beb) febVar2.m.getValue();
                        oda odaVar = new oda(febVar2.d().a, febVar2.j);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        heb hebVar = new heb(xbcVar, lebVar, bebVar, rp7Var2, odaVar, (g0l) qdcVar.C(I), febVar2.d(), febVar2.j);
                        oq5Var2.k0(hebVar);
                        K = hebVar;
                    }
                    x97.i((heb) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
