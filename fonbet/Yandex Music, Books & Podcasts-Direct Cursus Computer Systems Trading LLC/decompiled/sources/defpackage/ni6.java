package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ni6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;

    public /* synthetic */ ni6(Function0 function0, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = function0;
        this.c = yciVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bcx.c(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 1:
                ild.i(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 2:
                tt0.n(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 3:
                bkp.Q(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 4:
                bzf.d(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 5:
                rzf.i(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            case 6:
                a0g.q(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
            default:
                p1g.p(this.b, this.c, hq5Var, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
