package defpackage;

import android.os.PowerManager;

/* loaded from: classes6.dex */
public final class s041 extends r041 {
    public s041(PowerManager.WakeLock wakeLock) {
        super(wakeLock);
    }

    @Override // defpackage.r041, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PowerManager.WakeLock wakeLock = this.a;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release(1);
            }
        } catch (Throwable th) {
            jst.e.h("WakeLockHelper", "Got exception while trying to release wakelock", th);
        }
    }
}
