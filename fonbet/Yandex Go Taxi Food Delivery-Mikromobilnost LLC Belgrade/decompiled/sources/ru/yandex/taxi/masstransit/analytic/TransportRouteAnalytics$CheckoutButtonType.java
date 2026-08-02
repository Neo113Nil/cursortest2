package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$CheckoutButtonType", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$CheckoutButtonType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TripType", "Conditions", "TariffName", "AdultTicket", "ChildrenTicket", "PaymentMethod", "Payment", "Back", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$CheckoutButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$CheckoutButtonType[] $VALUES;
    public static final TransportRouteAnalytics$CheckoutButtonType AdultTicket;
    public static final TransportRouteAnalytics$CheckoutButtonType Back;
    public static final TransportRouteAnalytics$CheckoutButtonType ChildrenTicket;
    public static final TransportRouteAnalytics$CheckoutButtonType Conditions;
    public static final TransportRouteAnalytics$CheckoutButtonType Payment;
    public static final TransportRouteAnalytics$CheckoutButtonType PaymentMethod;
    public static final TransportRouteAnalytics$CheckoutButtonType TariffName;
    public static final TransportRouteAnalytics$CheckoutButtonType TripType;
    private final String eventValue;

    static {
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType = new TransportRouteAnalytics$CheckoutButtonType("TripType", 0, "trip_type");
        TripType = transportRouteAnalytics$CheckoutButtonType;
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType2 = new TransportRouteAnalytics$CheckoutButtonType("Conditions", 1, "conditions");
        Conditions = transportRouteAnalytics$CheckoutButtonType2;
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType3 = new TransportRouteAnalytics$CheckoutButtonType("TariffName", 2, "tariff_name");
        TariffName = transportRouteAnalytics$CheckoutButtonType3;
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType4 = new TransportRouteAnalytics$CheckoutButtonType("AdultTicket", 3, "adult_ticket");
        AdultTicket = transportRouteAnalytics$CheckoutButtonType4;
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType5 = new TransportRouteAnalytics$CheckoutButtonType("ChildrenTicket", 4, "children_ticket");
        ChildrenTicket = transportRouteAnalytics$CheckoutButtonType5;
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType6 = new TransportRouteAnalytics$CheckoutButtonType("PaymentMethod", 5, "payment_method");
        PaymentMethod = transportRouteAnalytics$CheckoutButtonType6;
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType7 = new TransportRouteAnalytics$CheckoutButtonType("Payment", 6, "payment");
        Payment = transportRouteAnalytics$CheckoutButtonType7;
        TransportRouteAnalytics$CheckoutButtonType transportRouteAnalytics$CheckoutButtonType8 = new TransportRouteAnalytics$CheckoutButtonType("Back", 7, "back");
        Back = transportRouteAnalytics$CheckoutButtonType8;
        TransportRouteAnalytics$CheckoutButtonType[] transportRouteAnalytics$CheckoutButtonTypeArr = {transportRouteAnalytics$CheckoutButtonType, transportRouteAnalytics$CheckoutButtonType2, transportRouteAnalytics$CheckoutButtonType3, transportRouteAnalytics$CheckoutButtonType4, transportRouteAnalytics$CheckoutButtonType5, transportRouteAnalytics$CheckoutButtonType6, transportRouteAnalytics$CheckoutButtonType7, transportRouteAnalytics$CheckoutButtonType8};
        $VALUES = transportRouteAnalytics$CheckoutButtonTypeArr;
        $ENTRIES = a.a(transportRouteAnalytics$CheckoutButtonTypeArr);
    }

    public TransportRouteAnalytics$CheckoutButtonType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$CheckoutButtonType valueOf(String str) {
        return (TransportRouteAnalytics$CheckoutButtonType) Enum.valueOf(TransportRouteAnalytics$CheckoutButtonType.class, str);
    }

    public static TransportRouteAnalytics$CheckoutButtonType[] values() {
        return (TransportRouteAnalytics$CheckoutButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
