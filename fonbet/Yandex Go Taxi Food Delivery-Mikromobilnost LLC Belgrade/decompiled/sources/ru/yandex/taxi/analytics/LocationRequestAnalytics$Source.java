package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/analytics/LocationRequestAnalytics$Source", "", "Lru/yandex/taxi/analytics/LocationRequestAnalytics$Source;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "START", "GEO_AVAILABLE_SUBSCRIPTION", "MY_LOCATION_CLICK", "CURRENT_LOCATION_IN_SUGGESTS", "CURRENT_LOCATION_IN_FAVORITES", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocationRequestAnalytics$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationRequestAnalytics$Source[] $VALUES;
    public static final LocationRequestAnalytics$Source CURRENT_LOCATION_IN_FAVORITES;
    public static final LocationRequestAnalytics$Source CURRENT_LOCATION_IN_SUGGESTS;
    public static final LocationRequestAnalytics$Source GEO_AVAILABLE_SUBSCRIPTION;
    public static final LocationRequestAnalytics$Source MY_LOCATION_CLICK;
    public static final LocationRequestAnalytics$Source START;
    private final String value;

    static {
        LocationRequestAnalytics$Source locationRequestAnalytics$Source = new LocationRequestAnalytics$Source("START", 0, "start");
        START = locationRequestAnalytics$Source;
        LocationRequestAnalytics$Source locationRequestAnalytics$Source2 = new LocationRequestAnalytics$Source("GEO_AVAILABLE_SUBSCRIPTION", 1, "geo_available_subscription");
        GEO_AVAILABLE_SUBSCRIPTION = locationRequestAnalytics$Source2;
        LocationRequestAnalytics$Source locationRequestAnalytics$Source3 = new LocationRequestAnalytics$Source("MY_LOCATION_CLICK", 2, "my_location_click");
        MY_LOCATION_CLICK = locationRequestAnalytics$Source3;
        LocationRequestAnalytics$Source locationRequestAnalytics$Source4 = new LocationRequestAnalytics$Source("CURRENT_LOCATION_IN_SUGGESTS", 3, "current_location_in_suggests");
        CURRENT_LOCATION_IN_SUGGESTS = locationRequestAnalytics$Source4;
        LocationRequestAnalytics$Source locationRequestAnalytics$Source5 = new LocationRequestAnalytics$Source("CURRENT_LOCATION_IN_FAVORITES", 4, "current_location_in_favorites");
        CURRENT_LOCATION_IN_FAVORITES = locationRequestAnalytics$Source5;
        LocationRequestAnalytics$Source[] locationRequestAnalytics$SourceArr = {locationRequestAnalytics$Source, locationRequestAnalytics$Source2, locationRequestAnalytics$Source3, locationRequestAnalytics$Source4, locationRequestAnalytics$Source5};
        $VALUES = locationRequestAnalytics$SourceArr;
        $ENTRIES = a.a(locationRequestAnalytics$SourceArr);
    }

    public LocationRequestAnalytics$Source(String str, int i, String str2) {
        this.value = str2;
    }

    public static LocationRequestAnalytics$Source valueOf(String str) {
        return (LocationRequestAnalytics$Source) Enum.valueOf(LocationRequestAnalytics$Source.class, str);
    }

    public static LocationRequestAnalytics$Source[] values() {
        return (LocationRequestAnalytics$Source[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
