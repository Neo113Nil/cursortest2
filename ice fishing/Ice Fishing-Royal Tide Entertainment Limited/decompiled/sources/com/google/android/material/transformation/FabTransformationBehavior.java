package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.text.CatchingFishMVPView;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCoroutine(CatchingFishMVPView catchingFishMVPView) {
        if (catchingFishMVPView.CatchingFishViewModelFAB == 0) {
            catchingFishMVPView.CatchingFishViewModelFAB = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishSnackbar(View view) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
