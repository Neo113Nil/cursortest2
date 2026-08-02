package com.squareup.cash.activity.presenters;

import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class BalanceFeedPresenter$MetroFactory {
    public final DoubleCheck activitiesCacheManager;
    public final Provider activityEmbeddedPresenterFactory;
    public final Provider activityTokenFactory;
    public final Provider balanceSnapshotManager;
    public final Provider moneyFormatterFactory;
    public final LambdaProvider stringManager;

    public BalanceFeedPresenter$MetroFactory(RetroUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, ScoreUiFactory.MetroFactory metroFactory2) {
        this.activityEmbeddedPresenterFactory = metroFactory;
        this.stringManager = lambdaProvider;
        this.activitiesCacheManager = doubleCheck;
        this.activityTokenFactory = instanceFactory;
        this.moneyFormatterFactory = instanceFactory2;
        this.balanceSnapshotManager = metroFactory2;
    }

    public BalanceFeedPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, RealMarketAttributesProvider.MetroFactory metroFactory3, InstanceFactory instanceFactory) {
        this.stringManager = lambdaProvider;
        this.activitiesCacheManager = doubleCheck;
        this.activityEmbeddedPresenterFactory = metroFactory;
        this.activityTokenFactory = metroFactory2;
        this.moneyFormatterFactory = metroFactory3;
        this.balanceSnapshotManager = instanceFactory;
    }

    public BalanceFeedPresenter$MetroFactory(DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, InstanceFactory instanceFactory, RealMessageSigner.MetroFactory metroFactory3, LambdaProvider lambdaProvider) {
        this.activitiesCacheManager = doubleCheck;
        this.activityEmbeddedPresenterFactory = metroFactory;
        this.activityTokenFactory = metroFactory2;
        this.moneyFormatterFactory = instanceFactory;
        this.balanceSnapshotManager = metroFactory3;
        this.stringManager = lambdaProvider;
    }

    public BalanceFeedPresenter$MetroFactory(DoubleCheck doubleCheck, ShiftsAnalytics.MetroFactory metroFactory, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
        this.activityEmbeddedPresenterFactory = doubleCheck;
        this.activityTokenFactory = metroFactory;
        this.moneyFormatterFactory = instanceFactory;
        this.activitiesCacheManager = doubleCheck2;
        this.stringManager = lambdaProvider;
        this.balanceSnapshotManager = musicViewFactory$MetroFactory;
    }

    public BalanceFeedPresenter$MetroFactory(InstanceFactory instanceFactory, RealPasscodeFlowStarter.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory2, RealSessionFlags.MetroFactory metroFactory3) {
        this.activityEmbeddedPresenterFactory = instanceFactory;
        this.activityTokenFactory = metroFactory;
        this.stringManager = lambdaProvider;
        this.activitiesCacheManager = doubleCheck;
        this.moneyFormatterFactory = metroFactory2;
        this.balanceSnapshotManager = metroFactory3;
    }
}
