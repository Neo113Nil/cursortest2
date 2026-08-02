package com.squareup.cash.amountslider;

import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadListener;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes5.dex */
public final class CappedKeypadListener implements KeypadListener {
    public final AmountConfig amountConfig;
    public final AmountDisplayKeypadListener delegate;
    public final AmountPickerViewModel.Ready.Amount maxAmount;
    public final PoolDescriptionKt$$ExternalSyntheticLambda4 onInvalid;
    public final AmountDisplayState state;

    public CappedKeypadListener(AmountDisplayKeypadListener amountDisplayKeypadListener, AmountDisplayState amountDisplayState, AmountConfig amountConfig, AmountPickerViewModel.Ready.Amount amount, PoolDescriptionKt$$ExternalSyntheticLambda4 poolDescriptionKt$$ExternalSyntheticLambda4) {
        amountConfig.getClass();
        this.delegate = amountDisplayKeypadListener;
        this.state = amountDisplayState;
        this.amountConfig = amountConfig;
        this.maxAmount = amount;
        this.onInvalid = poolDescriptionKt$$ExternalSyntheticLambda4;
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onBackspace() {
        this.delegate.onBackspace();
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onDecimal() {
        this.delegate.onDecimal();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (kotlin.math.MathKt__MathJVMKt.roundToLong(r0.doubleValue() * 100.0d) > r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r7.onInvalid.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r0.compareTo(r1) <= 0) goto L30;
     */
    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDigit(int i) {
        Money money;
        Long l;
        String str = this.state.getRawAmount() + i;
        AmountConfig amountConfig = this.amountConfig;
        boolean z = amountConfig instanceof AmountConfig.MoneyConfig;
        AmountPickerViewModel.Ready.Amount amount = this.maxAmount;
        if (z) {
            AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = amount instanceof AmountPickerViewModel.Ready.Amount.MoneyAmount ? (AmountPickerViewModel.Ready.Amount.MoneyAmount) amount : null;
            if (moneyAmount != null && (money = moneyAmount.money) != null && (l = money.amount) != null) {
                long longValue = l.longValue();
                Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
                if (doubleOrNull != null) {
                }
            }
            this.delegate.onDigit(i);
        }
        if (!(amountConfig instanceof AmountConfig.PercentConfig)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AmountPickerViewModel.Ready.Amount.PercentAmount percentAmount = amount instanceof AmountPickerViewModel.Ready.Amount.PercentAmount ? (AmountPickerViewModel.Ready.Amount.PercentAmount) amount : null;
        if (percentAmount != null) {
            BigDecimal bigDecimal = percentAmount.percent;
            BigDecimal bigDecimalOrNull = StringsKt__StringNumberConversionsJVMKt.toBigDecimalOrNull(str);
            if (bigDecimalOrNull != null) {
            }
        }
        this.delegate.onDigit(i);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onLongBackspace() {
        this.delegate.onLongBackspace();
    }
}
