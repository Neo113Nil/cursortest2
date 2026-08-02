package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/analytics/Events$ShareScreen$Screen", "", "Lru/yandex/taxi/analytics/Events$ShareScreen$Screen;", "", "screenName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MAIN", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Events$ShareScreen$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Events$ShareScreen$Screen[] $VALUES;
    public static final Events$ShareScreen$Screen MAIN;
    private final String screenName = "main";

    static {
        Events$ShareScreen$Screen events$ShareScreen$Screen = new Events$ShareScreen$Screen();
        MAIN = events$ShareScreen$Screen;
        Events$ShareScreen$Screen[] events$ShareScreen$ScreenArr = {events$ShareScreen$Screen};
        $VALUES = events$ShareScreen$ScreenArr;
        $ENTRIES = a.a(events$ShareScreen$ScreenArr);
    }

    public static Events$ShareScreen$Screen valueOf(String str) {
        return (Events$ShareScreen$Screen) Enum.valueOf(Events$ShareScreen$Screen.class, str);
    }

    public static Events$ShareScreen$Screen[] values() {
        return (Events$ShareScreen$Screen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }
}
