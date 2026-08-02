package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* loaded from: classes6.dex */
public final class obb extends ImageSpan {
    public final /* synthetic */ Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obb(Drawable drawable) {
        super(drawable, 1);
        this.a = drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        paint.getClass();
        canvas.save();
        Drawable drawable = this.a;
        canvas.translate(f, (i5 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2));
        drawable.draw(canvas);
        canvas.restore();
    }
}
