package com.squareup.cash.history.payments.presenters;

import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class ProfileCompleteActivityPresenter$MetroFactory {
    public final DoubleCheck activitiesCacheManager;
    public final Provider activityEmbeddedPresenterFactory;
    public final Provider activityTokenFactory;
    public final Provider counterpartyPageRequestHandlerFactory;
    public final Provider defaultActivityItemEventHandlerFactory;
    public final Provider profileActivityItemEventDecorator;
    public final LambdaProvider stringManager;

    public ProfileCompleteActivityPresenter$MetroFactory(LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, RealGlobalConfigManager.MetroFactory metroFactory2, RealAppMessageManager.MetroFactory metroFactory3, LocalViewFactory.MetroFactory metroFactory4, RealAppLockState.MetroFactory metroFactory5, DoubleCheck doubleCheck) {
        this.stringManager = lambdaProvider;
        this.activityEmbeddedPresenterFactory = metroFactory;
        this.counterpartyPageRequestHandlerFactory = metroFactory2;
        this.activityTokenFactory = metroFactory3;
        this.defaultActivityItemEventHandlerFactory = metroFactory4;
        this.profileActivityItemEventDecorator = metroFactory5;
        this.activitiesCacheManager = doubleCheck;
    }

    public ProfileCompleteActivityPresenter$MetroFactory(LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory2, RealPasscodeFlowStarter.MetroFactory metroFactory, InstanceFactory instanceFactory3, RealMarketAttributesProvider.MetroFactory metroFactory2) {
        this.stringManager = lambdaProvider;
        this.activityEmbeddedPresenterFactory = instanceFactory;
        this.activitiesCacheManager = doubleCheck;
        this.counterpartyPageRequestHandlerFactory = instanceFactory2;
        this.activityTokenFactory = metroFactory;
        this.defaultActivityItemEventHandlerFactory = instanceFactory3;
        this.profileActivityItemEventDecorator = metroFactory2;
    }
}
