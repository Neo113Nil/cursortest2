package com.squareup.cash.common.composeui;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes6.dex */
public final class SegmentedCircleInteractableState {
    public final ParcelableSnapshotMutableState center$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState radius$delegate = Updater.mutableStateOf$default(new Dp(40.0f));
}
