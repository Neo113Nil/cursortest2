package ru.yandex.taxi.communications.modal.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/communications/modal/analytics/CommunicationModalAnalyticsData$CloseReason", "", "Lru/yandex/taxi/communications/modal/analytics/CommunicationModalAnalyticsData$CloseReason;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ACTION_BUTTON", "SWIPE", "TAP_OUTSIDE", "SYSTEM_BACK", "CLOSE_BUTTON", "TIMEOUT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommunicationModalAnalyticsData$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationModalAnalyticsData$CloseReason[] $VALUES;
    public static final CommunicationModalAnalyticsData$CloseReason ACTION_BUTTON;
    public static final CommunicationModalAnalyticsData$CloseReason CLOSE_BUTTON;
    public static final CommunicationModalAnalyticsData$CloseReason SWIPE;
    public static final CommunicationModalAnalyticsData$CloseReason SYSTEM_BACK;
    public static final CommunicationModalAnalyticsData$CloseReason TAP_OUTSIDE;
    public static final CommunicationModalAnalyticsData$CloseReason TIMEOUT;
    private final String analyticsName;

    static {
        CommunicationModalAnalyticsData$CloseReason communicationModalAnalyticsData$CloseReason = new CommunicationModalAnalyticsData$CloseReason("ACTION_BUTTON", 0, "action_button");
        ACTION_BUTTON = communicationModalAnalyticsData$CloseReason;
        CommunicationModalAnalyticsData$CloseReason communicationModalAnalyticsData$CloseReason2 = new CommunicationModalAnalyticsData$CloseReason("SWIPE", 1, "swipe");
        SWIPE = communicationModalAnalyticsData$CloseReason2;
        CommunicationModalAnalyticsData$CloseReason communicationModalAnalyticsData$CloseReason3 = new CommunicationModalAnalyticsData$CloseReason("TAP_OUTSIDE", 2, "tap_outside");
        TAP_OUTSIDE = communicationModalAnalyticsData$CloseReason3;
        CommunicationModalAnalyticsData$CloseReason communicationModalAnalyticsData$CloseReason4 = new CommunicationModalAnalyticsData$CloseReason("SYSTEM_BACK", 3, "system_back");
        SYSTEM_BACK = communicationModalAnalyticsData$CloseReason4;
        CommunicationModalAnalyticsData$CloseReason communicationModalAnalyticsData$CloseReason5 = new CommunicationModalAnalyticsData$CloseReason("CLOSE_BUTTON", 4, "close_button");
        CLOSE_BUTTON = communicationModalAnalyticsData$CloseReason5;
        CommunicationModalAnalyticsData$CloseReason communicationModalAnalyticsData$CloseReason6 = new CommunicationModalAnalyticsData$CloseReason("TIMEOUT", 5, "timeout");
        TIMEOUT = communicationModalAnalyticsData$CloseReason6;
        CommunicationModalAnalyticsData$CloseReason[] communicationModalAnalyticsData$CloseReasonArr = {communicationModalAnalyticsData$CloseReason, communicationModalAnalyticsData$CloseReason2, communicationModalAnalyticsData$CloseReason3, communicationModalAnalyticsData$CloseReason4, communicationModalAnalyticsData$CloseReason5, communicationModalAnalyticsData$CloseReason6};
        $VALUES = communicationModalAnalyticsData$CloseReasonArr;
        $ENTRIES = a.a(communicationModalAnalyticsData$CloseReasonArr);
    }

    public CommunicationModalAnalyticsData$CloseReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static CommunicationModalAnalyticsData$CloseReason valueOf(String str) {
        return (CommunicationModalAnalyticsData$CloseReason) Enum.valueOf(CommunicationModalAnalyticsData$CloseReason.class, str);
    }

    public static CommunicationModalAnalyticsData$CloseReason[] values() {
        return (CommunicationModalAnalyticsData$CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
