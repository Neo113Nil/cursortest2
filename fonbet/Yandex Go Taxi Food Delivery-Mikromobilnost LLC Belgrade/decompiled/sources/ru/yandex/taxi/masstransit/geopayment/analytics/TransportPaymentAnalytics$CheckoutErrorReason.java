package ru.yandex.taxi.masstransit.geopayment.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$CheckoutErrorReason", "", "Lru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$CheckoutErrorReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "сHeckoutLoadingError", "PaymentFailed", "PaymentLoadingError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportPaymentAnalytics$CheckoutErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportPaymentAnalytics$CheckoutErrorReason[] $VALUES;
    public static final TransportPaymentAnalytics$CheckoutErrorReason PaymentFailed;
    public static final TransportPaymentAnalytics$CheckoutErrorReason PaymentLoadingError;

    /* renamed from: сHeckoutLoadingError, reason: contains not printable characters */
    public static final TransportPaymentAnalytics$CheckoutErrorReason f78HeckoutLoadingError;
    private final String eventValue;

    static {
        TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason = new TransportPaymentAnalytics$CheckoutErrorReason("сHeckoutLoadingError", 0, "сheckout_loading_error");
        f78HeckoutLoadingError = transportPaymentAnalytics$CheckoutErrorReason;
        TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason2 = new TransportPaymentAnalytics$CheckoutErrorReason("PaymentFailed", 1, "payment_failed");
        PaymentFailed = transportPaymentAnalytics$CheckoutErrorReason2;
        TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason3 = new TransportPaymentAnalytics$CheckoutErrorReason("PaymentLoadingError", 2, "payment_loading_error");
        PaymentLoadingError = transportPaymentAnalytics$CheckoutErrorReason3;
        TransportPaymentAnalytics$CheckoutErrorReason[] transportPaymentAnalytics$CheckoutErrorReasonArr = {transportPaymentAnalytics$CheckoutErrorReason, transportPaymentAnalytics$CheckoutErrorReason2, transportPaymentAnalytics$CheckoutErrorReason3};
        $VALUES = transportPaymentAnalytics$CheckoutErrorReasonArr;
        $ENTRIES = a.a(transportPaymentAnalytics$CheckoutErrorReasonArr);
    }

    public TransportPaymentAnalytics$CheckoutErrorReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportPaymentAnalytics$CheckoutErrorReason valueOf(String str) {
        return (TransportPaymentAnalytics$CheckoutErrorReason) Enum.valueOf(TransportPaymentAnalytics$CheckoutErrorReason.class, str);
    }

    public static TransportPaymentAnalytics$CheckoutErrorReason[] values() {
        return (TransportPaymentAnalytics$CheckoutErrorReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
