package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;

/* loaded from: classes6.dex */
public final class wam extends nb31 {
    public final PaintDrawable a;
    public final Rect b;

    public wam(PaintDrawable paintDrawable, Rect rect) {
        this.a = paintDrawable;
        this.b = rect;
    }

    @Override // defpackage.nb31
    public final void a(Canvas canvas, int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        int width = rect.width();
        int height = rect.height();
        int max = Math.max(width, i3 - i);
        int max2 = Math.max(height, i4 - i2);
        canvas.save();
        canvas.translate(((i + (r10 / 2)) - (max / 2.0f)) - rect.left, ((i2 + (r11 / 2)) - (max2 / 2.0f)) - rect.top);
        PaintDrawable paintDrawable = this.a;
        paintDrawable.setBounds(0, 0, (paintDrawable.getIntrinsicWidth() - width) + max, (paintDrawable.getIntrinsicHeight() - height) + max2);
        paintDrawable.draw(canvas);
        canvas.restore();
    }
}
