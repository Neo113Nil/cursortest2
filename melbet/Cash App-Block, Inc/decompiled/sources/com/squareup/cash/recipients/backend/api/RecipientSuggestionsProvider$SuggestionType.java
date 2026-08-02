package com.squareup.cash.recipients.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RecipientSuggestionsProvider$SuggestionType {
    public static final /* synthetic */ RecipientSuggestionsProvider$SuggestionType[] $VALUES;
    public static final RecipientSuggestionsProvider$SuggestionType CONTACTS;
    public static final RecipientSuggestionsProvider$SuggestionType RESULTS;
    public static final RecipientSuggestionsProvider$SuggestionType SUGGESTED;

    static {
        RecipientSuggestionsProvider$SuggestionType recipientSuggestionsProvider$SuggestionType = new RecipientSuggestionsProvider$SuggestionType("SUGGESTED", 0);
        SUGGESTED = recipientSuggestionsProvider$SuggestionType;
        RecipientSuggestionsProvider$SuggestionType recipientSuggestionsProvider$SuggestionType2 = new RecipientSuggestionsProvider$SuggestionType("CONTACTS", 1);
        CONTACTS = recipientSuggestionsProvider$SuggestionType2;
        RecipientSuggestionsProvider$SuggestionType recipientSuggestionsProvider$SuggestionType3 = new RecipientSuggestionsProvider$SuggestionType("RESULTS", 2);
        RESULTS = recipientSuggestionsProvider$SuggestionType3;
        $VALUES = new RecipientSuggestionsProvider$SuggestionType[]{recipientSuggestionsProvider$SuggestionType, recipientSuggestionsProvider$SuggestionType2, recipientSuggestionsProvider$SuggestionType3};
    }

    public static RecipientSuggestionsProvider$SuggestionType valueOf(String str) {
        return (RecipientSuggestionsProvider$SuggestionType) Enum.valueOf(RecipientSuggestionsProvider$SuggestionType.class, str);
    }

    public static RecipientSuggestionsProvider$SuggestionType[] values() {
        return (RecipientSuggestionsProvider$SuggestionType[]) $VALUES.clone();
    }
}
