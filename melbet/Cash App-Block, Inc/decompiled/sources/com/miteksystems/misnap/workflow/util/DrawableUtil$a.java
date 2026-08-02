package com.miteksystems.misnap.workflow.util;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes4.dex */
public final class DrawableUtil$a extends LayerDrawable {
    public final float a;
    public final float b;
    public final /* synthetic */ Drawable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableUtil$a(Drawable drawable, Drawable[] drawableArr) {
        super(drawableArr);
        this.c = drawable;
        this.a = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        this.b = drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Drawable drawable = this.c;
        if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float width = drawable.getBounds().width();
        float height = drawable.getBounds().height();
        float f = this.b;
        float f2 = this.a;
        canvas.scale(f, f2);
        canvas.rotate(-90.0f, width / 2.0f, height / 2.0f);
        canvas.translate(-((width - (f2 * width)) / 2.0f), (height - (f * height)) / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.getIntrinsicHeight();
    }
}
