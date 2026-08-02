package com.squareup.cash.observability.backend.real.network;

import com.squareup.cash.featureflags.FeatureFlagManager;
import kotlin.Lazy;
import okhttp3.EventListener;

/* loaded from: classes.dex */
public final class RealMobileObservabilityEventListener {
    public final Lazy datadogEventListenerFactory;
    public final FeatureFlagManager featureFlagManager;
    public final EventListener.Factory noOpEventListenerFactory;

    public RealMobileObservabilityEventListener(FeatureFlagManager featureFlagManager, Lazy lazy, EventListener.Factory factory) {
        this.featureFlagManager = featureFlagManager;
        this.datadogEventListenerFactory = lazy;
        this.noOpEventListenerFactory = factory;
    }
}
