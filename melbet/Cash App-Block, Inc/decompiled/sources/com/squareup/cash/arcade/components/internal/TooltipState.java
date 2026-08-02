package com.squareup.cash.arcade.components.internal;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes5.dex */
public final class TooltipState {
    public final ParcelableSnapshotMutableFloatState _alpha$delegate;
    public StandaloneCoroutine dismissJob;
    public final CoroutineScope scope;

    public TooltipState(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.scope = coroutineScope;
        this._alpha$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    }
}
