package ru.yandex.taxi.masstransit.geopayment.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$CheckoutButtonActionType", "", "Lru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$CheckoutButtonActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "AddTicket", "RemoveTicket", "GoToPayment", "FinalStop", "PaymentMethod", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportPaymentAnalytics$CheckoutButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportPaymentAnalytics$CheckoutButtonActionType[] $VALUES;
    public static final TransportPaymentAnalytics$CheckoutButtonActionType AddTicket;
    public static final TransportPaymentAnalytics$CheckoutButtonActionType Back;
    public static final TransportPaymentAnalytics$CheckoutButtonActionType FinalStop;
    public static final TransportPaymentAnalytics$CheckoutButtonActionType GoToPayment;
    public static final TransportPaymentAnalytics$CheckoutButtonActionType PaymentMethod;
    public static final TransportPaymentAnalytics$CheckoutButtonActionType RemoveTicket;
    private final String eventValue;

    static {
        TransportPaymentAnalytics$CheckoutButtonActionType transportPaymentAnalytics$CheckoutButtonActionType = new TransportPaymentAnalytics$CheckoutButtonActionType("Back", 0, "back");
        Back = transportPaymentAnalytics$CheckoutButtonActionType;
        TransportPaymentAnalytics$CheckoutButtonActionType transportPaymentAnalytics$CheckoutButtonActionType2 = new TransportPaymentAnalytics$CheckoutButtonActionType("AddTicket", 1, "add_ticket");
        AddTicket = transportPaymentAnalytics$CheckoutButtonActionType2;
        TransportPaymentAnalytics$CheckoutButtonActionType transportPaymentAnalytics$CheckoutButtonActionType3 = new TransportPaymentAnalytics$CheckoutButtonActionType("RemoveTicket", 2, "remove_ticket");
        RemoveTicket = transportPaymentAnalytics$CheckoutButtonActionType3;
        TransportPaymentAnalytics$CheckoutButtonActionType transportPaymentAnalytics$CheckoutButtonActionType4 = new TransportPaymentAnalytics$CheckoutButtonActionType("GoToPayment", 3, "go_to_payment");
        GoToPayment = transportPaymentAnalytics$CheckoutButtonActionType4;
        TransportPaymentAnalytics$CheckoutButtonActionType transportPaymentAnalytics$CheckoutButtonActionType5 = new TransportPaymentAnalytics$CheckoutButtonActionType("FinalStop", 4, "final_stop");
        FinalStop = transportPaymentAnalytics$CheckoutButtonActionType5;
        TransportPaymentAnalytics$CheckoutButtonActionType transportPaymentAnalytics$CheckoutButtonActionType6 = new TransportPaymentAnalytics$CheckoutButtonActionType("PaymentMethod", 5, "payment_method");
        PaymentMethod = transportPaymentAnalytics$CheckoutButtonActionType6;
        TransportPaymentAnalytics$CheckoutButtonActionType[] transportPaymentAnalytics$CheckoutButtonActionTypeArr = {transportPaymentAnalytics$CheckoutButtonActionType, transportPaymentAnalytics$CheckoutButtonActionType2, transportPaymentAnalytics$CheckoutButtonActionType3, transportPaymentAnalytics$CheckoutButtonActionType4, transportPaymentAnalytics$CheckoutButtonActionType5, transportPaymentAnalytics$CheckoutButtonActionType6};
        $VALUES = transportPaymentAnalytics$CheckoutButtonActionTypeArr;
        $ENTRIES = a.a(transportPaymentAnalytics$CheckoutButtonActionTypeArr);
    }

    public TransportPaymentAnalytics$CheckoutButtonActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportPaymentAnalytics$CheckoutButtonActionType valueOf(String str) {
        return (TransportPaymentAnalytics$CheckoutButtonActionType) Enum.valueOf(TransportPaymentAnalytics$CheckoutButtonActionType.class, str);
    }

    public static TransportPaymentAnalytics$CheckoutButtonActionType[] values() {
        return (TransportPaymentAnalytics$CheckoutButtonActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
