package com.squareup.cash.stablecoin.presenters.nullstate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.R;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.preferences.KeyValue;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RealStablecoinNullStateCarouselPresenter implements MoleculeCallbackPresenter {
    public final Analytics analytics;
    public final KeyValue onboardedValue;
    public final List pages;
    public final AndroidStringManager stringManager;
    public boolean userPressedCTA;
    public final LinkedHashSet viewedPages = new LinkedHashSet();

    public RealStablecoinNullStateCarouselPresenter(AndroidStringManager androidStringManager, Analytics analytics, KeyValue keyValue) {
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.onboardedValue = keyValue;
        this.pages = CollectionsKt__CollectionsKt.listOf((Object[]) new UiGroupViewModel[]{buildPage(0, androidStringManager.get(R.string.stablecoin_null_state_carousel_page_one_title), androidStringManager.get(R.string.stablecoin_null_state_carousel_page_one_body)), buildPage(1, androidStringManager.get(R.string.stablecoin_null_state_carousel_page_two_title), androidStringManager.get(R.string.stablecoin_null_state_carousel_page_two_body)), buildPage(2, androidStringManager.get(R.string.stablecoin_null_state_carousel_page_three_title), androidStringManager.get(R.string.stablecoin_null_state_carousel_page_three_body))});
    }

    public static UiGroupViewModel buildPage(int i, String str, String str2) {
        return new UiGroupViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new UiGroupElementViewModel[]{new UiGroupElementViewModel.DrawableViewModel(), new UiGroupElementViewModel.TextViewModel(str, UiGroupElementViewModel.TextStyle.HEADLINE), new UiGroupElementViewModel.SpaceViewModel(), new UiGroupElementViewModel.TextViewModel(str2, UiGroupElementViewModel.TextStyle.SUBTITLE)}), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(730033457);
        Object rememberedValue = gapComposer.rememberedValue();
        KeyValue keyValue = this.onboardedValue;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = keyValue.observe();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, keyValue.blockingGet(), null, gapComposer, 0, 2);
        NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content = null;
        Object[] objArr = 0;
        if (((Boolean) collectAsState.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-1287361935);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1287465723);
            Unit unit = Unit.INSTANCE;
            boolean changed = gapComposer.changed(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ChatInputView$Content$1$1$1(this, objArr == true ? 1 : 0, 11);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            gapComposer.end(false);
        }
        Unit unit2 = Unit.INSTANCE;
        boolean changed2 = gapComposer.changed(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new RealSandboxer$$ExternalSyntheticLambda0(this, 19);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.DisposableEffect(unit2, (Function1) rememberedValue3, gapComposer);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Integer.valueOf(R.string.stablecoin_next_button_label));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        if (!((Boolean) collectAsState.getValue()).booleanValue()) {
            String str = this.stringManager.get(((Number) mutableState.getValue()).intValue());
            UiGroupElementViewModel.ButtonStyle buttonStyle = UiGroupElementViewModel.ButtonStyle.PRIMARY;
            nullStateViewModel$SwipeViewModel$Content = new NullStateViewModel$SwipeViewModel$Content(this.pages, new UiGroupElementViewModel.ButtonViewModel(str));
        }
        boolean changed3 = gapComposer.changed(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new BottomSheet$$ExternalSyntheticLambda3(8, this, mutableState);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue5, nullStateViewModel$SwipeViewModel$Content);
        gapComposer.end(false);
        return uiCallbackModel;
    }
}
