package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class cy5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy5 b;

    public /* synthetic */ cy5(gy5 gy5Var, int i) {
        this.a = i;
        this.b = gy5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                this.b.a(str, booleanValue);
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                zsd.i(this.b, null, hq5Var, 0);
        }
        return Unit.a;
    }
}
