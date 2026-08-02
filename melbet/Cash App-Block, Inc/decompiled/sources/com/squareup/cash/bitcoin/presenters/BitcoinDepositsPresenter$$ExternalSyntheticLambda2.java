package com.squareup.cash.bitcoin.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerQuestion;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationResult;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.InstrumentSelection;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class BitcoinDepositsPresenter$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ BitcoinDepositsPresenter$$ExternalSyntheticLambda2(MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InstrumentSelection instrumentSelection;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        MutableState mutableState2 = this.f$0;
        switch (i) {
            case 0:
                BitcoinAmountPickerResult bitcoinAmountPickerResult = (BitcoinAmountPickerResult) obj2;
                ((BitcoinAmountPickerQuestion) obj).getClass();
                if (bitcoinAmountPickerResult != null && !bitcoinAmountPickerResult.equals((BitcoinAmountPickerResult) mutableState2.getValue())) {
                    Money money = bitcoinAmountPickerResult.userInputtedAmount;
                    if (money == null || money.currency_code == CurrencyCode.BTC) {
                        money = null;
                    }
                    Money money2 = bitcoinAmountPickerResult.bitcoinAmount;
                    String str = bitcoinAmountPickerResult.note;
                    money2.getClass();
                    mutableState2.setValue(new BitcoinAmountPickerResult(money2, money, str));
                    mutableState.setValue(null);
                }
                return Unit.INSTANCE;
            case 1:
                PaymentScreens.SchedulePayment.SchedulePaymentAnswer schedulePaymentAnswer = (PaymentScreens.SchedulePayment.SchedulePaymentAnswer) obj2;
                ((PaymentScreens.SchedulePayment.SchedulePaymentQuestion) obj).getClass();
                if (schedulePaymentAnswer instanceof PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Selected) {
                    InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = ((PaymentRouterData) mutableState2.getValue()).instrumentRowModel;
                    mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, Intrinsics.areEqual((instrumentSelectionRowViewModel == null || (instrumentSelection = instrumentSelectionRowViewModel.instrumentSelection) == null) ? null : instrumentSelection.instrument_token, "GOOGLE_PAY") ? null : ((PaymentRouterData) mutableState2.getValue()).instrumentRowModel, null, false, null, false, false, null, null, null, null, ((PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Selected) schedulePaymentAnswer).selection, null, false, 14679807));
                    InstrumentSelection instrumentSelection2 = (InstrumentSelection) mutableState.getValue();
                    if (Intrinsics.areEqual(instrumentSelection2 != null ? instrumentSelection2.instrument_token : null, "GOOGLE_PAY")) {
                        mutableState.setValue(null);
                    }
                } else if (Intrinsics.areEqual(schedulePaymentAnswer, PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Cleared.INSTANCE)) {
                    mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 14680063));
                } else if (schedulePaymentAnswer != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            default:
                RecurringReloadConfigurationResult recurringReloadConfigurationResult = (RecurringReloadConfigurationResult) obj2;
                ((RecurringReloadConfigurationQuestion) obj).getClass();
                if (recurringReloadConfigurationResult instanceof RecurringReloadConfigurationResult.BalanceBasedReloadResult) {
                    RecurringReloadConfigurationResult.BalanceBasedReloadResult balanceBasedReloadResult = (RecurringReloadConfigurationResult.BalanceBasedReloadResult) recurringReloadConfigurationResult;
                    mutableState2.setValue(balanceBasedReloadResult.minBalance);
                    mutableState.setValue(balanceBasedReloadResult.reloadAmount);
                } else if (!(recurringReloadConfigurationResult instanceof RecurringReloadConfigurationResult.ScheduledReloadResult) && recurringReloadConfigurationResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
        }
    }
}
