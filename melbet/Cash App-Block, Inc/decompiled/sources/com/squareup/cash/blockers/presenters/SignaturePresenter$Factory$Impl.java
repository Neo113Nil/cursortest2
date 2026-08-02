package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class SignaturePresenter$Factory$Impl {
    public final SignaturePresenter$MetroFactory delegateFactory;

    public SignaturePresenter$Factory$Impl(SignaturePresenter$MetroFactory signaturePresenter$MetroFactory) {
        this.delegateFactory = signaturePresenter$MetroFactory;
    }

    public final LocalHomePresenter create(BlockersScreens.SignatureScreen signatureScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        SignaturePresenter$MetroFactory signaturePresenter$MetroFactory = this.delegateFactory;
        CoroutineContext coroutineContext = (CoroutineContext) signaturePresenter$MetroFactory.ioDispatcher.lambda.invoke();
        Analytics analytics = (Analytics) signaturePresenter$MetroFactory.analytics.getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) signaturePresenter$MetroFactory.stringManager.lambda.invoke();
        AppService appService = (AppService) signaturePresenter$MetroFactory.appService.getValue();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) signaturePresenter$MetroFactory.blockersNavigator.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) signaturePresenter$MetroFactory.blockersHelperFactory.invoke();
        coroutineContext.getClass();
        analytics.getClass();
        androidStringManager.getClass();
        appService.getClass();
        blockersDataNavigator.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        return new LocalHomePresenter(signatureScreen, screenNavigator, coroutineContext, analytics, androidStringManager, appService, blockersDataNavigator, realBlockersHelper$Factory$Impl);
    }
}
