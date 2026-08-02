package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class sbt extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ovn s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbt(ovn ovnVar, yci yciVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = ovnVar;
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
                this.s.o(this.t, hq5Var, rvf.R(this.u | 1));
                break;
            default:
                this.s.f(this.t, hq5Var, rvf.R(this.u | 1));
                break;
        }
        return Unit.a;
    }
}
