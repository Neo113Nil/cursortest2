package com.squareup.cash.arcade.components;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes5.dex */
public final class SearchBarKeyboardState {
    public final ParcelableSnapshotMutableState open$delegate;

    public SearchBarKeyboardState(boolean z) {
        this.open$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
    }

    public final void setOpen(boolean z) {
        this.open$delegate.setValue(Boolean.valueOf(z));
    }
}
