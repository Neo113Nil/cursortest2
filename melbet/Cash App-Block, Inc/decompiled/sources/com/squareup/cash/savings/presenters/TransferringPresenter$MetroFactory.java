package com.squareup.cash.savings.presenters;

import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class TransferringPresenter$MetroFactory {
    public final DoubleCheck appService;
    public final Provider balanceSnapshotManager;
    public final Provider blockersDataNavigator;
    public final DoubleCheck flowStarter;
    public final Provider moneyFormatterFactory;
    public final LambdaProvider stringManager;
    public final LambdaProvider uuidGenerator;

    public TransferringPresenter$MetroFactory(RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, NavigationSideEffects.MetroFactory metroFactory2, LambdaProvider lambdaProvider2) {
        this.blockersDataNavigator = metroFactory;
        this.stringManager = lambdaProvider;
        this.balanceSnapshotManager = doubleCheck;
        this.appService = doubleCheck2;
        this.flowStarter = doubleCheck3;
        this.moneyFormatterFactory = metroFactory2;
        this.uuidGenerator = lambdaProvider2;
    }

    public TransferringPresenter$MetroFactory(IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider, LocalViewFactory.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory) {
        this.blockersDataNavigator = metroFactory;
        this.stringManager = lambdaProvider;
        this.balanceSnapshotManager = metroFactory2;
        this.uuidGenerator = lambdaProvider2;
        this.appService = doubleCheck;
        this.flowStarter = doubleCheck2;
        this.moneyFormatterFactory = instanceFactory;
    }

    public TransferringPresenter$MetroFactory(DoubleCheck doubleCheck, RealPasscodeFlowStarter.MetroFactory metroFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2) {
        this.appService = doubleCheck;
        this.blockersDataNavigator = metroFactory;
        this.balanceSnapshotManager = instanceFactory;
        this.moneyFormatterFactory = instanceFactory2;
        this.stringManager = lambdaProvider;
        this.flowStarter = doubleCheck2;
        this.uuidGenerator = lambdaProvider2;
    }

    public TransferringPresenter$MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
        this.appService = doubleCheck;
        this.blockersDataNavigator = metroFactory;
        this.stringManager = lambdaProvider;
        this.balanceSnapshotManager = metroFactory2;
        this.flowStarter = doubleCheck2;
        this.uuidGenerator = lambdaProvider2;
        this.moneyFormatterFactory = musicViewFactory$MetroFactory;
    }

    public TransferringPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealKeyStoreProvider.MetroFactory metroFactory, RealMessageSigner.MetroFactory metroFactory2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
        this.appService = doubleCheck;
        this.stringManager = lambdaProvider;
        this.blockersDataNavigator = metroFactory;
        this.balanceSnapshotManager = metroFactory2;
        this.flowStarter = doubleCheck2;
        this.uuidGenerator = lambdaProvider2;
        this.moneyFormatterFactory = musicViewFactory$MetroFactory;
    }

    public TransferringPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, RealSessionFlags.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory3) {
        this.appService = doubleCheck;
        this.flowStarter = doubleCheck2;
        this.blockersDataNavigator = metroFactory;
        this.stringManager = lambdaProvider;
        this.balanceSnapshotManager = metroFactory2;
        this.uuidGenerator = lambdaProvider2;
        this.moneyFormatterFactory = metroFactory3;
    }

    public TransferringPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, RealMessageSigner.MetroFactory metroFactory2, LambdaProvider lambdaProvider2) {
        this.appService = doubleCheck;
        this.blockersDataNavigator = doubleCheck2;
        this.balanceSnapshotManager = metroFactory;
        this.stringManager = lambdaProvider;
        this.flowStarter = doubleCheck3;
        this.moneyFormatterFactory = metroFactory2;
        this.uuidGenerator = lambdaProvider2;
    }
}
