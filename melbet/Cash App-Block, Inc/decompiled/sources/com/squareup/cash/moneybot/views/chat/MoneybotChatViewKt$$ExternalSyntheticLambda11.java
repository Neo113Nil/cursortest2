package com.squareup.cash.moneybot.views.chat;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotChatViewKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$0;
    public final /* synthetic */ FocusOwnerImpl f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ MoneybotChatViewKt$$ExternalSyntheticLambda11(FocusOwnerImpl focusOwnerImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1) {
        this.f$1 = focusOwnerImpl;
        this.f$0 = delegatingSoftwareKeyboardController;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$0;
        FocusOwnerImpl focusOwnerImpl = this.f$1;
        switch (i) {
            case 0:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                focusOwnerImpl.clearFocus(false);
                function1.invoke(MoneybotChatViewEvent.Exit.INSTANCE);
                break;
            default:
                focusOwnerImpl.clearFocus(false);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(VerifyAliasViewEvent.Help.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotChatViewKt$$ExternalSyntheticLambda11(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, FocusOwnerImpl focusOwnerImpl, Function1 function1) {
        this.f$0 = delegatingSoftwareKeyboardController;
        this.f$1 = focusOwnerImpl;
        this.f$2 = function1;
    }
}
