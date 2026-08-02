package ru.yandex.taxi.masstransit.analytic;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Deeplink", "MasstransitMain", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason[] $VALUES;
    public static final MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason Deeplink;
    public static final MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason MasstransitMain;
    public static final MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason Other;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason masstransitPaymentAnalytics$BleVehiclesScreenOpenReason = new MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason("Deeplink", 0, Constants.DEEPLINK);
        Deeplink = masstransitPaymentAnalytics$BleVehiclesScreenOpenReason;
        MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason masstransitPaymentAnalytics$BleVehiclesScreenOpenReason2 = new MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason("MasstransitMain", 1, "masstransit_main");
        MasstransitMain = masstransitPaymentAnalytics$BleVehiclesScreenOpenReason2;
        MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason masstransitPaymentAnalytics$BleVehiclesScreenOpenReason3 = new MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason("Other", 2, "other");
        Other = masstransitPaymentAnalytics$BleVehiclesScreenOpenReason3;
        MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason[] masstransitPaymentAnalytics$BleVehiclesScreenOpenReasonArr = {masstransitPaymentAnalytics$BleVehiclesScreenOpenReason, masstransitPaymentAnalytics$BleVehiclesScreenOpenReason2, masstransitPaymentAnalytics$BleVehiclesScreenOpenReason3};
        $VALUES = masstransitPaymentAnalytics$BleVehiclesScreenOpenReasonArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$BleVehiclesScreenOpenReasonArr);
    }

    public MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason valueOf(String str) {
        return (MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason) Enum.valueOf(MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason.class, str);
    }

    public static MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason[] values() {
        return (MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
