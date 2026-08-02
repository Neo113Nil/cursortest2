package com.squareup.cash.integration.analytics;

import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.cdf.pushnotification.PushNotificationConfirmComplete;
import com.squareup.cash.cdf.pushnotification.PushNotificationViewOpen;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Action {
    public static final /* synthetic */ Action[] $VALUES;
    public static final Action CONFIRMED_COMPLETE;
    public static final Action OPENED;

    static {
        Action action = new Action("CONFIRMED_COMPLETE", 0);
        CONFIRMED_COMPLETE = action;
        Action action2 = new Action("OPENED", 1);
        OPENED = action2;
        $VALUES = new Action[]{action, action2};
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }

    public final Event build(NotificationType notificationType, String str) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return new PushNotificationConfirmComplete(notificationType, null, 2);
        }
        if (ordinal == 1) {
            return new PushNotificationViewOpen(notificationType, str);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
