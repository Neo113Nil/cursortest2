package com.squareup.cash.clientsync;

import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.lifecycle.Lifecycle;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.observability.backend.real.sampling.FeatureFlaggedSamplingStrategy$Factory$Impl;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class CustomerStreamingSubscriber implements UiActivitySetupTeardown {
    public final RealClientSyncer clientSyncer;
    public final AndroidClock clock;
    public final RealBrazeConfigurator.MetroFactory customerFeedClient;
    public final ErrorReporter errorReporter;
    public final RealExponentialBackoff exponentialBackoff;
    public final CoroutineContext ioDispatcher;
    public final StateFlow requestMetadata;
    public final Lazy sampleStrategy$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 10));
    public final FeatureFlaggedSamplingStrategy$Factory$Impl sampleStrategyFactory;

    public CustomerStreamingSubscriber(RealBrazeConfigurator.MetroFactory metroFactory, RealClientSyncer realClientSyncer, ErrorReporter errorReporter, FeatureFlaggedSamplingStrategy$Factory$Impl featureFlaggedSamplingStrategy$Factory$Impl, RealExponentialBackoff realExponentialBackoff, AndroidClock androidClock, CoroutineContext coroutineContext, StateFlow stateFlow) {
        this.customerFeedClient = metroFactory;
        this.clientSyncer = realClientSyncer;
        this.errorReporter = errorReporter;
        this.sampleStrategyFactory = featureFlaggedSamplingStrategy$Factory$Impl;
        this.exponentialBackoff = realExponentialBackoff;
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
        this.requestMetadata = stateFlow;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new DataStoreImpl$data$1((Continuation) null, this, lifecycle, 23), 1);
        return StateFlowKt.noOpTeardown;
    }
}
