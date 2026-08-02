package com.squareup.cash.real;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.squareup.cash.api.ExperimentExposure;
import com.squareup.cash.api.ExperimentExposureTracker;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CompositeExposureTracker implements ExperimentExposureTracker {
    public final CdpExposureTracker cdpExposureTracker;
    public final InMemoryExperimentExposureCache experimentExposureCache;

    public CompositeExposureTracker(CdpExposureTracker cdpExposureTracker, InMemoryExperimentExposureCache inMemoryExperimentExposureCache) {
        this.cdpExposureTracker = cdpExposureTracker;
        this.experimentExposureCache = inMemoryExperimentExposureCache;
    }

    @Override // com.squareup.cash.api.ExperimentExposureTracker
    public final void trackExposure(ExperimentExposure experimentExposure) {
        Timber.Forest forest = Timber.Forest;
        String str = experimentExposure.experimentId;
        String str2 = experimentExposure.variationId;
        forest.d(CameraSelector$$ExternalSyntheticOutline0.m("Logging exposure for key:", str, " value:", str2), new Object[0]);
        LinkedHashMap linkedHashMap = this.experimentExposureCache.exposuresMap;
        boolean areEqual = Intrinsics.areEqual(linkedHashMap.get(str), str2);
        linkedHashMap.put(str, str2);
        if (areEqual) {
            return;
        }
        this.cdpExposureTracker.trackExposure(experimentExposure);
    }
}
