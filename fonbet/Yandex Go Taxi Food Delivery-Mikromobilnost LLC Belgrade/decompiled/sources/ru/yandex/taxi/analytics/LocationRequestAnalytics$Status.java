package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/analytics/LocationRequestAnalytics$Status", "", "Lru/yandex/taxi/analytics/LocationRequestAnalytics$Status;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SUCCESS", "ERROR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocationRequestAnalytics$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationRequestAnalytics$Status[] $VALUES;
    public static final LocationRequestAnalytics$Status ERROR;
    public static final LocationRequestAnalytics$Status SUCCESS;
    private final String value;

    static {
        LocationRequestAnalytics$Status locationRequestAnalytics$Status = new LocationRequestAnalytics$Status("SUCCESS", 0, "success");
        SUCCESS = locationRequestAnalytics$Status;
        LocationRequestAnalytics$Status locationRequestAnalytics$Status2 = new LocationRequestAnalytics$Status("ERROR", 1, "error");
        ERROR = locationRequestAnalytics$Status2;
        LocationRequestAnalytics$Status[] locationRequestAnalytics$StatusArr = {locationRequestAnalytics$Status, locationRequestAnalytics$Status2};
        $VALUES = locationRequestAnalytics$StatusArr;
        $ENTRIES = a.a(locationRequestAnalytics$StatusArr);
    }

    public LocationRequestAnalytics$Status(String str, int i, String str2) {
        this.value = str2;
    }

    public static LocationRequestAnalytics$Status valueOf(String str) {
        return (LocationRequestAnalytics$Status) Enum.valueOf(LocationRequestAnalytics$Status.class, str);
    }

    public static LocationRequestAnalytics$Status[] values() {
        return (LocationRequestAnalytics$Status[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
