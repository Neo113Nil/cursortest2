package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class FadeThroughDrawable extends Drawable {
    public final float[] alphas;
    public final Drawable fadeInDrawable;
    public final Drawable fadeOutDrawable;
    public float progress;

    public final class EmptyDrawable extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public FadeThroughDrawable(Drawable drawable, Drawable drawable2) {
        Drawable mutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new EmptyDrawable();
        this.fadeOutDrawable = mutate;
        Drawable mutate2 = drawable2.getConstantState().newDrawable().mutate();
        this.fadeInDrawable = mutate2;
        int layoutDirection = drawable != null ? drawable.getLayoutDirection() : 3;
        int layoutDirection2 = drawable2.getLayoutDirection();
        mutate.setLayoutDirection(layoutDirection);
        mutate2.setLayoutDirection(layoutDirection2);
        mutate2.setAlpha(0);
        this.alphas = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.fadeOutDrawable.draw(canvas);
        this.fadeInDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.fadeOutDrawable.getIntrinsicHeight(), this.fadeInDrawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.fadeOutDrawable.getIntrinsicWidth(), this.fadeInDrawable.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.fadeOutDrawable.getMinimumHeight(), this.fadeInDrawable.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.fadeOutDrawable.getMinimumWidth(), this.fadeInDrawable.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.fadeOutDrawable.isStateful() || this.fadeInDrawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = this.progress;
        Drawable drawable = this.fadeInDrawable;
        Drawable drawable2 = this.fadeOutDrawable;
        if (f <= 0.5f) {
            drawable2.setAlpha(i);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.fadeOutDrawable.setBounds(i, i2, i3, i4);
        this.fadeInDrawable.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.fadeOutDrawable.setColorFilter(colorFilter);
        this.fadeInDrawable.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setProgress(float f) {
        if (this.progress != f) {
            this.progress = f;
            float[] fArr = this.alphas;
            ViewUtils.calculateFadeOutAndInAlphas(f, fArr);
            this.fadeOutDrawable.setAlpha((int) (fArr[0] * 255.0f));
            this.fadeInDrawable.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.fadeOutDrawable.setState(iArr) || this.fadeInDrawable.setState(iArr);
    }
}
