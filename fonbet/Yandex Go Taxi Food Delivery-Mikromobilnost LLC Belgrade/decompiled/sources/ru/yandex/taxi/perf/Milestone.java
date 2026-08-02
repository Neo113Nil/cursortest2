package ru.yandex.taxi.perf;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/perf/Milestone;", "", "", "eventName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ApplicationClass", "Application", "StartActivity", "MainActivity", "MainScreen", "SplashScreen", "Pin", "MainScreenData", "MainScreenDataNav", "MainScreenDataTaxi", "ShortcutsRender", "ZoneInfo", "Suggest", "ShortcutsLoaded", "FirstContentfulPaint", "LargestContentfulPaint", "LargestContentfulPaintCached", "FullContentfulPaint", "FullContentfulPaintCached", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Milestone {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Milestone[] $VALUES;
    public static final Milestone Application;
    public static final Milestone ApplicationClass;
    public static final Milestone FirstContentfulPaint;
    public static final Milestone FullContentfulPaint;
    public static final Milestone FullContentfulPaintCached;
    public static final Milestone LargestContentfulPaint;
    public static final Milestone LargestContentfulPaintCached;
    public static final Milestone MainActivity;
    public static final Milestone MainScreen;
    public static final Milestone MainScreenData;
    public static final Milestone MainScreenDataNav;
    public static final Milestone MainScreenDataTaxi;
    public static final Milestone Pin;
    public static final Milestone ShortcutsLoaded;
    public static final Milestone ShortcutsRender;
    public static final Milestone SplashScreen;
    public static final Milestone StartActivity;
    public static final Milestone Suggest;
    public static final Milestone ZoneInfo;
    private final String eventName;

    static {
        Milestone milestone = new Milestone("ApplicationClass", 0, "Taxi.ApplicationClass.Create");
        ApplicationClass = milestone;
        Milestone milestone2 = new Milestone("Application", 1, "Taxi.Application.Create");
        Application = milestone2;
        Milestone milestone3 = new Milestone("StartActivity", 2, "Main.StartActivity.Create");
        StartActivity = milestone3;
        Milestone milestone4 = new Milestone("MainActivity", 3, "Main.MainActivity.Create");
        MainActivity = milestone4;
        Milestone milestone5 = new Milestone("MainScreen", 4, "Main.MainScreen.Appear");
        MainScreen = milestone5;
        Milestone milestone6 = new Milestone("SplashScreen", 5, "Main.MainScreen.Splash");
        SplashScreen = milestone6;
        Milestone milestone7 = new Milestone("Pin", 6, "Main.MainScreen.Pin.Appear");
        Pin = milestone7;
        Milestone milestone8 = new Milestone("MainScreenData", 7, "Main.MainScreen.Data");
        MainScreenData = milestone8;
        Milestone milestone9 = new Milestone("MainScreenDataNav", 8, "Main.MainScreen.Data.Nav");
        MainScreenDataNav = milestone9;
        Milestone milestone10 = new Milestone("MainScreenDataTaxi", 9, "Main.MainScreen.Data.Taxi");
        MainScreenDataTaxi = milestone10;
        Milestone milestone11 = new Milestone("ShortcutsRender", 10, "Main.MainScreen.Shortcuts.Render");
        ShortcutsRender = milestone11;
        Milestone milestone12 = new Milestone("ZoneInfo", 11, "Main.MainScreen.ZoneInfo");
        ZoneInfo = milestone12;
        Milestone milestone13 = new Milestone("Suggest", 12, "Main.MainScreen.Suggest");
        Suggest = milestone13;
        Milestone milestone14 = new Milestone("ShortcutsLoaded", 13, "Main.MainScreen.Shortcuts.Loaded");
        ShortcutsLoaded = milestone14;
        Milestone milestone15 = new Milestone("FirstContentfulPaint", 14, "FirstContentfulPaint");
        FirstContentfulPaint = milestone15;
        Milestone milestone16 = new Milestone("LargestContentfulPaint", 15, "LargestContentfulPaint");
        LargestContentfulPaint = milestone16;
        Milestone milestone17 = new Milestone("LargestContentfulPaintCached", 16, "LargestContentfulPaint.Cached");
        LargestContentfulPaintCached = milestone17;
        Milestone milestone18 = new Milestone("FullContentfulPaint", 17, "FullContentfulPaint");
        FullContentfulPaint = milestone18;
        Milestone milestone19 = new Milestone("FullContentfulPaintCached", 18, "FullContentfulPaint.Cached");
        FullContentfulPaintCached = milestone19;
        Milestone[] milestoneArr = {milestone, milestone2, milestone3, milestone4, milestone5, milestone6, milestone7, milestone8, milestone9, milestone10, milestone11, milestone12, milestone13, milestone14, milestone15, milestone16, milestone17, milestone18, milestone19};
        $VALUES = milestoneArr;
        $ENTRIES = kotlin.enums.a.a(milestoneArr);
    }

    public Milestone(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static Milestone valueOf(String str) {
        return (Milestone) Enum.valueOf(Milestone.class, str);
    }

    public static Milestone[] values() {
        return (Milestone[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }
}
