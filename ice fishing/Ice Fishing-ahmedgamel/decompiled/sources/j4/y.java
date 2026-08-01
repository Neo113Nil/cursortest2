package j4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i3.C4582a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final long f38472a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f38473b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C4582a f38474c;

    public static void a(Context context) {
        if (f38474c == null) {
            C4582a c4582a = new C4582a(context);
            f38474c = c4582a;
            synchronized (c4582a.f38046a) {
                c4582a.f38052g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f38473b) {
            try {
                if (f38474c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f38474c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f38473b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f38474c.a(f38472a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
