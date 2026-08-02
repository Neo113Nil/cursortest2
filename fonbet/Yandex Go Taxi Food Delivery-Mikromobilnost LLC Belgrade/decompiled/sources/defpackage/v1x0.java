package defpackage;

import android.system.Os;
import android.system.OsConstants;
import com.yandex.pulse.metrics.g;

/* loaded from: classes8.dex */
public abstract class v1x0 {
    public static final long a;

    static {
        g gVar = g.a;
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        if (sysconf <= 0) {
            sysconf = 100;
        }
        a = sysconf;
    }
}
