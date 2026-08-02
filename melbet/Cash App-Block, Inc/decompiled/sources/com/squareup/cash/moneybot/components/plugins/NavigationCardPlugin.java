package com.squareup.cash.moneybot.components.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.mappers.clientrenderable.NavigationCardMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.NavigationCard;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter$Factory$Impl;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class NavigationCardPlugin extends ClientRenderablePlugin implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final NavigationCardPresenter$Factory$Impl presenterFactory;

    public NavigationCardPlugin(NavigationCardPresenter$Factory$Impl navigationCardPresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.presenterFactory = navigationCardPresenter$Factory$Impl;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        LoadTimeClock.MetroFactory metroFactory = this.presenterFactory.delegateFactory;
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) metroFactory.clock.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.observabilityManager.invoke();
        realMoneybotAnalyticsService.getClass();
        realRouter$Factory$Impl.getClass();
        return new NavigationCardPresenter(realMoneybotAnalyticsService, realRouter$Factory$Impl, (NavigationCard) obj, pluginContext, screenNavigator);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new Edge.Companion(1);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        if (component != null) {
            ClientRenderable.Component.NavigationCard navigationCard = component instanceof ClientRenderable.Component.NavigationCard ? (ClientRenderable.Component.NavigationCard) component : null;
            com.squareup.protos.cash.kgoose.api.v3.NavigationCard value = navigationCard != null ? navigationCard.getValue() : null;
            if (value != null) {
                return NavigationCardMappersKt.toNavigationCard$default(this, value, pluginContext.getRequestId());
            }
        }
        return null;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }
}
