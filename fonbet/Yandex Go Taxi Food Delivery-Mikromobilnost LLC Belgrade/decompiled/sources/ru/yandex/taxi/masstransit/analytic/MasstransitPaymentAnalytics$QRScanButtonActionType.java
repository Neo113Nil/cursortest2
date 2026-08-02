package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$QRScanButtonActionType", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$QRScanButtonActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Close", "OpenSettings", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPaymentAnalytics$QRScanButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$QRScanButtonActionType[] $VALUES;
    public static final MasstransitPaymentAnalytics$QRScanButtonActionType Close;
    public static final MasstransitPaymentAnalytics$QRScanButtonActionType OpenSettings;
    public static final MasstransitPaymentAnalytics$QRScanButtonActionType Other;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$QRScanButtonActionType masstransitPaymentAnalytics$QRScanButtonActionType = new MasstransitPaymentAnalytics$QRScanButtonActionType("Close", 0, "close");
        Close = masstransitPaymentAnalytics$QRScanButtonActionType;
        MasstransitPaymentAnalytics$QRScanButtonActionType masstransitPaymentAnalytics$QRScanButtonActionType2 = new MasstransitPaymentAnalytics$QRScanButtonActionType("OpenSettings", 1, "open_settings");
        OpenSettings = masstransitPaymentAnalytics$QRScanButtonActionType2;
        MasstransitPaymentAnalytics$QRScanButtonActionType masstransitPaymentAnalytics$QRScanButtonActionType3 = new MasstransitPaymentAnalytics$QRScanButtonActionType("Other", 2, "other");
        Other = masstransitPaymentAnalytics$QRScanButtonActionType3;
        MasstransitPaymentAnalytics$QRScanButtonActionType[] masstransitPaymentAnalytics$QRScanButtonActionTypeArr = {masstransitPaymentAnalytics$QRScanButtonActionType, masstransitPaymentAnalytics$QRScanButtonActionType2, masstransitPaymentAnalytics$QRScanButtonActionType3};
        $VALUES = masstransitPaymentAnalytics$QRScanButtonActionTypeArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$QRScanButtonActionTypeArr);
    }

    public MasstransitPaymentAnalytics$QRScanButtonActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$QRScanButtonActionType valueOf(String str) {
        return (MasstransitPaymentAnalytics$QRScanButtonActionType) Enum.valueOf(MasstransitPaymentAnalytics$QRScanButtonActionType.class, str);
    }

    public static MasstransitPaymentAnalytics$QRScanButtonActionType[] values() {
        return (MasstransitPaymentAnalytics$QRScanButtonActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
