package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$CheckoutActionType", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$CheckoutActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Notification", "Modal", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$CheckoutActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$CheckoutActionType[] $VALUES;
    public static final TransportRouteAnalytics$CheckoutActionType Modal;
    public static final TransportRouteAnalytics$CheckoutActionType Notification;
    private final String eventValue;

    static {
        TransportRouteAnalytics$CheckoutActionType transportRouteAnalytics$CheckoutActionType = new TransportRouteAnalytics$CheckoutActionType("Notification", 0, "notification");
        Notification = transportRouteAnalytics$CheckoutActionType;
        TransportRouteAnalytics$CheckoutActionType transportRouteAnalytics$CheckoutActionType2 = new TransportRouteAnalytics$CheckoutActionType("Modal", 1, "modal");
        Modal = transportRouteAnalytics$CheckoutActionType2;
        TransportRouteAnalytics$CheckoutActionType[] transportRouteAnalytics$CheckoutActionTypeArr = {transportRouteAnalytics$CheckoutActionType, transportRouteAnalytics$CheckoutActionType2};
        $VALUES = transportRouteAnalytics$CheckoutActionTypeArr;
        $ENTRIES = a.a(transportRouteAnalytics$CheckoutActionTypeArr);
    }

    public TransportRouteAnalytics$CheckoutActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$CheckoutActionType valueOf(String str) {
        return (TransportRouteAnalytics$CheckoutActionType) Enum.valueOf(TransportRouteAnalytics$CheckoutActionType.class, str);
    }

    public static TransportRouteAnalytics$CheckoutActionType[] values() {
        return (TransportRouteAnalytics$CheckoutActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
