package ru.yandex.taxi.orderpopup.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/orderpopup/analytics/OrderPopupAnalytics$Screen", "", "Lru/yandex/taxi/orderpopup/analytics/OrderPopupAnalytics$Screen;", "SUMMARY", "ACTIVE_COMBO_ORDER", "INTERCITY_DASHBOARD", "order_popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderPopupAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderPopupAnalytics$Screen[] $VALUES;
    public static final OrderPopupAnalytics$Screen ACTIVE_COMBO_ORDER;
    public static final OrderPopupAnalytics$Screen INTERCITY_DASHBOARD;
    public static final OrderPopupAnalytics$Screen SUMMARY;

    static {
        OrderPopupAnalytics$Screen orderPopupAnalytics$Screen = new OrderPopupAnalytics$Screen("SUMMARY", 0);
        SUMMARY = orderPopupAnalytics$Screen;
        OrderPopupAnalytics$Screen orderPopupAnalytics$Screen2 = new OrderPopupAnalytics$Screen("ACTIVE_COMBO_ORDER", 1);
        ACTIVE_COMBO_ORDER = orderPopupAnalytics$Screen2;
        OrderPopupAnalytics$Screen orderPopupAnalytics$Screen3 = new OrderPopupAnalytics$Screen("INTERCITY_DASHBOARD", 2);
        INTERCITY_DASHBOARD = orderPopupAnalytics$Screen3;
        OrderPopupAnalytics$Screen[] orderPopupAnalytics$ScreenArr = {orderPopupAnalytics$Screen, orderPopupAnalytics$Screen2, orderPopupAnalytics$Screen3};
        $VALUES = orderPopupAnalytics$ScreenArr;
        $ENTRIES = a.a(orderPopupAnalytics$ScreenArr);
    }

    public static OrderPopupAnalytics$Screen valueOf(String str) {
        return (OrderPopupAnalytics$Screen) Enum.valueOf(OrderPopupAnalytics$Screen.class, str);
    }

    public static OrderPopupAnalytics$Screen[] values() {
        return (OrderPopupAnalytics$Screen[]) $VALUES.clone();
    }
}
