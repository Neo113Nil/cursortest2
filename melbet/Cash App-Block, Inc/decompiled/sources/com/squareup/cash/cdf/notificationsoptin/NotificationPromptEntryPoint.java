package com.squareup.cash.cdf.notificationsoptin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NotificationPromptEntryPoint {
    public static final /* synthetic */ NotificationPromptEntryPoint[] $VALUES;
    public static final NotificationPromptEntryPoint ACTIVITY_TAB;
    public static final NotificationPromptEntryPoint CARD_ORDER;
    public static final NotificationPromptEntryPoint COLD_OPEN;
    public static final NotificationPromptEntryPoint P2P_RECEIVE;
    public static final NotificationPromptEntryPoint P2P_SEND;
    public static final NotificationPromptEntryPoint POST_SIGN_IN;
    public static final NotificationPromptEntryPoint SETTINGS;

    static {
        NotificationPromptEntryPoint notificationPromptEntryPoint = new NotificationPromptEntryPoint("ACTIVITY_TAB", 0);
        ACTIVITY_TAB = notificationPromptEntryPoint;
        NotificationPromptEntryPoint notificationPromptEntryPoint2 = new NotificationPromptEntryPoint("POST_SIGN_IN", 1);
        POST_SIGN_IN = notificationPromptEntryPoint2;
        NotificationPromptEntryPoint notificationPromptEntryPoint3 = new NotificationPromptEntryPoint("P2P_SEND", 2);
        P2P_SEND = notificationPromptEntryPoint3;
        NotificationPromptEntryPoint notificationPromptEntryPoint4 = new NotificationPromptEntryPoint("P2P_RECEIVE", 3);
        P2P_RECEIVE = notificationPromptEntryPoint4;
        NotificationPromptEntryPoint notificationPromptEntryPoint5 = new NotificationPromptEntryPoint("CARD_ORDER", 4);
        CARD_ORDER = notificationPromptEntryPoint5;
        NotificationPromptEntryPoint notificationPromptEntryPoint6 = new NotificationPromptEntryPoint("COLD_OPEN", 5);
        COLD_OPEN = notificationPromptEntryPoint6;
        NotificationPromptEntryPoint notificationPromptEntryPoint7 = new NotificationPromptEntryPoint("SETTINGS", 6);
        SETTINGS = notificationPromptEntryPoint7;
        $VALUES = new NotificationPromptEntryPoint[]{notificationPromptEntryPoint, notificationPromptEntryPoint2, notificationPromptEntryPoint3, notificationPromptEntryPoint4, notificationPromptEntryPoint5, notificationPromptEntryPoint6, notificationPromptEntryPoint7};
    }

    public static NotificationPromptEntryPoint valueOf(String str) {
        return (NotificationPromptEntryPoint) Enum.valueOf(NotificationPromptEntryPoint.class, str);
    }

    public static NotificationPromptEntryPoint[] values() {
        return (NotificationPromptEntryPoint[]) $VALUES.clone();
    }
}
