package com.squareup.cash.moneybot.viewmodels;

import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class SuggestionViewModel {

    public abstract class SuggestionPillViewModel extends SuggestionViewModel {
    }

    public final class SuggestionsRowViewModel extends SuggestionViewModel implements SuggestionRowModel {
        public final MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion action;
        public final String body;
        public final SuggestionRowIcon icon;
        public final String title;

        public SuggestionsRowViewModel(String str, String str2, SuggestionRowIcon suggestionRowIcon, MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) {
            this.title = str;
            this.body = str2;
            this.icon = suggestionRowIcon;
            this.action = moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestionsRowViewModel)) {
                return false;
            }
            SuggestionsRowViewModel suggestionsRowViewModel = (SuggestionsRowViewModel) obj;
            return this.title.equals(suggestionsRowViewModel.title) && this.body.equals(suggestionsRowViewModel.body) && Intrinsics.areEqual(this.icon, suggestionsRowViewModel.icon) && this.action.equals(suggestionsRowViewModel.action);
        }

        @Override // com.squareup.cash.moneybot.viewmodels.SuggestionRowModel
        public final String getBody() {
            return this.body;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.SuggestionRowModel
        public final SuggestionRowIcon getIcon() {
            return this.icon;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.SuggestionRowModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            SuggestionRowIcon suggestionRowIcon = this.icon;
            return (this.action.params.hashCode() + ((m + (suggestionRowIcon == null ? 0 : suggestionRowIcon.hashCode())) * 31)) * 31;
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SuggestionsRowViewModel(title=", this.title, ", body=", this.body, ", icon=");
            m.append(this.icon);
            m.append(", action=");
            m.append(this.action);
            m.append(", renderEvent=null)");
            return m.toString();
        }
    }
}
