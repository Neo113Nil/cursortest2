package com.squareup.cash.blockers.presenters;

import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.launcher.IntentLauncher;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class SignaturePresenter$MetroFactory {
    public final DoubleCheck analytics;
    public final DoubleCheck appService;
    public final Provider blockersHelperFactory;
    public final Provider blockersNavigator;
    public final LambdaProvider ioDispatcher;
    public final LambdaProvider stringManager;

    public SignaturePresenter$MetroFactory(RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, TemporaryStorage.MetroFactory metroFactory2, LambdaProvider lambdaProvider2) {
        this.blockersNavigator = metroFactory;
        this.analytics = doubleCheck;
        this.appService = doubleCheck2;
        this.ioDispatcher = lambdaProvider;
        this.blockersHelperFactory = metroFactory2;
        this.stringManager = lambdaProvider2;
    }

    public SignaturePresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, InstanceFactory instanceFactory) {
        this.ioDispatcher = lambdaProvider;
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider2;
        this.appService = doubleCheck2;
        this.blockersNavigator = metroFactory;
        this.blockersHelperFactory = instanceFactory;
    }

    public SignaturePresenter$MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, RealGlobalConfigDataSource.MetroFactory metroFactory2, LambdaProvider lambdaProvider2) {
        this.analytics = doubleCheck;
        this.blockersNavigator = metroFactory;
        this.ioDispatcher = lambdaProvider;
        this.appService = doubleCheck2;
        this.blockersHelperFactory = metroFactory2;
        this.stringManager = lambdaProvider2;
    }

    public SignaturePresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealKeyStoreProvider.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, AppMessageSyncer.MetroFactory metroFactory2) {
        this.analytics = doubleCheck;
        this.ioDispatcher = lambdaProvider;
        this.blockersNavigator = metroFactory;
        this.appService = doubleCheck2;
        this.stringManager = lambdaProvider2;
        this.blockersHelperFactory = metroFactory2;
    }

    public SignaturePresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, IntentLauncher.MetroFactory metroFactory) {
        this.analytics = doubleCheck;
        this.ioDispatcher = lambdaProvider;
        this.stringManager = lambdaProvider2;
        this.appService = doubleCheck2;
        this.blockersNavigator = doubleCheck3;
        this.blockersHelperFactory = metroFactory;
    }
}
