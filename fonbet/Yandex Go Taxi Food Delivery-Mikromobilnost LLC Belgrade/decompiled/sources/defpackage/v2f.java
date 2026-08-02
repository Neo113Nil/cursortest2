package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.a;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class v2f {
    public final Context a;
    public final uo2 b;
    public final fy60 c;
    public final long d;
    public lb7 e;
    public lb7 f;
    public boolean g;
    public a h;
    public final c6v i;
    public final q1r j;
    public final g32 k;
    public final g32 l;
    public final p2f m;
    public final b3f n;
    public final o370 o;
    public final com.google.firebase.crashlytics.internal.concurrency.a p;

    public v2f(com.google.firebase.a aVar, c6v c6vVar, b3f b3fVar, uo2 uo2Var, g32 g32Var, g32 g32Var2, q1r q1rVar, p2f p2fVar, o370 o370Var, com.google.firebase.crashlytics.internal.concurrency.a aVar2) {
        this.b = uo2Var;
        aVar.a();
        this.a = aVar.a;
        this.i = c6vVar;
        this.n = b3fVar;
        this.k = g32Var;
        this.l = g32Var2;
        this.j = q1rVar;
        this.m = p2fVar;
        this.o = o370Var;
        this.p = aVar2;
        this.d = System.currentTimeMillis();
        this.c = new fy60();
    }

    public final void a(com.google.firebase.crashlytics.internal.settings.a aVar) {
        com.google.firebase.crashlytics.internal.concurrency.a.a();
        com.google.firebase.crashlytics.internal.concurrency.a.a();
        this.e.o();
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            this.k.a(new u2f(this));
            this.h.h();
            if (!aVar.b().b.a) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            this.h.e(aVar);
            this.h.i(((atx0) aVar.i.get()).a);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
        } finally {
            c();
        }
    }

    public final void b(com.google.firebase.crashlytics.internal.settings.a aVar) {
        Future<?> submit = ((ExecutorService) this.p.a.b).submit(new l7a(27, this, aVar));
        Log.isLoggable("FirebaseCrashlytics", 3);
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        com.google.firebase.crashlytics.internal.concurrency.a.a();
        try {
            lb7 lb7Var = this.e;
            q1r q1rVar = (q1r) lb7Var.b;
            String str = (String) lb7Var.c;
            q1rVar.getClass();
            new File(q1rVar.c, str).delete();
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public final void d(Boolean bool) {
        Boolean b;
        uo2 uo2Var = this.b;
        synchronized (uo2Var) {
            if (bool != null) {
                b = bool;
            } else {
                com.google.firebase.a aVar = (com.google.firebase.a) uo2Var.c;
                aVar.a();
                b = uo2Var.b(aVar.a);
            }
            uo2Var.y = b;
            SharedPreferences.Editor edit = ((SharedPreferences) uo2Var.b).edit();
            if (bool != null) {
                edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                edit.remove("firebase_crashlytics_collection_enabled");
            }
            edit.apply();
            synchronized (uo2Var.w) {
                try {
                    boolean c = uo2Var.c();
                    boolean z = uo2Var.a;
                    if (c) {
                        if (!z) {
                            ((atx0) uo2Var.x).c(null);
                            uo2Var.a = true;
                        }
                    } else if (z) {
                        uo2Var.x = new atx0();
                        uo2Var.a = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void e(String str, String str2) {
        this.p.a.a(new r94(2, this, str, str2));
    }
}
