package com.squareup.cash.pools.views;

import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StartPoolAmountKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AmountDisplayKeypadListener f$0;

    public /* synthetic */ StartPoolAmountKt$$ExternalSyntheticLambda8(AmountDisplayKeypadListener amountDisplayKeypadListener, int i) {
        this.$r8$classId = i;
        this.f$0 = amountDisplayKeypadListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AmountDisplayKeypadListener amountDisplayKeypadListener = this.f$0;
        KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
        switch (i) {
            case 0:
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    amountDisplayKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    amountDisplayKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    amountDisplayKeypadListener.onDecimal();
                }
                break;
            case 1:
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    amountDisplayKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    amountDisplayKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    amountDisplayKeypadListener.onDecimal();
                }
                break;
            case 2:
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    amountDisplayKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    amountDisplayKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    amountDisplayKeypadListener.onDecimal();
                }
                break;
            default:
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    amountDisplayKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    amountDisplayKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    amountDisplayKeypadListener.onDecimal();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
