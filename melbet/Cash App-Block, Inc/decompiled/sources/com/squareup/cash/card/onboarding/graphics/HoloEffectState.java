package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.math.Vector4;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class HoloEffectState {
    public final ParcelableSnapshotMutableState holoBaseTexture$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState holoReflectTexture$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState error$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableFloatState roughness$delegate = new ParcelableSnapshotMutableFloatState(0.7529412f);
    public final ParcelableSnapshotMutableFloatState roughnessScale$delegate = new ParcelableSnapshotMutableFloatState(1.0f);
    public final ParcelableSnapshotMutableFloatState metallic$delegate = new ParcelableSnapshotMutableFloatState(1.0f);
    public final ParcelableSnapshotMutableFloatState ao$delegate = new ParcelableSnapshotMutableFloatState(1.0f);
    public final ParcelableSnapshotMutableFloatState holoOffsetScale$delegate = new ParcelableSnapshotMutableFloatState(0.125f);
    public final ParcelableSnapshotMutableFloatState holoOffsetX$delegate = new ParcelableSnapshotMutableFloatState(-0.066f);
    public final ParcelableSnapshotMutableFloatState holoOffsetY$delegate = new ParcelableSnapshotMutableFloatState(-0.02f);
    public final ParcelableSnapshotMutableFloatState vibrance$delegate = new ParcelableSnapshotMutableFloatState(1.5f);
    public final ParcelableSnapshotMutableState forwardDirection$delegate = Updater.mutableStateOf$default(new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE));
    public final ParcelableSnapshotMutableState lights$delegate = Updater.mutableStateOf$default(EmptyList.INSTANCE);
}
