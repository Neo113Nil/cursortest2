package com.squareup.cash.money.views;

import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import com.squareup.cash.moneybot.viewmodels.SuggestionViewModel;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda21 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda21(SuggestionViewModel.SuggestionsRowViewModel suggestionsRowViewModel, Function1 function1) {
        this.$r8$classId = 10;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MoneybotAmountInputViewEvent.Dismissed dismissed = MoneybotAmountInputViewEvent.Dismissed.INSTANCE;
        MoneybotFeedbackViewEvent.Dismissed dismissed2 = MoneybotFeedbackViewEvent.Dismissed.INSTANCE;
        MoneybotOverflowMenuViewEvent.Close close = MoneybotOverflowMenuViewEvent.Close.INSTANCE;
        MoneybotChatHistoryViewEvent.Exit exit = MoneybotChatHistoryViewEvent.Exit.INSTANCE;
        MoneybotDebugOverlayViewEvent.Dismiss dismiss = MoneybotDebugOverlayViewEvent.Dismiss.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(MoneyTabEvent.HandleBack.INSTANCE);
                break;
            case 1:
                function1.invoke(dismissed);
                break;
            case 2:
                function1.invoke(dismissed);
                break;
            case 3:
                function1.invoke(ChatCardViewEvent.ViewAllActivity.INSTANCE);
                break;
            case 4:
                function1.invoke(MoneybotChatViewEvent.StartNewChat.INSTANCE);
                break;
            case 5:
                function1.invoke(MoneybotChatViewEvent.OpenAboutMoneybot.INSTANCE);
                break;
            case 6:
                function1.invoke(MoneybotChatViewEvent.OpenDebugOverlay.INSTANCE);
                break;
            case 7:
                function1.invoke(MoneybotChatViewEvent.OpenOverflowMenu.INSTANCE);
                break;
            case 8:
                function1.invoke(MoneybotChatViewEvent.Exit.INSTANCE);
                break;
            case 9:
                function1.invoke(MoneybotChatViewEvent.CancelMessage.INSTANCE);
                break;
            case 10:
                break;
            case 11:
                function1.invoke(MoneybotFeedbackViewEvent.LearnMoreTapped.INSTANCE);
                break;
            case 12:
                function1.invoke(MoneybotFeedbackViewEvent.SubmitTapped.INSTANCE);
                break;
            case 13:
                function1.invoke(dismissed2);
                break;
            case 14:
                function1.invoke(dismissed2);
                break;
            case 15:
                function1.invoke(exit);
                break;
            case 16:
                function1.invoke(MoneybotChatHistoryViewEvent.TryLoadingHistoryListAgain.INSTANCE);
                break;
            case 17:
                function1.invoke(exit);
                break;
            case 18:
                function1.invoke(MoneybotChatHistoryViewEvent.NewChatClicked.INSTANCE);
                break;
            case 19:
                function1.invoke(exit);
                break;
            case 20:
                function1.invoke(MoneybotChatHistoryViewEvent.CancelDelete.INSTANCE);
                break;
            case 21:
                function1.invoke(MoneybotHomeViewEvent.ChatInputTapped.INSTANCE);
                break;
            case 22:
                function1.invoke(MoneybotHomeViewEvent.ReloadHome.INSTANCE);
                break;
            case 23:
                function1.invoke(dismiss);
                break;
            case 24:
                function1.invoke(dismiss);
                break;
            case 25:
                function1.invoke(dismiss);
                break;
            case 26:
                function1.invoke(close);
                break;
            case 27:
                function1.invoke(MoneybotOverflowMenuViewEvent.ShowDebugSheet.INSTANCE);
                break;
            case 28:
                function1.invoke(close);
                break;
            default:
                function1.invoke(MoneybotOverflowMenuViewEvent.RefreshChatHistory.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda21(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
