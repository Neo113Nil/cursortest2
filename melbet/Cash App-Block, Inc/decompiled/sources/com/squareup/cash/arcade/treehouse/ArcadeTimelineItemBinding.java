package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.widget.Space;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;

/* loaded from: classes5.dex */
public final class ArcadeTimelineItemBinding implements Widget {
    public final Space value;
    public Modifier modifier = Modifier.Companion.$$INSTANCE;
    public final ParcelableSnapshotMutableState body$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState state$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState title$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState valueText$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState valueDescriptor$delegate = Updater.mutableStateOf$default(null);

    public ArcadeTimelineItemBinding(Context context) {
        this.value = new Space(context);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
