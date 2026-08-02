package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.system.Os;
import android.system.OsConstants;
import com.yandex.pulse.metrics.g;

/* loaded from: classes8.dex */
public abstract class u1x0 {
    public static final long a;

    static {
        g gVar = g.a;
        long sysconf = Os.sysconf(OsConstants._SC_PAGESIZE);
        if (sysconf <= 0) {
            sysconf = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        a = sysconf;
    }
}
