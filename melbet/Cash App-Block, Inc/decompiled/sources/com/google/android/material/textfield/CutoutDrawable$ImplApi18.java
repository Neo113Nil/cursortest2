package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes4.dex */
public final class CutoutDrawable$ImplApi18 extends MaterialShapeDrawable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public CutoutDrawable$CutoutDrawableState drawableState;

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public final void drawStrokeShape(Canvas canvas) {
        if (this.drawableState.cutoutBounds.isEmpty()) {
            super.drawStrokeShape(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.drawableState.cutoutBounds);
        super.drawStrokeShape(canvas);
        canvas.restore();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.drawableState = new CutoutDrawable$CutoutDrawableState(this.drawableState);
        return this;
    }

    public final void setCutout(float f, float f2, float f3, float f4) {
        RectF rectF = this.drawableState.cutoutBounds;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
