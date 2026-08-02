package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.yandex.go.navigator.focus.ScreenPointEvaluator;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapWindow;
import defpackage.gh00;
import defpackage.wb50;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes12.dex */
public final class wb50 implements l390 {
    public final ah00 a;
    public ValueAnimator b;

    public wb50(ah00 ah00Var) {
        this.a = ah00Var;
    }

    public final ScreenPoint a() {
        MapWindow mapWindow;
        ScreenPoint focusPoint;
        ah00 ah00Var = this.a;
        TaxiMapView h = ((gh00) ah00Var).h();
        if (h == null || (mapWindow = h.getMapWindow()) == null || (focusPoint = mapWindow.getFocusPoint()) == null) {
            return null;
        }
        gh00 gh00Var = (gh00) ah00Var;
        TaxiMapView h2 = gh00Var.h();
        return new ScreenPoint(focusPoint.getX() + (h2 != null ? h2.getPaddingStart() : 0), focusPoint.getY() + (gh00Var.h() != null ? r4.getPaddingTop() : 0));
    }

    public final ScreenPoint b() {
        ah00 ah00Var = this.a;
        return new ScreenPoint(((gh00) ah00Var).a.b().exactCenterX(), ((gh00) ah00Var).a.b().exactCenterY());
    }

    public final void c() {
        ah00 ah00Var = this.a;
        if (((gh00) ah00Var).a.e(this)) {
            return;
        }
        ((gh00) ah00Var).p(this);
    }

    public final void d() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.b = null;
    }

    public final ScreenPoint e(ScreenPoint screenPoint) {
        ah00 ah00Var = this.a;
        TaxiMapView h = ((gh00) ah00Var).h();
        return new ScreenPoint(screenPoint.getX() - (h != null ? h.getPaddingStart() : 0), screenPoint.getY() - (((gh00) ah00Var).h() != null ? r3.getPaddingTop() : 0));
    }

    public final void f(ScreenPoint screenPoint, long j) {
        if (fx91.b(screenPoint, a())) {
            return;
        }
        d();
        ScreenPoint e = e(screenPoint == null ? b() : screenPoint);
        if (j <= 0) {
            ((gh00) this.a).x(e);
            return;
        }
        ScreenPoint a = a();
        if (a == null) {
            a = b();
        }
        ScreenPoint e2 = e(a);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setObjectValues(e2, e);
        valueAnimator.setEvaluator(new ScreenPointEvaluator());
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new yso(13, this));
        valueAnimator.start();
        if (screenPoint == null) {
            valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.navigator.focus.NavigatorFocusCoordinator$updateFocusPoint$lambda$0$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ((gh00) wb50.this.a).x(null);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
        this.b = valueAnimator;
    }

    public final void g(ScreenPoint screenPoint) {
        if (fx91.b(screenPoint, a())) {
            return;
        }
        d();
        ScreenPoint b = screenPoint == null ? b() : screenPoint;
        gh00 gh00Var = (gh00) this.a;
        Point d = gh00Var.e.d(b);
        if (d == null) {
            return;
        }
        gh00Var.getClass();
        gh00Var.q(new vmz(7, gh00Var, d));
        gh00Var.x(screenPoint != null ? e(screenPoint) : null);
    }

    public final void h(Rect rect) {
        ah00 ah00Var = this.a;
        if (jl40.l(rect, ((gh00) ah00Var).a.b())) {
            return;
        }
        gh00 gh00Var = (gh00) ah00Var;
        Point d = gh00Var.e.d(new ScreenPoint(rect.exactCenterX(), rect.exactCenterY()));
        if (d != null) {
            gh00Var.getClass();
            gh00Var.q(new vmz(7, gh00Var, d));
        }
        gh00Var.z(this, a.A(rect), false, 0L);
    }
}
