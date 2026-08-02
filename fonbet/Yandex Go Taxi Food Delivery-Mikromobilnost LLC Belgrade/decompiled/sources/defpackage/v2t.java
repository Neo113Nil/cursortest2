package defpackage;

import android.animation.ValueAnimator;
import com.yandex.mapkit.maps.core.geometry.Point;

/* loaded from: classes7.dex */
public final class v2t {
    public final Point a;
    public final Point b;
    public final eo1 c;
    public final f02 d;
    public ValueAnimator e;

    public v2t(Point point, Point point2, c4c0 c4c0Var, eo1 eo1Var, f02 f02Var) {
        this.a = point;
        this.b = point2;
        this.c = eo1Var;
        this.d = f02Var;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.e = null;
    }
}
