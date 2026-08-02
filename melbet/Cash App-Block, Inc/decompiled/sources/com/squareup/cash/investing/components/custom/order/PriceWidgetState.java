package com.squareup.cash.investing.components.custom.order;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes6.dex */
public final class PriceWidgetState {
    public final ParcelableSnapshotMutableIntState tooltipHeight$delegate = new ParcelableSnapshotMutableIntState(0);
    public final ParcelableSnapshotMutableIntState dragWidgetOffset$delegate = new ParcelableSnapshotMutableIntState(0);
    public final ParcelableSnapshotMutableState dragWidgetState$delegate = Updater.mutableStateOf$default(new DragWidgetState());
}
