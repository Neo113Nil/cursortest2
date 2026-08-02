package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class fl9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jl9 s;
    public final /* synthetic */ wl9 t;
    public final /* synthetic */ xzb u;
    public final /* synthetic */ dx8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl9(jl9 jl9Var, wl9 wl9Var, xzb xzbVar, dx8 dx8Var, int i) {
        super(1);
        this.r = i;
        this.s = jl9Var;
        this.t = wl9Var;
        this.u = xzbVar;
        this.v = dx8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                wl9 wl9Var = this.t;
                dx8 dx8Var = this.v;
                wl9Var.setActiveTickMarkDrawable(dx8Var != null ? vq1.g0(dx8Var, wl9Var.getResources().getDisplayMetrics(), this.u) : null);
                this.s.G(wl9Var);
                break;
            default:
                wl9 wl9Var2 = this.t;
                dx8 dx8Var2 = this.v;
                wl9Var2.setInactiveTickMarkDrawable(dx8Var2 != null ? vq1.g0(dx8Var2, wl9Var2.getResources().getDisplayMetrics(), this.u) : null);
                this.s.G(wl9Var2);
                break;
        }
        return Unit.a;
    }
}
