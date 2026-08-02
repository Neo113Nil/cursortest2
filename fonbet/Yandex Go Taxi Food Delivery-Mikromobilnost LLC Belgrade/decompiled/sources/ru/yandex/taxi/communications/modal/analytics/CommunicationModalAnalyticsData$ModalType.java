package ru.yandex.taxi.communications.modal.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/communications/modal/analytics/CommunicationModalAnalyticsData$ModalType", "", "Lru/yandex/taxi/communications/modal/analytics/CommunicationModalAnalyticsData$ModalType;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DEFAULT", "STEPS", "SHARE_ORDER", "ROBOTAXI", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommunicationModalAnalyticsData$ModalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationModalAnalyticsData$ModalType[] $VALUES;
    public static final CommunicationModalAnalyticsData$ModalType DEFAULT;
    public static final CommunicationModalAnalyticsData$ModalType ROBOTAXI;
    public static final CommunicationModalAnalyticsData$ModalType SHARE_ORDER;
    public static final CommunicationModalAnalyticsData$ModalType STEPS;
    private final String analyticsName;

    static {
        CommunicationModalAnalyticsData$ModalType communicationModalAnalyticsData$ModalType = new CommunicationModalAnalyticsData$ModalType("DEFAULT", 0, "default");
        DEFAULT = communicationModalAnalyticsData$ModalType;
        CommunicationModalAnalyticsData$ModalType communicationModalAnalyticsData$ModalType2 = new CommunicationModalAnalyticsData$ModalType("STEPS", 1, "steps");
        STEPS = communicationModalAnalyticsData$ModalType2;
        CommunicationModalAnalyticsData$ModalType communicationModalAnalyticsData$ModalType3 = new CommunicationModalAnalyticsData$ModalType("SHARE_ORDER", 2, "share_order");
        SHARE_ORDER = communicationModalAnalyticsData$ModalType3;
        CommunicationModalAnalyticsData$ModalType communicationModalAnalyticsData$ModalType4 = new CommunicationModalAnalyticsData$ModalType("ROBOTAXI", 3, "robotaxi");
        ROBOTAXI = communicationModalAnalyticsData$ModalType4;
        CommunicationModalAnalyticsData$ModalType[] communicationModalAnalyticsData$ModalTypeArr = {communicationModalAnalyticsData$ModalType, communicationModalAnalyticsData$ModalType2, communicationModalAnalyticsData$ModalType3, communicationModalAnalyticsData$ModalType4};
        $VALUES = communicationModalAnalyticsData$ModalTypeArr;
        $ENTRIES = a.a(communicationModalAnalyticsData$ModalTypeArr);
    }

    public CommunicationModalAnalyticsData$ModalType(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static CommunicationModalAnalyticsData$ModalType valueOf(String str) {
        return (CommunicationModalAnalyticsData$ModalType) Enum.valueOf(CommunicationModalAnalyticsData$ModalType.class, str);
    }

    public static CommunicationModalAnalyticsData$ModalType[] values() {
        return (CommunicationModalAnalyticsData$ModalType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
