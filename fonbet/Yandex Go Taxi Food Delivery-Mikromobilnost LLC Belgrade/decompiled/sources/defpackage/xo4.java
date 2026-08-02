package defpackage;

import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;

/* loaded from: classes12.dex */
public abstract class xo4 {
    public final vo4 a;
    public rgr0 b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final Paint i;

    public xo4(vo4 vo4Var, float f, float f2) {
        this.a = vo4Var;
        this.c = f / f2;
        float f3 = vo4Var.a - vo4Var.b;
        this.d = f3;
        float f4 = vo4Var.e;
        this.e = f3 + f4;
        float f5 = vo4Var.d + f4;
        this.f = f5;
        this.g = vo4Var.c / 2.0f;
        this.h = f5;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStrokeWidth(0.1f);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        paint.setColor(-65536);
    }

    public abstract View a(BalloonAnchor balloonAnchor);

    public final PointF b(PointF pointF, BalloonAnchor balloonAnchor) {
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        int i = wo4.b[balloonAnchor.getVertical().ordinal()];
        float f3 = this.d;
        vo4 vo4Var = this.a;
        if (i == 1) {
            int i2 = wo4.a[balloonAnchor.getHorizontal().ordinal()];
            if (i2 == 1) {
                float f4 = vo4Var.e;
                return new PointF(f4, f4);
            }
            if (i2 == 2) {
                return new PointF(f, vo4Var.e);
            }
            if (i2 == 3) {
                return new PointF(pointF.x + f3, vo4Var.e);
            }
            w511.b();
            return null;
        }
        if (i == 2) {
            int i3 = wo4.a[balloonAnchor.getHorizontal().ordinal()];
            if (i3 == 1) {
                return new PointF(vo4Var.e, f2);
            }
            if (i3 == 2) {
                ny61.g("Unknown leg position");
                return null;
            }
            if (i3 == 3) {
                return new PointF(pointF.x + vo4Var.d, f2);
            }
            w511.b();
            return null;
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        int i4 = wo4.a[balloonAnchor.getHorizontal().ordinal()];
        if (i4 == 1) {
            return new PointF(vo4Var.e, pointF.y + f3);
        }
        if (i4 == 2) {
            return new PointF(f, pointF.y + vo4Var.d);
        }
        if (i4 == 3) {
            return new PointF(pointF.x + f3, pointF.y + f3);
        }
        w511.b();
        return null;
    }

    public final PointF[] c(PointF pointF, PointF pointF2, boolean z) {
        float f = pointF.x;
        float f2 = pointF.y;
        vo4 vo4Var = this.a;
        PointF pointF3 = new PointF(f, Math.copySign(vo4Var.b, f2 - pointF2.y) + f2);
        float f3 = pointF.x;
        PointF[] d = d(pointF3, pointF2, new PointF(Math.copySign(vo4Var.b, f3 - pointF2.x) + f3, pointF.y), true);
        return z ? (PointF[]) j73.W(d) : d;
    }

    public final PointF[] d(PointF pointF, PointF pointF2, PointF pointF3, boolean z) {
        PointF e = z ? j4b1.e(4.0f, j4b1.h(j4b1.i(1.5f, j4b1.h(pointF, pointF3)), pointF2)) : j4b1.e(2.0f, j4b1.h(pointF, pointF3));
        PointF e2 = j4b1.e(4.0f, j4b1.h(j4b1.h(pointF, pointF3), j4b1.i(2.0f, pointF2)));
        PointF e3 = j4b1.e(4.0f, j4b1.f(pointF, pointF3));
        PointF e4 = j4b1.e(z ? 8.0f : 13.0f, j4b1.f(pointF, pointF3));
        PointF g = j4b1.g(j4b1.f(pointF, pointF3));
        vo4 vo4Var = this.a;
        float f = vo4Var.g;
        float f2 = vo4Var.g;
        PointF h = j4b1.h(j4b1.i(f, g), j4b1.e(9.0f, j4b1.f(e, pointF2)));
        PointF h2 = j4b1.h(j4b1.i(f2, j4b1.g(j4b1.f(pointF3, pointF))), j4b1.e(9.0f, j4b1.f(e, pointF2)));
        return new PointF[]{pointF, j4b1.h(e, e3), j4b1.h(e2, e4), j4b1.h(pointF2, h), j4b1.h(j4b1.h(pointF2, h), j4b1.i(1.5f, j4b1.i(f2, j4b1.g(j4b1.f(pointF2, e))))), j4b1.h(j4b1.h(pointF2, h2), j4b1.i(1.5f, j4b1.i(f2, j4b1.g(j4b1.f(pointF2, e))))), j4b1.h(pointF2, h2), j4b1.f(e2, e4), j4b1.f(e, e3), pointF3};
    }
}
