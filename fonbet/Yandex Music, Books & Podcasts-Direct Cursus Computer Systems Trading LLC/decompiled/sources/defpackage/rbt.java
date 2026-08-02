package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class rbt extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ovn s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbt(ovn ovnVar, yci yciVar, boolean z, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = ovnVar;
        this.t = yciVar;
        this.u = z;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                this.s.s(rvf.R(this.v | 1), hq5Var, this.t, this.u);
                break;
            default:
                this.s.h(rvf.R(this.v | 1), hq5Var, this.t, this.u);
                break;
        }
        return Unit.a;
    }
}
