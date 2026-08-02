package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class aho extends Drawable {
    public final zgo a;
    public final Paint b;
    public final Paint c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final RectF h;

    public aho(zgo zgoVar) {
        Integer num = zgoVar.e;
        float f = zgoVar.a;
        Float f2 = zgoVar.f;
        this.a = zgoVar;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(zgoVar.c);
        this.b = paint;
        float f3 = zgoVar.d;
        float f4 = zgoVar.b;
        float f5 = 2;
        this.f = f3 - (f3 >= f4 / f5 ? this.d : 0.0f);
        this.g = f3 - (f3 >= f / f5 ? this.d : 0.0f);
        RectF rectF = new RectF(0.0f, 0.0f, f, f4);
        this.h = rectF;
        if (num == null || f2 == null) {
            this.c = null;
            this.d = 0.0f;
            this.e = 0.0f;
        } else {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(num.intValue());
            paint2.setStrokeWidth(f2.floatValue());
            this.c = paint2;
            this.d = f2.floatValue() / f5;
            this.e = 1.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    public final void a(float f) {
        Rect bounds = getBounds();
        this.h.set(bounds.left + f, bounds.top + f, bounds.right - f, bounds.bottom - f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(this.e);
        float f = this.g;
        Paint paint = this.b;
        RectF rectF = this.h;
        canvas.drawRoundRect(rectF, this.f, f, paint);
        Paint paint2 = this.c;
        if (paint2 != null) {
            a(this.d);
            float f2 = this.a.d;
            canvas.drawRoundRect(rectF, f2, f2, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.a.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.a.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
