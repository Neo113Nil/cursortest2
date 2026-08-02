package com.squareup.cash.arcade.components.titlebar;

import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final /* synthetic */ class TitleBarActionKt$$ExternalSyntheticLambda4 implements BoundsTransform {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TitleBarActionKt$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
        switch (this.$r8$classId) {
        }
        return AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 200.0f, null, 5);
    }
}
