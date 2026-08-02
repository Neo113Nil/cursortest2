package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class qp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo6 b;

    public /* synthetic */ qp(qo6 qo6Var, int i) {
        this.a = i;
        this.b = qo6Var;
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
                swf.d(this.b, gce.c, null, null, 0L, 0L, false, hq5Var, 48, 124);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                swf.d(this.b, gce.c, null, null, 0L, 0L, false, hq5Var2, 48, 124);
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                swf.d(this.b, gce.d, null, null, 0L, 0L, false, hq5Var3, 48, 124);
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                swf.d(this.b, gce.c, null, null, 0L, 0L, false, hq5Var4, 48, 124);
            default:
                hq5 hq5Var5 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue & 1, (intValue & 3) != 2)) {
                    p1g.t(this.b, null, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                break;
        }
        return Unit.a;
    }
}
