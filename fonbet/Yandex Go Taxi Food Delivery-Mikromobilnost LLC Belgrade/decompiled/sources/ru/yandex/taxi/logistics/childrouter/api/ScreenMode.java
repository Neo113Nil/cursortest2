package ru.yandex.taxi.logistics.childrouter.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/childrouter/api/ScreenMode;", "", "FIXED", "SLIDEABLE", "FULLSCREEN_MODE", "sdk-delivery-child-router"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScreenMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScreenMode[] $VALUES;
    public static final ScreenMode FIXED;
    public static final ScreenMode FULLSCREEN_MODE;
    public static final ScreenMode SLIDEABLE;

    static {
        ScreenMode screenMode = new ScreenMode("FIXED", 0);
        FIXED = screenMode;
        ScreenMode screenMode2 = new ScreenMode("SLIDEABLE", 1);
        SLIDEABLE = screenMode2;
        ScreenMode screenMode3 = new ScreenMode("FULLSCREEN_MODE", 2);
        FULLSCREEN_MODE = screenMode3;
        ScreenMode[] screenModeArr = {screenMode, screenMode2, screenMode3};
        $VALUES = screenModeArr;
        $ENTRIES = a.a(screenModeArr);
    }

    public static ScreenMode valueOf(String str) {
        return (ScreenMode) Enum.valueOf(ScreenMode.class, str);
    }

    public static ScreenMode[] values() {
        return (ScreenMode[]) $VALUES.clone();
    }
}
