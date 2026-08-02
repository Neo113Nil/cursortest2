package com.squareup.cash.card.onboarding;

import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class CardStudioPresenterV2$MetroFactory {
    public final DoubleCheck appConfig;
    public final DoubleCheck cashDatabase;
    public final Provider deviceOrientationProvider;
    public final LambdaProvider ioContext;

    public CardStudioPresenterV2$MetroFactory(RealAppLockState.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
        this.deviceOrientationProvider = metroFactory;
        this.ioContext = lambdaProvider;
        this.cashDatabase = doubleCheck;
        this.appConfig = doubleCheck2;
    }

    public CardStudioPresenterV2$MetroFactory(LambdaProvider lambdaProvider, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
        this.ioContext = lambdaProvider;
        this.deviceOrientationProvider = broadwayModule$ProvideBroadwayMetroFactory;
        this.cashDatabase = doubleCheck;
        this.appConfig = doubleCheck2;
    }

    public CardStudioPresenterV2$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, BrazeInitializer.MetroFactory metroFactory, DoubleCheck doubleCheck2) {
        this.ioContext = lambdaProvider;
        this.cashDatabase = doubleCheck;
        this.deviceOrientationProvider = metroFactory;
        this.appConfig = doubleCheck2;
    }

    public CardStudioPresenterV2$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, ShiftsAnalytics.MetroFactory metroFactory) {
        this.ioContext = lambdaProvider;
        this.cashDatabase = doubleCheck;
        this.appConfig = doubleCheck2;
        this.deviceOrientationProvider = metroFactory;
    }

    public /* synthetic */ CardStudioPresenterV2$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, FillrInitializer.MetroFactory metroFactory) {
        this.cashDatabase = doubleCheck;
        this.ioContext = lambdaProvider;
        this.appConfig = doubleCheck2;
        this.deviceOrientationProvider = metroFactory;
    }

    public CardStudioPresenterV2$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory) {
        this.cashDatabase = doubleCheck;
        this.appConfig = doubleCheck2;
        this.ioContext = lambdaProvider;
        this.deviceOrientationProvider = metroFactory;
    }

    public CardStudioPresenterV2$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider) {
        this.cashDatabase = doubleCheck;
        this.appConfig = doubleCheck2;
        this.deviceOrientationProvider = instanceFactory;
        this.ioContext = lambdaProvider;
    }

    public /* synthetic */ CardStudioPresenterV2$MetroFactory(DoubleCheck doubleCheck, Factory factory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2) {
        this.cashDatabase = doubleCheck;
        this.deviceOrientationProvider = factory;
        this.ioContext = lambdaProvider;
        this.appConfig = doubleCheck2;
    }

    public /* synthetic */ CardStudioPresenterV2$MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2) {
        this.deviceOrientationProvider = instanceFactory;
        this.cashDatabase = doubleCheck;
        this.ioContext = lambdaProvider;
        this.appConfig = doubleCheck2;
    }
}
