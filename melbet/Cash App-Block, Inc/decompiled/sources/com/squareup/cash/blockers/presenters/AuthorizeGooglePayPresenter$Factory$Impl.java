package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cashlynxflow.service.v2.AppService;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.resource.text.AndroidStringManager;

/* loaded from: classes.dex */
public final class AuthorizeGooglePayPresenter$Factory$Impl {
    public final FormPresenter.MetroFactory delegateFactory;

    public AuthorizeGooglePayPresenter$Factory$Impl(FormPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final AuthorizeGooglePayPresenter create(BlockersScreens.AuthorizeGooglePayScreen authorizeGooglePayScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        FormPresenter.MetroFactory metroFactory = this.delegateFactory;
        GooglePayPaymentsClient googlePayPaymentsClient = (GooglePayPaymentsClient) metroFactory.blockersHelperFactory.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.formAnalytics.invoke();
        AppService appService = (AppService) metroFactory.analytics.getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.clock.lambda.invoke();
        String str = (String) metroFactory.blockerActionUriDecoder.invoke();
        googlePayPaymentsClient.getClass();
        blockersDataNavigator.getClass();
        appService.getClass();
        androidStringManager.getClass();
        str.getClass();
        return new AuthorizeGooglePayPresenter(googlePayPaymentsClient, blockersDataNavigator, appService, androidStringManager, str, authorizeGooglePayScreen, screenNavigator);
    }
}
