package ru.yandex.taxi.map.overlay.order;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/map/overlay/order/OrderMapOverlayComponent$Mode", "", "Lru/yandex/taxi/map/overlay/order/OrderMapOverlayComponent$Mode;", "SINGLE", "MULTIPLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderMapOverlayComponent$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderMapOverlayComponent$Mode[] $VALUES;
    public static final OrderMapOverlayComponent$Mode MULTIPLE;
    public static final OrderMapOverlayComponent$Mode SINGLE;

    static {
        OrderMapOverlayComponent$Mode orderMapOverlayComponent$Mode = new OrderMapOverlayComponent$Mode("SINGLE", 0);
        SINGLE = orderMapOverlayComponent$Mode;
        OrderMapOverlayComponent$Mode orderMapOverlayComponent$Mode2 = new OrderMapOverlayComponent$Mode("MULTIPLE", 1);
        MULTIPLE = orderMapOverlayComponent$Mode2;
        OrderMapOverlayComponent$Mode[] orderMapOverlayComponent$ModeArr = {orderMapOverlayComponent$Mode, orderMapOverlayComponent$Mode2};
        $VALUES = orderMapOverlayComponent$ModeArr;
        $ENTRIES = a.a(orderMapOverlayComponent$ModeArr);
    }

    public static OrderMapOverlayComponent$Mode valueOf(String str) {
        return (OrderMapOverlayComponent$Mode) Enum.valueOf(OrderMapOverlayComponent$Mode.class, str);
    }

    public static OrderMapOverlayComponent$Mode[] values() {
        return (OrderMapOverlayComponent$Mode[]) $VALUES.clone();
    }
}
