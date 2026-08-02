package com.squareup.cash.mooncake.themes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Theme {
    public static final /* synthetic */ Theme[] $VALUES;
    public static final Theme MooncakeDark;
    public static final Theme MooncakeLight;

    static {
        Theme theme = new Theme("MooncakeLight", 0);
        MooncakeLight = theme;
        Theme theme2 = new Theme("MooncakeDark", 1);
        MooncakeDark = theme2;
        $VALUES = new Theme[]{theme, theme2};
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
