package defpackage;

import android.os.PowerManager;
import java.io.Closeable;

/* loaded from: classes6.dex */
public class r041 implements Closeable {
    public final PowerManager.WakeLock a;

    public r041(PowerManager.WakeLock wakeLock) {
        this.a = wakeLock;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PowerManager.WakeLock wakeLock = this.a;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release(0);
            }
        } catch (Throwable th) {
            jst.e.h("WakeLockHelper", "Got exception while trying to release wakelock", th);
        }
    }
}
