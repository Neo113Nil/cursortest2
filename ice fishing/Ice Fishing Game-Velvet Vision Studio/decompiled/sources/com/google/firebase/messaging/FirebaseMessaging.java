package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.bb.f;
import com.gamericefishpro.space.c8.h;
import com.gamericefishpro.space.h0.w0;
import com.gamericefishpro.space.h0.z0;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.kb.c;
import com.gamericefishpro.space.n9.q2;
import com.gamericefishpro.space.nb.a;
import com.gamericefishpro.space.ob.d;
import com.gamericefishpro.space.r8.b;
import com.gamericefishpro.space.r8.l;
import com.gamericefishpro.space.t.e;
import com.gamericefishpro.space.tb.a0;
import com.gamericefishpro.space.tb.k;
import com.gamericefishpro.space.tb.m;
import com.gamericefishpro.space.tb.t;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.tb.w;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.wa.g;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static u k;
    public static ScheduledThreadPoolExecutor m;
    public final g a;
    public final Context b;
    public final h c;
    public final k d;
    public final z0 e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final com.gamericefishpro.space.f1.k h;
    public boolean i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static a l = new f(6);

    public FirebaseMessaging(g gVar, a aVar, a aVar2, d dVar, a aVar3, c cVar) {
        gVar.a();
        Context context = gVar.a;
        final com.gamericefishpro.space.f1.k kVar = new com.gamericefishpro.space.f1.k();
        final int i = 0;
        kVar.b = 0;
        kVar.c = context;
        gVar.a();
        b bVar = new b(gVar.a);
        final h hVar = new h();
        hVar.a = gVar;
        hVar.b = kVar;
        hVar.c = bVar;
        hVar.d = aVar;
        hVar.e = aVar2;
        hVar.f = dVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new com.gamericefishpro.space.a9.a("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.gamericefishpro.space.a9.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.gamericefishpro.space.a9.a("Firebase-Messaging-File-Io"));
        this.i = false;
        l = aVar3;
        this.a = gVar;
        this.e = new z0(this, cVar);
        gVar.a();
        final Context context2 = gVar.a;
        this.b = context2;
        q2 q2Var = new q2();
        this.h = kVar;
        this.c = hVar;
        this.d = new k(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(q2Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.gamericefishpro.space.tb.l
            public final /* synthetic */ FirebaseMessaging e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.gamericefishpro.space.r9.o oVarV;
                int i3;
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        FirebaseMessaging firebaseMessaging = this.e;
                        if (firebaseMessaging.e.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.e;
                        final Context context3 = firebaseMessaging2.b;
                        com.gamericefishpro.space.hj.c.D(context3);
                        com.gamericefishpro.space.c8.h hVar2 = firebaseMessaging2.c;
                        final boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesX = y3.x(context3);
                            if (!sharedPreferencesX.contains("proxy_retention") || sharedPreferencesX.getBoolean("proxy_retention", false) != zF) {
                                com.gamericefishpro.space.r8.b bVar2 = (com.gamericefishpro.space.r8.b) hVar2.c;
                                if (bVar2.c.p() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    com.gamericefishpro.space.r8.m mVarF = com.gamericefishpro.space.r8.m.f(bVar2.b);
                                    synchronized (mVarF) {
                                        i3 = mVarF.a;
                                        mVarF.a = i3 + 1;
                                    }
                                    oVarV = mVarF.g(new com.gamericefishpro.space.r8.l(i3, 4, bundle, 0));
                                } else {
                                    oVarV = com.gamericefishpro.space.d9.h.v(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                oVarV.e(new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.r9.e() { // from class: com.gamericefishpro.space.tb.q
                                    @Override // com.gamericefishpro.space.r9.e
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = y3.x(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new com.gamericefishpro.space.a9.a("Firebase-Messaging-Topics-Io"));
        int i3 = a0.j;
        com.gamericefishpro.space.d9.h.l(scheduledThreadPoolExecutor2, new Callable() { // from class: com.gamericefishpro.space.tb.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y yVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                com.gamericefishpro.space.f1.k kVar2 = kVar;
                com.gamericefishpro.space.c8.h hVar2 = hVar;
                synchronized (y.class) {
                    try {
                        WeakReference weakReference = y.b;
                        yVar = weakReference != null ? (y) weakReference.get() : null;
                        if (yVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            y yVar2 = new y();
                            synchronized (yVar2) {
                                yVar2.a = com.gamericefishpro.space.b1.d.l(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            y.b = new WeakReference(yVar2);
                            yVar = yVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new a0(firebaseMessaging, kVar2, yVar, hVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).e(scheduledThreadPoolExecutor, new m(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.gamericefishpro.space.tb.l
            public final /* synthetic */ FirebaseMessaging e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.gamericefishpro.space.r9.o oVarV;
                int i4;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        FirebaseMessaging firebaseMessaging = this.e;
                        if (firebaseMessaging.e.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.e;
                        final Context context3 = firebaseMessaging2.b;
                        com.gamericefishpro.space.hj.c.D(context3);
                        com.gamericefishpro.space.c8.h hVar2 = firebaseMessaging2.c;
                        final boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesX = y3.x(context3);
                            if (!sharedPreferencesX.contains("proxy_retention") || sharedPreferencesX.getBoolean("proxy_retention", false) != zF) {
                                com.gamericefishpro.space.r8.b bVar2 = (com.gamericefishpro.space.r8.b) hVar2.c;
                                if (bVar2.c.p() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    com.gamericefishpro.space.r8.m mVarF = com.gamericefishpro.space.r8.m.f(bVar2.b);
                                    synchronized (mVarF) {
                                        i4 = mVarF.a;
                                        mVarF.a = i4 + 1;
                                    }
                                    oVarV = mVarF.g(new com.gamericefishpro.space.r8.l(i4, 4, bundle, 0));
                                } else {
                                    oVarV = com.gamericefishpro.space.d9.h.v(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                oVarV.e(new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.r9.e() { // from class: com.gamericefishpro.space.tb.q
                                    @Override // com.gamericefishpro.space.r9.e
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = y3.x(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
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
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new com.gamericefishpro.space.a9.a("TAG"));
                }
                m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized u c(Context context) {
        try {
            if (k == null) {
                k = new u(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        c0.h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskG;
        t tVarD = d();
        if (!h(tVarD)) {
            return tVarD.a;
        }
        String strC = com.gamericefishpro.space.f1.k.c(this.a);
        k kVar = this.d;
        synchronized (kVar) {
            taskG = (Task) ((e) kVar.b).get(strC);
            if (taskG != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                h hVar = this.c;
                taskG = hVar.j(hVar.o(com.gamericefishpro.space.f1.k.c((g) hVar.a), "*", new Bundle())).k(this.g, new com.gamericefishpro.space.h8.a(this, strC, tVarD, 4)).g((Executor) kVar.a, new w0(5, kVar, strC));
                ((e) kVar.b).put(strC, taskG);
            }
        }
        try {
            return (String) com.gamericefishpro.space.d9.h.j(taskG);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final t d() {
        t tVarB;
        u uVarC = c(this.b);
        g gVar = this.a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String strC = com.gamericefishpro.space.f1.k.c(this.a);
        synchronized (uVarC) {
            tVarB = t.b(((SharedPreferences) uVarC.e).getString(strD + "|T|" + strC + "|*", null));
        }
        return tVarB;
    }

    public final void e() {
        Task taskV;
        int i;
        b bVar = (b) this.c.c;
        if (bVar.c.p() >= 241100000) {
            com.gamericefishpro.space.r8.m mVarF = com.gamericefishpro.space.r8.m.f(bVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (mVarF) {
                i = mVarF.a;
                mVarF.a = i + 1;
            }
            taskV = mVarF.g(new l(i, 5, bundle, 1)).f(com.gamericefishpro.space.r8.h.i, com.gamericefishpro.space.r8.d.i);
        } else {
            taskV = com.gamericefishpro.space.d9.h.v(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskV.e(this.f, new m(this, 1));
    }

    public final boolean f() {
        Context context = this.b;
        com.gamericefishpro.space.hj.c.D(context);
        if (Build.VERSION.SDK_INT < 29) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            Log.isLoggable("FirebaseMessaging", 3);
            if (this.a.b(com.gamericefishpro.space.ya.a.class) != null) {
                return true;
            }
            if (com.gamericefishpro.space.d9.h.q() && l != null) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void g(long j2) {
        b(new w(this, Math.min(Math.max(30L, 2 * j2), j)), j2);
        this.i = true;
    }

    public final boolean h(t tVar) {
        if (tVar != null) {
            return System.currentTimeMillis() > tVar.c + t.d || !this.h.b().equals(tVar.b);
        }
        return true;
    }
}
