package com.squareup.cash.checks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.checks.screens.ConfirmFrontOfCheckScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class ConfirmFrontOfCheckPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final ConfirmFrontOfCheckScreen args;
    public final String formattedCheckAmount;
    public final BetterNavigator.ScreenNavigator navigator;

    public ConfirmFrontOfCheckPresenter(LocalizedMoneyFormatter.Factory factory, Analytics analytics, ConfirmFrontOfCheckScreen confirmFrontOfCheckScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        confirmFrontOfCheckScreen.getClass();
        this.analytics = analytics;
        this.args = confirmFrontOfCheckScreen;
        this.navigator = screenNavigator;
        MoneyFormatter create = factory.create(MoneyFormatterConfig.COMPACT);
        Money money = confirmFrontOfCheckScreen.blockersData.amount;
        money.getClass();
        this.formattedCheckAmount = create.format(money);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-303895899);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new TemporaryStorage$getDir$2(this, continuation, 20);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, mutableState, 12));
        CheckDepositBlocker.PhotoCaptureData photoCaptureData = this.args.checkDepositBlocker.photo_capture_data;
        photoCaptureData.getClass();
        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions endorsementInstructions = photoCaptureData.endorsement_instructions;
        endorsementInstructions.getClass();
        CheckDepositBlocker.PhotoCaptureData.EndorsementInstructions.FrontConfirmation frontConfirmation = endorsementInstructions.front_confirmation;
        frontConfirmation.getClass();
        String str = frontConfirmation.title;
        str.getClass();
        String str2 = frontConfirmation.message;
        str2.getClass();
        String str3 = frontConfirmation.amount_template_plain_text;
        str3.getClass();
        String format2 = String.format(str3, Arrays.copyOf(new Object[]{this.formattedCheckAmount}, 1));
        String str4 = frontConfirmation.customer_name_plain_text;
        str4.getClass();
        String str5 = frontConfirmation.verify_checkbox_label;
        str5.getClass();
        String str6 = frontConfirmation.button_title;
        str6.getClass();
        ConfirmFrontOfCheckViewModel confirmFrontOfCheckViewModel = new ConfirmFrontOfCheckViewModel(str, ((Boolean) mutableState.getValue()).booleanValue(), ((Boolean) mutableState.getValue()).booleanValue(), str2, format2, str4, str5, str6);
        gapComposer.end(false);
        return confirmFrontOfCheckViewModel;
    }
}
