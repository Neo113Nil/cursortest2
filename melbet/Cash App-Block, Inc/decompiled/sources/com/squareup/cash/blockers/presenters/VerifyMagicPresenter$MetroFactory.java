package com.squareup.cash.blockers.presenters;

import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.launcher.IntentLauncher;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class VerifyMagicPresenter$MetroFactory {
    public final DoubleCheck analytics;
    public final DoubleCheck appService;
    public final Provider blockerFlowAnalytics;
    public final Provider blockersNavigator;
    public final DoubleCheck flowStarter;
    public final DoubleCheck signOut;
    public final LambdaProvider stringManager;

    public VerifyMagicPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, RealGlobalConfigDataSource.MetroFactory metroFactory2, DoubleCheck doubleCheck4) {
        this.analytics = doubleCheck;
        this.appService = doubleCheck2;
        this.flowStarter = doubleCheck3;
        this.blockersNavigator = metroFactory;
        this.stringManager = lambdaProvider;
        this.blockerFlowAnalytics = metroFactory2;
        this.signOut = doubleCheck4;
    }

    public VerifyMagicPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck4, InstanceFactory instanceFactory, LambdaProvider lambdaProvider) {
        this.analytics = doubleCheck;
        this.appService = doubleCheck2;
        this.flowStarter = doubleCheck3;
        this.blockersNavigator = metroFactory;
        this.signOut = doubleCheck4;
        this.blockerFlowAnalytics = instanceFactory;
        this.stringManager = lambdaProvider;
    }
}
