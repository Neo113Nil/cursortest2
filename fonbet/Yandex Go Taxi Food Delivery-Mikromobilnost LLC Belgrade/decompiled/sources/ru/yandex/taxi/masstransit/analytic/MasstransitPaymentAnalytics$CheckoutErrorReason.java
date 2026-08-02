package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$CheckoutErrorReason", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$CheckoutErrorReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "VehicleSearchFailure", "TripInitFailure", "TripUpdateFailure", "CheckoutFailure", "CheckoutStatusFailure", "OrderPaymentFailure", "TripCopyFailure", "PaymentMethodsFailure", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MasstransitPaymentAnalytics$CheckoutErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$CheckoutErrorReason[] $VALUES;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason CheckoutFailure;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason CheckoutStatusFailure;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason OrderPaymentFailure;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason Other;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason PaymentMethodsFailure;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason TripCopyFailure;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason TripInitFailure;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason TripUpdateFailure;
    public static final MasstransitPaymentAnalytics$CheckoutErrorReason VehicleSearchFailure;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason = new MasstransitPaymentAnalytics$CheckoutErrorReason("VehicleSearchFailure", 0, "vehicle_search_failure");
        VehicleSearchFailure = masstransitPaymentAnalytics$CheckoutErrorReason;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason2 = new MasstransitPaymentAnalytics$CheckoutErrorReason("TripInitFailure", 1, "trip_init_failure");
        TripInitFailure = masstransitPaymentAnalytics$CheckoutErrorReason2;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason3 = new MasstransitPaymentAnalytics$CheckoutErrorReason("TripUpdateFailure", 2, "trip_update_failure");
        TripUpdateFailure = masstransitPaymentAnalytics$CheckoutErrorReason3;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason4 = new MasstransitPaymentAnalytics$CheckoutErrorReason("CheckoutFailure", 3, "checkout_failure");
        CheckoutFailure = masstransitPaymentAnalytics$CheckoutErrorReason4;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason5 = new MasstransitPaymentAnalytics$CheckoutErrorReason("CheckoutStatusFailure", 4, "checkout_status_failure");
        CheckoutStatusFailure = masstransitPaymentAnalytics$CheckoutErrorReason5;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason6 = new MasstransitPaymentAnalytics$CheckoutErrorReason("OrderPaymentFailure", 5, "order_payment_failure");
        OrderPaymentFailure = masstransitPaymentAnalytics$CheckoutErrorReason6;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason7 = new MasstransitPaymentAnalytics$CheckoutErrorReason("TripCopyFailure", 6, "trip_copy_failure");
        TripCopyFailure = masstransitPaymentAnalytics$CheckoutErrorReason7;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason8 = new MasstransitPaymentAnalytics$CheckoutErrorReason("PaymentMethodsFailure", 7, "payment_methods_failure");
        PaymentMethodsFailure = masstransitPaymentAnalytics$CheckoutErrorReason8;
        MasstransitPaymentAnalytics$CheckoutErrorReason masstransitPaymentAnalytics$CheckoutErrorReason9 = new MasstransitPaymentAnalytics$CheckoutErrorReason("Other", 8, "other");
        Other = masstransitPaymentAnalytics$CheckoutErrorReason9;
        MasstransitPaymentAnalytics$CheckoutErrorReason[] masstransitPaymentAnalytics$CheckoutErrorReasonArr = {masstransitPaymentAnalytics$CheckoutErrorReason, masstransitPaymentAnalytics$CheckoutErrorReason2, masstransitPaymentAnalytics$CheckoutErrorReason3, masstransitPaymentAnalytics$CheckoutErrorReason4, masstransitPaymentAnalytics$CheckoutErrorReason5, masstransitPaymentAnalytics$CheckoutErrorReason6, masstransitPaymentAnalytics$CheckoutErrorReason7, masstransitPaymentAnalytics$CheckoutErrorReason8, masstransitPaymentAnalytics$CheckoutErrorReason9};
        $VALUES = masstransitPaymentAnalytics$CheckoutErrorReasonArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$CheckoutErrorReasonArr);
    }

    public MasstransitPaymentAnalytics$CheckoutErrorReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$CheckoutErrorReason valueOf(String str) {
        return (MasstransitPaymentAnalytics$CheckoutErrorReason) Enum.valueOf(MasstransitPaymentAnalytics$CheckoutErrorReason.class, str);
    }

    public static MasstransitPaymentAnalytics$CheckoutErrorReason[] values() {
        return (MasstransitPaymentAnalytics$CheckoutErrorReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
