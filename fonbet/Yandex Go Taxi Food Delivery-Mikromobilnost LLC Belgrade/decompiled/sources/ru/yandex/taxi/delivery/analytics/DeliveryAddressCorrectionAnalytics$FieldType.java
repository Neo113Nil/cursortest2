package ru.yandex.taxi.delivery.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"ru/yandex/taxi/delivery/analytics/DeliveryAddressCorrectionAnalytics$FieldType", "", "Lru/yandex/taxi/delivery/analytics/DeliveryAddressCorrectionAnalytics$FieldType;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "STREET", "APARTMENT", "ENTRANCE", "FLOOR", "DOORPHONE", "COMMENT", "RECIPIENT", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryAddressCorrectionAnalytics$FieldType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryAddressCorrectionAnalytics$FieldType[] $VALUES;
    public static final DeliveryAddressCorrectionAnalytics$FieldType APARTMENT;
    public static final DeliveryAddressCorrectionAnalytics$FieldType COMMENT;
    public static final DeliveryAddressCorrectionAnalytics$FieldType DOORPHONE;
    public static final DeliveryAddressCorrectionAnalytics$FieldType ENTRANCE;
    public static final DeliveryAddressCorrectionAnalytics$FieldType FLOOR;
    public static final DeliveryAddressCorrectionAnalytics$FieldType RECIPIENT;
    public static final DeliveryAddressCorrectionAnalytics$FieldType STREET;
    private final String analyticsName;

    static {
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType = new DeliveryAddressCorrectionAnalytics$FieldType("STREET", 0, "street");
        STREET = deliveryAddressCorrectionAnalytics$FieldType;
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType2 = new DeliveryAddressCorrectionAnalytics$FieldType("APARTMENT", 1, "appartment");
        APARTMENT = deliveryAddressCorrectionAnalytics$FieldType2;
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType3 = new DeliveryAddressCorrectionAnalytics$FieldType("ENTRANCE", 2, "entrance");
        ENTRANCE = deliveryAddressCorrectionAnalytics$FieldType3;
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType4 = new DeliveryAddressCorrectionAnalytics$FieldType("FLOOR", 3, "floor");
        FLOOR = deliveryAddressCorrectionAnalytics$FieldType4;
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType5 = new DeliveryAddressCorrectionAnalytics$FieldType("DOORPHONE", 4, "doorphone");
        DOORPHONE = deliveryAddressCorrectionAnalytics$FieldType5;
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType6 = new DeliveryAddressCorrectionAnalytics$FieldType("COMMENT", 5, "comment");
        COMMENT = deliveryAddressCorrectionAnalytics$FieldType6;
        DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType7 = new DeliveryAddressCorrectionAnalytics$FieldType("RECIPIENT", 6, "recipient");
        RECIPIENT = deliveryAddressCorrectionAnalytics$FieldType7;
        DeliveryAddressCorrectionAnalytics$FieldType[] deliveryAddressCorrectionAnalytics$FieldTypeArr = {deliveryAddressCorrectionAnalytics$FieldType, deliveryAddressCorrectionAnalytics$FieldType2, deliveryAddressCorrectionAnalytics$FieldType3, deliveryAddressCorrectionAnalytics$FieldType4, deliveryAddressCorrectionAnalytics$FieldType5, deliveryAddressCorrectionAnalytics$FieldType6, deliveryAddressCorrectionAnalytics$FieldType7};
        $VALUES = deliveryAddressCorrectionAnalytics$FieldTypeArr;
        $ENTRIES = a.a(deliveryAddressCorrectionAnalytics$FieldTypeArr);
    }

    public DeliveryAddressCorrectionAnalytics$FieldType(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static DeliveryAddressCorrectionAnalytics$FieldType valueOf(String str) {
        return (DeliveryAddressCorrectionAnalytics$FieldType) Enum.valueOf(DeliveryAddressCorrectionAnalytics$FieldType.class, str);
    }

    public static DeliveryAddressCorrectionAnalytics$FieldType[] values() {
        return (DeliveryAddressCorrectionAnalytics$FieldType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
