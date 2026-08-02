package ru.yandex.taxi.preorder.source.pickup;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/preorder/source/pickup/PickupPointAnalytics$PointType", "", "Lru/yandex/taxi/preorder/source/pickup/PickupPointAnalytics$PointType;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setAnalyticsName", "(Ljava/lang/String;)V", "SOURCE", "DESTINATION", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PickupPointAnalytics$PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PickupPointAnalytics$PointType[] $VALUES;
    public static final PickupPointAnalytics$PointType DESTINATION;
    public static final PickupPointAnalytics$PointType SOURCE;
    private String analyticsName;

    static {
        PickupPointAnalytics$PointType pickupPointAnalytics$PointType = new PickupPointAnalytics$PointType("SOURCE", 0, "starting");
        SOURCE = pickupPointAnalytics$PointType;
        PickupPointAnalytics$PointType pickupPointAnalytics$PointType2 = new PickupPointAnalytics$PointType("DESTINATION", 1, "destination");
        DESTINATION = pickupPointAnalytics$PointType2;
        PickupPointAnalytics$PointType[] pickupPointAnalytics$PointTypeArr = {pickupPointAnalytics$PointType, pickupPointAnalytics$PointType2};
        $VALUES = pickupPointAnalytics$PointTypeArr;
        $ENTRIES = kotlin.enums.a.a(pickupPointAnalytics$PointTypeArr);
    }

    public PickupPointAnalytics$PointType(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static PickupPointAnalytics$PointType valueOf(String str) {
        return (PickupPointAnalytics$PointType) Enum.valueOf(PickupPointAnalytics$PointType.class, str);
    }

    public static PickupPointAnalytics$PointType[] values() {
        return (PickupPointAnalytics$PointType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
