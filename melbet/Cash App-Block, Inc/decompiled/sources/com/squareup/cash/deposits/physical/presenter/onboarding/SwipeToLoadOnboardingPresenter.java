package com.squareup.cash.deposits.physical.presenter.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.deposits.physical.screens.SwipeToLoadOnboardingScreen;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.stripe.attestation.TaskExtensionsKt;
import com.withpersona.sdk2.camera.BitmapUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class SwipeToLoadOnboardingPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final SwipeToLoadOnboardingScreen args;
    public final AndroidClock clock;
    public final KeyValue lastViewed;
    public final BetterNavigator.ScreenNavigator navigator;
    public final BooleanPreference physicalDepositViewed;

    public SwipeToLoadOnboardingPresenter(SwipeToLoadOnboardingScreen swipeToLoadOnboardingScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, AndroidClock androidClock, KeyValue keyValue, BooleanPreference booleanPreference) {
        swipeToLoadOnboardingScreen.getClass();
        this.args = swipeToLoadOnboardingScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.clock = androidClock;
        this.lastViewed = keyValue;
        this.physicalDepositViewed = booleanPreference;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        BlockerAction.SubmitAction value;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1427025117);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        String str = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new GooglePayPresenter$models$1$1(this, null, 11);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) null, this, 29));
        SwipeToLoadOnboardingScreen swipeToLoadOnboardingScreen = this.args;
        FormBlocker formBlocker = swipeToLoadOnboardingScreen.blocker;
        List<FormBlocker.Element> list = formBlocker.elements;
        BlockerAction blockerAction = formBlocker.primary_action;
        String str2 = blockerAction != null ? blockerAction.text : null;
        BlockerAction blockerAction2 = formBlocker.secondary_action;
        String str3 = blockerAction2 != null ? blockerAction2.text : null;
        String str4 = formBlocker.disclaimer_text;
        boolean z = formBlocker.help_action != null;
        BlockerAction.Action action = blockerAction != null ? blockerAction.action : null;
        BlockerAction.Action.SubmitAction submitAction = action instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action : null;
        if (submitAction != null && (value = submitAction.getValue()) != null) {
            str = value.id;
        }
        String str5 = str;
        boolean areEqual = Intrinsics.areEqual(formBlocker.requires_full_scroll, Boolean.TRUE);
        FormBlocker.Element.ButtonElement.Style style = formBlocker.secondary_action_style;
        if (style == null) {
            style = FormBlocker.Element.ButtonElement.Style.SECONDARY;
        }
        FormViewModel formViewModel = new FormViewModel(list, true, str2, null, str3, str4, z, str5, null, areEqual, null, null, null, style, null, null, BitmapUtils.toClientScenarioAndFlowToken(swipeToLoadOnboardingScreen), TaskExtensionsKt.toBlockerIdentifiers(swipeToLoadOnboardingScreen), false, null, 841736);
        gapComposer.end(false);
        return formViewModel;
    }
}
