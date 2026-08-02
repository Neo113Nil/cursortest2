package com.squareup.cash.pools.views.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.ui.unit.Dp;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;

/* loaded from: classes6.dex */
public final class PoolDetailsAnimationStateHolder {
    public final float avatarSize;
    public final Animatable avatarSpacingAnimatable;
    public final Animatable progressUiScaleAnimatable = AnimatableKt.Animatable(1.0f, 0.01f);
    public final Animatable progressUiAlphaAnimatable = AnimatableKt.Animatable(1.0f, 0.01f);
    public final Animatable progressRingScaleAnimatable = AnimatableKt.Animatable(1.0f, 0.01f);
    public final Animatable avatarAlphaAnimatable = AnimatableKt.Animatable(1.0f, 0.01f);

    public PoolDetailsAnimationStateHolder(float f, float f2) {
        this.avatarSize = f;
        this.avatarSpacingAnimatable = new Animatable(new Dp(f2), new TwoWayConverterImpl(new PoolsListViewKt$$ExternalSyntheticLambda6(8), new PoolsListViewKt$$ExternalSyntheticLambda6(9)), (Object) null, 12);
    }
}
