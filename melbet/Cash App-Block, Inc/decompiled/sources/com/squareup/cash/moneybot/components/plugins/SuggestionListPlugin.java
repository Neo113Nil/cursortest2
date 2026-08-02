package com.squareup.cash.moneybot.components.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.clientrouting.LiteClientRouteRouter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.mappers.PromptSuggestionMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.PromptSuggestion;
import com.squareup.cash.moneybot.backend.api.model.chat.PromptSuggestions;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.SuggestionListPresenter$Factory$Impl;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.protos.cash.kgoose.api.v3.Suggestion;
import com.squareup.protos.cash.kgoose.api.v3.SuggestionList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class SuggestionListPlugin extends ClientRenderablePlugin implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final SuggestionListPresenter$Factory$Impl presenterFactory;

    public SuggestionListPlugin(SuggestionListPresenter$Factory$Impl suggestionListPresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.presenterFactory = suggestionListPresenter$Factory$Impl;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        PromptSuggestions promptSuggestions = (PromptSuggestions) obj;
        function2.getClass();
        LiteClientRouteRouter.MetroFactory metroFactory = this.presenterFactory.delegateFactory;
        metroFactory.getClass();
        ChatManager chatManager = (ChatManager) metroFactory.allowlistProvider.invoke();
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) metroFactory.errorReporter.invoke();
        AndroidClock androidClock = (AndroidClock) metroFactory.stringManager.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.wrappedFactory.value;
        chatManager.getClass();
        realMoneybotAnalyticsService.getClass();
        androidClock.getClass();
        coroutineScope.getClass();
        return new EarningsHeaderPresenter(chatManager, realMoneybotAnalyticsService, androidClock, coroutineScope, promptSuggestions, pluginContext, screenNavigator, function2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new Error.Code.Companion(2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        if (component != null) {
            ClientRenderable.Component.SuggestionList suggestionList = component instanceof ClientRenderable.Component.SuggestionList ? (ClientRenderable.Component.SuggestionList) component : null;
            SuggestionList value = suggestionList != null ? suggestionList.getValue() : null;
            if (value != null) {
                List<Suggestion> list = value.suggestions;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    PromptSuggestion promptSuggestion = PromptSuggestionMappersKt.toPromptSuggestion(this, (Suggestion) it.next());
                    if (promptSuggestion != null) {
                        arrayList.add(promptSuggestion);
                    }
                }
                return new PromptSuggestions(value.suggestions_id, arrayList);
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
