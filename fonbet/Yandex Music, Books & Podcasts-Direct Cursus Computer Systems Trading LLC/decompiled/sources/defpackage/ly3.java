package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ly3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ my3 b;

    public /* synthetic */ ly3(my3 my3Var, int i) {
        this.a = i;
        this.b = my3Var;
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
                    jf0.a(new qzm[0], pd.t(new qzm[0]), true, ild.C(1372749376, new ly3(this.b, 1), oq5Var), oq5Var, 3456, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    ny3 ny3Var = this.b.n;
                    if (ny3Var == null) {
                        Intrinsics.j("presenter");
                        throw null;
                    }
                    tt0.c(ny3Var, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }
}
