package T0;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3135a;

    static {
        String f2 = J0.r.f("WakeLocks");
        kotlin.jvm.internal.h.d(f2, "tagWithPrefix(\"WakeLocks\")");
        f3135a = f2;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (o.f3136a) {
        }
        kotlin.jvm.internal.h.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
