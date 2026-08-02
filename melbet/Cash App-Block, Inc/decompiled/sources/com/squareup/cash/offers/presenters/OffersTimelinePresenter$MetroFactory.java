package com.squareup.cash.offers.presenters;

import com.squareup.cash.aiedge.MLKitTitleGenerator$MetroFactory;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.retro.views.RetroUiFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class OffersTimelinePresenter$MetroFactory {
    public final Provider analyticsFactory;
    public final DoubleCheck analyticsHelper;
    public final LambdaProvider clock;
    public final DoubleCheck flowStarter;
    public final Provider flowTokenGenerator;
    public final LambdaProvider observabilityManager;
    public final Provider offersSheetRepository;
    public final Provider routerFactory;
    public final Provider spanManager;
    public final LambdaProvider stringManager;
    public final LambdaProvider uuidGenerator;

    public OffersTimelinePresenter$MetroFactory(RealSessionFlags.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealFlowTokenGenerator.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider4, InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
        this.offersSheetRepository = metroFactory;
        this.analyticsHelper = doubleCheck;
        this.stringManager = lambdaProvider;
        this.flowTokenGenerator = metroFactory2;
        this.observabilityManager = lambdaProvider2;
        this.spanManager = musicViewFactory$MetroFactory;
        this.clock = lambdaProvider3;
        this.flowStarter = doubleCheck2;
        this.uuidGenerator = lambdaProvider4;
        this.routerFactory = instanceFactory;
        this.analyticsFactory = instanceFactory2;
    }

    public OffersTimelinePresenter$MetroFactory(RetroUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, MLKitTitleGenerator$MetroFactory mLKitTitleGenerator$MetroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, RealMessageSigner.MetroFactory metroFactory2, LambdaProvider lambdaProvider4) {
        this.offersSheetRepository = metroFactory;
        this.stringManager = lambdaProvider;
        this.flowTokenGenerator = instanceFactory;
        this.analyticsHelper = doubleCheck;
        this.observabilityManager = lambdaProvider2;
        this.spanManager = mLKitTitleGenerator$MetroFactory;
        this.flowStarter = doubleCheck2;
        this.clock = lambdaProvider3;
        this.routerFactory = musicViewFactory$MetroFactory;
        this.analyticsFactory = metroFactory2;
        this.uuidGenerator = lambdaProvider4;
    }
}
