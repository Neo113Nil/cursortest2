package com.gamericefishpro.space.lc;

import com.gamericefishpro.space.i9.a4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    NOTIFICATION_CLICK,
    APP_OPEN,
    APP_CLOSE;

    private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());

    public static com.gamericefishpro.space.wh.a getEntries() {
        return $ENTRIES;
    }

    public final boolean isAppClose() {
        return this == APP_CLOSE;
    }

    public final boolean isAppOpen() {
        return this == APP_OPEN;
    }

    public final boolean isNotificationClick() {
        return this == NOTIFICATION_CLICK;
    }
}
