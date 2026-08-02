package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class bl9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wl9 s;
    public final /* synthetic */ xzb t;
    public final /* synthetic */ dx8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl9(jl9 jl9Var, wl9 wl9Var, xzb xzbVar, dx8 dx8Var, int i) {
        super(1);
        this.r = i;
        this.s = wl9Var;
        this.t = xzbVar;
        this.u = dx8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                wl9 wl9Var = this.s;
                wl9Var.setThumbSecondaryDrawable(vq1.g0(this.u, wl9Var.getResources().getDisplayMetrics(), this.t));
                break;
            case 1:
                wl9 wl9Var2 = this.s;
                wl9Var2.setThumbDrawable(vq1.g0(this.u, wl9Var2.getResources().getDisplayMetrics(), this.t));
                break;
            case 2:
                wl9 wl9Var3 = this.s;
                wl9Var3.setActiveTrackDrawable(vq1.g0(this.u, wl9Var3.getResources().getDisplayMetrics(), this.t));
                break;
            default:
                wl9 wl9Var4 = this.s;
                wl9Var4.setInactiveTrackDrawable(vq1.g0(this.u, wl9Var4.getResources().getDisplayMetrics(), this.t));
                break;
        }
        return Unit.a;
    }
}
