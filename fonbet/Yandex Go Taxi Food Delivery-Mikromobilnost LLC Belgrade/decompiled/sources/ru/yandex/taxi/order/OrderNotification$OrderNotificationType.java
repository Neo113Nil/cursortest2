package ru.yandex.taxi.order;

import defpackage.k4o;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"ru/yandex/taxi/order/OrderNotification$OrderNotificationType", "", "Lru/yandex/taxi/order/OrderNotification$OrderNotificationType;", "", "id", CA20Status.STATUS_USER_I, "b", "()I", "ORDER", "ORDER_SEARCH", "ORDER_CHECK_IN", "ORDER_TRANSPORTING", "ORDER_DRIVING", "ORDER_WAITING", "ORDER_UPDATE_BY_PUSH", "TAXI_ARRIVING", "TAXI_REORDER", "UPDATE_REQUIREMENTS", "PREPAID_TIME_ENDS_SOON", "PREPAID_TIME_ENDS_NOW", "ORDER_INFORMATION", "ORDER_ALTERNATIVE_POINT_A_FOUND", "ORDER_TRANSPORTING_TIPS", "ORDER_WAITING_LIVE_UPDATES", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderNotification$OrderNotificationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderNotification$OrderNotificationType[] $VALUES;
    public static final OrderNotification$OrderNotificationType ORDER;
    public static final OrderNotification$OrderNotificationType ORDER_ALTERNATIVE_POINT_A_FOUND;
    public static final OrderNotification$OrderNotificationType ORDER_CHECK_IN;
    public static final OrderNotification$OrderNotificationType ORDER_DRIVING;
    public static final OrderNotification$OrderNotificationType ORDER_INFORMATION;
    public static final OrderNotification$OrderNotificationType ORDER_SEARCH;
    public static final OrderNotification$OrderNotificationType ORDER_TRANSPORTING;
    public static final OrderNotification$OrderNotificationType ORDER_TRANSPORTING_TIPS;
    public static final OrderNotification$OrderNotificationType ORDER_UPDATE_BY_PUSH;
    public static final OrderNotification$OrderNotificationType ORDER_WAITING;
    public static final OrderNotification$OrderNotificationType ORDER_WAITING_LIVE_UPDATES;
    public static final OrderNotification$OrderNotificationType PREPAID_TIME_ENDS_NOW;
    public static final OrderNotification$OrderNotificationType PREPAID_TIME_ENDS_SOON;
    public static final OrderNotification$OrderNotificationType TAXI_ARRIVING;
    public static final OrderNotification$OrderNotificationType TAXI_REORDER;
    public static final OrderNotification$OrderNotificationType UPDATE_REQUIREMENTS;
    private final int id;

    static {
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = new OrderNotification$OrderNotificationType("ORDER", 0, 32455);
        ORDER = orderNotification$OrderNotificationType;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType2 = new OrderNotification$OrderNotificationType("ORDER_SEARCH", 1, 23562);
        ORDER_SEARCH = orderNotification$OrderNotificationType2;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType3 = new OrderNotification$OrderNotificationType("ORDER_CHECK_IN", 2, 23564);
        ORDER_CHECK_IN = orderNotification$OrderNotificationType3;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType4 = new OrderNotification$OrderNotificationType("ORDER_TRANSPORTING", 3, 23565);
        ORDER_TRANSPORTING = orderNotification$OrderNotificationType4;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType5 = new OrderNotification$OrderNotificationType("ORDER_DRIVING", 4, 32458);
        ORDER_DRIVING = orderNotification$OrderNotificationType5;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType6 = new OrderNotification$OrderNotificationType("ORDER_WAITING", 5, 16853);
        ORDER_WAITING = orderNotification$OrderNotificationType6;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType7 = new OrderNotification$OrderNotificationType("ORDER_UPDATE_BY_PUSH", 6, 31944);
        ORDER_UPDATE_BY_PUSH = orderNotification$OrderNotificationType7;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType8 = new OrderNotification$OrderNotificationType("TAXI_ARRIVING", 7, 15678);
        TAXI_ARRIVING = orderNotification$OrderNotificationType8;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType9 = new OrderNotification$OrderNotificationType("TAXI_REORDER", 8, 15679);
        TAXI_REORDER = orderNotification$OrderNotificationType9;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType10 = new OrderNotification$OrderNotificationType("UPDATE_REQUIREMENTS", 9, 13113);
        UPDATE_REQUIREMENTS = orderNotification$OrderNotificationType10;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType11 = new OrderNotification$OrderNotificationType("PREPAID_TIME_ENDS_SOON", 10, 13114);
        PREPAID_TIME_ENDS_SOON = orderNotification$OrderNotificationType11;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType12 = new OrderNotification$OrderNotificationType("PREPAID_TIME_ENDS_NOW", 11, 13115);
        PREPAID_TIME_ENDS_NOW = orderNotification$OrderNotificationType12;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType13 = new OrderNotification$OrderNotificationType("ORDER_INFORMATION", 12, 31945);
        ORDER_INFORMATION = orderNotification$OrderNotificationType13;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType14 = new OrderNotification$OrderNotificationType("ORDER_ALTERNATIVE_POINT_A_FOUND", 13, 31946);
        ORDER_ALTERNATIVE_POINT_A_FOUND = orderNotification$OrderNotificationType14;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType15 = new OrderNotification$OrderNotificationType("ORDER_TRANSPORTING_TIPS", 14, 31947);
        ORDER_TRANSPORTING_TIPS = orderNotification$OrderNotificationType15;
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType16 = new OrderNotification$OrderNotificationType("ORDER_WAITING_LIVE_UPDATES", 15, 31948);
        ORDER_WAITING_LIVE_UPDATES = orderNotification$OrderNotificationType16;
        OrderNotification$OrderNotificationType[] orderNotification$OrderNotificationTypeArr = {orderNotification$OrderNotificationType, orderNotification$OrderNotificationType2, orderNotification$OrderNotificationType3, orderNotification$OrderNotificationType4, orderNotification$OrderNotificationType5, orderNotification$OrderNotificationType6, orderNotification$OrderNotificationType7, orderNotification$OrderNotificationType8, orderNotification$OrderNotificationType9, orderNotification$OrderNotificationType10, orderNotification$OrderNotificationType11, orderNotification$OrderNotificationType12, orderNotification$OrderNotificationType13, orderNotification$OrderNotificationType14, orderNotification$OrderNotificationType15, orderNotification$OrderNotificationType16};
        $VALUES = orderNotification$OrderNotificationTypeArr;
        $ENTRIES = kotlin.enums.a.a(orderNotification$OrderNotificationTypeArr);
    }

    public OrderNotification$OrderNotificationType(String str, int i, int i2) {
        this.id = i2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static OrderNotification$OrderNotificationType valueOf(String str) {
        return (OrderNotification$OrderNotificationType) Enum.valueOf(OrderNotification$OrderNotificationType.class, str);
    }

    public static OrderNotification$OrderNotificationType[] values() {
        return (OrderNotification$OrderNotificationType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
