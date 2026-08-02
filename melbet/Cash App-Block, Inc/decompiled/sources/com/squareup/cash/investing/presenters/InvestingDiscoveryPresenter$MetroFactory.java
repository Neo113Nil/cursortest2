package com.squareup.cash.investing.presenters;

import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class InvestingDiscoveryPresenter$MetroFactory {
    public final DoubleCheck database;
    public final Provider discoverySectionsPresenterFactory;
    public final DoubleCheck featureFlagManager;
    public final Provider investingActivity;
    public final Provider investingStateManager;
    public final LambdaProvider ioDispatcher;
    public final Provider kybRestrictionBannerFactory;
    public final Provider newsPresenterFactory;
    public final DoubleCheck rangeSelectionCache;
    public final LambdaProvider stringManager;

    public InvestingDiscoveryPresenter$MetroFactory(LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, TreehouseFlows.MetroFactory metroFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, RealMessageSigner.MetroFactory metroFactory2, InstanceFactory instanceFactory2) {
        this.stringManager = lambdaProvider;
        this.newsPresenterFactory = musicViewFactory$MetroFactory;
        this.database = doubleCheck;
        this.featureFlagManager = doubleCheck2;
        this.discoverySectionsPresenterFactory = instanceFactory;
        this.investingStateManager = metroFactory;
        this.ioDispatcher = lambdaProvider2;
        this.rangeSelectionCache = doubleCheck3;
        this.investingActivity = metroFactory2;
        this.kybRestrictionBannerFactory = instanceFactory2;
    }

    public InvestingDiscoveryPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory2, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, InstanceFactory instanceFactory3) {
        this.stringManager = lambdaProvider;
        this.database = doubleCheck;
        this.newsPresenterFactory = instanceFactory;
        this.ioDispatcher = lambdaProvider2;
        this.discoverySectionsPresenterFactory = instanceFactory2;
        this.investingStateManager = broadwayModule$ProvideBroadwayMetroFactory;
        this.featureFlagManager = doubleCheck2;
        this.rangeSelectionCache = doubleCheck3;
        this.investingActivity = walletUiFactory$MetroFactory;
        this.kybRestrictionBannerFactory = instanceFactory3;
    }
}
