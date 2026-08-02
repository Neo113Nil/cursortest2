package com.squareup.cash.benefits.components.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Style {
    public static final /* synthetic */ Style[] $VALUES;
    public static final Style LARGE;
    public static final Style SMALL;

    static {
        Style style = new Style("LARGE", 0);
        LARGE = style;
        Style style2 = new Style("SMALL", 1);
        SMALL = style2;
        $VALUES = new Style[]{style, style2};
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) $VALUES.clone();
    }
}
