package com.squareup.cash.moneybot.components.api;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes.dex */
public abstract class ClientRenderablePlugin {
    public final void RenderContent(UiCallbackModel uiCallbackModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-387386498);
        int i2 = (gapComposer.changed(uiCallbackModel) ? 4 : 2) | i | (gapComposer.changed(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ClientRenderableUi createUi = createUi();
            Object model = uiCallbackModel.getModel();
            model.getClass();
            Function1 onEvent = uiCallbackModel.getOnEvent();
            onEvent.getClass();
            TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, onEvent);
            createUi.Content(model, onEvent, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(this, uiCallbackModel, i, 26);
        }
    }

    public Modifier containerModifier(Modifier modifier) {
        modifier.getClass();
        return modifier;
    }

    public abstract MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2);

    public abstract ClientRenderableUi createUi();

    public abstract Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext);

    public final UiCallbackModel rememberCallbackModel(ClientRenderable clientRenderable, ClientRenderable clientRenderable2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, MoneybotChatPresenter$$ExternalSyntheticLambda0 moneybotChatPresenter$$ExternalSyntheticLambda0, Function1 function1, GapComposer gapComposer, int i) {
        Function2 function2;
        Object extractMetadata;
        clientRenderable.getClass();
        gapComposer.startReplaceGroup(-1527400104);
        int i2 = i & 16;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (i2 != 0) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            function2 = (Function2) rememberedValue;
        } else {
            function2 = moneybotChatPresenter$$ExternalSyntheticLambda0;
        }
        boolean changed = gapComposer.changed(clientRenderable) | gapComposer.changed(pluginContext);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            try {
                rememberedValue2 = extractMetadata(clientRenderable, pluginContext);
            } catch (Exception e) {
                function1.invoke(e);
                rememberedValue2 = null;
            }
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Object obj = rememberedValue2;
        if (obj == null) {
            gapComposer.end(false);
            return null;
        }
        boolean changed2 = gapComposer.changed(clientRenderable2) | gapComposer.changed(pluginContext);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == neverEqualPolicy) {
            if (clientRenderable2 != null) {
                try {
                    extractMetadata = extractMetadata(clientRenderable2, pluginContext);
                } catch (Exception e2) {
                    function1.invoke(e2);
                    rememberedValue3 = null;
                }
            } else {
                extractMetadata = null;
            }
            rememberedValue3 = extractMetadata;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Object obj2 = rememberedValue3;
        boolean changed3 = gapComposer.changed(obj) | gapComposer.changed(obj2) | gapComposer.changed(pluginContext);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue4 == neverEqualPolicy) {
            try {
                rememberedValue4 = createPresenter(obj, obj2, pluginContext, screenNavigator, function2);
            } catch (Exception e3) {
                function1.invoke(e3);
                rememberedValue4 = null;
            }
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MoleculeCallbackPresenter moleculeCallbackPresenter = (MoleculeCallbackPresenter) rememberedValue4;
        if (moleculeCallbackPresenter == null) {
            gapComposer.end(false);
            return null;
        }
        UiCallbackModel models = moleculeCallbackPresenter.models(gapComposer);
        gapComposer.end(false);
        return models;
    }
}
