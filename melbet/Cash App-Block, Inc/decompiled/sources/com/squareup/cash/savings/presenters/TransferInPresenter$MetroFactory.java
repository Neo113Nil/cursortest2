package com.squareup.cash.savings.presenters;

import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class TransferInPresenter$MetroFactory {
    public final DoubleCheck analytics;
    public final Provider moneyFormatterFactory;
    public final LambdaProvider stringManager;

    public /* synthetic */ TransferInPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, Factory factory) {
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.moneyFormatterFactory = factory;
    }

    public /* synthetic */ TransferInPresenter$MetroFactory(LambdaProvider lambdaProvider, Factory factory, DoubleCheck doubleCheck) {
        this.stringManager = lambdaProvider;
        this.moneyFormatterFactory = factory;
        this.analytics = doubleCheck;
    }

    public /* synthetic */ TransferInPresenter$MetroFactory(Provider provider, LambdaProvider lambdaProvider, DoubleCheck doubleCheck) {
        this.moneyFormatterFactory = provider;
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
    }

    public /* synthetic */ TransferInPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, Factory factory) {
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider;
        this.moneyFormatterFactory = factory;
    }

    public /* synthetic */ TransferInPresenter$MetroFactory(DoubleCheck doubleCheck, Factory factory, LambdaProvider lambdaProvider) {
        this.analytics = doubleCheck;
        this.moneyFormatterFactory = factory;
        this.stringManager = lambdaProvider;
    }

    public TransferInPresenter$MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider) {
        this.moneyFormatterFactory = instanceFactory;
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider;
    }
}
