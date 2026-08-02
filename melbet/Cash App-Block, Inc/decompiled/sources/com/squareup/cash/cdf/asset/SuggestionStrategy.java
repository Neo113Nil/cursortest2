package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SuggestionStrategy {
    public static final /* synthetic */ SuggestionStrategy[] $VALUES;
    public static final SuggestionStrategy CONTACTS_OFF_CASH;
    public static final SuggestionStrategy CONTACTS_ON_CASH;
    public static final SuggestionStrategy FAVORITE;
    public static final SuggestionStrategy RECENTS;
    public static final SuggestionStrategy REMOTE;
    public static final SuggestionStrategy REMOTE_SEARCH;
    public static final SuggestionStrategy REMOTE_SUGGESTIONS;

    static {
        SuggestionStrategy suggestionStrategy = new SuggestionStrategy("RECENTS", 0);
        RECENTS = suggestionStrategy;
        SuggestionStrategy suggestionStrategy2 = new SuggestionStrategy("REMOTE_SUGGESTIONS", 1);
        REMOTE_SUGGESTIONS = suggestionStrategy2;
        SuggestionStrategy suggestionStrategy3 = new SuggestionStrategy("CONTACTS_ON_CASH", 2);
        CONTACTS_ON_CASH = suggestionStrategy3;
        SuggestionStrategy suggestionStrategy4 = new SuggestionStrategy("CONTACTS_OFF_CASH", 3);
        CONTACTS_OFF_CASH = suggestionStrategy4;
        SuggestionStrategy suggestionStrategy5 = new SuggestionStrategy("REMOTE_SEARCH", 4);
        REMOTE_SEARCH = suggestionStrategy5;
        SuggestionStrategy suggestionStrategy6 = new SuggestionStrategy("REMOTE", 5);
        REMOTE = suggestionStrategy6;
        SuggestionStrategy suggestionStrategy7 = new SuggestionStrategy("FAVORITE", 6);
        FAVORITE = suggestionStrategy7;
        $VALUES = new SuggestionStrategy[]{suggestionStrategy, suggestionStrategy2, suggestionStrategy3, suggestionStrategy4, suggestionStrategy5, suggestionStrategy6, suggestionStrategy7, new SuggestionStrategy("LINKED_ACCOUNT", 7)};
    }

    public static SuggestionStrategy valueOf(String str) {
        return (SuggestionStrategy) Enum.valueOf(SuggestionStrategy.class, str);
    }

    public static SuggestionStrategy[] values() {
        return (SuggestionStrategy[]) $VALUES.clone();
    }
}
