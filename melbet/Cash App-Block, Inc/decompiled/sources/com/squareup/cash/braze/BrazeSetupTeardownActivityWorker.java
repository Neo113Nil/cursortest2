package com.squareup.cash.braze;

import androidx.lifecycle.Lifecycle;
import app.cash.passcode.backend.AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class BrazeSetupTeardownActivityWorker implements IoActivitySetupTeardown {
    public final BrazeManager brazeManager;
    public final FeatureFlagManager featureFlagManager;
    public final SessionManager sessionManager;
    public final Flow signOut;

    public BrazeSetupTeardownActivityWorker(FeatureFlagManager featureFlagManager, BrazeManager brazeManager, SessionManager sessionManager, Flow flow) {
        this.featureFlagManager = featureFlagManager;
        this.brazeManager = brazeManager;
        this.sessionManager = sessionManager;
        this.signOut = flow;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new AppLockMonitor$setup$$inlined$setupSingleCoroutine$default$1(1, lifecycle, this, null), 1);
        return StateFlowKt.noOpTeardown;
    }
}
