package com.squareup.cash.pools.views.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;

/* loaded from: classes6.dex */
public final class GoalMetAnimationStateHolder {
    public final Animatable backgroundAlphaAnimatable;
    public final Animatable subtitleAlphaAnimatable;
    public final Animatable subtitleScaleAnimatable;
    public final Animatable titleAlphaAnimatable;
    public final Animatable titleScaleAnimatable;

    public GoalMetAnimationStateHolder(float f, float f2, float f3) {
        this.titleScaleAnimatable = AnimatableKt.Animatable(f, 0.01f);
        this.titleAlphaAnimatable = AnimatableKt.Animatable(f2, 0.01f);
        this.subtitleScaleAnimatable = AnimatableKt.Animatable(f, 0.01f);
        this.subtitleAlphaAnimatable = AnimatableKt.Animatable(f2, 0.01f);
        this.backgroundAlphaAnimatable = AnimatableKt.Animatable(f3, 0.01f);
    }
}
