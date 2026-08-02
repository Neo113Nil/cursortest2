package com.squareup.cash.attribution.deeplink;

import androidx.lifecycle.Lifecycle;
import app.cash.passcode.backend.RealAppLockState;
import coil3.ComponentRegistry;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.gcl.RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes.dex */
public final class RealDeepLinkAttributionWorker implements IoActivitySetupTeardown {
    public final Flow activityEvents;
    public final RealAppLockState appLockState;
    public final SharedFlow deepLinkState;
    public final DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkEmitter;
    public final ComponentRegistry.Builder deferredDeepLinkNavigator;
    public final DeepLinkCompletableNavigator navigator;
    public final SessionManager sessionManager;

    public RealDeepLinkAttributionWorker(ComponentRegistry.Builder builder, SharedFlow sharedFlow, DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, Flow flow, RealAppLockState realAppLockState, DeepLinkCompletableNavigator deepLinkCompletableNavigator, SessionManager sessionManager) {
        this.deferredDeepLinkNavigator = builder;
        this.deepLinkState = sharedFlow;
        this.deferredDeepLinkEmitter = deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
        this.activityEvents = flow;
        this.appLockState = realAppLockState;
        this.navigator = deepLinkCompletableNavigator;
        this.sessionManager = sessionManager;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(null, this, 1), 1);
        return StateFlowKt.noOpTeardown;
    }
}
