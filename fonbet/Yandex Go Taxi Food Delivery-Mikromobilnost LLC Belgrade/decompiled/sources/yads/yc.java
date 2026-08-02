package yads;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import defpackage.m810;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class yc extends ImageSpan {
    public final int a;
    public WeakReference b;

    public yc(Drawable drawable) {
        super(drawable);
        this.a = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.a != -1) {
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            return;
        }
        WeakReference weakReference = this.b;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.b = new WeakReference(drawable);
        }
        canvas.save();
        canvas.translate(f, m810.b(((i3 + i5) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        WeakReference weakReference = this.b;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.b = new WeakReference(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
