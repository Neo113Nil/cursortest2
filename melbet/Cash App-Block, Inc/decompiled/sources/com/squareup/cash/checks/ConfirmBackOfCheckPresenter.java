package com.squareup.cash.checks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.checks.screens.ConfirmBackOfCheckScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class ConfirmBackOfCheckPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final ConfirmBackOfCheckScreen args;
    public final BetterNavigator.ScreenNavigator navigator;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
    }

    public ConfirmBackOfCheckPresenter(Analytics analytics, ConfirmBackOfCheckScreen confirmBackOfCheckScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        confirmBackOfCheckScreen.getClass();
        this.analytics = analytics;
        this.args = confirmBackOfCheckScreen;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1217224863);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new TemporaryStorage$getDir$2(this, continuation, 19);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, mutableState, 11));
        CheckDepositBlocker.PhotoCaptureData photoCaptureData = this.args.checkDepositBlocker.photo_capture_data;
        photoCaptureData.getClass();
        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions endorsementInstructions = photoCaptureData.endorsement_instructions;
        endorsementInstructions.getClass();
        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.BackConfirmation backConfirmation = endorsementInstructions.back_confirmation;
        backConfirmation.getClass();
        String str = backConfirmation.title;
        str.getClass();
        String str2 = backConfirmation.message;
        str2.getClass();
        String str3 = backConfirmation.verify_checkbox_label;
        str3.getClass();
        String str4 = backConfirmation.button_title;
        str4.getClass();
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        String str5 = backConfirmation.combined_signature_endorsement_plain_text;
        str5.getClass();
        ConfirmBackOfCheckViewModel confirmBackOfCheckViewModel = new ConfirmBackOfCheckViewModel(str, str2, str3, str4, booleanValue, str5, ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return confirmBackOfCheckViewModel;
    }
}
