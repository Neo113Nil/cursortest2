package com.gamericefishpro.space.t6;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Notification e;
    public final /* synthetic */ int i;
    public final /* synthetic */ SystemForegroundService v;

    public c(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.v = systemForegroundService;
        this.d = i;
        this.e = notification;
        this.i = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i2 = this.i;
        Notification notification = this.e;
        int i3 = this.d;
        SystemForegroundService systemForegroundService = this.v;
        if (i >= 31) {
            e.a(systemForegroundService, i3, notification, i2);
        } else if (i >= 29) {
            d.a(systemForegroundService, i3, notification, i2);
        } else {
            systemForegroundService.startForeground(i3, notification);
        }
    }
}
