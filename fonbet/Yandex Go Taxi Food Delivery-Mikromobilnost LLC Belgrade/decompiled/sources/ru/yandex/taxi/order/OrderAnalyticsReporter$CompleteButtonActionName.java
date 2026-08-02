package ru.yandex.taxi.order;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/order/OrderAnalyticsReporter$CompleteButtonActionName", "", "Lru/yandex/taxi/order/OrderAnalyticsReporter$CompleteButtonActionName;", "CLOSE", "CLOSE_AND_DEEPLINK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderAnalyticsReporter$CompleteButtonActionName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderAnalyticsReporter$CompleteButtonActionName[] $VALUES;
    public static final OrderAnalyticsReporter$CompleteButtonActionName CLOSE;
    public static final OrderAnalyticsReporter$CompleteButtonActionName CLOSE_AND_DEEPLINK;

    static {
        OrderAnalyticsReporter$CompleteButtonActionName orderAnalyticsReporter$CompleteButtonActionName = new OrderAnalyticsReporter$CompleteButtonActionName("CLOSE", 0);
        CLOSE = orderAnalyticsReporter$CompleteButtonActionName;
        OrderAnalyticsReporter$CompleteButtonActionName orderAnalyticsReporter$CompleteButtonActionName2 = new OrderAnalyticsReporter$CompleteButtonActionName("CLOSE_AND_DEEPLINK", 1);
        CLOSE_AND_DEEPLINK = orderAnalyticsReporter$CompleteButtonActionName2;
        OrderAnalyticsReporter$CompleteButtonActionName[] orderAnalyticsReporter$CompleteButtonActionNameArr = {orderAnalyticsReporter$CompleteButtonActionName, orderAnalyticsReporter$CompleteButtonActionName2};
        $VALUES = orderAnalyticsReporter$CompleteButtonActionNameArr;
        $ENTRIES = kotlin.enums.a.a(orderAnalyticsReporter$CompleteButtonActionNameArr);
    }

    public static OrderAnalyticsReporter$CompleteButtonActionName valueOf(String str) {
        return (OrderAnalyticsReporter$CompleteButtonActionName) Enum.valueOf(OrderAnalyticsReporter$CompleteButtonActionName.class, str);
    }

    public static OrderAnalyticsReporter$CompleteButtonActionName[] values() {
        return (OrderAnalyticsReporter$CompleteButtonActionName[]) $VALUES.clone();
    }
}
