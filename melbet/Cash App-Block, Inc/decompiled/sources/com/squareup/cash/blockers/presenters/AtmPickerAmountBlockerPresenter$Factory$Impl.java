package com.squareup.cash.blockers.presenters;

import com.squareup.cash.activity.presenters.BalanceFeedPresenter$MetroFactory;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class AtmPickerAmountBlockerPresenter$Factory$Impl {
    public final BalanceFeedPresenter$MetroFactory delegateFactory;

    public AtmPickerAmountBlockerPresenter$Factory$Impl(BalanceFeedPresenter$MetroFactory balanceFeedPresenter$MetroFactory) {
        this.delegateFactory = balanceFeedPresenter$MetroFactory;
    }

    public final AtmPickerAmountBlockerPresenter create(BlockersScreens.AtmPickerAmountBlockerScreen atmPickerAmountBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        BalanceFeedPresenter$MetroFactory balanceFeedPresenter$MetroFactory = this.delegateFactory;
        AppService appService = (AppService) balanceFeedPresenter$MetroFactory.activitiesCacheManager.getValue();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) balanceFeedPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) balanceFeedPresenter$MetroFactory.activityTokenFactory.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) balanceFeedPresenter$MetroFactory.moneyFormatterFactory.invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) balanceFeedPresenter$MetroFactory.balanceSnapshotManager.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) balanceFeedPresenter$MetroFactory.stringManager.lambda.invoke();
        appService.getClass();
        blockerFlowListener.getClass();
        blockersDataNavigator.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        factory.getClass();
        androidStringManager.getClass();
        return new AtmPickerAmountBlockerPresenter(appService, blockerFlowListener, blockersDataNavigator, realBlockersHelper$Factory$Impl, factory, androidStringManager, atmPickerAmountBlockerScreen, screenNavigator);
    }
}
