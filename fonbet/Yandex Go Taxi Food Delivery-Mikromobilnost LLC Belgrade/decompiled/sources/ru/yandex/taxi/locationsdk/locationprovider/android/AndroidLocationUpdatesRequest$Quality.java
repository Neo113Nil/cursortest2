package ru.yandex.taxi.locationsdk.locationprovider.android;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/locationsdk/locationprovider/android/AndroidLocationUpdatesRequest$Quality", "", "Lru/yandex/taxi/locationsdk/locationprovider/android/AndroidLocationUpdatesRequest$Quality;", "HIGH_ACCURACY", "BALANCED_POWER_ACCURACY", "LOW_POWER", "PASSIVE", "location-provider-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidLocationUpdatesRequest$Quality {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidLocationUpdatesRequest$Quality[] $VALUES;
    public static final AndroidLocationUpdatesRequest$Quality BALANCED_POWER_ACCURACY;
    public static final AndroidLocationUpdatesRequest$Quality HIGH_ACCURACY;
    public static final AndroidLocationUpdatesRequest$Quality LOW_POWER;
    public static final AndroidLocationUpdatesRequest$Quality PASSIVE;

    static {
        AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality = new AndroidLocationUpdatesRequest$Quality("HIGH_ACCURACY", 0);
        HIGH_ACCURACY = androidLocationUpdatesRequest$Quality;
        AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality2 = new AndroidLocationUpdatesRequest$Quality("BALANCED_POWER_ACCURACY", 1);
        BALANCED_POWER_ACCURACY = androidLocationUpdatesRequest$Quality2;
        AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality3 = new AndroidLocationUpdatesRequest$Quality("LOW_POWER", 2);
        LOW_POWER = androidLocationUpdatesRequest$Quality3;
        AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality4 = new AndroidLocationUpdatesRequest$Quality("PASSIVE", 3);
        PASSIVE = androidLocationUpdatesRequest$Quality4;
        AndroidLocationUpdatesRequest$Quality[] androidLocationUpdatesRequest$QualityArr = {androidLocationUpdatesRequest$Quality, androidLocationUpdatesRequest$Quality2, androidLocationUpdatesRequest$Quality3, androidLocationUpdatesRequest$Quality4};
        $VALUES = androidLocationUpdatesRequest$QualityArr;
        $ENTRIES = kotlin.enums.a.a(androidLocationUpdatesRequest$QualityArr);
    }

    public static AndroidLocationUpdatesRequest$Quality valueOf(String str) {
        return (AndroidLocationUpdatesRequest$Quality) Enum.valueOf(AndroidLocationUpdatesRequest$Quality.class, str);
    }

    public static AndroidLocationUpdatesRequest$Quality[] values() {
        return (AndroidLocationUpdatesRequest$Quality[]) $VALUES.clone();
    }
}
