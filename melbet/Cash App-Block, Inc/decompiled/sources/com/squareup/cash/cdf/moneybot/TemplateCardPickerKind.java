package com.squareup.cash.cdf.moneybot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TemplateCardPickerKind {
    public static final /* synthetic */ TemplateCardPickerKind[] $VALUES;
    public static final TemplateCardPickerKind SAVINGS;

    static {
        TemplateCardPickerKind templateCardPickerKind = new TemplateCardPickerKind("SAVINGS", 0);
        SAVINGS = templateCardPickerKind;
        $VALUES = new TemplateCardPickerKind[]{templateCardPickerKind};
    }

    public static TemplateCardPickerKind valueOf(String str) {
        return (TemplateCardPickerKind) Enum.valueOf(TemplateCardPickerKind.class, str);
    }

    public static TemplateCardPickerKind[] values() {
        return (TemplateCardPickerKind[]) $VALUES.clone();
    }
}
