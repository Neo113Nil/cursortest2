package ru.yandex.taxi.map.overlay;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/map/overlay/OrderDrivingRoute$Type", "", "Lru/yandex/taxi/map/overlay/OrderDrivingRoute$Type;", "NORMAL_MONOCHROME", "NORMAL_JAMS_COLORED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderDrivingRoute$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderDrivingRoute$Type[] $VALUES;
    public static final OrderDrivingRoute$Type NORMAL_JAMS_COLORED;
    public static final OrderDrivingRoute$Type NORMAL_MONOCHROME;

    static {
        OrderDrivingRoute$Type orderDrivingRoute$Type = new OrderDrivingRoute$Type("NORMAL_MONOCHROME", 0);
        NORMAL_MONOCHROME = orderDrivingRoute$Type;
        OrderDrivingRoute$Type orderDrivingRoute$Type2 = new OrderDrivingRoute$Type("NORMAL_JAMS_COLORED", 1);
        NORMAL_JAMS_COLORED = orderDrivingRoute$Type2;
        OrderDrivingRoute$Type[] orderDrivingRoute$TypeArr = {orderDrivingRoute$Type, orderDrivingRoute$Type2};
        $VALUES = orderDrivingRoute$TypeArr;
        $ENTRIES = kotlin.enums.a.a(orderDrivingRoute$TypeArr);
    }

    public static OrderDrivingRoute$Type valueOf(String str) {
        return (OrderDrivingRoute$Type) Enum.valueOf(OrderDrivingRoute$Type.class, str);
    }

    public static OrderDrivingRoute$Type[] values() {
        return (OrderDrivingRoute$Type[]) $VALUES.clone();
    }
}
