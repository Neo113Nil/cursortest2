package com.squareup.cash.bitcoin.views.exchange;

import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadListener;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes5.dex */
public final class MaxCentsCappedKeypadListener implements KeypadListener {
    public final AmountDisplayKeypadListener delegate;
    public final long maxAmountCents;
    public final PoolDescriptionKt$$ExternalSyntheticLambda4 onInvalid;
    public final AmountDisplayState state;

    public MaxCentsCappedKeypadListener(AmountDisplayKeypadListener amountDisplayKeypadListener, AmountDisplayState amountDisplayState, long j, PoolDescriptionKt$$ExternalSyntheticLambda4 poolDescriptionKt$$ExternalSyntheticLambda4) {
        this.delegate = amountDisplayKeypadListener;
        this.state = amountDisplayState;
        this.maxAmountCents = j;
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
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(this.state.getRawAmount() + i);
        if (doubleOrNull == null || MathKt__MathJVMKt.roundToLong(doubleOrNull.doubleValue() * 100.0d) <= this.maxAmountCents) {
            this.delegate.onDigit(i);
        } else {
            this.onInvalid.invoke();
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onLongBackspace() {
        this.delegate.onLongBackspace();
    }
}
