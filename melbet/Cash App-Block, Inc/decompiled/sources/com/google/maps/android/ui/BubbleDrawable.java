package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class BubbleDrawable extends Drawable {
    public int mColor = -1;
    public final Drawable mMask;
    public final Drawable mShadow;

    public BubbleDrawable(Context context) {
        this.mMask = context.getDrawable(2131231085);
        this.mShadow = context.getDrawable(2131231086);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.mMask.draw(canvas);
        canvas.drawColor(this.mColor, PorterDuff.Mode.SRC_IN);
        this.mShadow.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.mMask.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.mMask.setBounds(i, i2, i3, i4);
        this.mShadow.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.mMask.setBounds(rect);
        this.mShadow.setBounds(rect);
    }
}
