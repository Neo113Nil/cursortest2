package com.onesignal.notifications.internal;

import android.content.Context;
import i5.k;

/* loaded from: classes2.dex */
public final class f implements k {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context, c notification) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(notification, "notification");
        this.context = context;
        this.notification = notification;
    }

    @Override // i5.k
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // i5.k
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z3) {
        this.discard = z3;
    }

    public final void setPreventDefault(boolean z3) {
        this.isPreventDefault = z3;
    }

    @Override // i5.k
    public c getNotification() {
        return this.notification;
    }

    @Override // i5.k
    public void preventDefault(boolean z3) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationReceivedEvent.preventDefault(" + z3 + ')', null, 2, null);
        if (this.isPreventDefault && z3) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z3;
    }
}
