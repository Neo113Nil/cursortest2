package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public final class vgt0 extends bhf implements ugt0, wgt0 {
    public final xm00 A;
    public final vgf B;
    public final ygt0 C;
    public final oo21 D;
    public f4c0 E;
    public ValueAnimator F;
    public final Context z;

    public vgt0(Context context, xm00 xm00Var, vgf vgfVar, ygt0 ygt0Var, ah00 ah00Var, no21 no21Var) {
        super(ah00Var, no21Var);
        this.z = context;
        this.A = xm00Var;
        this.B = vgfVar;
        this.C = ygt0Var;
        this.D = new oo21(0, this);
    }

    @Override // defpackage.bhf
    public final ugf Jg() {
        this.B.getClass();
        return new ahf(this.z, this.A);
    }

    @Override // defpackage.bhf
    public final ScreenPoint Kg() {
        es00 es00Var = ((gh00) ((ah00) this.b)).e;
        return es00Var.e(a.F(es00Var.b()));
    }

    public final f4c0 Og() {
        f4c0 f4c0Var = this.E;
        if (f4c0Var != null) {
            return f4c0Var;
        }
        f4c0 r = this.A.r(new Point(0.0d, 0.0d));
        r.k(10.0f);
        r.g(new r58(7, this));
        this.E = r;
        v2();
        return r;
    }

    @Override // defpackage.to21
    public final void n0() {
        Lg().setVisible(false);
    }

    @Override // defpackage.bhf, defpackage.igc0
    public final void pause() {
        super.pause();
        ((gh00) ((ah00) this.b)).u(this.D);
    }

    @Override // defpackage.wgt0
    public final void pc(Bitmap bitmap, Integer num) {
        Og().x(bitmap);
        Og().D(new IconStyle().setAnchor(new PointF(0.5f, 1.0f)));
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Og().i(true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(num.intValue() * 1000);
        ofFloat.addListener(new AnimUtils$AnimationEndListener(new m8t0(10, this)));
        ofFloat.start();
        this.F = ofFloat;
    }

    @Override // defpackage.bhf, defpackage.igc0
    public final void resume() {
        super.resume();
        ((gh00) ((ah00) this.b)).e(this.D);
        Lg().u0(new la00(2, this));
    }

    @Override // defpackage.to21
    public final void t0() {
        Lg().setVisible(true);
    }

    @Override // defpackage.to21
    public final void updateUserLocation(mo21 mo21Var) {
        unr0.C(new Object[]{mo21Var}, 1, "updateUserLocation %s", jst.e);
        Ng(mo21Var.a, mo21Var.b, mo21Var.c);
        Og().o(new Point(mo21Var.a, mo21Var.b));
    }

    @Override // defpackage.wgt0
    public final void v2() {
        Og().i(false);
    }
}
