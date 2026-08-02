package com.squareup.cash.marketing.components;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class TooltipState {
    public final ParcelableSnapshotMutableFloatState _alpha$delegate;
    public final ParcelableSnapshotMutableState orientation$delegate;
    public final CoroutineScope scope;

    public TooltipState(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.scope = coroutineScope;
        this._alpha$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.orientation$delegate = Updater.mutableStateOf$default(ArrowOrientation.Down);
    }
}
