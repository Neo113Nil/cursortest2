package com.squareup.cash.card.onboarding;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class CardMarginDrawable extends Drawable {
    public final float cardCornerRadius;
    public final float marginCornerRadius;
    public final Paint shapePaint;
    public final float size;

    public CardMarginDrawable(float f, float f2, float f3, int i) {
        this.size = f;
        this.cardCornerRadius = f2;
        this.marginCornerRadius = f3;
        Paint paint = new Paint();
        paint.setColor(i);
        this.shapePaint = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.size;
        canvas.getClass();
        int save = canvas.save();
        try {
            RectF rectF = new RectF(getBounds().left + f, getBounds().top + f, getBounds().right - f, getBounds().bottom - f);
            Path path = new Path();
            float f2 = this.marginCornerRadius;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            canvas.clipOutPath(path);
            Rect bounds = getBounds();
            bounds.getClass();
            RectF rectF2 = new RectF(bounds);
            float f3 = this.cardCornerRadius;
            canvas.drawRoundRect(rectF2, f3, f3, this.shapePaint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.shapePaint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.shapePaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.shapePaint.setColorFilter(colorFilter);
    }
}
