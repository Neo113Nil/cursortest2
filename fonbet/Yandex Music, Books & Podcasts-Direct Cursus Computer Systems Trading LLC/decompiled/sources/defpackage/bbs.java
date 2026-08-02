package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bbs extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ long s;
    public final /* synthetic */ Float t;
    public final /* synthetic */ Function2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbs(long j, Float f, Function2 function2) {
        super(2);
        this.s = j;
        this.t = f;
        this.u = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    Function2 function2 = this.u;
                    Float f = this.t;
                    if (f != null) {
                        oq5Var.Z(-1177895124);
                        etn.l(mb6.a.a(f), function2, oq5Var, 8);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1177696538);
                        etn.l(mb6.a.a(Float.valueOf(d85.d(this.s))), function2, oq5Var, 8);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qs5 qs5Var = sb6.a;
                    long j = this.s;
                    etn.l(qs5Var.a(new d85(j)), ild.C(-1132188434, new bbs(this.t, this.u, j), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbs(Float f, Function2 function2, long j) {
        super(2);
        this.t = f;
        this.u = function2;
        this.s = j;
    }
}
