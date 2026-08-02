package com.squareup.cash.paychecks.views;

import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadListener;
import java.math.BigDecimal;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes6.dex */
public final class MaxPercentCappedKeypadListener implements KeypadListener {
    public final AmountDisplayKeypadListener delegate;
    public final BigDecimal maxPercent;
    public final PoolDescriptionKt$$ExternalSyntheticLambda4 onInvalid;
    public final AmountDisplayState state;

    public MaxPercentCappedKeypadListener(AmountDisplayKeypadListener amountDisplayKeypadListener, AmountDisplayState amountDisplayState, BigDecimal bigDecimal, PoolDescriptionKt$$ExternalSyntheticLambda4 poolDescriptionKt$$ExternalSyntheticLambda4) {
        this.delegate = amountDisplayKeypadListener;
        this.state = amountDisplayState;
        this.maxPercent = bigDecimal;
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

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onDigit(int i) {
        BigDecimal bigDecimal = this.maxPercent;
        if (bigDecimal != null) {
            BigDecimal bigDecimalOrNull = StringsKt__StringNumberConversionsJVMKt.toBigDecimalOrNull(this.state.getRawAmount() + i);
            if (bigDecimalOrNull != null && bigDecimalOrNull.compareTo(bigDecimal) > 0) {
                this.onInvalid.invoke();
                return;
            }
        }
        this.delegate.onDigit(i);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onLongBackspace() {
        this.delegate.onLongBackspace();
    }
}
