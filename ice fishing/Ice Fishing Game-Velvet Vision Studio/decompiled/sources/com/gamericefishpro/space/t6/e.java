package com.gamericefishpro.space.t6;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import com.gamericefishpro.space.l6.q;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            q qVarC = q.c();
            String str = SystemForegroundService.y;
            if (qVarC.a <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        }
    }
}
