package ru.yandex.taxi.themes;

import defpackage.hvy0;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/themes/ThemeChangeMode;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "hvy0", "DARK", "LIGHT", "AUTO", "SYSTEM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThemeChangeMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThemeChangeMode[] $VALUES;
    public static final ThemeChangeMode AUTO;
    public static final hvy0 Companion;
    public static final ThemeChangeMode DARK;
    public static final ThemeChangeMode LIGHT;
    public static final ThemeChangeMode SYSTEM;
    private final String id;

    static {
        ThemeChangeMode themeChangeMode = new ThemeChangeMode("DARK", 0, "dark");
        DARK = themeChangeMode;
        ThemeChangeMode themeChangeMode2 = new ThemeChangeMode("LIGHT", 1, "light");
        LIGHT = themeChangeMode2;
        ThemeChangeMode themeChangeMode3 = new ThemeChangeMode("AUTO", 2, "auto");
        AUTO = themeChangeMode3;
        ThemeChangeMode themeChangeMode4 = new ThemeChangeMode("SYSTEM", 3, "system");
        SYSTEM = themeChangeMode4;
        ThemeChangeMode[] themeChangeModeArr = {themeChangeMode, themeChangeMode2, themeChangeMode3, themeChangeMode4};
        $VALUES = themeChangeModeArr;
        $ENTRIES = kotlin.enums.a.a(themeChangeModeArr);
        Companion = new hvy0();
    }

    public ThemeChangeMode(String str, int i, String str2) {
        this.id = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ThemeChangeMode valueOf(String str) {
        return (ThemeChangeMode) Enum.valueOf(ThemeChangeMode.class, str);
    }

    public static ThemeChangeMode[] values() {
        return (ThemeChangeMode[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
