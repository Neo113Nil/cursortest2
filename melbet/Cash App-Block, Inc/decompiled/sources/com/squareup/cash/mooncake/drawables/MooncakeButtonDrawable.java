package com.squareup.cash.mooncake.drawables;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MooncakeButtonDrawable extends RippleDrawable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final PaintDrawable content;
    public Float cornerRadius;
    public final PaintDrawable mask;
    public ColorStateList strokeColor;
    public final Paint strokePaint;

    public MooncakeButtonDrawable(int i, PaintDrawable paintDrawable, PaintDrawable paintDrawable2) {
        super(ColorStateList.valueOf(i), paintDrawable, paintDrawable2);
        this.content = paintDrawable;
        this.mask = paintDrawable2;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(RecyclerView.DECELERATION_RATE);
        paint.setAntiAlias(true);
        this.strokePaint = paint;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        super.draw(canvas);
        Paint paint = this.strokePaint;
        if (paint.getStrokeWidth() > RecyclerView.DECELERATION_RATE) {
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            canvas.drawRoundRect(strokeWidth, strokeWidth, getBounds().width() - strokeWidth, getBounds().height() - strokeWidth, getDrawingCornerRadius(), getDrawingCornerRadius(), paint);
        }
    }

    public final float getDrawingCornerRadius() {
        Float f = this.cornerRadius;
        return f != null ? f.floatValue() : getBounds().height() / 2.0f;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        this.content.setCornerRadius(getDrawingCornerRadius());
        this.mask.setCornerRadius(getDrawingCornerRadius());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        iArr.getClass();
        ColorStateList colorStateList = this.strokeColor;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            Paint paint = this.strokePaint;
            z = colorForState != paint.getColor();
            if (z) {
                paint.setColor(colorForState);
                invalidateSelf();
            }
        } else {
            z = false;
        }
        return super.onStateChange(iArr) || z;
    }

    public final void setCornerRadius(Float f) {
        if (Intrinsics.areEqual(this.cornerRadius, f)) {
            return;
        }
        this.cornerRadius = f;
        this.content.setCornerRadius(getDrawingCornerRadius());
        this.mask.setCornerRadius(getDrawingCornerRadius());
        invalidateSelf();
    }
}
