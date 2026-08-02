package com.squareup.cash.moneybot.components.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.PromptButtonList;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.PromptButtonListPresenter$Factory$Impl;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import kotlin.jvm.functions.Function2;
import string.TrimMode;

/* loaded from: classes.dex */
public final class PromptButtonListPlugin extends ClientRenderablePlugin implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final PromptButtonListPresenter$Factory$Impl presenterFactory;

    public PromptButtonListPlugin(PromptButtonListPresenter$Factory$Impl promptButtonListPresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.presenterFactory = promptButtonListPresenter$Factory$Impl;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        PromptButtonList promptButtonList = (PromptButtonList) obj;
        function2.getClass();
        LoadTimeClock.MetroFactory metroFactory = this.presenterFactory.delegateFactory;
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) metroFactory.clock.invoke();
        AndroidClock androidClock = (AndroidClock) metroFactory.observabilityManager.invoke();
        realMoneybotAnalyticsService.getClass();
        androidClock.getClass();
        return new RealAlertBannerPresenter(realMoneybotAnalyticsService, androidClock, promptButtonList, pluginContext, screenNavigator, function2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new Op.Companion();
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        com.squareup.protos.cash.kgoose.api.v3.PromptButtonList value;
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        ClientRenderable.Component.PromptButtonList promptButtonList = component instanceof ClientRenderable.Component.PromptButtonList ? (ClientRenderable.Component.PromptButtonList) component : null;
        if (promptButtonList != null && (value = promptButtonList.getValue()) != null) {
            PromptButtonList promptButtonList$default = TrimMode.toPromptButtonList$default(this, value, pluginContext.getRequestId());
            if (!promptButtonList$default.getButtons().isEmpty()) {
                return promptButtonList$default;
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
