package com.squareup.cash.moneybot.components.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TextCard;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.BriefPresenter;
import com.squareup.cash.moneybot.presenters.plugins.TextCardPresenter$Factory$Impl;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class TextCardPlugin extends ClientRenderablePlugin implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;

    public TextCardPlugin(TextCardPresenter$Factory$Impl textCardPresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        return new BriefPresenter((TextCard) obj, pluginContext, screenNavigator, function2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new Edge.Companion(2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        if (component != null) {
            ClientRenderable.Component.TextCard textCard = component instanceof ClientRenderable.Component.TextCard ? (ClientRenderable.Component.TextCard) component : null;
            com.squareup.protos.cash.kgoose.api.v3.TextCard value = textCard != null ? textCard.getValue() : null;
            if (value != null) {
                return Aliases.toTextCard$default(this, value, pluginContext.getRequestId());
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
