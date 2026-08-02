package com.squareup.cash.savings.applets.presenters;

import com.squareup.cash.keystore.RealMessageSigner;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class SavingsAppletTilePresenter$MetroFactory {
    public final Provider analytics;
    public final Provider familyProfileManager;
    public final Provider featureFlagManager;
    public final Provider moneyAnalyticsService;
    public final Provider moneyFormatterFactory;
    public final Provider moneyNavigatorHelper;
    public final Provider promotedAppletTilePresenterFactory;
    public final Provider repository;
    public final Provider routerFactory;
    public final Provider stringManager;

    public /* synthetic */ SavingsAppletTilePresenter$MetroFactory(Provider provider, DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory, Object obj, LambdaProvider lambdaProvider, Provider provider2, Object obj2, Factory factory, Object obj3, Object obj4) {
        this.analytics = provider;
        this.moneyAnalyticsService = doubleCheck;
        this.moneyFormatterFactory = metroFactory;
        this.repository = (Provider) obj;
        this.stringManager = lambdaProvider;
        this.familyProfileManager = provider2;
        this.routerFactory = (Provider) obj2;
        this.moneyNavigatorHelper = factory;
        this.featureFlagManager = (Provider) obj3;
        this.promotedAppletTilePresenterFactory = (Provider) obj4;
    }
}
