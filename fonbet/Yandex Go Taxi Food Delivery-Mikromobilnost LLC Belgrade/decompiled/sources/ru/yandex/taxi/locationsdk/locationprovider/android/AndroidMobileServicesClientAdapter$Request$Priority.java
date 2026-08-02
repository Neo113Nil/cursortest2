package ru.yandex.taxi.locationsdk.locationprovider.android;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/locationsdk/locationprovider/android/AndroidMobileServicesClientAdapter$Request$Priority", "", "Lru/yandex/taxi/locationsdk/locationprovider/android/AndroidMobileServicesClientAdapter$Request$Priority;", "HIGH_ACCURACY", "BALANCED_POWER_ACCURACY", "LOW_POWER", "PASSIVE", "location-provider-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidMobileServicesClientAdapter$Request$Priority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidMobileServicesClientAdapter$Request$Priority[] $VALUES;
    public static final AndroidMobileServicesClientAdapter$Request$Priority BALANCED_POWER_ACCURACY;
    public static final AndroidMobileServicesClientAdapter$Request$Priority HIGH_ACCURACY;
    public static final AndroidMobileServicesClientAdapter$Request$Priority LOW_POWER;
    public static final AndroidMobileServicesClientAdapter$Request$Priority PASSIVE;

    static {
        AndroidMobileServicesClientAdapter$Request$Priority androidMobileServicesClientAdapter$Request$Priority = new AndroidMobileServicesClientAdapter$Request$Priority("HIGH_ACCURACY", 0);
        HIGH_ACCURACY = androidMobileServicesClientAdapter$Request$Priority;
        AndroidMobileServicesClientAdapter$Request$Priority androidMobileServicesClientAdapter$Request$Priority2 = new AndroidMobileServicesClientAdapter$Request$Priority("BALANCED_POWER_ACCURACY", 1);
        BALANCED_POWER_ACCURACY = androidMobileServicesClientAdapter$Request$Priority2;
        AndroidMobileServicesClientAdapter$Request$Priority androidMobileServicesClientAdapter$Request$Priority3 = new AndroidMobileServicesClientAdapter$Request$Priority("LOW_POWER", 2);
        LOW_POWER = androidMobileServicesClientAdapter$Request$Priority3;
        AndroidMobileServicesClientAdapter$Request$Priority androidMobileServicesClientAdapter$Request$Priority4 = new AndroidMobileServicesClientAdapter$Request$Priority("PASSIVE", 3);
        PASSIVE = androidMobileServicesClientAdapter$Request$Priority4;
        AndroidMobileServicesClientAdapter$Request$Priority[] androidMobileServicesClientAdapter$Request$PriorityArr = {androidMobileServicesClientAdapter$Request$Priority, androidMobileServicesClientAdapter$Request$Priority2, androidMobileServicesClientAdapter$Request$Priority3, androidMobileServicesClientAdapter$Request$Priority4};
        $VALUES = androidMobileServicesClientAdapter$Request$PriorityArr;
        $ENTRIES = kotlin.enums.a.a(androidMobileServicesClientAdapter$Request$PriorityArr);
    }

    public static AndroidMobileServicesClientAdapter$Request$Priority valueOf(String str) {
        return (AndroidMobileServicesClientAdapter$Request$Priority) Enum.valueOf(AndroidMobileServicesClientAdapter$Request$Priority.class, str);
    }

    public static AndroidMobileServicesClientAdapter$Request$Priority[] values() {
        return (AndroidMobileServicesClientAdapter$Request$Priority[]) $VALUES.clone();
    }
}
