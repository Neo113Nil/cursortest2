package com.onesignal.notifications.internal;

import ca.m;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements m {
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public g(c cVar) {
        j.e(cVar, "notification");
        this.notification = cVar;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // ca.m
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z10) {
        this.discard = z10;
    }

    public final void setPreventDefault(boolean z10) {
        this.isPreventDefault = z10;
    }

    @Override // ca.m
    public c getNotification() {
        return this.notification;
    }

    @Override // ca.m
    public void preventDefault(boolean z10) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWillDisplayEvent.preventDefault(" + z10 + ')', null, 2, null);
        if (this.isPreventDefault && z10) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z10;
    }
}
