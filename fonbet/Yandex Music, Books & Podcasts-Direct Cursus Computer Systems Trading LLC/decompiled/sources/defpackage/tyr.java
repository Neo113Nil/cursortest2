package defpackage;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes5.dex */
public abstract class tyr {
    public static final long a;

    static {
        uyr uyrVar = uyr.a;
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        if (sysconf <= 0) {
            sysconf = 100;
        }
        a = sysconf;
    }
}
