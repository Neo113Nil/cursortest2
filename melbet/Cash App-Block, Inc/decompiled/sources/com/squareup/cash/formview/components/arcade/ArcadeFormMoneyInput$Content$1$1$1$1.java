package com.squareup.cash.formview.components.arcade;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.R;
import com.squareup.cash.formview.presenters.FormMoneyInputPresenter;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.FormMoneyInputViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ArcadeFormMoneyInput$Content$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $helperText$delegate;
    public final /* synthetic */ MutableState $value$delegate;
    public final /* synthetic */ ArcadeFormMoneyInput this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormMoneyInput$Content$1$1$1$1(ArcadeFormMoneyInput arcadeFormMoneyInput, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = arcadeFormMoneyInput;
        this.$value$delegate = mutableState;
        this.$helperText$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ArcadeFormMoneyInput$Content$1$1$1$1(this.this$0, this.$value$delegate, this.$helperText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ArcadeFormMoneyInput$Content$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        ArcadeFormMoneyInput arcadeFormMoneyInput = this.this$0;
        FormBlocker.Element.MoneyInputElement.DenominationOption denominationOption = arcadeFormMoneyInput.denominationOption;
        FormBlocker.Element.MoneyInputElement.DenominationOption denominationOption2 = FormBlocker.Element.MoneyInputElement.DenominationOption.CENTS;
        MutableState mutableState = this.$value$delegate;
        String m$1 = denominationOption == denominationOption2 ? Recorder$$ExternalSyntheticOutline2.m$1(arcadeFormMoneyInput.fractionalValuePrefix, (String) mutableState.getValue()) : (String) mutableState.getValue();
        FormMoneyInputPresenter formMoneyInputPresenter = arcadeFormMoneyInput.presenter;
        MoneyFormatter moneyFormatter = formMoneyInputPresenter.moneyFormatter;
        CurrencyCode currencyCode = formMoneyInputPresenter.currencyCode;
        Resources resources = formMoneyInputPresenter.stringManager.resources;
        Money money = formMoneyInputPresenter.maxAmount;
        Money money2 = formMoneyInputPresenter.minAmount;
        m$1.getClass();
        String str = null;
        Money parseMoneyFromString$default = !StringsKt.isBlank(m$1) ? Moneys.parseMoneyFromString$default(m$1, currencyCode) : null;
        boolean z = false;
        if ((!StringsKt.isBlank(m$1) || formMoneyInputPresenter.isOptional) && ((money2 == null || Moneys.compareTo(parseMoneyFromString$default, money2) >= 0) && (money == null || Moneys.compareTo(parseMoneyFromString$default, money) <= 0))) {
            z = true;
        }
        Money money3 = new Money((Long) 1L, currencyCode, 4);
        if (!StringsKt.isBlank(m$1) && formMoneyInputPresenter.showErrorMessage) {
            if (money2 != null && Moneys.compareTo(parseMoneyFromString$default, money2) < 0) {
                String format2 = moneyFormatter.format(Moneys.minus(money2, money3));
                format2.getClass();
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.money_input_error_out_of_lower_bound)).format(new Object[]{format2});
                str.getClass();
            } else if (money != null && Moneys.compareTo(parseMoneyFromString$default, money) > 0) {
                String format3 = moneyFormatter.format(Moneys.plus(money, money3));
                format3.getClass();
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.money_input_error_out_of_upper_bound)).format(new Object[]{format3});
                str.getClass();
            }
        }
        FormMoneyInputViewModel formMoneyInputViewModel = new FormMoneyInputViewModel(parseMoneyFromString$default, str, z);
        arcadeFormMoneyInput.onEvent.invoke(new FormViewEvent.UpdateResultEvent.MoneyInputChanged(arcadeFormMoneyInput.formElementId, new SubmitFormRequest.ElementResult.MoneyInputResult(parseMoneyFromString$default, ByteString.EMPTY)));
        this.$helperText$delegate.setValue(str);
        return formMoneyInputViewModel;
    }
}
