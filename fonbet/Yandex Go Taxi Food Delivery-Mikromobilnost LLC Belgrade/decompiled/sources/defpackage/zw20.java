package defpackage;

import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class zw20 implements yw20 {
    public h030 a;

    @Override // defpackage.yw20
    public final void a() {
        h030 h030Var = this.a;
        if (h030Var != null) {
            d130 d130Var = (d130) ((yvi0) h030Var).a;
            a130 a130Var = d130Var.g;
            FrameLayout frameLayout = d130Var.f;
            a130Var.e++;
            a130Var.a.a(frameLayout, a130Var.b, a130Var.c);
        }
    }

    @Override // defpackage.yw20
    public final void b() {
        h030 h030Var = this.a;
        if (h030Var != null) {
            d130 d130Var = (d130) ((yvi0) h030Var).a;
            d130Var.g.a(d130Var.f);
        }
    }
}
