package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class rgf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wgf b;
    public final /* synthetic */ ix6 c;

    public /* synthetic */ rgf(wgf wgfVar, ix6 ix6Var, int i) {
        this.a = i;
        this.b = wgfVar;
        this.c = ix6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wgf wgfVar = this.b;
                ix6 ix6Var = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-382865476, new rgf(wgfVar, ix6Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                wgf wgfVar2 = this.b;
                ix6 ix6Var2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        xbc xbcVar = (xbc) wgfVar2.o.getValue();
                        ghf ghfVar = (ghf) wgfVar2.k.getValue();
                        wy4 wy4Var = (wy4) wgfVar2.m.getValue();
                        pgf pgfVar = new pgf(wgfVar2.d().a, 0);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        zgf zgfVar = new zgf(xbcVar, ghfVar, wy4Var, ix6Var2, pgfVar, (g0l) qdcVar.C(I), wgfVar2.d(), wgfVar2.j);
                        oq5Var2.k0(zgfVar);
                        K = zgfVar;
                    }
                    yd5.k((zgf) K, oq5Var2, 0);
                    rzf.j(((ghf) wgfVar2.k.getValue()).n, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
