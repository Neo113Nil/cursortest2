package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eep extends uif implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ xep s;
    public final /* synthetic */ bfp t;
    public final /* synthetic */ wn5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eep(xep xepVar, bfp bfpVar, wn5 wn5Var) {
        super(2);
        this.s = xepVar;
        this.t = bfpVar;
        this.u = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    etn.l(cfp.a.a(this.t), ild.C(-272381430, new rf6(this.u, this.s), oq5Var), oq5Var, 56);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    bfp bfpVar = this.t;
                    wn5 wn5Var = this.u;
                    xep xepVar = this.s;
                    wct.e(xepVar, ild.C(577209674, new eep(bfpVar, wn5Var, xepVar), oq5Var2), oq5Var2, 48);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eep(bfp bfpVar, wn5 wn5Var, xep xepVar) {
        super(2);
        this.t = bfpVar;
        this.u = wn5Var;
        this.s = xepVar;
    }
}
