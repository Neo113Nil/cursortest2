package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vf4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    public /* synthetic */ vf4(int i, int i2, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    n7w.g(this.c, 0, oq5Var, null, this.b);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                num.getClass();
                sk3.j(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            case 2:
                num.getClass();
                sk3.l(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            case 3:
                num.getClass();
                xee.k(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            case 4:
                num.intValue();
                q7g.i(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            case 5:
                num.intValue();
                ixf.c(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            case 6:
                num.getClass();
                swf.p(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            case 7:
                num.getClass();
                swf.q(this.b, hq5Var, rvf.R(this.c | 1));
                break;
            default:
                num.intValue();
                u1g.n(this.b, hq5Var, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vf4(int i, int i2, boolean z, boolean z2) {
        this.a = i2;
        this.b = z;
        this.c = i;
    }
}
