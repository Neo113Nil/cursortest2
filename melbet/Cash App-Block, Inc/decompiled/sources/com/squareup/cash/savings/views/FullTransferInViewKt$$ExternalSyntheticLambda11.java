package com.squareup.cash.savings.views;

import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class FullTransferInViewKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaxCentsCappedKeypadListener f$0;

    public /* synthetic */ FullTransferInViewKt$$ExternalSyntheticLambda11(MaxCentsCappedKeypadListener maxCentsCappedKeypadListener, int i) {
        this.$r8$classId = i;
        this.f$0 = maxCentsCappedKeypadListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MaxCentsCappedKeypadListener maxCentsCappedKeypadListener = this.f$0;
        KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
        switch (i) {
            case 0:
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    maxCentsCappedKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    maxCentsCappedKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    maxCentsCappedKeypadListener.onDecimal();
                }
                break;
            default:
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    maxCentsCappedKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    maxCentsCappedKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    maxCentsCappedKeypadListener.onDecimal();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
