package defpackage;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class oh {
    public static final String a;
    public static final ScheduledExecutorService b;
    public static volatile ScheduledFuture c;
    public static final Object d;
    public static final AtomicInteger e;
    public static volatile sj f;
    public static final AtomicBoolean g;
    public static String h;
    public static long i;
    public static int j;
    public static WeakReference k;

    static {
        String canonicalName = oh.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        a = canonicalName;
        b = Executors.newSingleThreadScheduledExecutor();
        d = new Object();
        e = new AtomicInteger(0);
        g = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (d) {
            try {
                if (c != null && (scheduledFuture = c) != null) {
                    scheduledFuture.cancel(false);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final UUID b() {
        sj sjVar;
        if (f == null || (sjVar = f) == null) {
            return null;
        }
        return (UUID) sjVar.f;
    }

    public static final void c(Application application, String str) {
        application.getClass();
        if (g.compareAndSet(false, true)) {
            x6c.a(bs4.c, v6c.CodelessEvents);
            h = str;
            application.registerActivityLifecycleCallbacks(new jnp(1));
        }
    }
}
