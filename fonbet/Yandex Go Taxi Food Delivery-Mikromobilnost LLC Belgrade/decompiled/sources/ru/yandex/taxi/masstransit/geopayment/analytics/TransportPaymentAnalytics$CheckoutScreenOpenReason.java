package ru.yandex.taxi.masstransit.geopayment.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$CheckoutScreenOpenReason", "", "Lru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$CheckoutScreenOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "QrCode", "VehicleItem", "Deeplink", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportPaymentAnalytics$CheckoutScreenOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportPaymentAnalytics$CheckoutScreenOpenReason[] $VALUES;
    public static final TransportPaymentAnalytics$CheckoutScreenOpenReason Deeplink;
    public static final TransportPaymentAnalytics$CheckoutScreenOpenReason QrCode;
    public static final TransportPaymentAnalytics$CheckoutScreenOpenReason VehicleItem;
    private final String eventValue;

    static {
        TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = new TransportPaymentAnalytics$CheckoutScreenOpenReason("QrCode", 0, "qr_code");
        QrCode = transportPaymentAnalytics$CheckoutScreenOpenReason;
        TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason2 = new TransportPaymentAnalytics$CheckoutScreenOpenReason("VehicleItem", 1, "vehicle_item");
        VehicleItem = transportPaymentAnalytics$CheckoutScreenOpenReason2;
        TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason3 = new TransportPaymentAnalytics$CheckoutScreenOpenReason("Deeplink", 2, Constants.DEEPLINK);
        Deeplink = transportPaymentAnalytics$CheckoutScreenOpenReason3;
        TransportPaymentAnalytics$CheckoutScreenOpenReason[] transportPaymentAnalytics$CheckoutScreenOpenReasonArr = {transportPaymentAnalytics$CheckoutScreenOpenReason, transportPaymentAnalytics$CheckoutScreenOpenReason2, transportPaymentAnalytics$CheckoutScreenOpenReason3};
        $VALUES = transportPaymentAnalytics$CheckoutScreenOpenReasonArr;
        $ENTRIES = a.a(transportPaymentAnalytics$CheckoutScreenOpenReasonArr);
    }

    public TransportPaymentAnalytics$CheckoutScreenOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportPaymentAnalytics$CheckoutScreenOpenReason valueOf(String str) {
        return (TransportPaymentAnalytics$CheckoutScreenOpenReason) Enum.valueOf(TransportPaymentAnalytics$CheckoutScreenOpenReason.class, str);
    }

    public static TransportPaymentAnalytics$CheckoutScreenOpenReason[] values() {
        return (TransportPaymentAnalytics$CheckoutScreenOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
