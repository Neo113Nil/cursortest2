package com.squareup.cash.moneybot.views.chat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SuggestionRowStyle {
    public static final /* synthetic */ SuggestionRowStyle[] $VALUES;
    public static final SuggestionRowStyle CARD;
    public static final SuggestionRowStyle DEFAULT;

    static {
        SuggestionRowStyle suggestionRowStyle = new SuggestionRowStyle("DEFAULT", 0);
        DEFAULT = suggestionRowStyle;
        SuggestionRowStyle suggestionRowStyle2 = new SuggestionRowStyle("CARD", 1);
        CARD = suggestionRowStyle2;
        $VALUES = new SuggestionRowStyle[]{suggestionRowStyle, suggestionRowStyle2};
    }

    public static SuggestionRowStyle valueOf(String str) {
        return (SuggestionRowStyle) Enum.valueOf(SuggestionRowStyle.class, str);
    }

    public static SuggestionRowStyle[] values() {
        return (SuggestionRowStyle[]) $VALUES.clone();
    }
}
