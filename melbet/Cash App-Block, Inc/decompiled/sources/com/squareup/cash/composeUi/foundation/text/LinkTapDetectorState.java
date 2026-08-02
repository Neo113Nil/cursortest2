package com.squareup.cash.composeUi.foundation.text;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes6.dex */
public final class LinkTapDetectorState {
    public final ParcelableSnapshotMutableState textLayoutResult$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState highlightedLink$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState text$delegate = Updater.mutableStateOf$default(new AnnotatedString(""));
}
