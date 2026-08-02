package ru.yandex.taxi.themes.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/themes/evgen/DarkThemeSwitcherAnalytics$Theme", "", "Lru/yandex/taxi/themes/evgen/DarkThemeSwitcherAnalytics$Theme;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Light", "Dark", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DarkThemeSwitcherAnalytics$Theme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DarkThemeSwitcherAnalytics$Theme[] $VALUES;
    public static final DarkThemeSwitcherAnalytics$Theme Dark;
    public static final DarkThemeSwitcherAnalytics$Theme Light;
    private final String eventValue;

    static {
        DarkThemeSwitcherAnalytics$Theme darkThemeSwitcherAnalytics$Theme = new DarkThemeSwitcherAnalytics$Theme("Light", 0, "light");
        Light = darkThemeSwitcherAnalytics$Theme;
        DarkThemeSwitcherAnalytics$Theme darkThemeSwitcherAnalytics$Theme2 = new DarkThemeSwitcherAnalytics$Theme("Dark", 1, "dark");
        Dark = darkThemeSwitcherAnalytics$Theme2;
        DarkThemeSwitcherAnalytics$Theme[] darkThemeSwitcherAnalytics$ThemeArr = {darkThemeSwitcherAnalytics$Theme, darkThemeSwitcherAnalytics$Theme2};
        $VALUES = darkThemeSwitcherAnalytics$ThemeArr;
        $ENTRIES = a.a(darkThemeSwitcherAnalytics$ThemeArr);
    }

    public DarkThemeSwitcherAnalytics$Theme(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DarkThemeSwitcherAnalytics$Theme valueOf(String str) {
        return (DarkThemeSwitcherAnalytics$Theme) Enum.valueOf(DarkThemeSwitcherAnalytics$Theme.class, str);
    }

    public static DarkThemeSwitcherAnalytics$Theme[] values() {
        return (DarkThemeSwitcherAnalytics$Theme[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
