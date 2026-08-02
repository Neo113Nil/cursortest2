package com.squareup.cash.savings.views;

import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadListener;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes7.dex */
public final class MaxCentsCappedKeypadListener implements KeypadListener {
    public final AmountDisplayKeypadListener delegate;
    public final Long maxAmountCents;
    public final Function0 onInvalid;
    public final AmountDisplayState state;

    public MaxCentsCappedKeypadListener(AmountDisplayKeypadListener amountDisplayKeypadListener, AmountDisplayState amountDisplayState, Long l, Function0 function0) {
        this.delegate = amountDisplayKeypadListener;
        this.state = amountDisplayState;
        this.maxAmountCents = l;
        this.onInvalid = function0;
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
        Long l = this.maxAmountCents;
        if (l != null) {
            String str = this.state.getRawAmount() + i;
            long longValue = l.longValue();
            Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
            if (doubleOrNull != null && MathKt__MathJVMKt.roundToLong(doubleOrNull.doubleValue() * 100.0d) > longValue) {
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
