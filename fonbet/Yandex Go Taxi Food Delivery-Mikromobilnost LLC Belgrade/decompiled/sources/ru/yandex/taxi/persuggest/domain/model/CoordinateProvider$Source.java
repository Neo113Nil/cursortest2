package ru.yandex.taxi.persuggest.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"ru/yandex/taxi/persuggest/domain/model/CoordinateProvider$Source", "", "Lru/yandex/taxi/persuggest/domain/model/CoordinateProvider$Source;", "GPS", "LBS", "LBS_WIFI", "LBS_GSM", "LBS_IP", "MAPKIT", "PLATFORM_LBS", "FUSED", "ZERO_KM", "RIDETECH_LOCATION_SDK", "RIDETECH_LOCATION_SDK_LAST_LOCATION", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CoordinateProvider$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CoordinateProvider$Source[] $VALUES;
    public static final CoordinateProvider$Source FUSED;
    public static final CoordinateProvider$Source GPS;
    public static final CoordinateProvider$Source LBS;
    public static final CoordinateProvider$Source LBS_GSM;
    public static final CoordinateProvider$Source LBS_IP;
    public static final CoordinateProvider$Source LBS_WIFI;
    public static final CoordinateProvider$Source MAPKIT;
    public static final CoordinateProvider$Source PLATFORM_LBS;
    public static final CoordinateProvider$Source RIDETECH_LOCATION_SDK;
    public static final CoordinateProvider$Source RIDETECH_LOCATION_SDK_LAST_LOCATION;
    public static final CoordinateProvider$Source UNKNOWN;
    public static final CoordinateProvider$Source ZERO_KM;

    static {
        CoordinateProvider$Source coordinateProvider$Source = new CoordinateProvider$Source("GPS", 0);
        GPS = coordinateProvider$Source;
        CoordinateProvider$Source coordinateProvider$Source2 = new CoordinateProvider$Source("LBS", 1);
        LBS = coordinateProvider$Source2;
        CoordinateProvider$Source coordinateProvider$Source3 = new CoordinateProvider$Source("LBS_WIFI", 2);
        LBS_WIFI = coordinateProvider$Source3;
        CoordinateProvider$Source coordinateProvider$Source4 = new CoordinateProvider$Source("LBS_GSM", 3);
        LBS_GSM = coordinateProvider$Source4;
        CoordinateProvider$Source coordinateProvider$Source5 = new CoordinateProvider$Source("LBS_IP", 4);
        LBS_IP = coordinateProvider$Source5;
        CoordinateProvider$Source coordinateProvider$Source6 = new CoordinateProvider$Source("MAPKIT", 5);
        MAPKIT = coordinateProvider$Source6;
        CoordinateProvider$Source coordinateProvider$Source7 = new CoordinateProvider$Source("PLATFORM_LBS", 6);
        PLATFORM_LBS = coordinateProvider$Source7;
        CoordinateProvider$Source coordinateProvider$Source8 = new CoordinateProvider$Source("FUSED", 7);
        FUSED = coordinateProvider$Source8;
        CoordinateProvider$Source coordinateProvider$Source9 = new CoordinateProvider$Source("ZERO_KM", 8);
        ZERO_KM = coordinateProvider$Source9;
        CoordinateProvider$Source coordinateProvider$Source10 = new CoordinateProvider$Source("RIDETECH_LOCATION_SDK", 9);
        RIDETECH_LOCATION_SDK = coordinateProvider$Source10;
        CoordinateProvider$Source coordinateProvider$Source11 = new CoordinateProvider$Source("RIDETECH_LOCATION_SDK_LAST_LOCATION", 10);
        RIDETECH_LOCATION_SDK_LAST_LOCATION = coordinateProvider$Source11;
        CoordinateProvider$Source coordinateProvider$Source12 = new CoordinateProvider$Source("UNKNOWN", 11);
        UNKNOWN = coordinateProvider$Source12;
        CoordinateProvider$Source[] coordinateProvider$SourceArr = {coordinateProvider$Source, coordinateProvider$Source2, coordinateProvider$Source3, coordinateProvider$Source4, coordinateProvider$Source5, coordinateProvider$Source6, coordinateProvider$Source7, coordinateProvider$Source8, coordinateProvider$Source9, coordinateProvider$Source10, coordinateProvider$Source11, coordinateProvider$Source12};
        $VALUES = coordinateProvider$SourceArr;
        $ENTRIES = a.a(coordinateProvider$SourceArr);
    }

    public static CoordinateProvider$Source valueOf(String str) {
        return (CoordinateProvider$Source) Enum.valueOf(CoordinateProvider$Source.class, str);
    }

    public static CoordinateProvider$Source[] values() {
        return (CoordinateProvider$Source[]) $VALUES.clone();
    }
}
