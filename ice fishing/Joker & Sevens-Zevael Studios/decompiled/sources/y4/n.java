package y4;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8759a;

    static {
        String f10 = o4.o.f("WakeLocks");
        pc.j.d(f10, "tagWithPrefix(\"WakeLocks\")");
        f8759a = f10;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        pc.j.e(context, "context");
        pc.j.e(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        pc.j.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (o.f8760a) {
        }
        pc.j.d(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
