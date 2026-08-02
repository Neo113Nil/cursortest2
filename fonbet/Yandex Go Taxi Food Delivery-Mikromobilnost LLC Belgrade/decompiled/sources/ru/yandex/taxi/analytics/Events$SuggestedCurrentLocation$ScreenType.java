package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/analytics/Events$SuggestedCurrentLocation$ScreenType", "", "Lru/yandex/taxi/analytics/Events$SuggestedCurrentLocation$ScreenType;", "", "screenType", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MAIN", "FAVORITES", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Events$SuggestedCurrentLocation$ScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Events$SuggestedCurrentLocation$ScreenType[] $VALUES;
    public static final Events$SuggestedCurrentLocation$ScreenType FAVORITES;
    public static final Events$SuggestedCurrentLocation$ScreenType MAIN;
    private final String screenType;

    static {
        Events$SuggestedCurrentLocation$ScreenType events$SuggestedCurrentLocation$ScreenType = new Events$SuggestedCurrentLocation$ScreenType("MAIN", 0, "main");
        MAIN = events$SuggestedCurrentLocation$ScreenType;
        Events$SuggestedCurrentLocation$ScreenType events$SuggestedCurrentLocation$ScreenType2 = new Events$SuggestedCurrentLocation$ScreenType("FAVORITES", 1, "favorites");
        FAVORITES = events$SuggestedCurrentLocation$ScreenType2;
        Events$SuggestedCurrentLocation$ScreenType[] events$SuggestedCurrentLocation$ScreenTypeArr = {events$SuggestedCurrentLocation$ScreenType, events$SuggestedCurrentLocation$ScreenType2};
        $VALUES = events$SuggestedCurrentLocation$ScreenTypeArr;
        $ENTRIES = a.a(events$SuggestedCurrentLocation$ScreenTypeArr);
    }

    public Events$SuggestedCurrentLocation$ScreenType(String str, int i, String str2) {
        this.screenType = str2;
    }

    public static Events$SuggestedCurrentLocation$ScreenType valueOf(String str) {
        return (Events$SuggestedCurrentLocation$ScreenType) Enum.valueOf(Events$SuggestedCurrentLocation$ScreenType.class, str);
    }

    public static Events$SuggestedCurrentLocation$ScreenType[] values() {
        return (Events$SuggestedCurrentLocation$ScreenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getScreenType() {
        return this.screenType;
    }
}
