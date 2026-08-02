package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;

/* loaded from: classes3.dex */
public final class uce extends xhm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final es6 e;
    public Drawable f = null;
    public final RectF g = new RectF();

    public uce(int i, int i2, int i3, int i4, es6 es6Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = es6Var;
    }

    @Override // defpackage.xhm
    public final int a(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds;
        Rect bounds2;
        if (fontMetricsInt != null && this.c <= 0) {
            int b = eeh.b(paint.ascent());
            int b2 = eeh.b(paint.descent());
            Drawable drawable = this.f;
            int height = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.b : bounds2.height();
            int D = ouj.D(this.d);
            if (D == 0) {
                b2 = b + height;
            } else if (D == 1) {
                b2 = ((b + b2) + height) / 2;
            } else if (D == 2) {
                b2 = 0;
            } else if (D != 3) {
                b6e.s();
                return 0;
            }
            int i3 = b2 - height;
            int i4 = fontMetricsInt.top;
            int i5 = fontMetricsInt.ascent;
            int i6 = fontMetricsInt.bottom - fontMetricsInt.descent;
            fontMetricsInt.ascent = Math.min(i3, i5);
            int max = Math.max(b2, fontMetricsInt.descent);
            fontMetricsInt.descent = max;
            fontMetricsInt.top = fontMetricsInt.ascent + (i4 - i5);
            fontMetricsInt.bottom = max + i6;
            Drawable drawable2 = this.f;
            if (drawable2 != null && (bounds = drawable2.getBounds()) != null) {
                return bounds.width();
            }
        }
        return this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = this.f;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int height = drawable.getBounds().height();
        int D = ouj.D(this.d);
        if (D == 0) {
            i4 = i3 + height;
        } else if (D == 1) {
            i4 = ((i3 + i5) + height) / 2;
        } else if (D != 2) {
            if (D != 3) {
                b6e.s();
                return;
            }
            i4 = i5;
        }
        float f2 = i4 - height;
        Rect bounds = drawable.getBounds();
        RectF rectF = this.g;
        rectF.set(bounds);
        rectF.offset(f, f2);
        canvas.translate(f, f2);
        if (drawable instanceof PictureDrawable) {
            float min = Math.min(r3.getBounds().width() / r3.getIntrinsicWidth(), r3.getBounds().height() / r3.getIntrinsicHeight());
            canvas.scale(min, min);
            canvas.drawPicture(((PictureDrawable) drawable).getPicture());
        } else {
            drawable.draw(canvas);
        }
        canvas.restore();
    }
}
