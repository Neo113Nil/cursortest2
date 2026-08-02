package defpackage;

import android.content.Context;
import com.yandex.mapkit.ScreenPoint;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public final class vo21 extends bhf implements to21, uo21 {
    public final vgf A;
    public final xo21 B;
    public final oo21 C;
    public final xm00 D;
    public final Context z;

    public vo21(Context context, vgf vgfVar, xo21 xo21Var, ah00 ah00Var, no21 no21Var) {
        super(ah00Var, no21Var);
        this.z = context;
        this.A = vgfVar;
        this.B = xo21Var;
        this.C = new oo21(0, this);
        this.D = new xm00();
    }

    @Override // defpackage.bhf
    public final ugf Jg() {
        this.A.getClass();
        return new ahf(this.z, this.D);
    }

    @Override // defpackage.bhf
    public final ScreenPoint Kg() {
        es00 es00Var = ((gh00) ((ah00) this.b)).e;
        return es00Var.e(a.F(es00Var.b()));
    }

    @Override // defpackage.uo21
    public final void attach() {
        this.D.b(((gh00) ((ah00) this.b)).i);
        this.B.Bg(this);
    }

    @Override // defpackage.uo21
    public final void detach() {
        Ig();
        this.B.Cg();
        this.D.d();
    }

    @Override // defpackage.to21
    public final void n0() {
        Lg().setVisible(false);
    }

    @Override // defpackage.bhf, defpackage.igc0
    public final void pause() {
        super.pause();
        ((gh00) ((ah00) this.b)).u(this.C);
    }

    @Override // defpackage.bhf, defpackage.igc0
    public final void resume() {
        super.resume();
        ((gh00) ((ah00) this.b)).e(this.C);
    }

    @Override // defpackage.to21
    public final void t0() {
        Lg().setVisible(true);
    }

    @Override // defpackage.to21
    public final void updateUserLocation(mo21 mo21Var) {
        unr0.C(new Object[]{mo21Var}, 1, "updateUserLocation %s", jst.e);
        Ng(mo21Var.a, mo21Var.b, mo21Var.c);
    }
}
