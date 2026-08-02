package com.squareup.cash.blockers.presenters;

import app.cash.local.views.LocalViewFactory;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class BlockerImageUploader$MetroFactory {
    public final DoubleCheck analytics;
    public final Provider blockersNavigator;
    public final LambdaProvider ioDispatcher;
    public final Provider multiBlockerFacilitator;
    public final LambdaProvider stringManager;

    public BlockerImageUploader$MetroFactory(RealBrazeManager.MetroFactory metroFactory, LocalViewFactory.MetroFactory metroFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2) {
        this.blockersNavigator = metroFactory;
        this.multiBlockerFacilitator = metroFactory2;
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.ioDispatcher = lambdaProvider2;
    }

    public BlockerImageUploader$MetroFactory(IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory) {
        this.blockersNavigator = metroFactory;
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider;
        this.ioDispatcher = lambdaProvider2;
        this.multiBlockerFacilitator = instanceFactory;
    }

    public BlockerImageUploader$MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory, RealReferralManager.MetroFactory metroFactory2) {
        this.stringManager = lambdaProvider;
        this.ioDispatcher = lambdaProvider2;
        this.analytics = doubleCheck;
        this.blockersNavigator = metroFactory;
        this.multiBlockerFacilitator = metroFactory2;
    }

    public /* synthetic */ BlockerImageUploader$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, RealKnotLauncher.MetroFactory metroFactory, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, LambdaProvider lambdaProvider2) {
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.blockersNavigator = metroFactory;
        this.multiBlockerFacilitator = broadwayModule$ProvideBroadwayMetroFactory;
        this.ioDispatcher = lambdaProvider2;
    }

    public BlockerImageUploader$MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory) {
        this.analytics = doubleCheck;
        this.blockersNavigator = metroFactory;
        this.stringManager = lambdaProvider;
        this.ioDispatcher = lambdaProvider2;
        this.multiBlockerFacilitator = instanceFactory;
    }

    public BlockerImageUploader$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider;
        this.blockersNavigator = instanceFactory;
        this.ioDispatcher = lambdaProvider2;
        this.multiBlockerFacilitator = musicViewFactory$MetroFactory;
    }

    public BlockerImageUploader$MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, LambdaProvider lambdaProvider2) {
        this.analytics = doubleCheck;
        this.blockersNavigator = instanceFactory;
        this.stringManager = lambdaProvider;
        this.multiBlockerFacilitator = broadwayModule$ProvideBroadwayMetroFactory;
        this.ioDispatcher = lambdaProvider2;
    }
}
