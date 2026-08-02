package defpackage;

import android.content.Context;

/* loaded from: classes6.dex */
public final class zrz0 extends zyg {
    public final Context a;
    public final int b;
    public final float c;
    public int d;

    public zrz0(zuj0 zuj0Var, Context context) {
        this.a = context;
        avj0 avj0Var = (avj0) zuj0Var;
        this.b = avj0Var.a(mqg0.component_red_normal);
        this.c = avj0Var.e(xrg0.map_toll_route_width);
        this.d = qje.t(xng0.bgMain, context);
    }

    @Override // defpackage.zyg
    public final void b(w4e0 w4e0Var, int i) {
        w4e0Var.B(i, this.b);
        w4e0Var.y(this.d);
        w4e0Var.p(this.c);
        w4e0Var.v(false);
    }
}
