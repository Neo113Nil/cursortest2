package com.squareup.cash.moneybot.fixtures;

import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowIcon;
import com.squareup.cash.moneybot.viewmodels.SuggestionViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion;

/* loaded from: classes6.dex */
public abstract class MoneybotChatViewTestDataKt {
    public static final SuggestionViewModel.SuggestionsRowViewModel createSuggestionRowViewModel(String str, String str2, SuggestionRowIcon suggestionRowIcon) {
        return new SuggestionViewModel.SuggestionsRowViewModel(str, str2, suggestionRowIcon, new MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion(new ChatKickoffParams(null, null, 15)));
    }
}
