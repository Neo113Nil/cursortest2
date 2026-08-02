package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pyl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ fvf c;

    public /* synthetic */ pyl(yci yciVar, fvf fvfVar, int i) {
        this.a = i;
        this.b = yciVar;
        this.c = fvfVar;
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
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        K = new osl(11);
                        oq5Var.k0(K);
                    }
                    zyl.a(this.b, this.c, (Function1) K, oq5Var, 384);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K2 = oq5Var2.K();
                    if (K2 == gq5.a) {
                        K2 = new osl(12);
                        oq5Var2.k0(K2);
                    }
                    azl.a(this.b, this.c, (Function1) K2, oq5Var2, 384);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
