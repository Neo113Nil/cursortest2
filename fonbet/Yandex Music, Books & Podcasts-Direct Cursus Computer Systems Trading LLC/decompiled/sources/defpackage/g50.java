package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g50 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a60 b;

    public /* synthetic */ g50(a60 a60Var) {
        this.b = a60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    a60 a60Var = this.b;
                    boolean h = oq5Var.h(a60Var);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        K = new zy(0, a60Var, a60.class, "onBackClicked", "onBackClicked()V", 0, 10);
                        oq5Var.k0(K);
                    }
                    zsd.g((Function0) ((h9f) K), null, 0, 0L, 0, oq5Var, 0, 30);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                p50.b(this.b, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g50(a60 a60Var, int i) {
        this.b = a60Var;
    }
}
