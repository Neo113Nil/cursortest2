package com.squareup.cash.history.presenters;

import app.cash.local.views.LocalViewFactory;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class ReportAbusePresenter$MetroFactory {
    public final DoubleCheck appService;
    public final Provider contactRepository;
    public final Provider familyProfileManager;
    public final Provider favoritesManager;
    public final DoubleCheck paymentManager;
    public final Provider routerFactory;
    public final LambdaProvider stringManager;

    public /* synthetic */ ReportAbusePresenter$MetroFactory(RealSessionFlags.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, LocalViewFactory.MetroFactory metroFactory2, Provider provider, InstanceFactory instanceFactory) {
        this.contactRepository = metroFactory;
        this.paymentManager = doubleCheck;
        this.stringManager = lambdaProvider;
        this.appService = doubleCheck2;
        this.favoritesManager = metroFactory2;
        this.familyProfileManager = provider;
        this.routerFactory = instanceFactory;
    }

    public ReportAbusePresenter$MetroFactory(RealMessageSigner.MetroFactory metroFactory, MoneyUiFactory.MetroFactory metroFactory2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory3, DoubleCheck doubleCheck2) {
        this.contactRepository = metroFactory;
        this.favoritesManager = metroFactory2;
        this.familyProfileManager = walletUiFactory$MetroFactory;
        this.paymentManager = doubleCheck;
        this.stringManager = lambdaProvider;
        this.routerFactory = metroFactory3;
        this.appService = doubleCheck2;
    }

    public ReportAbusePresenter$MetroFactory(InstanceFactory instanceFactory, LambdaProvider lambdaProvider, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RetroUiFactory.MetroFactory metroFactory, RealFileDownloader.MetroFactory metroFactory2) {
        this.contactRepository = instanceFactory;
        this.stringManager = lambdaProvider;
        this.favoritesManager = arcadeModule$ProvideHapticVibratorMetroFactory;
        this.paymentManager = doubleCheck;
        this.appService = doubleCheck2;
        this.familyProfileManager = metroFactory;
        this.routerFactory = metroFactory2;
    }
}
