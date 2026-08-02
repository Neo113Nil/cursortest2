package defpackage;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes5.dex */
public abstract class oyr {
    public static final long a;

    static {
        uyr uyrVar = uyr.a;
        long sysconf = Os.sysconf(OsConstants._SC_PHYS_PAGES);
        long sysconf2 = Os.sysconf(OsConstants._SC_PAGESIZE);
        a = (sysconf == -1 || sysconf2 == -1) ? 0L : sysconf * sysconf2;
    }
}
