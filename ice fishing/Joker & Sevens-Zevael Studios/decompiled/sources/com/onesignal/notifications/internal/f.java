package com.onesignal.notifications.internal;

import android.content.Context;
import ca.k;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements k {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context, c cVar) {
        j.e(context, "context");
        j.e(cVar, "notification");
        this.context = context;
        this.notification = cVar;
    }

    @Override // ca.k
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // ca.k
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z10) {
        this.discard = z10;
    }

    public final void setPreventDefault(boolean z10) {
        this.isPreventDefault = z10;
    }

    @Override // ca.k
    public c getNotification() {
        return this.notification;
    }

    @Override // ca.k
    public void preventDefault(boolean z10) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationReceivedEvent.preventDefault(" + z10 + ')', null, 2, null);
        if (this.isPreventDefault && z10) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z10;
    }
}
