package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.transition.Transition;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet currentAnimation;

    public ExpandableTransformationBehavior() {
    }

    public abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void onExpandedStateChange(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.currentAnimation;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet onCreateExpandedStateChangeAnimation = onCreateExpandedStateChangeAnimation(view, view2, z, z3);
        this.currentAnimation = onCreateExpandedStateChangeAnimation;
        onCreateExpandedStateChangeAnimation.addListener(new Transition.AnonymousClass3(this, 12));
        this.currentAnimation.start();
        if (z2) {
            return;
        }
        this.currentAnimation.end();
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
