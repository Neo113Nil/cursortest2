package com.squareup.cash.session.backend;

import com.squareup.cash.api.ExperimentExposure;
import com.squareup.cash.featureflags.FeatureFlagInterceptor;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.real.CompositeExposureTracker;
import com.squareup.cash.session.backend.SignedInStateSetupTeardown;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.franklin.common.FeatureFlagSource;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class SignedInStateSetupTeardown implements UiSetupTeardown {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object sessionManager;
    public final Object signedInStateManager;

    public SignedInStateSetupTeardown(SessionManager sessionManager, Provider provider) {
        provider.getClass();
        this.sessionManager = sessionManager;
        this.signedInStateManager = provider;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        int i = this.$r8$classId;
        coroutineScope.getClass();
        switch (i) {
            case 0:
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1((Continuation) null, this, 2), 1);
                break;
            default:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) this.sessionManager;
                FeatureFlagInterceptor featureFlagInterceptor = new FeatureFlagInterceptor() { // from class: com.squareup.cash.real.ExposureTrackerConfigurationSetupTeardown$setup$1$1
                    @Override // com.squareup.cash.featureflags.FeatureFlagInterceptor
                    public final void intercept(String str, String str2, boolean z, boolean z2, FeatureFlagSource featureFlagSource) {
                        str2.getClass();
                        if (!z || z2) {
                            return;
                        }
                        ExperimentExposure.ExperimentSource experimentSource = null;
                        if (featureFlagSource != null) {
                            int i2 = ExposureTrackerConfigurationSetupTeardownKt$WhenMappings.$EnumSwitchMapping$0[featureFlagSource.ordinal()];
                            if (i2 == 1 || i2 == 2) {
                                experimentSource = ExperimentExposure.ExperimentSource.LAUNCH_DARKLY;
                            } else if (i2 == 3) {
                                experimentSource = ExperimentExposure.ExperimentSource.AMPLITUDE;
                            } else if (i2 != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                        }
                        ((CompositeExposureTracker) SignedInStateSetupTeardown.this.signedInStateManager).trackExposure(new ExperimentExposure(str, str2, experimentSource));
                    }
                };
                ConcurrentLinkedQueue concurrentLinkedQueue = ((RealFeatureFlagManager) featureFlagManager).interceptors;
                if (!concurrentLinkedQueue.contains(featureFlagInterceptor)) {
                    concurrentLinkedQueue.add(featureFlagInterceptor);
                }
                break;
        }
        return StateFlowKt.noOpTeardown;
    }

    public SignedInStateSetupTeardown(FeatureFlagManager featureFlagManager, CompositeExposureTracker compositeExposureTracker) {
        this.sessionManager = featureFlagManager;
        this.signedInStateManager = compositeExposureTracker;
    }
}
