package com.squareup.cash.moneybot.backend.api.model.chat;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PromptSuggestions {
    public final ArrayList suggestions;
    public final String suggestionsId;

    public PromptSuggestions(String str, ArrayList arrayList) {
        this.suggestions = arrayList;
        this.suggestionsId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptSuggestions)) {
            return false;
        }
        PromptSuggestions promptSuggestions = (PromptSuggestions) obj;
        return this.suggestions.equals(promptSuggestions.suggestions) && Intrinsics.areEqual(this.suggestionsId, promptSuggestions.suggestionsId);
    }

    public final int hashCode() {
        int hashCode = this.suggestions.hashCode() * 31;
        String str = this.suggestionsId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PromptSuggestions(title=, suggestions=" + this.suggestions + ", suggestionsId=" + this.suggestionsId + ")";
    }
}
