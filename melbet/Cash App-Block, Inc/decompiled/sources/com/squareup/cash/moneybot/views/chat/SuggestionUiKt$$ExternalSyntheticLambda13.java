package com.squareup.cash.moneybot.views.chat;

import androidx.compose.ui.focus.FocusOwnerImpl;
import com.squareup.cash.moneybot.viewmodels.chat.InChatPromptViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class SuggestionUiKt$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ FocusOwnerImpl f$1;

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda13(Function1 function1, FocusOwnerImpl focusOwnerImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = focusOwnerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        FocusOwnerImpl focusOwnerImpl = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion = (MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) obj;
                moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion.getClass();
                function1.invoke(moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion);
                focusOwnerImpl.clearFocus(false);
                break;
            default:
                InChatPromptViewModel inChatPromptViewModel = (InChatPromptViewModel) obj;
                inChatPromptViewModel.getClass();
                MoneybotChatViewEvent moneybotChatViewEvent = inChatPromptViewModel.clickAction;
                if (moneybotChatViewEvent != null) {
                    function1.invoke(moneybotChatViewEvent);
                }
                focusOwnerImpl.clearFocus(false);
                break;
        }
        return Unit.INSTANCE;
    }
}
