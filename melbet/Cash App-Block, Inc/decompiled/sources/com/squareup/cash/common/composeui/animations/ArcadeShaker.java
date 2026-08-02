package com.squareup.cash.common.composeui.animations;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CardModelView;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes6.dex */
public final class ArcadeShaker implements Shaker {
    public StandaloneCoroutine currentShake;
    public final float distance;
    public final CoroutineScope scope;
    public final Animatable shakeOffset;
    public final SpringSpec spring;

    public ArcadeShaker(CoroutineScope coroutineScope, float f, SpringSpec springSpec) {
        coroutineScope.getClass();
        this.scope = coroutineScope;
        this.distance = f;
        this.spring = springSpec;
        this.shakeOffset = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
    }

    @Override // com.squareup.cash.common.composeui.animations.Shaker
    public final float getCurrentOffset() {
        return ((Number) this.shakeOffset.getValue()).floatValue();
    }

    @Override // com.squareup.cash.common.composeui.animations.Shaker
    public final void shake() {
        StandaloneCoroutine launch$default = JobKt.launch$default(this.scope, null, null, new CardModelView.AnonymousClass1.C00581(this, null, 24), 3);
        StandaloneCoroutine standaloneCoroutine = this.currentShake;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.currentShake = launch$default;
    }
}
