package ru.yandex.taxi.notifications.tips;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/notifications/tips/TipsNotificationAnalytics$NotificationState", "", "Lru/yandex/taxi/notifications/tips/TipsNotificationAnalytics$NotificationState;", "HEADS_UP", "SMALL", "BIG", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TipsNotificationAnalytics$NotificationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TipsNotificationAnalytics$NotificationState[] $VALUES;
    public static final TipsNotificationAnalytics$NotificationState BIG;
    public static final TipsNotificationAnalytics$NotificationState HEADS_UP;
    public static final TipsNotificationAnalytics$NotificationState SMALL;

    static {
        TipsNotificationAnalytics$NotificationState tipsNotificationAnalytics$NotificationState = new TipsNotificationAnalytics$NotificationState("HEADS_UP", 0);
        HEADS_UP = tipsNotificationAnalytics$NotificationState;
        TipsNotificationAnalytics$NotificationState tipsNotificationAnalytics$NotificationState2 = new TipsNotificationAnalytics$NotificationState("SMALL", 1);
        SMALL = tipsNotificationAnalytics$NotificationState2;
        TipsNotificationAnalytics$NotificationState tipsNotificationAnalytics$NotificationState3 = new TipsNotificationAnalytics$NotificationState("BIG", 2);
        BIG = tipsNotificationAnalytics$NotificationState3;
        TipsNotificationAnalytics$NotificationState[] tipsNotificationAnalytics$NotificationStateArr = {tipsNotificationAnalytics$NotificationState, tipsNotificationAnalytics$NotificationState2, tipsNotificationAnalytics$NotificationState3};
        $VALUES = tipsNotificationAnalytics$NotificationStateArr;
        $ENTRIES = kotlin.enums.a.a(tipsNotificationAnalytics$NotificationStateArr);
    }

    public static TipsNotificationAnalytics$NotificationState valueOf(String str) {
        return (TipsNotificationAnalytics$NotificationState) Enum.valueOf(TipsNotificationAnalytics$NotificationState.class, str);
    }

    public static TipsNotificationAnalytics$NotificationState[] values() {
        return (TipsNotificationAnalytics$NotificationState[]) $VALUES.clone();
    }
}
