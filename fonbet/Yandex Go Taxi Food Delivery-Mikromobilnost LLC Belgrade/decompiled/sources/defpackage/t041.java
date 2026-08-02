package defpackage;

import android.os.PowerManager;

/* loaded from: classes9.dex */
public final class t041 {
    public final PowerManager a;

    public t041(PowerManager powerManager) {
        this.a = powerManager;
    }

    public final r041 a(long j, String str) {
        PowerManager.WakeLock newWakeLock = this.a.newWakeLock(1, str);
        newWakeLock.acquire(j);
        return new r041(newWakeLock);
    }
}
