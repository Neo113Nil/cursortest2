package L4;

import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class a implements K4.a {
    @Override // K4.a
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // K4.a
    public long getProcessUptimeMillis() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }
}
