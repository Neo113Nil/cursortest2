package l4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import k3.C4643a;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final long f38984a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f38985b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C4643a f38986c;

    public static void a(Context context) {
        if (f38986c == null) {
            C4643a c4643a = new C4643a(context);
            f38986c = c4643a;
            synchronized (c4643a.f38583a) {
                c4643a.f38589g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f38985b) {
            try {
                if (f38986c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f38986c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f38985b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f38986c.a(f38984a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
