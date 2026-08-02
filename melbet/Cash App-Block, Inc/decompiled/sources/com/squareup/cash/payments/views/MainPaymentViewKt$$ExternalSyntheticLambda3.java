package com.squareup.cash.payments.views;

import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda3(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1) {
        this.f$0 = delegatingSoftwareKeyboardController;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
                recipientViewModel.getClass();
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(new MainPaymentViewEvent.AvatarClicked(recipientViewModel.recipient));
                break;
            default:
                ChatCardViewEvent chatCardViewEvent = (ChatCardViewEvent) obj;
                chatCardViewEvent.getClass();
                function1.invoke(new MoneybotChatViewEvent.HandleChatCardEvent(chatCardViewEvent));
                if ((chatCardViewEvent instanceof ChatCardViewEvent.LaunchClientRoute) && delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda3(Function1 function1, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.f$1 = function1;
        this.f$0 = delegatingSoftwareKeyboardController;
    }
}
