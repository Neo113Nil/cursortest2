package com.squareup.cash.pools.views.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;

/* loaded from: classes6.dex */
public final class AvatarLayoutAnimationStateHolder {
    public final int index;
    public final Animatable offsetMultiplierAnimatable = AnimatableKt.Animatable(1.0f, 0.01f);
    public final Animatable scaleMultiplierAnimatable;

    public AvatarLayoutAnimationStateHolder(float f, int i) {
        this.index = i;
        this.scaleMultiplierAnimatable = AnimatableKt.Animatable(f, 0.01f);
    }
}
