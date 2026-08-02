package ru.yandex.taxi.persuggest.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t5z;
import defpackage.xbz;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/persuggest/api/LocationProvider;", "", "Companion", "xbz", "GPS", "LBS", "MAPKIT", "PLATFORM_LBS", "FUSED", "ZERO_KM", JCP.RAW_PREFIX, "RIDETECH_LOCATION_SDK", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationProvider {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationProvider[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final xbz Companion;
    public static final LocationProvider FUSED;
    public static final LocationProvider GPS;
    public static final LocationProvider LBS;
    public static final LocationProvider MAPKIT;
    public static final LocationProvider NONE;
    public static final LocationProvider PLATFORM_LBS;
    public static final LocationProvider RIDETECH_LOCATION_SDK;
    public static final LocationProvider ZERO_KM;

    static {
        LocationProvider locationProvider = new LocationProvider("GPS", 0);
        GPS = locationProvider;
        LocationProvider locationProvider2 = new LocationProvider("LBS", 1);
        LBS = locationProvider2;
        LocationProvider locationProvider3 = new LocationProvider("MAPKIT", 2);
        MAPKIT = locationProvider3;
        LocationProvider locationProvider4 = new LocationProvider("PLATFORM_LBS", 3);
        PLATFORM_LBS = locationProvider4;
        LocationProvider locationProvider5 = new LocationProvider("FUSED", 4);
        FUSED = locationProvider5;
        LocationProvider locationProvider6 = new LocationProvider("ZERO_KM", 5);
        ZERO_KM = locationProvider6;
        LocationProvider locationProvider7 = new LocationProvider(JCP.RAW_PREFIX, 6);
        NONE = locationProvider7;
        LocationProvider locationProvider8 = new LocationProvider("RIDETECH_LOCATION_SDK", 7);
        RIDETECH_LOCATION_SDK = locationProvider8;
        LocationProvider[] locationProviderArr = {locationProvider, locationProvider2, locationProvider3, locationProvider4, locationProvider5, locationProvider6, locationProvider7, locationProvider8};
        $VALUES = locationProviderArr;
        $ENTRIES = kotlin.enums.a.a(locationProviderArr);
        Companion = new xbz();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(1));
    }

    public static LocationProvider valueOf(String str) {
        return (LocationProvider) Enum.valueOf(LocationProvider.class, str);
    }

    public static LocationProvider[] values() {
        return (LocationProvider[]) $VALUES.clone();
    }
}
