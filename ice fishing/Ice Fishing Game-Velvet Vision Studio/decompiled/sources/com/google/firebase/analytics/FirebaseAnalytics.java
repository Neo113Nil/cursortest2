package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.i9.j1;
import com.gamericefishpro.space.i9.v0;
import com.gamericefishpro.space.i9.y0;
import com.gamericefishpro.space.i9.z0;
import com.gamericefishpro.space.n9.k1;
import com.gamericefishpro.space.n9.u2;
import com.gamericefishpro.space.ob.d;
import com.gamericefishpro.space.r9.o;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.wa.g;
import com.gamericefishpro.space.xa.b;
import com.gamericefishpro.space.xa.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final j1 a;
    public b b;

    public FirebaseAnalytics(j1 j1Var) {
        c0.g(j1Var);
        this.a = j1Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(j1.c(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static u2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        j1 j1VarC = j1.c(context, bundle);
        if (j1VarC == null) {
            return null;
        }
        return new c(j1VarC);
    }

    public final o a() {
        b bVar;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.b == null) {
                        this.b = new b(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    bVar = this.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return h.l(bVar, new k1(2, this));
        } catch (RuntimeException e) {
            j1 j1Var = this.a;
            j1Var.getClass();
            j1Var.a(new z0(j1Var, "Failed to schedule task for getAppInstanceId", (Object) null));
            return h.v(e);
        }
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = com.gamericefishpro.space.ob.c.m;
            return (String) h.k(((com.gamericefishpro.space.ob.c) g.c().b(d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        v0 v0VarB = v0.b(activity);
        j1 j1Var = this.a;
        j1Var.getClass();
        j1Var.a(new y0(j1Var, v0VarB, str, str2));
    }
}
