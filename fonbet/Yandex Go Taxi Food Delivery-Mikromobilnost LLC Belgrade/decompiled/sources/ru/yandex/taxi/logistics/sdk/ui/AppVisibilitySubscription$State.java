package ru.yandex.taxi.logistics.sdk.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/logistics/sdk/ui/AppVisibilitySubscription$State", "", "Lru/yandex/taxi/logistics/sdk/ui/AppVisibilitySubscription$State;", "FOREGROUND", "BACKGROUND", "sdk-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppVisibilitySubscription$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppVisibilitySubscription$State[] $VALUES;
    public static final AppVisibilitySubscription$State BACKGROUND;
    public static final AppVisibilitySubscription$State FOREGROUND;

    static {
        AppVisibilitySubscription$State appVisibilitySubscription$State = new AppVisibilitySubscription$State("FOREGROUND", 0);
        FOREGROUND = appVisibilitySubscription$State;
        AppVisibilitySubscription$State appVisibilitySubscription$State2 = new AppVisibilitySubscription$State("BACKGROUND", 1);
        BACKGROUND = appVisibilitySubscription$State2;
        AppVisibilitySubscription$State[] appVisibilitySubscription$StateArr = {appVisibilitySubscription$State, appVisibilitySubscription$State2};
        $VALUES = appVisibilitySubscription$StateArr;
        $ENTRIES = kotlin.enums.a.a(appVisibilitySubscription$StateArr);
    }

    public static AppVisibilitySubscription$State valueOf(String str) {
        return (AppVisibilitySubscription$State) Enum.valueOf(AppVisibilitySubscription$State.class, str);
    }

    public static AppVisibilitySubscription$State[] values() {
        return (AppVisibilitySubscription$State[]) $VALUES.clone();
    }
}
