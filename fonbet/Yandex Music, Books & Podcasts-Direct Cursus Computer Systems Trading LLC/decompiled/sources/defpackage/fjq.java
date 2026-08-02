package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class fjq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ejq b;

    public /* synthetic */ fjq(ejq ejqVar, int i) {
        this.a = i;
        this.b = ejqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    bzf.i(this.b, null, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                ejq ejqVar = this.b;
                ejqVar.getClass();
                Object value = ejqVar.c.getValue();
                njq njqVar = value instanceof njq ? (njq) value : null;
                if (njqVar != null) {
                    ejqVar.a.f.h(ox6.M(njqVar.a, 0, str), booleanValue);
                }
                break;
        }
        return Unit.a;
    }
}
