package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.aec;
import defpackage.anx;
import defpackage.f48;
import defpackage.i8s;
import defpackage.iec;
import defpackage.iwe;
import defpackage.jt6;
import defpackage.lkx;
import defpackage.ma;
import defpackage.mec;
import defpackage.mi;
import defpackage.mmo;
import defpackage.mvn;
import defpackage.nnr;
import defpackage.onx;
import defpackage.p70;
import defpackage.pn5;
import defpackage.rho;
import defpackage.suh;
import defpackage.swi;
import defpackage.ttm;
import defpackage.u13;
import defpackage.uf2;
import defpackage.uzm;
import defpackage.v5g;
import defpackage.w6e;
import defpackage.x8a;
import defpackage.xy0;
import defpackage.y1g;
import defpackage.ywf;
import defpackage.z0j;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class FirebaseMessaging {
    public static ttm j;
    public static uzm k = new pn5(5);
    public static ScheduledThreadPoolExecutor l;
    public final aec a;
    public final Context b;
    public final mmo c;
    public final iwe d;
    public final z0j e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final ma h;
    public boolean i;

    public FirebaseMessaging(aec aecVar, uzm uzmVar, uzm uzmVar2, iec iecVar, uzm uzmVar3, nnr nnrVar) {
        aecVar.a();
        Context context = aecVar.a;
        final ma maVar = new ma();
        maVar.b = 0;
        maVar.e = context;
        final mmo mmoVar = new mmo(aecVar, maVar, uzmVar, uzmVar2, iecVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new swi("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new swi("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new swi("Firebase-Messaging-File-Io"));
        this.i = false;
        k = uzmVar3;
        this.a = aecVar;
        this.e = new z0j(this, nnrVar);
        aecVar.a();
        final Context context2 = aecVar.a;
        this.b = context2;
        uf2 uf2Var = new uf2();
        this.h = maVar;
        this.c = mmoVar;
        this.d = new iwe(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        aecVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(uf2Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        final int i = 0;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: lec
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                onx v;
                int i2;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.U() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context3 = firebaseMessaging2.b;
                        mi.x(context3);
                        mmo mmoVar2 = firebaseMessaging2.c;
                        boolean g = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences x = tyf.x(context3);
                            if (!x.contains("proxy_retention") || x.getBoolean("proxy_retention", false) != g) {
                                rho rhoVar = (rho) mmoVar2.d;
                                if (rhoVar.c.w() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g);
                                    anx J = anx.J(rhoVar.b);
                                    synchronized (J) {
                                        i2 = J.a;
                                        J.a = i2 + 1;
                                    }
                                    v = J.K(new lkx(i2, 4, bundle, 0));
                                } else {
                                    v = ywf.v(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                v.d(new gx0(1), new w1e(context3, g, 5));
                            }
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.f();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new swi("Firebase-Messaging-Topics-Io"));
        ywf.p(scheduledThreadPoolExecutor2, new Callable() { // from class: qps
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pps ppsVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                ma maVar2 = maVar;
                mmo mmoVar2 = mmoVar;
                synchronized (pps.class) {
                    try {
                        WeakReference weakReference = pps.b;
                        ppsVar = weakReference != null ? (pps) weakReference.get() : null;
                        if (ppsVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            pps ppsVar2 = new pps();
                            synchronized (ppsVar2) {
                                ppsVar2.a = n3m.G0(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            pps.b = new WeakReference(ppsVar2);
                            ppsVar = ppsVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new rps(firebaseMessaging, maVar2, ppsVar, mmoVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).d(scheduledThreadPoolExecutor, new mec(this, 0));
        final int i2 = 1;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: lec
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                onx v;
                int i22;
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.U() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context3 = firebaseMessaging2.b;
                        mi.x(context3);
                        mmo mmoVar2 = firebaseMessaging2.c;
                        boolean g = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences x = tyf.x(context3);
                            if (!x.contains("proxy_retention") || x.getBoolean("proxy_retention", false) != g) {
                                rho rhoVar = (rho) mmoVar2.d;
                                if (rhoVar.c.w() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g);
                                    anx J = anx.J(rhoVar.b);
                                    synchronized (J) {
                                        i22 = J.a;
                                        J.a = i22 + 1;
                                    }
                                    v = J.K(new lkx(i22, 4, bundle, 0));
                                } else {
                                    v = ywf.v(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                v.d(new gx0(1), new w1e(context3, g, 5));
                            }
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.f();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ScheduledThreadPoolExecutor(1, new swi("TAG"));
                }
                l.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized ttm c(Context context) {
        ttm ttmVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (j == null) {
                    j = new ttm(context);
                }
                ttmVar = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ttmVar;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull aec aecVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) aecVar.b(FirebaseMessaging.class);
            y1g.H(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        x8a e = e();
        if (!i(e)) {
            return (String) e.b;
        }
        String d = ma.d(this.a);
        iwe iweVar = this.d;
        synchronized (iweVar) {
            task = (Task) ((xy0) iweVar.c).get(d);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + d);
                }
                mmo mmoVar = this.c;
                task = mmoVar.S(mmoVar.P0(ma.d((aec) mmoVar.b), "*", new Bundle())).m(this.g, new u13(4, this, d, e)).f((Executor) iweVar.b, new suh(iweVar, d, 15));
                ((xy0) iweVar.c).put(d, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + d);
            }
        }
        try {
            return (String) ywf.n(task);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final onx d() {
        i8s i8sVar = new i8s();
        this.f.execute(new jt6(29, this, i8sVar));
        return i8sVar.a;
    }

    public final x8a e() {
        x8a d;
        ttm c = c(this.b);
        aec aecVar = this.a;
        aecVar.a();
        String f = "[DEFAULT]".equals(aecVar.b) ? "" : aecVar.f();
        String d2 = ma.d(this.a);
        synchronized (c) {
            d = x8a.d(c.a.getString(f + "|T|" + d2 + "|*", null));
        }
        return d;
    }

    public final void f() {
        Task v;
        int i;
        rho rhoVar = (rho) this.c.d;
        if (rhoVar.c.w() >= 241100000) {
            anx J = anx.J(rhoVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (J) {
                i = J.a;
                J.a = i + 1;
            }
            v = J.K(new lkx(i, 5, bundle, 1)).e(f48.d, mvn.k);
        } else {
            v = ywf.v(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        v.d(this.f, new mec(this, 1));
    }

    public final boolean g() {
        Context context = this.b;
        mi.x(context);
        if (!mi.z(context)) {
            return false;
        }
        if (this.a.b(p70.class) != null) {
            return true;
        }
        return v5g.y() && k != null;
    }

    public final synchronized void h(long j2) {
        b(new w6e(this, Math.min(Math.max(30L, 2 * j2), 28800L)), j2);
        this.i = true;
    }

    public final boolean i(x8a x8aVar) {
        if (x8aVar != null) {
            return System.currentTimeMillis() > x8aVar.a + 604800000 || !this.h.c().equals((String) x8aVar.c);
        }
        return true;
    }
}
