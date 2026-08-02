package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/locationsdk/locationprovider/android/impl/LocationManagerAdapter$Request$Quality", "", "Lru/yandex/taxi/locationsdk/locationprovider/android/impl/LocationManagerAdapter$Request$Quality;", "HIGH_ACCURACY", "BALANCED_POWER_ACCURACY", "LOW_POWER", "location-provider-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationManagerAdapter$Request$Quality {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocationManagerAdapter$Request$Quality[] $VALUES;
    public static final LocationManagerAdapter$Request$Quality BALANCED_POWER_ACCURACY;
    public static final LocationManagerAdapter$Request$Quality HIGH_ACCURACY;
    public static final LocationManagerAdapter$Request$Quality LOW_POWER;

    static {
        LocationManagerAdapter$Request$Quality locationManagerAdapter$Request$Quality = new LocationManagerAdapter$Request$Quality("HIGH_ACCURACY", 0);
        HIGH_ACCURACY = locationManagerAdapter$Request$Quality;
        LocationManagerAdapter$Request$Quality locationManagerAdapter$Request$Quality2 = new LocationManagerAdapter$Request$Quality("BALANCED_POWER_ACCURACY", 1);
        BALANCED_POWER_ACCURACY = locationManagerAdapter$Request$Quality2;
        LocationManagerAdapter$Request$Quality locationManagerAdapter$Request$Quality3 = new LocationManagerAdapter$Request$Quality("LOW_POWER", 2);
        LOW_POWER = locationManagerAdapter$Request$Quality3;
        LocationManagerAdapter$Request$Quality[] locationManagerAdapter$Request$QualityArr = {locationManagerAdapter$Request$Quality, locationManagerAdapter$Request$Quality2, locationManagerAdapter$Request$Quality3};
        $VALUES = locationManagerAdapter$Request$QualityArr;
        $ENTRIES = kotlin.enums.a.a(locationManagerAdapter$Request$QualityArr);
    }

    public static LocationManagerAdapter$Request$Quality valueOf(String str) {
        return (LocationManagerAdapter$Request$Quality) Enum.valueOf(LocationManagerAdapter$Request$Quality.class, str);
    }

    public static LocationManagerAdapter$Request$Quality[] values() {
        return (LocationManagerAdapter$Request$Quality[]) $VALUES.clone();
    }
}
