package com.gamericefishpro.space.i9;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static volatile j1 f;
    public final ExecutorService a;
    public final com.gamericefishpro.space.m.d b;
    public int c;
    public boolean d;
    public volatile j0 e;

    public j1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new com.gamericefishpro.space.m.d(4, this);
        new ArrayList();
        int i = 0;
        try {
            if (com.gamericefishpro.space.n9.f2.b(context, com.gamericefishpro.space.n9.f2.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, j1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.d = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new z0(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new i1(this));
        }
    }

    public static j1 c(Context context, Bundle bundle) {
        com.gamericefishpro.space.v8.c0.g(context);
        if (f == null) {
            synchronized (j1.class) {
                try {
                    if (f == null) {
                        f = new j1(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final void a(g1 g1Var) {
        this.a.execute(g1Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.d |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(new z0(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }
}
