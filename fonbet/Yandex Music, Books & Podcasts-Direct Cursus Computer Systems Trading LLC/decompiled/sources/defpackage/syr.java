package defpackage;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes5.dex */
public abstract class syr {
    public static final long a;

    static {
        uyr uyrVar = uyr.a;
        long sysconf = Os.sysconf(OsConstants._SC_PAGESIZE);
        if (sysconf <= 0) {
            sysconf = 4096;
        }
        a = sysconf;
    }
}
