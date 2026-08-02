package com.squareup.cash.incentives.finishsetup.applets.presenters;

import androidx.tracing.Trace;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.AmplitudeExperiments$NuxActivation;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealFinishSetupAppletTileRepository {
    public final DerivedStateFlow availabilityState;
    public final StateFlow tile;

    public RealFinishSetupAppletTileRepository(SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager) {
        DerivedStateFlow mapState = StateFlowKt.mapState(Trace.valuesStateExperiment(featureFlagManager, AmplitudeExperiments$NuxActivation.INSTANCE), new ActivityItemLayout$$ExternalSyntheticLambda4(11));
        StateFlow singleValueOrDefault = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.FinishSetupTile, null, new ActivityItemLayout$$ExternalSyntheticLambda4(12));
        this.tile = singleValueOrDefault;
        this.availabilityState = StateFlowKt.combineState(mapState, singleValueOrDefault, new CashMapViewKt$$ExternalSyntheticLambda1(6));
    }
}
