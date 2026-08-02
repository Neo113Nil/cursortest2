package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.transfers.TransferManager;

/* loaded from: classes.dex */
public final class BalanceTransferLoadingPresenter$Factory$Impl {
    public final GetFlowLoadingPresenter$MetroFactory delegateFactory;

    public BalanceTransferLoadingPresenter$Factory$Impl(GetFlowLoadingPresenter$MetroFactory getFlowLoadingPresenter$MetroFactory) {
        this.delegateFactory = getFlowLoadingPresenter$MetroFactory;
    }

    public final LocalPosCheckInPresenter create(BlockersScreens.BalanceTransferLoading balanceTransferLoading, BetterNavigator.ScreenNavigator screenNavigator) {
        GetFlowLoadingPresenter$MetroFactory getFlowLoadingPresenter$MetroFactory = this.delegateFactory;
        TransferManager transferManager = (TransferManager) getFlowLoadingPresenter$MetroFactory.flowNavigationHelper.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) getFlowLoadingPresenter$MetroFactory.activityFinisher.invoke();
        FlowStarter flowStarter = (FlowStarter) getFlowLoadingPresenter$MetroFactory.appService.getValue();
        transferManager.getClass();
        blockersDataNavigator.getClass();
        flowStarter.getClass();
        return new LocalPosCheckInPresenter(transferManager, blockersDataNavigator, flowStarter, balanceTransferLoading, screenNavigator, 11);
    }
}
