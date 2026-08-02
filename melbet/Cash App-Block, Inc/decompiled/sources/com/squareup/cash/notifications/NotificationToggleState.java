package com.squareup.cash.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NotificationToggleState {
    public static final /* synthetic */ NotificationToggleState[] $VALUES;
    public static final NotificationToggleState Disabled;
    public static final NotificationToggleState Enabled;

    static {
        NotificationToggleState notificationToggleState = new NotificationToggleState("Enabled", 0);
        Enabled = notificationToggleState;
        NotificationToggleState notificationToggleState2 = new NotificationToggleState("Disabled", 1);
        Disabled = notificationToggleState2;
        $VALUES = new NotificationToggleState[]{notificationToggleState, notificationToggleState2};
    }

    public static NotificationToggleState valueOf(String str) {
        return (NotificationToggleState) Enum.valueOf(NotificationToggleState.class, str);
    }

    public static NotificationToggleState[] values() {
        return (NotificationToggleState[]) $VALUES.clone();
    }
}
