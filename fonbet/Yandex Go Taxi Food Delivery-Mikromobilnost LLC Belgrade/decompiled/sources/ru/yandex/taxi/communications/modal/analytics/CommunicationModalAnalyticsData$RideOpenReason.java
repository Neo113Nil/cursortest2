package ru.yandex.taxi.communications.modal.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/communications/modal/analytics/CommunicationModalAnalyticsData$RideOpenReason", "", "Lru/yandex/taxi/communications/modal/analytics/CommunicationModalAnalyticsData$RideOpenReason;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "AUTOMATIC", "PIN_TAP", "SCREENSHOT", "TARIFF_SUGGEST", "CHANGE_ORDER_ERROR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommunicationModalAnalyticsData$RideOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationModalAnalyticsData$RideOpenReason[] $VALUES;
    public static final CommunicationModalAnalyticsData$RideOpenReason AUTOMATIC;
    public static final CommunicationModalAnalyticsData$RideOpenReason CHANGE_ORDER_ERROR;
    public static final CommunicationModalAnalyticsData$RideOpenReason PIN_TAP;
    public static final CommunicationModalAnalyticsData$RideOpenReason SCREENSHOT;
    public static final CommunicationModalAnalyticsData$RideOpenReason TARIFF_SUGGEST;
    private final String analyticsName;

    static {
        CommunicationModalAnalyticsData$RideOpenReason communicationModalAnalyticsData$RideOpenReason = new CommunicationModalAnalyticsData$RideOpenReason("AUTOMATIC", 0, "automatic");
        AUTOMATIC = communicationModalAnalyticsData$RideOpenReason;
        CommunicationModalAnalyticsData$RideOpenReason communicationModalAnalyticsData$RideOpenReason2 = new CommunicationModalAnalyticsData$RideOpenReason("PIN_TAP", 1, "pin_tap");
        PIN_TAP = communicationModalAnalyticsData$RideOpenReason2;
        CommunicationModalAnalyticsData$RideOpenReason communicationModalAnalyticsData$RideOpenReason3 = new CommunicationModalAnalyticsData$RideOpenReason("SCREENSHOT", 2, "screenshot");
        SCREENSHOT = communicationModalAnalyticsData$RideOpenReason3;
        CommunicationModalAnalyticsData$RideOpenReason communicationModalAnalyticsData$RideOpenReason4 = new CommunicationModalAnalyticsData$RideOpenReason("TARIFF_SUGGEST", 3, "tariff_suggest");
        TARIFF_SUGGEST = communicationModalAnalyticsData$RideOpenReason4;
        CommunicationModalAnalyticsData$RideOpenReason communicationModalAnalyticsData$RideOpenReason5 = new CommunicationModalAnalyticsData$RideOpenReason("CHANGE_ORDER_ERROR", 4, "change_order_error");
        CHANGE_ORDER_ERROR = communicationModalAnalyticsData$RideOpenReason5;
        CommunicationModalAnalyticsData$RideOpenReason[] communicationModalAnalyticsData$RideOpenReasonArr = {communicationModalAnalyticsData$RideOpenReason, communicationModalAnalyticsData$RideOpenReason2, communicationModalAnalyticsData$RideOpenReason3, communicationModalAnalyticsData$RideOpenReason4, communicationModalAnalyticsData$RideOpenReason5};
        $VALUES = communicationModalAnalyticsData$RideOpenReasonArr;
        $ENTRIES = a.a(communicationModalAnalyticsData$RideOpenReasonArr);
    }

    public CommunicationModalAnalyticsData$RideOpenReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static CommunicationModalAnalyticsData$RideOpenReason valueOf(String str) {
        return (CommunicationModalAnalyticsData$RideOpenReason) Enum.valueOf(CommunicationModalAnalyticsData$RideOpenReason.class, str);
    }

    public static CommunicationModalAnalyticsData$RideOpenReason[] values() {
        return (CommunicationModalAnalyticsData$RideOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
