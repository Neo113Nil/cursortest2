package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class pl4 extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final k5c h = new k5c(1);
    public static final int[] i = {-16777216};
    public final ol4 a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public pl4(Context context) {
        context.getClass();
        this.c = context.getResources();
        ol4 ol4Var = new ol4();
        this.a = ol4Var;
        ol4Var.i = i;
        ol4Var.a(0);
        ol4Var.h = 2.5f;
        ol4Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new nl4(this, ol4Var));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(g);
        ofFloat.addListener(new dn8(this, ol4Var));
        this.d = ofFloat;
    }

    public static void d(float f, ol4 ol4Var) {
        if (f <= 0.75f) {
            ol4Var.u = ol4Var.i[ol4Var.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = ol4Var.i;
        int i2 = ol4Var.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        ol4Var.u = ((((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - r1) * f2))) << 24) | ((((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - r3) * f2))) << 16) | ((((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - r4) * f2))) << 8) | ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) (f2 * ((i4 & KotlinVersion.MAX_COMPONENT_VALUE) - r2))));
    }

    public final void a(float f, ol4 ol4Var, boolean z) {
        float f2;
        if (this.f) {
            d(f, ol4Var);
            float floor = (float) (Math.floor(ol4Var.m / 0.8f) + 1.0d);
            float f3 = ol4Var.k;
            float f4 = ol4Var.l;
            ol4Var.e = (((f4 - 0.01f) - f3) * f) + f3;
            ol4Var.f = f4;
            float f5 = ol4Var.m;
            ol4Var.g = su4.e(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = ol4Var.m;
            float f7 = ol4Var.k;
            k5c k5cVar = h;
            if (f < 0.5f) {
                f2 = (k5cVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f8 = f7 + 0.79f;
                f7 = f8 - (((1.0f - k5cVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            float f9 = (0.20999998f * f) + f6;
            float f10 = (f + this.e) * 216.0f;
            ol4Var.e = f7;
            ol4Var.f = f2;
            ol4Var.g = f9;
            this.b = f10;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        ol4 ol4Var = this.a;
        ol4Var.h = f6;
        ol4Var.b.setStrokeWidth(f6);
        ol4Var.q = f * f5;
        ol4Var.a(0);
        ol4Var.r = (int) (f3 * f5);
        ol4Var.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        ol4 ol4Var = this.a;
        Paint paint = ol4Var.b;
        RectF rectF = ol4Var.a;
        float f = ol4Var.q;
        float f2 = (ol4Var.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((ol4Var.r * ol4Var.p) / 2.0f, ol4Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = ol4Var.e;
        float f4 = ol4Var.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((ol4Var.f + f4) * 360.0f) - f5;
        paint.setColor(ol4Var.u);
        paint.setAlpha(ol4Var.t);
        float f7 = ol4Var.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ol4Var.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = ol4Var.c;
        if (ol4Var.n) {
            Path path = ol4Var.o;
            if (path == null) {
                Path path2 = new Path();
                ol4Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (ol4Var.r * ol4Var.p) / 2.0f;
            ol4Var.o.moveTo(0.0f, 0.0f);
            ol4Var.o.lineTo(ol4Var.r * ol4Var.p, 0.0f);
            Path path3 = ol4Var.o;
            float f10 = ol4Var.r;
            float f11 = ol4Var.p;
            path3.lineTo((f10 * f11) / 2.0f, ol4Var.s * f11);
            ol4Var.o.offset((rectF.centerX() + min) - f9, (ol4Var.h / 2.0f) + rectF.centerY());
            ol4Var.o.close();
            paint2.setColor(ol4Var.u);
            paint2.setAlpha(ol4Var.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ol4Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d.cancel();
        ol4 ol4Var = this.a;
        float f = ol4Var.e;
        ol4Var.k = f;
        float f2 = ol4Var.f;
        ol4Var.l = f2;
        ol4Var.m = ol4Var.g;
        if (f2 != f) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        ol4Var.a(0);
        ol4Var.k = 0.0f;
        ol4Var.l = 0.0f;
        ol4Var.m = 0.0f;
        ol4Var.e = 0.0f;
        ol4Var.f = 0.0f;
        ol4Var.g = 0.0f;
        this.d.setDuration(1332L);
        this.d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        ol4 ol4Var = this.a;
        if (ol4Var.n) {
            ol4Var.n = false;
        }
        ol4Var.a(0);
        ol4Var.k = 0.0f;
        ol4Var.l = 0.0f;
        ol4Var.m = 0.0f;
        ol4Var.e = 0.0f;
        ol4Var.f = 0.0f;
        ol4Var.g = 0.0f;
        invalidateSelf();
    }
}
