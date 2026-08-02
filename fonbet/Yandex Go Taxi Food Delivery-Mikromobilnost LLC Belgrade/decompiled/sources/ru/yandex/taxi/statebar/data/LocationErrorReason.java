package ru.yandex.taxi.statebar.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/statebar/data/LocationErrorReason;", "", "LOCATION_SERVICE_ERROR_REASON", "LOCATION_PERMISSION_ERROR_REASON", "LOCATION_RESOLVING_ERROR_REASON", "LOCATION_MESSAGE_REASON", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LocationErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationErrorReason[] $VALUES;
    public static final LocationErrorReason LOCATION_MESSAGE_REASON;
    public static final LocationErrorReason LOCATION_PERMISSION_ERROR_REASON;
    public static final LocationErrorReason LOCATION_RESOLVING_ERROR_REASON;
    public static final LocationErrorReason LOCATION_SERVICE_ERROR_REASON;
    public static final LocationErrorReason NONE;

    static {
        LocationErrorReason locationErrorReason = new LocationErrorReason("LOCATION_SERVICE_ERROR_REASON", 0);
        LOCATION_SERVICE_ERROR_REASON = locationErrorReason;
        LocationErrorReason locationErrorReason2 = new LocationErrorReason("LOCATION_PERMISSION_ERROR_REASON", 1);
        LOCATION_PERMISSION_ERROR_REASON = locationErrorReason2;
        LocationErrorReason locationErrorReason3 = new LocationErrorReason("LOCATION_RESOLVING_ERROR_REASON", 2);
        LOCATION_RESOLVING_ERROR_REASON = locationErrorReason3;
        LocationErrorReason locationErrorReason4 = new LocationErrorReason("LOCATION_MESSAGE_REASON", 3);
        LOCATION_MESSAGE_REASON = locationErrorReason4;
        LocationErrorReason locationErrorReason5 = new LocationErrorReason(JCP.RAW_PREFIX, 4);
        NONE = locationErrorReason5;
        LocationErrorReason[] locationErrorReasonArr = {locationErrorReason, locationErrorReason2, locationErrorReason3, locationErrorReason4, locationErrorReason5};
        $VALUES = locationErrorReasonArr;
        $ENTRIES = a.a(locationErrorReasonArr);
    }

    public static LocationErrorReason valueOf(String str) {
        return (LocationErrorReason) Enum.valueOf(LocationErrorReason.class, str);
    }

    public static LocationErrorReason[] values() {
        return (LocationErrorReason[]) $VALUES.clone();
    }
}
