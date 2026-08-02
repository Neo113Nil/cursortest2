package com.squareup.cash.paymentpad.presenters;

import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.storage.RealFileDownloader;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class LitePaymentPadPresenter$MetroFactory {
    public final DoubleCheck fxExchangeRateStreamingSubscriber;
    public final Provider moneyFormatterFactory;
    public final Provider paymentPadOutboundNavigatorFactory;
    public final DelegateFactory profileManager;
    public final LambdaProvider stringManager;
    public final LambdaProvider uuidGenerator;

    public LitePaymentPadPresenter$MetroFactory(DelegateFactory delegateFactory, LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory, DoubleCheck doubleCheck) {
        this.profileManager = delegateFactory;
        this.uuidGenerator = lambdaProvider;
        this.moneyFormatterFactory = metroFactory;
        this.stringManager = lambdaProvider2;
        this.paymentPadOutboundNavigatorFactory = instanceFactory;
        this.fxExchangeRateStreamingSubscriber = doubleCheck;
    }

    public LitePaymentPadPresenter$MetroFactory(DoubleCheck doubleCheck, RealFileDownloader.MetroFactory metroFactory, DelegateFactory delegateFactory, LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider2) {
        this.fxExchangeRateStreamingSubscriber = doubleCheck;
        this.moneyFormatterFactory = metroFactory;
        this.profileManager = delegateFactory;
        this.uuidGenerator = lambdaProvider;
        this.paymentPadOutboundNavigatorFactory = metroFactory2;
        this.stringManager = lambdaProvider2;
    }
}
