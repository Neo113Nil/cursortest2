package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger$LogcatLogger;

/* loaded from: classes3.dex */
public abstract class WakeLocks {
    static {
        Logger$LogcatLogger.tagWithPrefix("WakeLocks");
    }

    public static final PowerManager.WakeLock newWakeLock(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
        synchronized (WakeLocksHolder.INSTANCE) {
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
