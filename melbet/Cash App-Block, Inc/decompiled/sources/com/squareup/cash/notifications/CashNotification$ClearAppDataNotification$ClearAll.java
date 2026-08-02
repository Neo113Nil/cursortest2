package com.squareup.cash.notifications;

import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.data.push.CashPushNotification;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashNotification$ClearAppDataNotification$ClearAll extends CashNotification {
    public final boolean hasBackgroundTasks;
    public final CashPushNotification notification;
    public final NotificationType notificationType;
    public final boolean shouldClearOnNextLaunch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashNotification$ClearAppDataNotification$ClearAll(boolean z, CashPushNotification cashPushNotification) {
        super(cashPushNotification);
        cashPushNotification.getClass();
        this.notificationType = NotificationType.OTHER;
        this.hasBackgroundTasks = true;
        this.shouldClearOnNextLaunch = z;
        this.notification = cashPushNotification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashNotification$ClearAppDataNotification$ClearAll)) {
            return false;
        }
        CashNotification$ClearAppDataNotification$ClearAll cashNotification$ClearAppDataNotification$ClearAll = (CashNotification$ClearAppDataNotification$ClearAll) obj;
        return this.shouldClearOnNextLaunch == cashNotification$ClearAppDataNotification$ClearAll.shouldClearOnNextLaunch && Intrinsics.areEqual(this.notification, cashNotification$ClearAppDataNotification$ClearAll.notification);
    }

    @Override // com.squareup.cash.notifications.CashNotification
    public final boolean getHasBackgroundTasks() {
        return this.hasBackgroundTasks;
    }

    @Override // com.squareup.cash.notifications.CashNotification
    public final NotificationType getNotificationType() {
        return this.notificationType;
    }

    @Override // com.squareup.cash.notifications.CashNotification
    public final int getPriority() {
        return 0;
    }

    @Override // com.squareup.cash.notifications.CashNotification
    public final boolean getShowNotification() {
        return false;
    }

    public final int hashCode() {
        return this.notification.hashCode() + (Boolean.hashCode(this.shouldClearOnNextLaunch) * 31);
    }

    public final String toString() {
        return "ClearAll(shouldClearOnNextLaunch=" + this.shouldClearOnNextLaunch + ", notification=" + this.notification + ")";
    }
}
