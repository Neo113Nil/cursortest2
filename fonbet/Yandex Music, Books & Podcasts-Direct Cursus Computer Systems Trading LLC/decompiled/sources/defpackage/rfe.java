package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class rfe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sfe b;

    public /* synthetic */ rfe(sfe sfeVar, int i) {
        this.a = i;
        this.b = sfeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                sfe sfeVar = this.b;
                zfe zfeVar = sfeVar.j;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                jf0.g(new qzm[0], ((Boolean) gld.O(zfeVar.a, hq5Var).getValue()).booleanValue(), zfeVar.b, zfeVar.c, ild.C(-1661243066, new rfe(sfeVar, 1), hq5Var), hq5Var, 24576);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                sfe sfeVar2 = this.b;
                nfe nfeVar = sfeVar2.k;
                ige igeVar = (ige) sfeVar2.n.getValue();
                yfe yfeVar = (yfe) sfeVar2.m.getValue();
                nfeVar.getClass();
                yfeVar.getClass();
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean f = oq5Var3.f(igeVar) | oq5Var3.f(yfeVar);
                Object K = oq5Var3.K();
                if (f || K == gq5.a) {
                    nfeVar.a.getClass();
                    K = new dfe(yfeVar, igeVar);
                    oq5Var3.k0(K);
                }
                quj.q((dfe) K, gut.a0(gut.p1(vci.a)), hq5Var2, 0, 0);
                break;
        }
        return Unit.a;
    }
}
