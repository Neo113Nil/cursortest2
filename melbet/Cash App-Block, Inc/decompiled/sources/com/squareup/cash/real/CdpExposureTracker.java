package com.squareup.cash.real;

import com.squareup.cash.api.ExperimentExposure;
import com.squareup.cash.api.ExperimentExposureTracker;
import com.squareup.cash.cdf.experiment.ExperimentActivateView;
import com.squareup.cash.cdf.experiment.ExperimentSource;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class CdpExposureTracker implements ExperimentExposureTracker {
    public final Analytics analytics;
    public final BugsnagClient bugsnagClient;

    public CdpExposureTracker(Analytics analytics, BugsnagClient bugsnagClient) {
        this.analytics = analytics;
        this.bugsnagClient = bugsnagClient;
    }

    @Override // com.squareup.cash.api.ExperimentExposureTracker
    public final void trackExposure(ExperimentExposure experimentExposure) {
        ExperimentSource experimentSource;
        String str = experimentExposure.experimentId;
        String str2 = experimentExposure.variationId;
        ExperimentExposure.ExperimentSource experimentSource2 = experimentExposure.featureFlagSource;
        if (experimentSource2 != null) {
            int ordinal = experimentSource2.ordinal();
            if (ordinal == 0) {
                experimentSource = ExperimentSource.LAUNCH_DARKLY;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                experimentSource = ExperimentSource.AMPLITUDE;
            }
        } else {
            experimentSource = null;
        }
        this.analytics.track(new ExperimentActivateView(str, str2, experimentSource), null);
        this.bugsnagClient.addFeatureFlag(str, str2);
    }
}
