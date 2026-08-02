package ru.yandex.taxi.locationsdk.locationprovider.android;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/locationsdk/locationprovider/android/AndroidLocationType;", "", "Gps", "Network", "Fused", "location-provider-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidLocationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidLocationType[] $VALUES;
    public static final AndroidLocationType Fused;
    public static final AndroidLocationType Gps;
    public static final AndroidLocationType Network;

    static {
        AndroidLocationType androidLocationType = new AndroidLocationType("Gps", 0);
        Gps = androidLocationType;
        AndroidLocationType androidLocationType2 = new AndroidLocationType("Network", 1);
        Network = androidLocationType2;
        AndroidLocationType androidLocationType3 = new AndroidLocationType("Fused", 2);
        Fused = androidLocationType3;
        AndroidLocationType[] androidLocationTypeArr = {androidLocationType, androidLocationType2, androidLocationType3};
        $VALUES = androidLocationTypeArr;
        $ENTRIES = kotlin.enums.a.a(androidLocationTypeArr);
    }

    public static AndroidLocationType valueOf(String str) {
        return (AndroidLocationType) Enum.valueOf(AndroidLocationType.class, str);
    }

    public static AndroidLocationType[] values() {
        return (AndroidLocationType[]) $VALUES.clone();
    }
}
