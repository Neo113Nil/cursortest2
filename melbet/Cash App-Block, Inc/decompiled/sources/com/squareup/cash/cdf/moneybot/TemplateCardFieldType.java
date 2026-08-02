package com.squareup.cash.cdf.moneybot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TemplateCardFieldType {
    public static final /* synthetic */ TemplateCardFieldType[] $VALUES;
    public static final TemplateCardFieldType AMOUNT;
    public static final TemplateCardFieldType PICKER;

    static {
        TemplateCardFieldType templateCardFieldType = new TemplateCardFieldType("AMOUNT", 0);
        AMOUNT = templateCardFieldType;
        TemplateCardFieldType templateCardFieldType2 = new TemplateCardFieldType("PICKER", 1);
        PICKER = templateCardFieldType2;
        $VALUES = new TemplateCardFieldType[]{templateCardFieldType, templateCardFieldType2};
    }

    public static TemplateCardFieldType valueOf(String str) {
        return (TemplateCardFieldType) Enum.valueOf(TemplateCardFieldType.class, str);
    }

    public static TemplateCardFieldType[] values() {
        return (TemplateCardFieldType[]) $VALUES.clone();
    }
}
