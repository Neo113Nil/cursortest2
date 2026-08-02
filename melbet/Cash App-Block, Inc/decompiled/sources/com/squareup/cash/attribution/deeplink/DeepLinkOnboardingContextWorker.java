package com.squareup.cash.attribution.deeplink;

import androidx.lifecycle.Lifecycle;
import app.cash.molecule.GatedFrameClock;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes.dex */
public final class DeepLinkOnboardingContextWorker implements IoActivitySetupTeardown {
    public final AppService appService;
    public final SharedFlow deepLinkState;
    public final RealOnboardingFlowTokenManager onboardingFlowTokenManager;

    public DeepLinkOnboardingContextWorker(AppService appService, SharedFlow sharedFlow, RealOnboardingFlowTokenManager realOnboardingFlowTokenManager) {
        this.appService = appService;
        this.deepLinkState = sharedFlow;
        this.onboardingFlowTokenManager = realOnboardingFlowTokenManager;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new GatedFrameClock.AnonymousClass1((Continuation) null, this, 28), 1);
        return StateFlowKt.noOpTeardown;
    }
}
