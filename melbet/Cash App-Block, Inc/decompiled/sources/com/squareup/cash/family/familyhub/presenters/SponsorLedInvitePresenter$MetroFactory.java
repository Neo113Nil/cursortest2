package com.squareup.cash.family.familyhub.presenters;

import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class SponsorLedInvitePresenter$MetroFactory {
    public final Provider customerStore;
    public final LambdaProvider errorReporter;
    public final Provider oneErrorPerAppSessionStrategy;
    public final Provider routerFactory;
    public final LambdaProvider stringManager;

    public SponsorLedInvitePresenter$MetroFactory(LambdaProvider lambdaProvider, RetroUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, InstanceFactory instanceFactory) {
        this.stringManager = lambdaProvider;
        this.customerStore = metroFactory;
        this.errorReporter = lambdaProvider2;
        this.oneErrorPerAppSessionStrategy = musicViewFactory$MetroFactory;
        this.routerFactory = instanceFactory;
    }

    public SponsorLedInvitePresenter$MetroFactory(LambdaProvider lambdaProvider, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, InstanceFactory instanceFactory, NavigationSideEffects.MetroFactory metroFactory, LambdaProvider lambdaProvider2) {
        this.stringManager = lambdaProvider;
        this.customerStore = broadwayModule$ProvideBroadwayMetroFactory;
        this.oneErrorPerAppSessionStrategy = instanceFactory;
        this.routerFactory = metroFactory;
        this.errorReporter = lambdaProvider2;
    }
}
