package com.squareup.cash.investingcrypto.components.common.drawables;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class ContentMaskDrawable extends DrawableWrapperCompat {
    public final Drawable content;
    public final Paint maskPaint;
    public final EglCore outline;

    public ContentMaskDrawable(Drawable drawable) {
        super(drawable);
        this.content = drawable;
        this.outline = new EglCore(17);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        this.maskPaint = paint;
    }

    @Override // com.squareup.cash.investingcrypto.components.common.drawables.DrawableWrapperCompat, android.graphics.drawable.ScaleDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.drawPath((Path) this.outline.eglDisplay, this.maskPaint);
    }

    @Override // android.graphics.drawable.ScaleDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        EglCore eglCore = this.outline;
        Rect rect2 = (Rect) eglCore.eglConfig;
        Drawable drawable = this.content;
        drawable.getClass();
        Outline outline = (Outline) eglCore.eglContext;
        drawable.getOutline(outline);
        outline.getAlpha();
        Path path = (Path) eglCore.eglDisplay;
        path.rewind();
        if (outline.isEmpty()) {
            return;
        }
        if (outline.getRadius() >= RecyclerView.DECELERATION_RATE) {
            outline.getRect(rect2);
            float radius = outline.getRadius();
            rect2.getClass();
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, radius, radius, Path.Direction.CW);
            return;
        }
        if (!(drawable instanceof GradientDrawable)) {
            a$$ExternalSyntheticBUOutline0.m1430m((Object) "Can't read the outline of ".concat(drawable.getClass().getName()));
            return;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        int shape = gradientDrawable.getShape();
        if (shape == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("convex rectangles are unsupported");
            return;
        }
        if (shape == 1) {
            gradientDrawable.getBounds().getClass();
            path.addOval(r10.left, r10.top, r10.right, r10.bottom, Path.Direction.CW);
        } else if (shape != 2) {
            Path$$ExternalSyntheticBUOutline0.m$1(shape, "unsupported GradientDrawable shape: ");
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("shouldn't be a convex path");
        }
    }
}
