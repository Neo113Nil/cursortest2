package com.squareup.cash.history.navigation;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.analytics.LoadTimeClock;

/* loaded from: classes.dex */
public final class RealActivityInboundNavigator$Factory$Impl {
    public final LoadTimeClock.MetroFactory delegateFactory;

    public RealActivityInboundNavigator$Factory$Impl(LoadTimeClock.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final EglCore create$1(Navigator navigator) {
        navigator.getClass();
        LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
        LoadTimeClock loadTimeClock = (LoadTimeClock) metroFactory.clock.invoke();
        ActivityAnalyticsService activityAnalyticsService = (ActivityAnalyticsService) metroFactory.observabilityManager.invoke();
        loadTimeClock.getClass();
        activityAnalyticsService.getClass();
        return new EglCore(navigator, loadTimeClock, activityAnalyticsService);
    }
}
