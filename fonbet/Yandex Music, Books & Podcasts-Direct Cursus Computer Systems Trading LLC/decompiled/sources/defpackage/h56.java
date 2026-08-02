package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class h56 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i56 b;

    public /* synthetic */ h56(i56 i56Var, int i) {
        this.a = i;
        this.b = i56Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                i56 i56Var = this.b;
                i56Var.A(ild.C(-1525667126, new h56(i56Var, 1), hq5Var), hq5Var, 6);
            default:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                i56 i56Var2 = this.b;
                e56 e56Var = i56Var2.k;
                d56 d56Var = (d56) i56Var2.l.getValue();
                e56Var.getClass();
                d56Var.getClass();
                oq5 oq5Var3 = (oq5) hq5Var;
                Object K = oq5Var3.K();
                if (K == gq5.a) {
                    e56Var.a.getClass();
                    K = new j56(d56Var);
                    oq5Var3.k0(K);
                }
                gld.d((j56) K, hq5Var, 0);
        }
        return Unit.a;
    }
}
