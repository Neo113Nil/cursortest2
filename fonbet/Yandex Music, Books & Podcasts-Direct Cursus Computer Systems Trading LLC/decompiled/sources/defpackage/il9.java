package defpackage;

import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class il9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wl9 s;
    public final /* synthetic */ ouq t;
    public final /* synthetic */ dx8 u;
    public final /* synthetic */ DisplayMetrics v;
    public final /* synthetic */ xzb w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il9(wl9 wl9Var, ouq ouqVar, dx8 dx8Var, DisplayMetrics displayMetrics, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = wl9Var;
        this.t = ouqVar;
        this.u = dx8Var;
        this.v = displayMetrics;
        this.w = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.t.e = vq1.g0(this.u, this.v, this.w);
                wl9 wl9Var = this.s;
                wl9Var.requestLayout();
                wl9Var.invalidate();
                break;
            default:
                this.t.f = vq1.g0(this.u, this.v, this.w);
                wl9 wl9Var2 = this.s;
                wl9Var2.requestLayout();
                wl9Var2.invalidate();
                break;
        }
        return Unit.a;
    }
}
