package com.squareup.cash.moneybot.components.plugins;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneybot.backend.api.mappers.clientrenderable.SlottedCardMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlottedCard;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.BriefPresenter;
import com.squareup.cash.moneybot.presenters.plugins.SlottedCardPresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class SlottedCardPlugin extends ClientRenderablePlugin implements HasObservability {
    public final ErrorReporter errorReporter;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final SampleStrategy oneErrorPerAppSessionStrategy;

    public SlottedCardPlugin(SlottedCardPresenter$Factory$Impl slottedCardPresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy, LocalizedMoneyFormatter.Factory factory) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.moneyFormatterFactory = factory;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Modifier containerModifier(Modifier modifier) {
        modifier.getClass();
        return ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f));
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        return new BriefPresenter((SlottedCard) obj, pluginContext, screenNavigator, function2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new CardProduct.Companion(2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        if (component != null) {
            ClientRenderable.Component.SlottedCard slottedCard = component instanceof ClientRenderable.Component.SlottedCard ? (ClientRenderable.Component.SlottedCard) component : null;
            com.squareup.protos.cash.kgoose.api.v3.SlottedCard value = slottedCard != null ? slottedCard.getValue() : null;
            if (value != null) {
                return SlottedCardMappersKt.toSlottedCard$default(this, value, pluginContext.getRequestId(), this.moneyFormatterFactory, pluginContext.getRenderableKey());
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
