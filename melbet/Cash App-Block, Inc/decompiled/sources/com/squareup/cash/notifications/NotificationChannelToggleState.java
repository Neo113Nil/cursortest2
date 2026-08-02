package com.squareup.cash.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NotificationChannelToggleState {
    public static final /* synthetic */ NotificationChannelToggleState[] $VALUES;
    public static final NotificationChannelToggleState DisabledByChannel;
    public static final NotificationChannelToggleState DisabledByGroup;
    public static final NotificationChannelToggleState Enabled;
    public static final NotificationChannelToggleState NotFound;

    static {
        NotificationChannelToggleState notificationChannelToggleState = new NotificationChannelToggleState("Enabled", 0);
        Enabled = notificationChannelToggleState;
        NotificationChannelToggleState notificationChannelToggleState2 = new NotificationChannelToggleState("DisabledByChannel", 1);
        DisabledByChannel = notificationChannelToggleState2;
        NotificationChannelToggleState notificationChannelToggleState3 = new NotificationChannelToggleState("DisabledByGroup", 2);
        DisabledByGroup = notificationChannelToggleState3;
        NotificationChannelToggleState notificationChannelToggleState4 = new NotificationChannelToggleState("NotFound", 3);
        NotFound = notificationChannelToggleState4;
        $VALUES = new NotificationChannelToggleState[]{notificationChannelToggleState, notificationChannelToggleState2, notificationChannelToggleState3, notificationChannelToggleState4};
    }

    public static NotificationChannelToggleState valueOf(String str) {
        return (NotificationChannelToggleState) Enum.valueOf(NotificationChannelToggleState.class, str);
    }

    public static NotificationChannelToggleState[] values() {
        return (NotificationChannelToggleState[]) $VALUES.clone();
    }
}
