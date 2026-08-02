package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f1r extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g1r s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1r(g1r g1rVar, int i) {
        super(2);
        this.r = i;
        switch (i) {
            case 1:
                this.s = g1rVar;
                super(2);
                break;
            default:
                wn5 wn5Var = vo5.a;
                this.s = g1rVar;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    wn5 wn5Var = vo5.a;
                    g1r g1rVar = this.s;
                    g1rVar.getClass();
                    wn5Var.invoke(g1rVar, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xcs.b(this.s.a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var2, 0, 0, 131070);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
