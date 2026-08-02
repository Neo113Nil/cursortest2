package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;

/* loaded from: classes.dex */
public final class CalendarBlockerPresenter$Factory$Impl {
    public final LocalEditorialPresenter.MetroFactory delegateFactory;

    public CalendarBlockerPresenter$Factory$Impl(LocalEditorialPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final CalendarBlockerPresenter create(BlockersScreens.CalendarBlockerScreen calendarBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        LocalEditorialPresenter.MetroFactory metroFactory = this.delegateFactory;
        AndroidClock androidClock = (AndroidClock) metroFactory.clock.lambda.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.launcher.invoke();
        Analytics analytics = (Analytics) metroFactory.service.getValue();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.installedStore.invoke();
        RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) metroFactory.responseContextHandlerFactory.invoke();
        androidClock.getClass();
        androidStringManager.getClass();
        blockersDataNavigator.getClass();
        analytics.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        realMultiBlockerFacilitator.getClass();
        return new CalendarBlockerPresenter(androidClock, androidStringManager, blockersDataNavigator, analytics, realBlockersHelper$Factory$Impl, realMultiBlockerFacilitator, calendarBlockerScreen, screenNavigator);
    }
}
