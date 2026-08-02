package ru.yandex.taxi.mainscreen.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/mainscreen/analytics/MainScreenAnalyticsScreenMode;", "", "COMPOSITE", "SHORTCUTS", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MainScreenAnalyticsScreenMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenAnalyticsScreenMode[] $VALUES;
    public static final MainScreenAnalyticsScreenMode COMPOSITE;
    public static final MainScreenAnalyticsScreenMode SHORTCUTS;

    static {
        MainScreenAnalyticsScreenMode mainScreenAnalyticsScreenMode = new MainScreenAnalyticsScreenMode("COMPOSITE", 0);
        COMPOSITE = mainScreenAnalyticsScreenMode;
        MainScreenAnalyticsScreenMode mainScreenAnalyticsScreenMode2 = new MainScreenAnalyticsScreenMode("SHORTCUTS", 1);
        SHORTCUTS = mainScreenAnalyticsScreenMode2;
        MainScreenAnalyticsScreenMode[] mainScreenAnalyticsScreenModeArr = {mainScreenAnalyticsScreenMode, mainScreenAnalyticsScreenMode2};
        $VALUES = mainScreenAnalyticsScreenModeArr;
        $ENTRIES = a.a(mainScreenAnalyticsScreenModeArr);
    }

    public static MainScreenAnalyticsScreenMode valueOf(String str) {
        return (MainScreenAnalyticsScreenMode) Enum.valueOf(MainScreenAnalyticsScreenMode.class, str);
    }

    public static MainScreenAnalyticsScreenMode[] values() {
        return (MainScreenAnalyticsScreenMode[]) $VALUES.clone();
    }
}
