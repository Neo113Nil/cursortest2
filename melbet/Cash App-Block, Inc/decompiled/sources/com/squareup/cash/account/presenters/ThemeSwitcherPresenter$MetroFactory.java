package com.squareup.cash.account.presenters;

import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.UiSandboxedSetupTeardowns;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.keystore.RealMessageSigner;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class ThemeSwitcherPresenter$MetroFactory {
    public final DoubleCheck analytics;
    public final DoubleCheck featureFlagManager;
    public final Provider paymentPadThemeSelection;
    public final DoubleCheck postcardService;
    public final Provider routerFactory;
    public final LambdaProvider stringManager;

    public ThemeSwitcherPresenter$MetroFactory(RealPasscodeFlowStarter.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, InstanceFactory instanceFactory) {
        this.paymentPadThemeSelection = metroFactory;
        this.analytics = doubleCheck;
        this.postcardService = doubleCheck2;
        this.stringManager = lambdaProvider;
        this.featureFlagManager = doubleCheck3;
        this.routerFactory = instanceFactory;
    }

    public ThemeSwitcherPresenter$MetroFactory(UiSandboxedSetupTeardowns.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3) {
        this.paymentPadThemeSelection = metroFactory;
        this.routerFactory = metroFactory2;
        this.analytics = doubleCheck;
        this.postcardService = doubleCheck2;
        this.stringManager = lambdaProvider;
        this.featureFlagManager = doubleCheck3;
    }

    public ThemeSwitcherPresenter$MetroFactory(RealClipboardManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory) {
        this.paymentPadThemeSelection = metroFactory;
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.postcardService = doubleCheck2;
        this.featureFlagManager = doubleCheck3;
        this.routerFactory = instanceFactory;
    }

    public ThemeSwitcherPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, TemporaryStorage.MetroFactory metroFactory2) {
        this.analytics = doubleCheck;
        this.postcardService = doubleCheck2;
        this.paymentPadThemeSelection = metroFactory;
        this.featureFlagManager = doubleCheck3;
        this.stringManager = lambdaProvider;
        this.routerFactory = metroFactory2;
    }

    public ThemeSwitcherPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, InstanceFactory instanceFactory) {
        this.analytics = doubleCheck;
        this.postcardService = doubleCheck2;
        this.featureFlagManager = doubleCheck3;
        this.stringManager = lambdaProvider;
        this.paymentPadThemeSelection = metroFactory;
        this.routerFactory = instanceFactory;
    }
}
