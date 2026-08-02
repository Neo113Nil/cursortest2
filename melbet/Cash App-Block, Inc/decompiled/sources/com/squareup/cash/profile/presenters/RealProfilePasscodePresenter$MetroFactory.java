package com.squareup.cash.profile.presenters;

import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class RealProfilePasscodePresenter$MetroFactory {
    public final Provider analytics;
    public final Provider balanceSnapshotManager;
    public final Provider blockersNavigator;
    public final Provider cryptoBalanceRepo;
    public final Provider featureFlagManager;
    public final Provider instrumentManager;
    public final Provider ioDispatcher;
    public final Provider passcodeFlowStarter;
    public final Provider passcodeSettings;
    public final Provider profileManager;
    public final Provider stringManager;

    public /* synthetic */ RealProfilePasscodePresenter$MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, Provider provider6, Provider provider7, Provider provider8, LambdaProvider lambdaProvider2) {
        this.balanceSnapshotManager = provider;
        this.cryptoBalanceRepo = provider2;
        this.instrumentManager = provider3;
        this.profileManager = provider4;
        this.blockersNavigator = provider5;
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider;
        this.featureFlagManager = provider6;
        this.passcodeFlowStarter = provider7;
        this.passcodeSettings = provider8;
        this.ioDispatcher = lambdaProvider2;
    }
}
