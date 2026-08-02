package ru.yandex.yx_platform_api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/yx_platform_api/AppLifecycleSource;", "", "Activity", "Engine", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppLifecycleSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppLifecycleSource[] $VALUES;
    public static final AppLifecycleSource Activity;
    public static final AppLifecycleSource Engine;

    static {
        AppLifecycleSource appLifecycleSource = new AppLifecycleSource("Activity", 0);
        Activity = appLifecycleSource;
        AppLifecycleSource appLifecycleSource2 = new AppLifecycleSource("Engine", 1);
        Engine = appLifecycleSource2;
        AppLifecycleSource[] appLifecycleSourceArr = {appLifecycleSource, appLifecycleSource2};
        $VALUES = appLifecycleSourceArr;
        $ENTRIES = kotlin.enums.a.a(appLifecycleSourceArr);
    }

    public static AppLifecycleSource valueOf(String str) {
        return (AppLifecycleSource) Enum.valueOf(AppLifecycleSource.class, str);
    }

    public static AppLifecycleSource[] values() {
        return (AppLifecycleSource[]) $VALUES.clone();
    }
}
