package com.squareup.cash.blockers.presenters;

import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.storage.RealFileDownloader;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class ClientScenarioLauncherPresenter$MetroFactory {
    public final Provider blockerFlowAnalytics;
    public final DoubleCheck clientScenarioCompleter;
    public final LambdaProvider ioDispatcher;
    public final LambdaProvider stringManager;
    public final LambdaProvider toaster;

    public ClientScenarioLauncherPresenter$MetroFactory(LambdaProvider lambdaProvider, RealFileDownloader.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3) {
        this.toaster = lambdaProvider;
        this.blockerFlowAnalytics = metroFactory;
        this.clientScenarioCompleter = doubleCheck;
        this.stringManager = lambdaProvider2;
        this.ioDispatcher = lambdaProvider3;
    }

    public ClientScenarioLauncherPresenter$MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, LambdaProvider lambdaProvider3, RealGlobalConfigManager.MetroFactory metroFactory) {
        this.toaster = lambdaProvider;
        this.stringManager = lambdaProvider2;
        this.clientScenarioCompleter = doubleCheck;
        this.ioDispatcher = lambdaProvider3;
        this.blockerFlowAnalytics = metroFactory;
    }

    public ClientScenarioLauncherPresenter$MetroFactory(DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3) {
        this.clientScenarioCompleter = doubleCheck;
        this.blockerFlowAnalytics = metroFactory;
        this.toaster = lambdaProvider;
        this.stringManager = lambdaProvider2;
        this.ioDispatcher = lambdaProvider3;
    }
}
