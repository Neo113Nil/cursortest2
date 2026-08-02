package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class MaskedDrawable extends Drawable {
    public final Drawable drawable;
    public final Path mask;

    public MaskedDrawable(Drawable drawable, float f) {
        drawable.getClass();
        this.drawable = drawable;
        Path path = new Path();
        path.addCircle(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f / 2.0f, Path.Direction.CW);
        this.mask = path;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.clipPath(this.mask);
        this.drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
        this.mask.offset(rect.exactCenterX(), rect.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.drawable.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }
}
