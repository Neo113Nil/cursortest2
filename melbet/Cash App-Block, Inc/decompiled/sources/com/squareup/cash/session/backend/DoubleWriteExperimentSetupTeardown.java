package com.squareup.cash.session.backend;

import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class DoubleWriteExperimentSetupTeardown implements UiSetupTeardown {
    public final DoubleWriteExperimentForwarder doubleWriteExperimentForwarder;
    public final FeatureFlagManager featureFlagManager;

    public DoubleWriteExperimentSetupTeardown(FeatureFlagManager featureFlagManager, DoubleWriteExperimentForwarder doubleWriteExperimentForwarder) {
        this.featureFlagManager = featureFlagManager;
        this.doubleWriteExperimentForwarder = doubleWriteExperimentForwarder;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        DoubleWriteExperimentForwarder doubleWriteExperimentForwarder = this.doubleWriteExperimentForwarder;
        doubleWriteExperimentForwarder.currentReader.set(this);
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new AppUpdateDetector$$ExternalSyntheticLambda0(doubleWriteExperimentForwarder, 1));
    }
}
