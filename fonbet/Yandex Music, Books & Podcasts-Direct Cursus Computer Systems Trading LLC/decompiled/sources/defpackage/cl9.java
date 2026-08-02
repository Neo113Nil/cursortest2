package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class cl9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jl9 s;
    public final /* synthetic */ wl9 t;
    public final /* synthetic */ xzb u;
    public final /* synthetic */ yk9 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl9(jl9 jl9Var, wl9 wl9Var, xzb xzbVar, yk9 yk9Var, int i) {
        super(1);
        this.r = i;
        this.s = jl9Var;
        this.t = wl9Var;
        this.u = xzbVar;
        this.v = yk9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((Number) obj).intValue();
                wl9 wl9Var = this.t;
                yk9 yk9Var = this.v;
                wl9Var.setThumbSecondTextDrawable(yk9Var != null ? new jas(c3x.W(yk9Var, wl9Var.getResources().getDisplayMetrics(), this.s.c, this.u)) : null);
                break;
            default:
                ((Number) obj).intValue();
                wl9 wl9Var2 = this.t;
                yk9 yk9Var2 = this.v;
                wl9Var2.setThumbTextDrawable(yk9Var2 != null ? new jas(c3x.W(yk9Var2, wl9Var2.getResources().getDisplayMetrics(), this.s.c, this.u)) : null);
                break;
        }
        return Unit.a;
    }
}
