package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/analytics/LocationRequestAnalytics$ErrorReason", "", "Lru/yandex/taxi/analytics/LocationRequestAnalytics$ErrorReason;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PERMISSION_NOT_GRANTED", "LOCATION_SERVICE_NOT_AVAILABLE", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocationRequestAnalytics$ErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationRequestAnalytics$ErrorReason[] $VALUES;
    public static final LocationRequestAnalytics$ErrorReason LOCATION_SERVICE_NOT_AVAILABLE;
    public static final LocationRequestAnalytics$ErrorReason PERMISSION_NOT_GRANTED;
    public static final LocationRequestAnalytics$ErrorReason UNKNOWN;
    private final String value;

    static {
        LocationRequestAnalytics$ErrorReason locationRequestAnalytics$ErrorReason = new LocationRequestAnalytics$ErrorReason("PERMISSION_NOT_GRANTED", 0, "permission_not_granted");
        PERMISSION_NOT_GRANTED = locationRequestAnalytics$ErrorReason;
        LocationRequestAnalytics$ErrorReason locationRequestAnalytics$ErrorReason2 = new LocationRequestAnalytics$ErrorReason("LOCATION_SERVICE_NOT_AVAILABLE", 1, "location_service_not_available");
        LOCATION_SERVICE_NOT_AVAILABLE = locationRequestAnalytics$ErrorReason2;
        LocationRequestAnalytics$ErrorReason locationRequestAnalytics$ErrorReason3 = new LocationRequestAnalytics$ErrorReason("UNKNOWN", 2, "unknown");
        UNKNOWN = locationRequestAnalytics$ErrorReason3;
        LocationRequestAnalytics$ErrorReason[] locationRequestAnalytics$ErrorReasonArr = {locationRequestAnalytics$ErrorReason, locationRequestAnalytics$ErrorReason2, locationRequestAnalytics$ErrorReason3};
        $VALUES = locationRequestAnalytics$ErrorReasonArr;
        $ENTRIES = a.a(locationRequestAnalytics$ErrorReasonArr);
    }

    public LocationRequestAnalytics$ErrorReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static LocationRequestAnalytics$ErrorReason valueOf(String str) {
        return (LocationRequestAnalytics$ErrorReason) Enum.valueOf(LocationRequestAnalytics$ErrorReason.class, str);
    }

    public static LocationRequestAnalytics$ErrorReason[] values() {
        return (LocationRequestAnalytics$ErrorReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
