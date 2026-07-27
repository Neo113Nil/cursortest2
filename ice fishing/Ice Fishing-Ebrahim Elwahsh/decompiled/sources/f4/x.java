package f4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import g3.C4527a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final long f37802a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f37803b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C4527a f37804c;

    public static void a(Context context) {
        if (f37804c == null) {
            C4527a c4527a = new C4527a(context);
            f37804c = c4527a;
            synchronized (c4527a.f37887a) {
                c4527a.f37893g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f37803b) {
            try {
                if (f37804c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f37804c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f37803b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f37804c.a(f37802a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
