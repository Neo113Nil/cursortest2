package ru.yandex.taxi.masstransit.analytic;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$CheckoutScreenOpenReason", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$CheckoutScreenOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "QrScan", "BleVehiclesScreen", "Deeplink", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MasstransitPaymentAnalytics$CheckoutScreenOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$CheckoutScreenOpenReason[] $VALUES;
    public static final MasstransitPaymentAnalytics$CheckoutScreenOpenReason BleVehiclesScreen;
    public static final MasstransitPaymentAnalytics$CheckoutScreenOpenReason Deeplink;
    public static final MasstransitPaymentAnalytics$CheckoutScreenOpenReason Other;
    public static final MasstransitPaymentAnalytics$CheckoutScreenOpenReason QrScan;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$CheckoutScreenOpenReason masstransitPaymentAnalytics$CheckoutScreenOpenReason = new MasstransitPaymentAnalytics$CheckoutScreenOpenReason("QrScan", 0, "qr_scan");
        QrScan = masstransitPaymentAnalytics$CheckoutScreenOpenReason;
        MasstransitPaymentAnalytics$CheckoutScreenOpenReason masstransitPaymentAnalytics$CheckoutScreenOpenReason2 = new MasstransitPaymentAnalytics$CheckoutScreenOpenReason("BleVehiclesScreen", 1, "ble_vehicles_screen");
        BleVehiclesScreen = masstransitPaymentAnalytics$CheckoutScreenOpenReason2;
        MasstransitPaymentAnalytics$CheckoutScreenOpenReason masstransitPaymentAnalytics$CheckoutScreenOpenReason3 = new MasstransitPaymentAnalytics$CheckoutScreenOpenReason("Deeplink", 2, Constants.DEEPLINK);
        Deeplink = masstransitPaymentAnalytics$CheckoutScreenOpenReason3;
        MasstransitPaymentAnalytics$CheckoutScreenOpenReason masstransitPaymentAnalytics$CheckoutScreenOpenReason4 = new MasstransitPaymentAnalytics$CheckoutScreenOpenReason("Other", 3, "other");
        Other = masstransitPaymentAnalytics$CheckoutScreenOpenReason4;
        MasstransitPaymentAnalytics$CheckoutScreenOpenReason[] masstransitPaymentAnalytics$CheckoutScreenOpenReasonArr = {masstransitPaymentAnalytics$CheckoutScreenOpenReason, masstransitPaymentAnalytics$CheckoutScreenOpenReason2, masstransitPaymentAnalytics$CheckoutScreenOpenReason3, masstransitPaymentAnalytics$CheckoutScreenOpenReason4};
        $VALUES = masstransitPaymentAnalytics$CheckoutScreenOpenReasonArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$CheckoutScreenOpenReasonArr);
    }

    public MasstransitPaymentAnalytics$CheckoutScreenOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$CheckoutScreenOpenReason valueOf(String str) {
        return (MasstransitPaymentAnalytics$CheckoutScreenOpenReason) Enum.valueOf(MasstransitPaymentAnalytics$CheckoutScreenOpenReason.class, str);
    }

    public static MasstransitPaymentAnalytics$CheckoutScreenOpenReason[] values() {
        return (MasstransitPaymentAnalytics$CheckoutScreenOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
