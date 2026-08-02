package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ba1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xbb b;
    public final /* synthetic */ twu c;

    public /* synthetic */ ba1(xbb xbbVar, twu twuVar, int i) {
        this.a = i;
        this.b = xbbVar;
        this.c = twuVar;
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
                i4w.b(this.b, this.c, null, hq5Var, 8);
            default:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                nt0.n(this.b, this.c, null, hq5Var, 8);
        }
        return Unit.a;
    }
}
