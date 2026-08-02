package com.squareup.cash.checks;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes6.dex */
public final class MiSnapState {
    public final ParcelableSnapshotMutableState takePictureManually$delegate;
    public final ParcelableSnapshotMutableState torchEnabled$delegate;

    public MiSnapState() {
        Boolean bool = Boolean.FALSE;
        this.torchEnabled$delegate = Updater.mutableStateOf$default(bool);
        this.takePictureManually$delegate = Updater.mutableStateOf$default(bool);
    }
}
