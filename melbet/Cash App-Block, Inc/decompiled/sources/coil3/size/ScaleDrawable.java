package coil3.size;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import coil3.decode.DecodeUtils;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes3.dex */
public final class ScaleDrawable extends Drawable implements Drawable.Callback, Animatable {
    public final Drawable child;
    public float childDx;
    public float childDy;
    public float childScale = 1.0f;
    public final Scale scale;

    public ScaleDrawable(Drawable drawable, Scale scale) {
        this.child = drawable;
        this.scale = scale;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.childDx, this.childDy);
            float f = this.childScale;
            canvas.scale(f, f);
            this.child.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.child.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.child.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.child.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.child.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.child.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.child;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.child.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.child;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.childDx = RecyclerView.DECELERATION_RATE;
            this.childDy = RecyclerView.DECELERATION_RATE;
            this.childScale = 1.0f;
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(intrinsicWidth, intrinsicHeight, width, height, this.scale, Size.ORIGINAL);
        int roundToInt = MathKt__MathJVMKt.roundToInt((width - (intrinsicWidth * computeSizeMultiplier)) / 2.0d);
        int roundToInt2 = MathKt__MathJVMKt.roundToInt((height - (intrinsicHeight * computeSizeMultiplier)) / 2.0d);
        drawable.setBounds(roundToInt, roundToInt2, intrinsicWidth + roundToInt, intrinsicHeight + roundToInt2);
        this.childDx = rect.left;
        this.childDy = rect.top;
        this.childScale = (float) computeSizeMultiplier;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.child.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.child.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.child.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.child.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.child.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.child.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.child.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.child.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
