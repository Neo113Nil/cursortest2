package com.squareup.cash.limits.presenters;

import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class LimitsInlineMessagePresenter$MetroFactory {
    public final DoubleCheck appService;
    public final Provider lastSeenPageletVersion;
    public final Provider limitsPageletStore;
    public final Provider routerFactory;

    public LimitsInlineMessagePresenter$MetroFactory(BrazeInitializer.MetroFactory metroFactory, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider) {
        this.limitsPageletStore = metroFactory;
        this.appService = doubleCheck;
        this.routerFactory = metroFactory2;
        this.lastSeenPageletVersion = lambdaProvider;
    }

    public LimitsInlineMessagePresenter$MetroFactory(AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, InstanceFactory instanceFactory, RealMessageSigner.MetroFactory metroFactory, DoubleCheck doubleCheck) {
        this.limitsPageletStore = attestedKeyMetrics$MetroFactory;
        this.routerFactory = instanceFactory;
        this.lastSeenPageletVersion = metroFactory;
        this.appService = doubleCheck;
    }

    public LimitsInlineMessagePresenter$MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck2, RealMessageSigner.MetroFactory metroFactory2) {
        this.limitsPageletStore = doubleCheck;
        this.routerFactory = metroFactory;
        this.appService = doubleCheck2;
        this.lastSeenPageletVersion = metroFactory2;
    }

    public /* synthetic */ LimitsInlineMessagePresenter$MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, Provider provider, Provider provider2) {
        this.appService = doubleCheck;
        this.limitsPageletStore = instanceFactory;
        this.routerFactory = provider;
        this.lastSeenPageletVersion = provider2;
    }
}
