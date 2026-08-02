package com.squareup.cash.card.onboarding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class StylePickerToPreviewKey {
    public static final /* synthetic */ StylePickerToPreviewKey[] $VALUES;
    public static final StylePickerToPreviewKey TitleBar;

    static {
        StylePickerToPreviewKey stylePickerToPreviewKey = new StylePickerToPreviewKey("TitleBar", 0);
        TitleBar = stylePickerToPreviewKey;
        $VALUES = new StylePickerToPreviewKey[]{stylePickerToPreviewKey};
    }

    public static StylePickerToPreviewKey valueOf(String str) {
        return (StylePickerToPreviewKey) Enum.valueOf(StylePickerToPreviewKey.class, str);
    }

    public static StylePickerToPreviewKey[] values() {
        return (StylePickerToPreviewKey[]) $VALUES.clone();
    }
}
