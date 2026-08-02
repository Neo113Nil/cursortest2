package com.squareup.cash.securityhub.presenters;

import app.cash.badging.backend.RealBadger2;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class RecoveryGuidePresenter$MetroFactory {
    public final InstanceFactory activity;
    public final DoubleCheck analytics;
    public final Provider deviceManagerInboundNavigatorFactory;
    public final DoubleCheck intentFactory;
    public final Provider passcodeFlowStarter;
    public final LambdaProvider stringManager;
    public final Provider supportNavigator;

    public RecoveryGuidePresenter$MetroFactory(RealBadger2.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealGlobalConfigManager.MetroFactory metroFactory2, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, InstanceFactory instanceFactory2) {
        this.supportNavigator = metroFactory;
        this.intentFactory = doubleCheck;
        this.stringManager = lambdaProvider;
        this.passcodeFlowStarter = metroFactory2;
        this.deviceManagerInboundNavigatorFactory = instanceFactory;
        this.analytics = doubleCheck2;
        this.activity = instanceFactory2;
    }

    public RecoveryGuidePresenter$MetroFactory(LambdaProvider lambdaProvider, RealBadger2.MetroFactory metroFactory, RealPasscodeFlowStarter.MetroFactory metroFactory2, InstanceFactory instanceFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory2, DoubleCheck doubleCheck2) {
        this.stringManager = lambdaProvider;
        this.supportNavigator = metroFactory;
        this.passcodeFlowStarter = metroFactory2;
        this.deviceManagerInboundNavigatorFactory = instanceFactory;
        this.intentFactory = doubleCheck;
        this.activity = instanceFactory2;
        this.analytics = doubleCheck2;
    }
}
