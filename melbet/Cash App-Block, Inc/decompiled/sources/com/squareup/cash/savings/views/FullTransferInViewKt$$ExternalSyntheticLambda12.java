package com.squareup.cash.savings.views;

import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class FullTransferInViewKt$$ExternalSyntheticLambda12 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AmountDisplayState f$0;
    public final /* synthetic */ CurrencyCode f$1;
    public final /* synthetic */ AmountPickerViewModel.Ready f$2;
    public final /* synthetic */ RealCashVibrator f$3;
    public final /* synthetic */ Shaker f$4;
    public final /* synthetic */ Function1 f$5;

    public /* synthetic */ FullTransferInViewKt$$ExternalSyntheticLambda12(AmountDisplayState amountDisplayState, CurrencyCode currencyCode, AmountPickerViewModel.Ready ready, RealCashVibrator realCashVibrator, Shaker shaker, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = amountDisplayState;
        this.f$1 = currencyCode;
        this.f$2 = ready;
        this.f$3 = realCashVibrator;
        this.f$4 = shaker;
        this.f$5 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Money money;
        int i = this.$r8$classId;
        Function1 function1 = this.f$5;
        Shaker shaker = this.f$4;
        RealCashVibrator realCashVibrator = this.f$3;
        AmountPickerViewModel.Ready ready = this.f$2;
        CurrencyCode currencyCode = this.f$1;
        AmountDisplayState amountDisplayState = this.f$0;
        switch (i) {
            case 0:
                Money money2 = currencyCode != null ? new Money(Long.valueOf(ButtonGroupKt.getAmountInCents(amountDisplayState.getRawAmount())), currencyCode, 4) : null;
                AmountPickerViewModel.Ready.Amount amount = ready.minAmount;
                AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = amount instanceof AmountPickerViewModel.Ready.Amount.MoneyAmount ? (AmountPickerViewModel.Ready.Amount.MoneyAmount) amount : null;
                money = moneyAmount != null ? moneyAmount.money : null;
                if (money2 == null || (money != null && Moneys.compareTo(money2, money) < 0)) {
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    shaker.shake();
                } else {
                    function1.invoke(new AmountPickerViewEvent$Full$MoneySubmitted(money2));
                }
                break;
            default:
                Money money3 = currencyCode != null ? new Money(Long.valueOf(ButtonGroupKt.getAmountInCents(amountDisplayState.getRawAmount())), currencyCode, 4) : null;
                AmountPickerViewModel.Ready.Amount amount2 = ready.minAmount;
                AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount2 = amount2 instanceof AmountPickerViewModel.Ready.Amount.MoneyAmount ? (AmountPickerViewModel.Ready.Amount.MoneyAmount) amount2 : null;
                money = moneyAmount2 != null ? moneyAmount2.money : null;
                if (money3 == null || (money != null && Moneys.compareTo(money3, money) < 0)) {
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    shaker.shake();
                } else {
                    function1.invoke(new AmountPickerViewEvent$Full$MoneySubmitted(money3));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
