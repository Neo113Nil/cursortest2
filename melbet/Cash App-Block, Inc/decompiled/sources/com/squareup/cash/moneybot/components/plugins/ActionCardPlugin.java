package com.squareup.cash.moneybot.components.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.mappers.clientrenderable.ActionCardMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.ActionCard;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.ActionCardPresenter;
import com.squareup.cash.moneybot.presenters.plugins.ActionCardPresenter$Factory$Impl;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ActionCardPlugin extends ClientRenderablePlugin implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final ActionCardPresenter$Factory$Impl presenterFactory;

    public ActionCardPlugin(ActionCardPresenter$Factory$Impl actionCardPresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.presenterFactory = actionCardPresenter$Factory$Impl;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.presenterFactory.delegateFactory;
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        Analytics analytics = (Analytics) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        realMoneybotAnalyticsService.getClass();
        analytics.getClass();
        realRouter$Factory$Impl.getClass();
        return new ActionCardPresenter(realMoneybotAnalyticsService, analytics, realRouter$Factory$Impl, (ActionCard) obj, (ActionCard) obj2, pluginContext, screenNavigator, function2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new CardProduct.Companion(1);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        if (component != null) {
            ClientRenderable.Component.ActionCard actionCard = component instanceof ClientRenderable.Component.ActionCard ? (ClientRenderable.Component.ActionCard) component : null;
            com.squareup.protos.cash.kgoose.api.v3.ActionCard value = actionCard != null ? actionCard.getValue() : null;
            if (value != null) {
                return ActionCardMappersKt.toActionCard$default(this, value, pluginContext.getRequestId());
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
