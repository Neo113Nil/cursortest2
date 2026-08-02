package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: classes4.dex */
public final class CutoutDrawable$CutoutDrawableState extends MaterialShapeDrawable.MaterialShapeDrawableState {
    public final RectF cutoutBounds;

    public CutoutDrawable$CutoutDrawableState(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        super(cutoutDrawable$CutoutDrawableState);
        this.cutoutBounds = cutoutDrawable$CutoutDrawableState.cutoutBounds;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        CutoutDrawable$ImplApi18 cutoutDrawable$ImplApi18 = new CutoutDrawable$ImplApi18(this);
        cutoutDrawable$ImplApi18.drawableState = this;
        cutoutDrawable$ImplApi18.invalidateSelf();
        return cutoutDrawable$ImplApi18;
    }

    public CutoutDrawable$CutoutDrawableState(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        super(shapeAppearanceModel);
        this.cutoutBounds = rectF;
    }
}
