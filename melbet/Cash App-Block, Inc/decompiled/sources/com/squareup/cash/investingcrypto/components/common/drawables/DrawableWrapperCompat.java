package com.squareup.cash.investingcrypto.components.common.drawables;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;

/* loaded from: classes6.dex */
public abstract class DrawableWrapperCompat extends ScaleDrawable {
    public final Drawable delegate;

    public DrawableWrapperCompat(Drawable drawable) {
        super(drawable, 17, -1.0f, -1.0f);
        this.delegate = drawable;
    }

    @Override // android.graphics.drawable.ScaleDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.getClass();
        this.delegate.draw(canvas);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.getClass();
        this.delegate.getOutline(outline);
    }
}
