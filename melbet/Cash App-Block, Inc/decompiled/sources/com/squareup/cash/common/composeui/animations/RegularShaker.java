package com.squareup.cash.common.composeui.animations;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CardModelView;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes6.dex */
public final class RegularShaker implements Shaker {
    public final ParcelableSnapshotMutableFloatState currentOffset$delegate;
    public StandaloneCoroutine currentShake;
    public final float distance;
    public final CoroutineScope scope;

    public RegularShaker(CoroutineScope coroutineScope, float f) {
        coroutineScope.getClass();
        this.scope = coroutineScope;
        this.distance = f;
        this.currentOffset$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    }

    @Override // com.squareup.cash.common.composeui.animations.Shaker
    public final float getCurrentOffset() {
        return this.currentOffset$delegate.getFloatValue();
    }

    @Override // com.squareup.cash.common.composeui.animations.Shaker
    public final void shake() {
        StandaloneCoroutine launch$default = JobKt.launch$default(this.scope, null, null, new CardModelView.AnonymousClass1.C00581(this, null, 25), 3);
        StandaloneCoroutine standaloneCoroutine = this.currentShake;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.currentShake = launch$default;
    }
}
