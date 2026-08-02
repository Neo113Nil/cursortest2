package com.squareup.cash.collapsingtoolbar.views;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes4.dex */
public final class CollapsingToolbarScaffoldState {
    public final ParcelableSnapshotMutableIntState offsetYState;
    public final CollapsingToolbarState toolbarState;

    public CollapsingToolbarScaffoldState(CollapsingToolbarState collapsingToolbarState, int i) {
        collapsingToolbarState.getClass();
        this.toolbarState = collapsingToolbarState;
        this.offsetYState = new ParcelableSnapshotMutableIntState(i);
    }
}
