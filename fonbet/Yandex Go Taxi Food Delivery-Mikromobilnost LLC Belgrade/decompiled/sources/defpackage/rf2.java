package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.yandex.mapkit.maps.core.geometry.Point;
import defpackage.v2t;

/* loaded from: classes7.dex */
public final class rf2 implements h2c0 {
    public final h2c0 a;
    public final c4c0 b;
    public boolean c;
    public v2t d;

    public rf2(h2c0 h2c0Var, c4c0 c4c0Var) {
        this.a = h2c0Var;
        this.b = c4c0Var;
    }

    @Override // defpackage.h2c0
    public final void a(yj70 yj70Var) {
        this.a.a(yj70Var);
    }

    @Override // defpackage.h2c0
    public final void b(boolean z, m1c0 m1c0Var, sls slsVar) {
        this.a.b(z, m1c0Var, slsVar);
    }

    @Override // defpackage.h2c0
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.h2c0
    public final void d(Point point) {
        Point geometry;
        boolean z = this.c;
        h2c0 h2c0Var = this.a;
        if (!z) {
            this.c = true;
            v2t v2tVar = this.d;
            if (v2tVar != null) {
                v2tVar.a();
            }
            this.d = null;
            h2c0Var.d(point);
            return;
        }
        boolean c = h2c0Var.c();
        v2t v2tVar2 = this.d;
        if (!c) {
            if (v2tVar2 != null) {
                v2tVar2.a();
            }
            this.d = null;
            return;
        }
        if (v2tVar2 == null || (geometry = v2tVar2.b) == null) {
            geometry = h2c0Var.getGeometry();
        }
        double lat = point.getLat() - geometry.getLat();
        double lon = point.getLon() - geometry.getLon();
        double d = (lon * lon) + (lat * lat);
        c4c0 c4c0Var = this.b;
        double d2 = c4c0Var.d;
        double d3 = d2 * d2;
        double d4 = c4c0Var.c;
        double d5 = d4 * d4;
        if (d < d3 || d > d5) {
            v2t v2tVar3 = this.d;
            if (v2tVar3 != null) {
                v2tVar3.a();
            }
            this.d = null;
            h2c0Var.d(point);
            return;
        }
        Point geometry2 = h2c0Var.getGeometry();
        v2t v2tVar4 = this.d;
        if (v2tVar4 != null) {
            v2tVar4.a();
        }
        final v2t v2tVar5 = new v2t(geometry2, point, c4c0Var, new eo1(8, this), new f02(4, this));
        this.d = v2tVar5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(c4c0Var.a);
        ofFloat.setInterpolator(c4c0Var.b);
        ofFloat.addUpdateListener(new yso(3, v2tVar5));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.yandexmaps.multiplatform.pin.war.internal.GeometryAnimator$start$anim$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                v2t v2tVar6 = v2t.this;
                if (v2tVar6.e == animation) {
                    v2tVar6.d.invoke();
                }
            }
        });
        v2tVar5.e = ofFloat;
        ofFloat.start();
    }

    @Override // defpackage.h2c0
    public final void e(boolean z) {
        v2t v2tVar = this.d;
        if (v2tVar != null) {
            v2tVar.a();
        }
        this.d = null;
        this.a.e(z);
    }

    @Override // defpackage.h2c0
    public final void f(f2c0 f2c0Var, m5v m5vVar) {
        this.a.f(f2c0Var, m5vVar);
    }

    @Override // defpackage.h2c0
    public final void g() {
        v2t v2tVar = this.d;
        if (v2tVar != null) {
            v2tVar.a();
        }
        this.d = null;
        this.a.g();
    }

    @Override // defpackage.h2c0
    public final Point getGeometry() {
        Point point;
        v2t v2tVar = this.d;
        return (v2tVar == null || (point = v2tVar.b) == null) ? this.a.getGeometry() : point;
    }

    @Override // defpackage.h2c0
    public final void setUserData(Object obj) {
        this.a.setUserData(obj);
    }

    @Override // defpackage.h2c0
    public final void setVisible(boolean z) {
        this.a.setVisible(z);
    }

    @Override // defpackage.h2c0
    public final void setZIndex(float f) {
        this.a.setZIndex(f);
    }
}
