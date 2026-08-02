package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidActivityFinisher;

/* loaded from: classes.dex */
public final class GetFlowLoadingPresenter$Factory$Impl {
    public final GetFlowLoadingPresenter$MetroFactory delegateFactory;

    public GetFlowLoadingPresenter$Factory$Impl(GetFlowLoadingPresenter$MetroFactory getFlowLoadingPresenter$MetroFactory) {
        this.delegateFactory = getFlowLoadingPresenter$MetroFactory;
    }

    public final LocalPosCheckInPresenter create(BlockersScreens.StartFlowEntryPoint startFlowEntryPoint, BetterNavigator.ScreenNavigator screenNavigator) {
        GetFlowLoadingPresenter$MetroFactory getFlowLoadingPresenter$MetroFactory = this.delegateFactory;
        FlowNavigationHelper flowNavigationHelper = (FlowNavigationHelper) getFlowLoadingPresenter$MetroFactory.flowNavigationHelper.invoke();
        AndroidActivityFinisher androidActivityFinisher = (AndroidActivityFinisher) getFlowLoadingPresenter$MetroFactory.activityFinisher.invoke();
        AppService appService = (AppService) getFlowLoadingPresenter$MetroFactory.appService.getValue();
        flowNavigationHelper.getClass();
        androidActivityFinisher.getClass();
        appService.getClass();
        return new LocalPosCheckInPresenter(flowNavigationHelper, androidActivityFinisher, appService, startFlowEntryPoint, screenNavigator, 14);
    }
}
