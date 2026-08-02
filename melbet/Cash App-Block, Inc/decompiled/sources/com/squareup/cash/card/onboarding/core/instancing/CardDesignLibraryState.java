package com.squareup.cash.card.onboarding.core.instancing;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class CardDesignLibraryState {
    public static final WorkLauncherImpl Saver = ListSaverKt.listSaver(new RealAppConfigManager$$ExternalSyntheticLambda6(5), new CardStudioQueries$$ExternalSyntheticLambda3(1));
    public Function0 onZoomIn;
    public Function0 onZoomOut;
    public final ParcelableSnapshotMutableState zoomLevel$delegate = Updater.mutableStateOf$default(ZoomLevel.FAR);
    public final ParcelableSnapshotMutableIntState focusedCardIndex$delegate = new ParcelableSnapshotMutableIntState(0);
    public final ParcelableSnapshotMutableState pendingFocusIndex$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState pendingFocusZoom$delegate = Updater.mutableStateOf$default(ZoomLevel.NEAR);

    public final ZoomLevel getZoomLevel() {
        return (ZoomLevel) this.zoomLevel$delegate.getValue();
    }
}
