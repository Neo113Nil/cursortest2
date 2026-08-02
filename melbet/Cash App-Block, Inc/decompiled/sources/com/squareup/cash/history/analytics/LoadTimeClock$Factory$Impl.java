package com.squareup.cash.history.analytics;

import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.util.clock.AndroidClock;

/* loaded from: classes.dex */
public final class LoadTimeClock$Factory$Impl {
    public final LoadTimeClock.MetroFactory delegateFactory;

    public LoadTimeClock$Factory$Impl(LoadTimeClock.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final LoadTimeClock create(boolean z) {
        LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
        AndroidClock androidClock = (AndroidClock) metroFactory.clock.invoke();
        RealObservabilityManager realObservabilityManager = (RealObservabilityManager) metroFactory.observabilityManager.invoke();
        androidClock.getClass();
        realObservabilityManager.getClass();
        return new LoadTimeClock(androidClock, realObservabilityManager, z);
    }
}
