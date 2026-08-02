package com.squareup.cash.payments.views;

import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.QuickPayViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1 implements Function0 {
    public final /* synthetic */ DelegatingSoftwareKeyboardController $keyboardController;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, int i) {
        this.$r8$classId = i;
        this.$keyboardController = delegatingSoftwareKeyboardController;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        QuickPayViewEvent.PersonalizePaymentClick personalizePaymentClick = QuickPayViewEvent.PersonalizePaymentClick.INSTANCE;
        Function1 function1 = this.$onEvent;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.$keyboardController;
        switch (i) {
            case 0:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(personalizePaymentClick);
                break;
            case 1:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(personalizePaymentClick);
                break;
            default:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(PersonalizePaymentViewEvent.Back.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
