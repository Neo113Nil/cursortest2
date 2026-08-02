package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class lku {
    static {
        jsg.n("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
        synchronized (mku.a) {
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
