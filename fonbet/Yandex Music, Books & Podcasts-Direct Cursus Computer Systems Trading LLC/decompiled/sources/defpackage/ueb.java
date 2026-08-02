package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ueb implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ seb b;

    public /* synthetic */ ueb(seb sebVar) {
        this.b = sebVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                xcs.b(this.b.a.a, null, ((dq0) ((oq5) hq5Var).j(eq0.a)).b.b, 0L, null, 0L, null, new o9s(5), 0L, 0, false, 0, 0, null, nu0.i(), hq5Var, 0, 0, 65018);
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                cxb.i(this.b, (hq5) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ueb(seb sebVar, int i) {
        this.b = sebVar;
    }
}
