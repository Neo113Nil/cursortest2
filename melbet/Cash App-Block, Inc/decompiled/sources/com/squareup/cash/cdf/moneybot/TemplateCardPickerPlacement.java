package com.squareup.cash.cdf.moneybot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TemplateCardPickerPlacement {
    public static final /* synthetic */ TemplateCardPickerPlacement[] $VALUES;
    public static final TemplateCardPickerPlacement BOTTOM;
    public static final TemplateCardPickerPlacement INLINE;

    static {
        TemplateCardPickerPlacement templateCardPickerPlacement = new TemplateCardPickerPlacement("INLINE", 0);
        INLINE = templateCardPickerPlacement;
        TemplateCardPickerPlacement templateCardPickerPlacement2 = new TemplateCardPickerPlacement("BOTTOM", 1);
        BOTTOM = templateCardPickerPlacement2;
        $VALUES = new TemplateCardPickerPlacement[]{templateCardPickerPlacement, templateCardPickerPlacement2};
    }

    public static TemplateCardPickerPlacement valueOf(String str) {
        return (TemplateCardPickerPlacement) Enum.valueOf(TemplateCardPickerPlacement.class, str);
    }

    public static TemplateCardPickerPlacement[] values() {
        return (TemplateCardPickerPlacement[]) $VALUES.clone();
    }
}
