package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/logistics/sdk/delivery/state/DeliveryState$Poll$Question$ChoicesType", "", "Lru/yandex/taxi/logistics/sdk/delivery/state/DeliveryState$Poll$Question$ChoicesType;", "SINGLE", "MULTI", "sdk-delivery"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryState$Poll$Question$ChoicesType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryState$Poll$Question$ChoicesType[] $VALUES;
    public static final DeliveryState$Poll$Question$ChoicesType MULTI;
    public static final DeliveryState$Poll$Question$ChoicesType SINGLE;

    static {
        DeliveryState$Poll$Question$ChoicesType deliveryState$Poll$Question$ChoicesType = new DeliveryState$Poll$Question$ChoicesType("SINGLE", 0);
        SINGLE = deliveryState$Poll$Question$ChoicesType;
        DeliveryState$Poll$Question$ChoicesType deliveryState$Poll$Question$ChoicesType2 = new DeliveryState$Poll$Question$ChoicesType("MULTI", 1);
        MULTI = deliveryState$Poll$Question$ChoicesType2;
        DeliveryState$Poll$Question$ChoicesType[] deliveryState$Poll$Question$ChoicesTypeArr = {deliveryState$Poll$Question$ChoicesType, deliveryState$Poll$Question$ChoicesType2};
        $VALUES = deliveryState$Poll$Question$ChoicesTypeArr;
        $ENTRIES = kotlin.enums.a.a(deliveryState$Poll$Question$ChoicesTypeArr);
    }

    public static DeliveryState$Poll$Question$ChoicesType valueOf(String str) {
        return (DeliveryState$Poll$Question$ChoicesType) Enum.valueOf(DeliveryState$Poll$Question$ChoicesType.class, str);
    }

    public static DeliveryState$Poll$Question$ChoicesType[] values() {
        return (DeliveryState$Poll$Question$ChoicesType[]) $VALUES.clone();
    }
}
