package com.squareup.cash.moneybot.presenters;

import app.cash.broadway.navigation.Navigator;
import com.fillr.n;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RealMoneybotInboundNavigator$Factory$Impl {
    public final FileBlockerView.MetroFactory delegateFactory;

    public RealMoneybotInboundNavigator$Factory$Impl(FileBlockerView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final n create(Navigator navigator) {
        navigator.getClass();
        FileBlockerView.MetroFactory metroFactory = this.delegateFactory;
        MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) metroFactory.vibrator.invoke();
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) metroFactory.permissionManager.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.activityEvents.value;
        moneybotFlagsHelper.getClass();
        realMoneybotAnalyticsService.getClass();
        coroutineScope.getClass();
        return new n(navigator, moneybotFlagsHelper, realMoneybotAnalyticsService, coroutineScope);
    }
}
