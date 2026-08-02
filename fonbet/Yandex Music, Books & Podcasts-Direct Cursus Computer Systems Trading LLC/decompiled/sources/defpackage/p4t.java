package defpackage;

import android.net.TrafficStats;
import android.os.Process;

/* loaded from: classes6.dex */
public final class p4t {
    public final int a = Process.myUid();

    public final long a(e2j e2jVar) {
        try {
            int ordinal = e2jVar.ordinal();
            int i = this.a;
            if (ordinal == 0) {
                return TrafficStats.getUidRxBytes(i);
            }
            if (ordinal == 1) {
                return TrafficStats.getUidTxBytes(i);
            }
            throw new x7j();
        } catch (Throwable th) {
            if (!c9g.J(th)) {
                throw th;
            }
            ssg.a(6, null, "Dead system raise", th);
            return -1L;
        }
    }
}
