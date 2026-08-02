package com.squareup.cash.money.presenters;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class HypeEligibilityProvider {
    public final RealFamilyProfileManager familyProfileManager;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final SyncValueReader syncValueReader;

    public HypeEligibilityProvider(RealP2pSettingsManager realP2pSettingsManager, RealFamilyProfileManager realFamilyProfileManager, SyncValueReader syncValueReader) {
        this.p2pSettingsManager = realP2pSettingsManager;
        this.familyProfileManager = realFamilyProfileManager;
        this.syncValueReader = syncValueReader;
    }

    public final FinishSetupTileBadgeCounter isEligible() {
        int i = 4;
        return FlowKt.combine(this.p2pSettingsManager.select(), this.familyProfileManager.familyProfile, this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PaychecksUiState), new AnchoredDraggableKt$snapTo$2(i, null, i));
    }
}
