package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tef implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uef b;
    public final /* synthetic */ rp7 c;

    public /* synthetic */ tef(uef uefVar, rp7 rp7Var, int i) {
        this.a = i;
        this.b = uefVar;
        this.c = rp7Var;
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
                    pd.b(new qzm[0], false, ild.C(-661799524, new tef(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        uef uefVar = this.b;
                        K = new zef((xbc) uefVar.o.getValue(), (cff) uefVar.k.getValue(), (oef) uefVar.m.getValue(), this.c);
                        oq5Var2.k0(K);
                    }
                    tt0.p((zef) K, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
