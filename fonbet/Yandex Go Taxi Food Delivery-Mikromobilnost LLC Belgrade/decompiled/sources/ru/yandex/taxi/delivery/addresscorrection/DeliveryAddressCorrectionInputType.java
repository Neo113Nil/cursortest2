package ru.yandex.taxi.delivery.addresscorrection;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/delivery/addresscorrection/DeliveryAddressCorrectionInputType;", "", "APARTMENT", "PORCH", "FLOOR", "DOORPHONE", "COMMENT", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryAddressCorrectionInputType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryAddressCorrectionInputType[] $VALUES;
    public static final DeliveryAddressCorrectionInputType APARTMENT;
    public static final DeliveryAddressCorrectionInputType COMMENT;
    public static final DeliveryAddressCorrectionInputType DOORPHONE;
    public static final DeliveryAddressCorrectionInputType FLOOR;
    public static final DeliveryAddressCorrectionInputType PORCH;

    static {
        DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType = new DeliveryAddressCorrectionInputType("APARTMENT", 0);
        APARTMENT = deliveryAddressCorrectionInputType;
        DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType2 = new DeliveryAddressCorrectionInputType("PORCH", 1);
        PORCH = deliveryAddressCorrectionInputType2;
        DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType3 = new DeliveryAddressCorrectionInputType("FLOOR", 2);
        FLOOR = deliveryAddressCorrectionInputType3;
        DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType4 = new DeliveryAddressCorrectionInputType("DOORPHONE", 3);
        DOORPHONE = deliveryAddressCorrectionInputType4;
        DeliveryAddressCorrectionInputType deliveryAddressCorrectionInputType5 = new DeliveryAddressCorrectionInputType("COMMENT", 4);
        COMMENT = deliveryAddressCorrectionInputType5;
        DeliveryAddressCorrectionInputType[] deliveryAddressCorrectionInputTypeArr = {deliveryAddressCorrectionInputType, deliveryAddressCorrectionInputType2, deliveryAddressCorrectionInputType3, deliveryAddressCorrectionInputType4, deliveryAddressCorrectionInputType5};
        $VALUES = deliveryAddressCorrectionInputTypeArr;
        $ENTRIES = a.a(deliveryAddressCorrectionInputTypeArr);
    }

    public static DeliveryAddressCorrectionInputType valueOf(String str) {
        return (DeliveryAddressCorrectionInputType) Enum.valueOf(DeliveryAddressCorrectionInputType.class, str);
    }

    public static DeliveryAddressCorrectionInputType[] values() {
        return (DeliveryAddressCorrectionInputType[]) $VALUES.clone();
    }
}
