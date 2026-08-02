package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class SavingsTransferOptionSelectionPresenter$Factory$Impl {
    public final FormPresenter.MetroFactory delegateFactory;

    public SavingsTransferOptionSelectionPresenter$Factory$Impl(FormPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final SavingsTransferOptionSelectionPresenter create(BlockersScreens.SavingsTransferOptionSelectionScreen savingsTransferOptionSelectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        FormPresenter.MetroFactory metroFactory = this.delegateFactory;
        AppService appService = (AppService) metroFactory.analytics.getValue();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory.blockersHelperFactory.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.formAnalytics.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.blockerActionUriDecoder.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.clock.lambda.invoke();
        appService.getClass();
        blockerFlowListener.getClass();
        blockersDataNavigator.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        androidStringManager.getClass();
        return new SavingsTransferOptionSelectionPresenter(appService, blockerFlowListener, blockersDataNavigator, realBlockersHelper$Factory$Impl, androidStringManager, savingsTransferOptionSelectionScreen, screenNavigator);
    }
}
