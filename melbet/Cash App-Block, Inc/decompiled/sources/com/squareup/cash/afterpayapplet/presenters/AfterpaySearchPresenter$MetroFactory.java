package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class AfterpaySearchPresenter$MetroFactory {
    public final DoubleCheck afterpayAnalytics;
    public final DoubleCheck afterpayMerchantRepo;
    public final LambdaProvider errorReporter;
    public final LambdaProvider inputFieldTextSaver;
    public final Provider oneErrorPerAppSessionStrategy;
    public final Provider routerFactory;
    public final LambdaProvider stringManager;

    public AfterpaySearchPresenter$MetroFactory(MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3) {
        this.routerFactory = musicViewFactory$MetroFactory;
        this.stringManager = lambdaProvider;
        this.afterpayMerchantRepo = doubleCheck;
        this.inputFieldTextSaver = lambdaProvider2;
        this.oneErrorPerAppSessionStrategy = metroFactory;
        this.afterpayAnalytics = doubleCheck2;
        this.errorReporter = lambdaProvider3;
    }

    public AfterpaySearchPresenter$MetroFactory(LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory, TemporaryStorage.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3) {
        this.stringManager = lambdaProvider;
        this.routerFactory = metroFactory;
        this.oneErrorPerAppSessionStrategy = metroFactory2;
        this.inputFieldTextSaver = lambdaProvider2;
        this.afterpayMerchantRepo = doubleCheck;
        this.afterpayAnalytics = doubleCheck2;
        this.errorReporter = lambdaProvider3;
    }

    public AfterpaySearchPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory, DoubleCheck doubleCheck2, FillrInitializer.MetroFactory metroFactory2, LambdaProvider lambdaProvider3) {
        this.afterpayMerchantRepo = doubleCheck;
        this.stringManager = lambdaProvider;
        this.inputFieldTextSaver = lambdaProvider2;
        this.routerFactory = metroFactory;
        this.afterpayAnalytics = doubleCheck2;
        this.oneErrorPerAppSessionStrategy = metroFactory2;
        this.errorReporter = lambdaProvider3;
    }

    public AfterpaySearchPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
        this.afterpayMerchantRepo = doubleCheck;
        this.stringManager = lambdaProvider;
        this.inputFieldTextSaver = lambdaProvider2;
        this.routerFactory = metroFactory;
        this.afterpayAnalytics = doubleCheck2;
        this.errorReporter = lambdaProvider3;
        this.oneErrorPerAppSessionStrategy = musicViewFactory$MetroFactory;
    }

    public AfterpaySearchPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
        this.afterpayMerchantRepo = doubleCheck;
        this.stringManager = lambdaProvider;
        this.routerFactory = instanceFactory;
        this.afterpayAnalytics = doubleCheck2;
        this.inputFieldTextSaver = lambdaProvider2;
        this.errorReporter = lambdaProvider3;
        this.oneErrorPerAppSessionStrategy = musicViewFactory$MetroFactory;
    }
}
