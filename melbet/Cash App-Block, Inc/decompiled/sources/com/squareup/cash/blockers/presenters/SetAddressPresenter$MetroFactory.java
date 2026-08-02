package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.retro.views.RetroUiFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class SetAddressPresenter$MetroFactory {
    public final DoubleCheck analytics;
    public final DoubleCheck appConfig;
    public final Provider blockerFlowAnalytics;
    public final Provider blockersHelperFactory;
    public final Provider blockersNavigator;
    public final DoubleCheck franklinAppService;
    public final Provider idvPresenterFactory;
    public final DoubleCheck service;
    public final LambdaProvider stringManager;

    public SetAddressPresenter$MetroFactory(MoneyUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, RealMessageSigner.MetroFactory metroFactory2, DoubleCheck doubleCheck3, RealReferralManager.MetroFactory metroFactory3, InstanceFactory instanceFactory, DoubleCheck doubleCheck4) {
        this.blockerFlowAnalytics = metroFactory;
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider;
        this.service = doubleCheck2;
        this.blockersNavigator = metroFactory2;
        this.franklinAppService = doubleCheck3;
        this.idvPresenterFactory = metroFactory3;
        this.blockersHelperFactory = instanceFactory;
        this.appConfig = doubleCheck4;
    }

    public SetAddressPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealBrazeManager.MetroFactory metroFactory2, DoubleCheck doubleCheck4, InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.blockerFlowAnalytics = metroFactory;
        this.service = doubleCheck2;
        this.franklinAppService = doubleCheck3;
        this.blockersNavigator = metroFactory2;
        this.appConfig = doubleCheck4;
        this.idvPresenterFactory = instanceFactory;
        this.blockersHelperFactory = instanceFactory2;
    }

    public SetAddressPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealFlowTokenGenerator.MetroFactory metroFactory, DoubleCheck doubleCheck3, RetroUiFactory.MetroFactory metroFactory2, DoubleCheck doubleCheck4, RealMessageSigner.MetroFactory metroFactory3, InstanceFactory instanceFactory) {
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.service = doubleCheck2;
        this.blockerFlowAnalytics = metroFactory;
        this.franklinAppService = doubleCheck3;
        this.blockersNavigator = metroFactory2;
        this.appConfig = doubleCheck4;
        this.idvPresenterFactory = metroFactory3;
        this.blockersHelperFactory = instanceFactory;
    }
}
