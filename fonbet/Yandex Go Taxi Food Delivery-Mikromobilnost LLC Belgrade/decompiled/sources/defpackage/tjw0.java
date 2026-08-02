package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.support.ui.support_menu.SupportMenuModalView;

/* loaded from: classes14.dex */
public final class tjw0 extends m230 {
    public final w030 E;
    public final pjw0 F;
    public final sjw0 G;
    public final boolean H;

    public tjw0(w030 w030Var, pjw0 pjw0Var, sjw0 sjw0Var) {
        super(null);
        this.E = w030Var;
        this.F = pjw0Var;
        this.G = sjw0Var;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        wor0 wor0Var = new wor0(this);
        zxs0 zxs0Var = this.G.a;
        rjw0 rjw0Var = new rjw0(wor0Var, (o2y0) obj, (l7s0) ((miv0) zxs0Var.a).get(), (piw0) ((xvf0) zxs0Var.b).get());
        vx0 vx0Var = this.F.a;
        return new SupportMenuModalView((Context) vx0Var.a.get(), (ip11) vx0Var.b.get(), (pav) vx0Var.c.get(), rjw0Var);
    }
}
