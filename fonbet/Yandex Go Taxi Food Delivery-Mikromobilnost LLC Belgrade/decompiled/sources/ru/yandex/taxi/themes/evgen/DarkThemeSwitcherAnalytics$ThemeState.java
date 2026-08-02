package ru.yandex.taxi.themes.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/themes/evgen/DarkThemeSwitcherAnalytics$ThemeState", "", "Lru/yandex/taxi/themes/evgen/DarkThemeSwitcherAnalytics$ThemeState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Dark", "Light", "Auto", "System", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DarkThemeSwitcherAnalytics$ThemeState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DarkThemeSwitcherAnalytics$ThemeState[] $VALUES;
    public static final DarkThemeSwitcherAnalytics$ThemeState Auto;
    public static final DarkThemeSwitcherAnalytics$ThemeState Dark;
    public static final DarkThemeSwitcherAnalytics$ThemeState Light;
    public static final DarkThemeSwitcherAnalytics$ThemeState System;
    private final String eventValue;

    static {
        DarkThemeSwitcherAnalytics$ThemeState darkThemeSwitcherAnalytics$ThemeState = new DarkThemeSwitcherAnalytics$ThemeState("Dark", 0, "dark");
        Dark = darkThemeSwitcherAnalytics$ThemeState;
        DarkThemeSwitcherAnalytics$ThemeState darkThemeSwitcherAnalytics$ThemeState2 = new DarkThemeSwitcherAnalytics$ThemeState("Light", 1, "light");
        Light = darkThemeSwitcherAnalytics$ThemeState2;
        DarkThemeSwitcherAnalytics$ThemeState darkThemeSwitcherAnalytics$ThemeState3 = new DarkThemeSwitcherAnalytics$ThemeState("Auto", 2, "auto");
        Auto = darkThemeSwitcherAnalytics$ThemeState3;
        DarkThemeSwitcherAnalytics$ThemeState darkThemeSwitcherAnalytics$ThemeState4 = new DarkThemeSwitcherAnalytics$ThemeState("System", 3, "system");
        System = darkThemeSwitcherAnalytics$ThemeState4;
        DarkThemeSwitcherAnalytics$ThemeState[] darkThemeSwitcherAnalytics$ThemeStateArr = {darkThemeSwitcherAnalytics$ThemeState, darkThemeSwitcherAnalytics$ThemeState2, darkThemeSwitcherAnalytics$ThemeState3, darkThemeSwitcherAnalytics$ThemeState4};
        $VALUES = darkThemeSwitcherAnalytics$ThemeStateArr;
        $ENTRIES = a.a(darkThemeSwitcherAnalytics$ThemeStateArr);
    }

    public DarkThemeSwitcherAnalytics$ThemeState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DarkThemeSwitcherAnalytics$ThemeState valueOf(String str) {
        return (DarkThemeSwitcherAnalytics$ThemeState) Enum.valueOf(DarkThemeSwitcherAnalytics$ThemeState.class, str);
    }

    public static DarkThemeSwitcherAnalytics$ThemeState[] values() {
        return (DarkThemeSwitcherAnalytics$ThemeState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
