package ru.yandex.taxi.locationsdk.locationprovider.android;

import defpackage.k4o;
import defpackage.q92;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/locationsdk/locationprovider/android/AndroidFusedLocationProviderType$MobileServicesClient", "Lq92;", "", "Lru/yandex/taxi/locationsdk/locationprovider/android/AndroidFusedLocationProviderType$MobileServicesClient;", "Google", "Huawei", "location-provider-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidFusedLocationProviderType$MobileServicesClient implements q92 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidFusedLocationProviderType$MobileServicesClient[] $VALUES;
    public static final AndroidFusedLocationProviderType$MobileServicesClient Google;
    public static final AndroidFusedLocationProviderType$MobileServicesClient Huawei;

    static {
        AndroidFusedLocationProviderType$MobileServicesClient androidFusedLocationProviderType$MobileServicesClient = new AndroidFusedLocationProviderType$MobileServicesClient("Google", 0);
        Google = androidFusedLocationProviderType$MobileServicesClient;
        AndroidFusedLocationProviderType$MobileServicesClient androidFusedLocationProviderType$MobileServicesClient2 = new AndroidFusedLocationProviderType$MobileServicesClient("Huawei", 1);
        Huawei = androidFusedLocationProviderType$MobileServicesClient2;
        AndroidFusedLocationProviderType$MobileServicesClient[] androidFusedLocationProviderType$MobileServicesClientArr = {androidFusedLocationProviderType$MobileServicesClient, androidFusedLocationProviderType$MobileServicesClient2};
        $VALUES = androidFusedLocationProviderType$MobileServicesClientArr;
        $ENTRIES = kotlin.enums.a.a(androidFusedLocationProviderType$MobileServicesClientArr);
    }

    public static AndroidFusedLocationProviderType$MobileServicesClient valueOf(String str) {
        return (AndroidFusedLocationProviderType$MobileServicesClient) Enum.valueOf(AndroidFusedLocationProviderType$MobileServicesClient.class, str);
    }

    public static AndroidFusedLocationProviderType$MobileServicesClient[] values() {
        return (AndroidFusedLocationProviderType$MobileServicesClient[]) $VALUES.clone();
    }
}
