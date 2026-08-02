package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class si0 extends uif implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(zpr zprVar, boolean z, yci yciVar, int i) {
        super(2);
        this.v = zprVar;
        this.s = z;
        this.t = yciVar;
        this.u = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                qld.t(rvf.R(this.u | 1), hq5Var, (yci) this.t, (Function0) this.v, this.s);
                break;
            case 1:
                lf7.e((zpr) this.v, this.s, (yci) this.t, hq5Var, rvf.R(this.u | 1));
                break;
            default:
                a0g.u(this.s, (i2o) this.t, (qbs) this.v, hq5Var, rvf.R(this.u | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(Function0 function0, yci yciVar, boolean z, int i) {
        super(2);
        this.t = yciVar;
        this.v = function0;
        this.s = z;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(boolean z, i2o i2oVar, qbs qbsVar, int i) {
        super(2);
        this.s = z;
        this.t = i2oVar;
        this.v = qbsVar;
        this.u = i;
    }
}
