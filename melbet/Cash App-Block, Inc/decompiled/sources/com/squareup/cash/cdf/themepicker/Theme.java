package com.squareup.cash.cdf.themepicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Theme {
    public static final /* synthetic */ Theme[] $VALUES;
    public static final Theme BLACK;
    public static final Theme BRAT;
    public static final Theme DEFAULT;
    public static final Theme GLITTER;
    public static final Theme PINK;
    public static final Theme TORTOISE;

    static {
        Theme theme = new Theme("DEFAULT", 0);
        DEFAULT = theme;
        Theme theme2 = new Theme("PINK", 1);
        PINK = theme2;
        Theme theme3 = new Theme("GLITTER", 2);
        GLITTER = theme3;
        Theme theme4 = new Theme("TORTOISE", 3);
        TORTOISE = theme4;
        Theme theme5 = new Theme("MOOD", 4);
        Theme theme6 = new Theme("BLACK", 5);
        BLACK = theme6;
        Theme theme7 = new Theme("BRAT", 6);
        BRAT = theme7;
        $VALUES = new Theme[]{theme, theme2, theme3, theme4, theme5, theme6, theme7};
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
