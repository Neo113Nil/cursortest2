package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes10.dex */
public abstract class u041 {
    static {
        hgz.o("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String concat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        synchronized (v041.a) {
        }
        return newWakeLock;
    }
}
