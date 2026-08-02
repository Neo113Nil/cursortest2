package com.squareup.cash.paychecks.presenters;

import app.cash.badging.backend.RealBadger2;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.score.views.ScoreUiFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class HelpSheetPresenter$MetroFactory {
    public final LambdaProvider errorReporter;
    public final Provider oneErrorPerAppSessionStrategy;
    public final Provider routerFactory;
    public final DoubleCheck syncValueReader;

    public HelpSheetPresenter$MetroFactory(RealBadger2.MetroFactory metroFactory, DoubleCheck doubleCheck, RealAppLockState.MetroFactory metroFactory2, LambdaProvider lambdaProvider) {
        this.routerFactory = metroFactory;
        this.syncValueReader = doubleCheck;
        this.oneErrorPerAppSessionStrategy = metroFactory2;
        this.errorReporter = lambdaProvider;
    }

    public HelpSheetPresenter$MetroFactory(RealTransferManager.MetroFactory metroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck) {
        this.routerFactory = metroFactory;
        this.oneErrorPerAppSessionStrategy = instanceFactory;
        this.errorReporter = lambdaProvider;
        this.syncValueReader = doubleCheck;
    }

    public HelpSheetPresenter$MetroFactory(RealMessageSigner.MetroFactory metroFactory, InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider) {
        this.routerFactory = metroFactory;
        this.oneErrorPerAppSessionStrategy = instanceFactory;
        this.syncValueReader = doubleCheck;
        this.errorReporter = lambdaProvider;
    }

    public HelpSheetPresenter$MetroFactory(LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory, LocalViewFactory.MetroFactory metroFactory2, DoubleCheck doubleCheck) {
        this.errorReporter = lambdaProvider;
        this.routerFactory = metroFactory;
        this.oneErrorPerAppSessionStrategy = metroFactory2;
        this.syncValueReader = doubleCheck;
    }

    public HelpSheetPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, ScoreUiFactory.MetroFactory metroFactory, ScoreUiFactory.MetroFactory metroFactory2) {
        this.errorReporter = lambdaProvider;
        this.syncValueReader = doubleCheck;
        this.routerFactory = metroFactory;
        this.oneErrorPerAppSessionStrategy = metroFactory2;
    }

    public HelpSheetPresenter$MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider) {
        this.syncValueReader = doubleCheck;
        this.routerFactory = metroFactory;
        this.oneErrorPerAppSessionStrategy = instanceFactory;
        this.errorReporter = lambdaProvider;
    }

    public HelpSheetPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, RealBrazeManager.MetroFactory metroFactory) {
        this.syncValueReader = doubleCheck;
        this.errorReporter = lambdaProvider;
        this.routerFactory = instanceFactory;
        this.oneErrorPerAppSessionStrategy = metroFactory;
    }

    public /* synthetic */ HelpSheetPresenter$MetroFactory(DoubleCheck doubleCheck, Factory factory, LambdaProvider lambdaProvider, Factory factory2) {
        this.syncValueReader = doubleCheck;
        this.routerFactory = factory;
        this.errorReporter = lambdaProvider;
        this.oneErrorPerAppSessionStrategy = factory2;
    }
}
