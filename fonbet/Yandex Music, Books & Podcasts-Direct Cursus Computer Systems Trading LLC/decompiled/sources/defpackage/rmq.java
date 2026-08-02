package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rmq extends uif implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ ymq u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmq(int i, long j, ymq ymqVar, Function2 function2) {
        super(2);
        this.u = ymqVar;
        this.t = j;
        this.s = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                Function2 function2 = this.s;
                y1g.c(1, this.t, (hq5) obj, this.u, function2);
                return Unit.a;
            default:
                hq5 hq5Var = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                smq smqVar = smq.a;
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.a0(578571862);
                oq5Var2.a0(-548224868);
                if (!(oq5Var2.a instanceof mw0)) {
                    lxe.v();
                    throw null;
                }
                oq5Var2.X();
                if (oq5Var2.O) {
                    oq5Var2.k(smqVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, new fma(this.t), epo.v0);
                g0g.U(oq5Var2, this.u, epo.w0);
                this.s.invoke(oq5Var2, 0);
                oq5Var2.p(true);
                oq5Var2.p(false);
                oq5Var2.p(false);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmq(Function2 function2, long j, ymq ymqVar) {
        super(2);
        this.s = function2;
        this.t = j;
        this.u = ymqVar;
    }
}
