package ru.yandex.taxi.locationsdk.locationprovider.android;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/locationsdk/locationprovider/android/AndroidLocationProviderType;", "", "GPS", "NETWORK", "PASSIVE", "FUSED", "location-provider-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidLocationProviderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidLocationProviderType[] $VALUES;
    public static final AndroidLocationProviderType FUSED;
    public static final AndroidLocationProviderType GPS;
    public static final AndroidLocationProviderType NETWORK;
    public static final AndroidLocationProviderType PASSIVE;

    static {
        AndroidLocationProviderType androidLocationProviderType = new AndroidLocationProviderType("GPS", 0);
        GPS = androidLocationProviderType;
        AndroidLocationProviderType androidLocationProviderType2 = new AndroidLocationProviderType("NETWORK", 1);
        NETWORK = androidLocationProviderType2;
        AndroidLocationProviderType androidLocationProviderType3 = new AndroidLocationProviderType("PASSIVE", 2);
        PASSIVE = androidLocationProviderType3;
        AndroidLocationProviderType androidLocationProviderType4 = new AndroidLocationProviderType("FUSED", 3);
        FUSED = androidLocationProviderType4;
        AndroidLocationProviderType[] androidLocationProviderTypeArr = {androidLocationProviderType, androidLocationProviderType2, androidLocationProviderType3, androidLocationProviderType4};
        $VALUES = androidLocationProviderTypeArr;
        $ENTRIES = kotlin.enums.a.a(androidLocationProviderTypeArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static AndroidLocationProviderType valueOf(String str) {
        return (AndroidLocationProviderType) Enum.valueOf(AndroidLocationProviderType.class, str);
    }

    public static AndroidLocationProviderType[] values() {
        return (AndroidLocationProviderType[]) $VALUES.clone();
    }
}
