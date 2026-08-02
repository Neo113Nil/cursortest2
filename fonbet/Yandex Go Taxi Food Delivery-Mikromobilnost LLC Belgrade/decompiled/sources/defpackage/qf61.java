package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes11.dex */
public final class qf61 {
    public final RectF a = new RectF();
    public final PointF b;
    public final PointF c;
    public final PointF d;
    public final PointF e;
    public float f;
    public float g;

    public qf61(RectF rectF, RectF rectF2) {
        PointF pointF = new PointF();
        this.b = pointF;
        this.c = new PointF();
        PointF pointF2 = new PointF();
        this.d = pointF2;
        PointF pointF3 = new PointF();
        this.e = pointF3;
        this.f = 1.0f;
        z83.h(null, rectF.height() > 0.0f);
        z83.h(null, rectF.width() > 0.0f);
        pointF2.set(rectF2.centerX(), rectF2.centerY());
        pointF3.set(pointF2);
        pointF.set(rectF.width(), rectF.height());
        a(rectF2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(RectF rectF) {
        float f;
        float centerX;
        float centerX2;
        float f2;
        float centerY;
        float centerY2;
        PointF pointF = this.b;
        float f3 = 0.0f;
        if (pointF.x <= 0.0f || pointF.y <= 0.0f) {
            z83.j("Invalid bounds dimensions");
        }
        if (this.f < 1.0f) {
            this.f = 1.0f;
        }
        float f4 = 2.0f;
        if (pointF.x / pointF.y > 1.0f) {
            float width = rectF.width() / pointF.x;
            this.g = width;
            float f5 = width * pointF.y;
            if (f5 > rectF.height()) {
                this.g = (rectF.height() / f5) * this.g;
            }
            float f6 = this.g * pointF.x;
            float width2 = rectF.width() * 2.0f;
            f = this.f;
            if (f * f6 > width2) {
                f = width2 / f6;
            }
        } else {
            float height = rectF.height() / pointF.y;
            this.g = height;
            float f7 = height * pointF.x;
            if (f7 > rectF.width()) {
                this.g = (rectF.width() / f7) * this.g;
            }
            float f8 = this.g * pointF.y;
            float height2 = rectF.height() * 2.0f;
            f = this.f;
            if (f * f8 > height2) {
                f = height2 / f8;
            }
        }
        if (f < 0.25f) {
            f4 = 0.25f;
        } else if (f <= 2.0f) {
            f4 = f;
        }
        c(f4 / this.f);
        RectF b = b();
        if (b.width() > rectF.width()) {
            float f9 = b.right;
            float f10 = rectF.right;
            float f11 = b.left;
            float f12 = rectF.left;
            if (f9 >= f10) {
                f2 = f11 > f12 ? f12 - f11 : 0.0f;
                if (b.height() <= rectF.height()) {
                    float f13 = b.bottom;
                    float f14 = rectF.bottom;
                    float f15 = b.top;
                    float f16 = rectF.top;
                    if (f13 >= f14) {
                        if (f15 > f16) {
                            f3 = f16 - f15;
                        }
                        this.c.offset(f2, f3);
                    } else {
                        z83.c(null, f15 > f16);
                        centerY = rectF.bottom;
                        centerY2 = b.bottom;
                    }
                } else {
                    centerY = rectF.centerY();
                    centerY2 = b.centerY();
                }
                f3 = centerY - centerY2;
                this.c.offset(f2, f3);
            }
            z83.c(null, f11 > f12);
            centerX = rectF.right;
            centerX2 = b.right;
        } else {
            centerX = rectF.centerX();
            centerX2 = b.centerX();
        }
        f2 = centerX - centerX2;
        if (b.height() <= rectF.height()) {
        }
        f3 = centerY - centerY2;
        this.c.offset(f2, f3);
    }

    public final RectF b() {
        float f = this.f * this.g;
        PointF pointF = this.c;
        float f2 = pointF.x;
        float f3 = pointF.y;
        PointF pointF2 = this.b;
        float f4 = (pointF2.x * f) + f2;
        float f5 = (pointF2.y * f) + f3;
        RectF rectF = this.a;
        rectF.set(f2, f3, f4, f5);
        return rectF;
    }

    public final void c(float f) {
        this.f *= f;
        PointF pointF = this.d;
        float f2 = pointF.x;
        PointF pointF2 = this.c;
        float f3 = (f2 - pointF2.x) * f;
        float f4 = pointF.y;
        pointF2.set(f2 - f3, f4 - ((f4 - pointF2.y) * f));
    }

    public qf61(qf61 qf61Var) {
        PointF pointF = new PointF();
        this.b = pointF;
        PointF pointF2 = new PointF();
        this.c = pointF2;
        PointF pointF3 = new PointF();
        this.d = pointF3;
        PointF pointF4 = new PointF();
        this.e = pointF4;
        this.f = 1.0f;
        pointF3.set(qf61Var.d);
        pointF4.set(qf61Var.e);
        pointF.set(qf61Var.b);
        pointF2.set(qf61Var.c);
        this.f = qf61Var.f;
        this.g = qf61Var.g;
    }
}
