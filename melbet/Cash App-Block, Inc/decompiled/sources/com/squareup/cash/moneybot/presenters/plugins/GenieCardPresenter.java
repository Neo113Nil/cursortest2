package com.squareup.cash.moneybot.presenters.plugins;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.viewmodels.plugins.GenieCardViewModel;
import com.squareup.protos.cash.kgoose.api.v3.GenieCard;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xyz.block.protos.genie.KeyValueMap;

/* loaded from: classes6.dex */
public final class GenieCardPresenter implements MoleculeCallbackPresenter {
    public final GenieCard metadata;
    public final Function2 onMessage;
    public final EglCore sceneLoader;

    public GenieCardPresenter(EglCore eglCore, GenieCard genieCard, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.sceneLoader = eglCore;
        this.metadata = genieCard;
        this.onMessage = function2;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2032447150);
        GenieCard genieCard = this.metadata;
        String str = genieCard.scene_slug;
        GenieCard.SceneInputs sceneInputs = genieCard.scene_inputs;
        KeyValueMap keyValueMap = sceneInputs != null ? sceneInputs.inputs : null;
        boolean changed = gapComposer.changed(str) | gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new AnimationsKt$takeUntil$1$1(str, this, (Continuation) null, 23);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState produceState = Updater.produceState(gapComposer, GenieCardViewModel.Content.Loading.INSTANCE, (Function2) rememberedValue);
        LocalizedString localizedString = genieCard.fallback_text;
        String str2 = localizedString != null ? localizedString.translated_value : null;
        if (str2 == null) {
            str2 = "";
        }
        GenieCardViewModel genieCardViewModel = new GenieCardViewModel(str2, (GenieCardViewModel.Content) produceState.getValue(), keyValueMap);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda13(24);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue2, genieCardViewModel);
        gapComposer.end(false);
        return uiCallbackModel;
    }
}
