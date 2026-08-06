package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f3747a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f3748b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f3749c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f3747a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f3748b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f3749c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f3747a + ", mHuawei=" + this.f3748b + ", yandex=" + this.f3749c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f3747a = adTrackingInfoResult;
        this.f3748b = adTrackingInfoResult2;
        this.f3749c = adTrackingInfoResult3;
    }
}
