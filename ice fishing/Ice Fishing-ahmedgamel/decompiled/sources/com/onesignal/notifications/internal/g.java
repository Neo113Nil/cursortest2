package com.onesignal.notifications.internal;

import i5.m;

/* loaded from: classes2.dex */
public final class g implements m {
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public g(c notification) {
        kotlin.jvm.internal.h.e(notification, "notification");
        this.notification = notification;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // i5.m
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z3) {
        this.discard = z3;
    }

    public final void setPreventDefault(boolean z3) {
        this.isPreventDefault = z3;
    }

    @Override // i5.m
    public c getNotification() {
        return this.notification;
    }

    @Override // i5.m
    public void preventDefault(boolean z3) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWillDisplayEvent.preventDefault(" + z3 + ')', null, 2, null);
        if (this.isPreventDefault && z3) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z3;
    }
}
