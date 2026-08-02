package com.squareup.cash.paychecks.viewmodels.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ColorTheme {
    public static final /* synthetic */ ColorTheme[] $VALUES;
    public static final ColorTheme BITCOIN;
    public static final ColorTheme DEFAULT;
    public static final ColorTheme INVESTING;

    static {
        ColorTheme colorTheme = new ColorTheme("BITCOIN", 0);
        BITCOIN = colorTheme;
        ColorTheme colorTheme2 = new ColorTheme("INVESTING", 1);
        INVESTING = colorTheme2;
        ColorTheme colorTheme3 = new ColorTheme("DEFAULT", 2);
        DEFAULT = colorTheme3;
        $VALUES = new ColorTheme[]{colorTheme, colorTheme2, colorTheme3};
    }

    public static ColorTheme valueOf(String str) {
        return (ColorTheme) Enum.valueOf(ColorTheme.class, str);
    }

    public static ColorTheme[] values() {
        return (ColorTheme[]) $VALUES.clone();
    }
}
