package com.squareup.cash.genericelements.presenters;

import app.cash.broadway.screen.Screen;
import coil3.ComponentRegistry;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.merchant.backend.real.RealThirdPartyOfferAnalyticsFlowProvider;
import com.squareup.workflow1.internal.SubtreeManager;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class RealGenericTreeElementsPresenter$Factory$Impl {
    public final ComponentRegistry.Builder delegateFactory;

    public RealGenericTreeElementsPresenter$Factory$Impl(ComponentRegistry.Builder builder) {
        this.delegateFactory = builder;
    }

    public final SubtreeManager create$1(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        ComponentRegistry.Builder builder = this.delegateFactory;
        RealGenericTreeElementsRepo realGenericTreeElementsRepo = (RealGenericTreeElementsRepo) ((AttestedKeyMetrics$MetroFactory) builder.interceptors).invoke();
        RealClientRouteParser realClientRouteParser = (RealClientRouteParser) ((Provider) builder.mappers).invoke();
        Analytics analytics = (Analytics) ((Provider) builder.keyers).invoke();
        RealThirdPartyOfferAnalyticsFlowProvider realThirdPartyOfferAnalyticsFlowProvider = (RealThirdPartyOfferAnalyticsFlowProvider) ((Provider) builder.lazyFetcherFactories).invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) builder.lazyDecoderFactories).invoke();
        realClientRouteParser.getClass();
        analytics.getClass();
        realThirdPartyOfferAnalyticsFlowProvider.getClass();
        realRouter$Factory$Impl.getClass();
        return new SubtreeManager(realGenericTreeElementsRepo, realClientRouteParser, analytics, realThirdPartyOfferAnalyticsFlowProvider, realRouter$Factory$Impl, screenNavigator, screen);
    }
}
