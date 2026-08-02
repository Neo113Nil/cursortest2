package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class kf7 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qe7 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf7(qe7 qe7Var, yci yciVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = qe7Var;
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
                lf7.a(this.s, this.t, hq5Var, rvf.R(this.u | 1));
                break;
            default:
                lf7.d(this.s, this.t, hq5Var, rvf.R(this.u | 1));
                break;
        }
        return Unit.a;
    }
}
