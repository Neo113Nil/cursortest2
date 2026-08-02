package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class hl4 extends Drawable {
    public final /* synthetic */ int a;
    public final RectF b;
    public final Object c;
    public final Object d;
    public final Object e;

    public hl4(gl4 gl4Var) {
        Paint paint;
        this.a = 0;
        Float f = gl4Var.d;
        this.c = gl4Var;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(gl4Var.b);
        this.d = paint2;
        Integer num = gl4Var.c;
        if (num == null || f == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(num.intValue());
            paint.setStrokeWidth(f.floatValue());
        }
        this.e = paint;
        float f2 = gl4Var.a * 2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        this.b = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.d;
                gl4 gl4Var = (gl4) this.c;
                paint.setColor(gl4Var.b);
                Rect bounds = getBounds();
                RectF rectF = this.b;
                rectF.set(bounds);
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), gl4Var.a, paint);
                Paint paint2 = (Paint) this.e;
                if (paint2 != null) {
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), gl4Var.a, paint2);
                    return;
                }
                return;
            default:
                canvas.getClass();
                Path path = (Path) this.d;
                int save = canvas.save();
                canvas.clipPath(path);
                try {
                    ((Drawable) this.c).draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(save);
                }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return ((int) ((gl4) this.c).a) * 2;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return ((int) ((gl4) this.c).a) * 2;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 1:
                rect.getClass();
                super.onBoundsChange(rect);
                ((Drawable) this.c).setBounds(rect);
                RectF rectF = this.b;
                rectF.set(rect);
                Path path = (Path) this.d;
                path.reset();
                path.addRoundRect(rectF, (float[]) this.e, Path.Direction.CW);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((Drawable) this.c).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((Drawable) this.c).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    public hl4(int i, int i2, int i3, int i4, Drawable drawable) {
        this.a = 1;
        this.c = drawable;
        this.d = new Path();
        this.b = new RectF();
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        this.e = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }
}
