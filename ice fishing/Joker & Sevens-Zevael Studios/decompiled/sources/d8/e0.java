package d8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1767a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1768b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static f7.a f1769c;

    public static void a(Context context) {
        if (f1769c == null) {
            f7.a aVar = new f7.a(context);
            f1769c = aVar;
            synchronized (aVar.f2320a) {
                aVar.f2326g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f1768b) {
            try {
                if (f1769c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f1769c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f1768b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f1769c.a(f1767a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
