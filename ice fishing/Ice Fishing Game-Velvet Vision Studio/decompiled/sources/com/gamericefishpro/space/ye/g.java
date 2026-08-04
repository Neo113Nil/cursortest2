package com.gamericefishpro.space.ye;

import com.gamericefishpro.space.ve.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m {
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public g(c notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.notification = notification;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // com.gamericefishpro.space.ve.m
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z) {
        this.discard = z;
    }

    public final void setPreventDefault(boolean z) {
        this.isPreventDefault = z;
    }

    @Override // com.gamericefishpro.space.ve.m
    public c getNotification() {
        return this.notification;
    }

    @Override // com.gamericefishpro.space.ve.m
    public void preventDefault(boolean z) {
        com.gamericefishpro.space.od.b.debug$default("NotificationWillDisplayEvent.preventDefault(" + z + ')', null, 2, null);
        if (this.isPreventDefault && z) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z;
    }
}
