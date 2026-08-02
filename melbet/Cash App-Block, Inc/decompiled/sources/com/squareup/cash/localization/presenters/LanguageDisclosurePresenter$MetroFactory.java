package com.squareup.cash.localization.presenters;

import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.util.android.AndroidToaster;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class LanguageDisclosurePresenter$MetroFactory {
    public final Provider activityFinisher;
    public final DoubleCheck analytics;
    public final DoubleCheck appConfigManager;
    public final DoubleCheck appService;
    public final LambdaProvider ioDispatcher;
    public final Provider launcher;
    public final LambdaProvider localeManager;
    public final DoubleCheck localizationDatabase;
    public final LambdaProvider stringManager;

    public LanguageDisclosurePresenter$MetroFactory(AndroidToaster.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider3) {
        this.activityFinisher = metroFactory;
        this.analytics = doubleCheck;
        this.appConfigManager = doubleCheck2;
        this.appService = doubleCheck3;
        this.ioDispatcher = lambdaProvider;
        this.launcher = metroFactory2;
        this.localeManager = lambdaProvider2;
        this.localizationDatabase = doubleCheck4;
        this.stringManager = lambdaProvider3;
    }

    public LanguageDisclosurePresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck4, InstanceFactory instanceFactory, LambdaProvider lambdaProvider3) {
        this.ioDispatcher = lambdaProvider;
        this.analytics = doubleCheck;
        this.appConfigManager = doubleCheck2;
        this.appService = doubleCheck3;
        this.localeManager = lambdaProvider2;
        this.activityFinisher = metroFactory;
        this.localizationDatabase = doubleCheck4;
        this.launcher = instanceFactory;
        this.stringManager = lambdaProvider3;
    }
}
