package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$31;
import com.squareup.cash.formview.components.IndividualFormRequirementProvider;
import com.squareup.cash.formview.presenters.FormMoneyInputPresenter;
import com.squareup.cash.formview.viewmodels.FormMoneyInputViewModel;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.FractionalMoneyScrubber;
import com.squareup.cash.scrubbing.InsertingScrubber;
import com.squareup.cash.scrubbing.MoneyScrubber;
import com.squareup.cash.scrubbing.WholeMoneyScrubber;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class ArcadeFormMoneyInput extends AbstractComposeView implements IndividualFormRequirementProvider {
    public final CurrencyConfig currencyConfig;
    public final FormBlocker.Element.MoneyInputElement.DenominationOption denominationOption;
    public final FormBlocker.Element.MoneyInputElement element;
    public final String formElementId;
    public final String fractionalValuePrefix;
    public final CoroutineContext ioDispatcher;
    public final StateFlowImpl models;
    public final MoneyFormatter moneyFormatter;
    public final FormElementViewBuilder$toView$31 onEvent;
    public final FormMoneyInputPresenter presenter;
    public final InsertingScrubber scrubber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormMoneyInput(Context context, FormBlocker.Element.MoneyInputElement moneyInputElement, FormElementViewBuilder$toView$31 formElementViewBuilder$toView$31, MoneyFormatter moneyFormatter, String str, AndroidStringManager androidStringManager, CoroutineContext coroutineContext) {
        super(context, null, 6, 0);
        FormBlocker.Element.MoneyInputElement.DenominationOption denominationOption;
        context.getClass();
        moneyFormatter.getClass();
        this.element = moneyInputElement;
        this.onEvent = formElementViewBuilder$toView$31;
        this.moneyFormatter = moneyFormatter;
        this.formElementId = str;
        this.ioDispatcher = coroutineContext;
        this.presenter = new FormMoneyInputPresenter(moneyInputElement, androidStringManager, moneyFormatter);
        this.models = FlowKt.MutableStateFlow(new FormMoneyInputViewModel(null, null, false));
        CurrencyCode currencyCode = moneyInputElement.currency_code;
        currencyCode.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        CurrencyConfig currencyConfig = CurrencyConfig.Companion.toCurrencyConfig(currencyCode, locale);
        this.currencyConfig = currencyConfig;
        Boolean bool = moneyInputElement.fractional_values_only;
        if (bool != null ? bool.booleanValue() : false) {
            denominationOption = FormBlocker.Element.MoneyInputElement.DenominationOption.CENTS;
        } else {
            Boolean bool2 = moneyInputElement.disable_decimal;
            denominationOption = bool2 != null ? bool2.booleanValue() : false ? FormBlocker.Element.MoneyInputElement.DenominationOption.DOLLARS : FormBlocker.Element.MoneyInputElement.DenominationOption.DOLLARS_AND_CENTS;
        }
        FormBlocker.Element.MoneyInputElement.DenominationOption denominationOption2 = moneyInputElement.denomination_option;
        denominationOption = denominationOption2 != null ? denominationOption2 : denominationOption;
        this.denominationOption = denominationOption;
        CurrencyCode currencyCode2 = moneyInputElement.currency_code;
        currencyCode2.getClass();
        this.fractionalValuePrefix = Moneys.symbol(currencyCode2) + "0" + currencyConfig.decimalSeparator;
        this.scrubber = (denominationOption == FormBlocker.Element.MoneyInputElement.DenominationOption.CENTS && currencyConfig.usesDecimalSeparator) ? new FractionalMoneyScrubber(currencyConfig) : denominationOption == FormBlocker.Element.MoneyInputElement.DenominationOption.DOLLARS ? new WholeMoneyScrubber(currencyConfig) : new MoneyScrubber(currencyConfig, (Integer) null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(432421604);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(918772793, new ArcadeFormMoneyInput$$ExternalSyntheticLambda0(this, b, b), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormMoneyInput$$ExternalSyntheticLambda0(this, i);
        }
    }

    @Override // com.squareup.cash.formview.components.IndividualFormRequirementProvider
    public final Flow isRequirementFulfilled() {
        return FlowKt.distinctUntilChanged(new RealGooglePayer$createWallet$$inlined$filter$1(this.models, 24));
    }
}
