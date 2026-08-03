package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b0.s0;
import c6.f;
import com.google.firebase.messaging.FirebaseMessaging;
import d8.b0;
import d8.j;
import d8.k;
import d8.m;
import d8.v;
import d8.x;
import g7.o;
import i7.g;
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
import p6.u;
import t5.e;
import t7.b;
import w7.a;
import x7.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: j, reason: collision with root package name */
    public static final long f1456j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k, reason: collision with root package name */
    public static v f1457k;

    /* renamed from: l, reason: collision with root package name */
    public static e f1458l;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f1459m;

    /* renamed from: a, reason: collision with root package name */
    public final g f1460a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1461b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1462c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1463d;

    /* renamed from: e, reason: collision with root package name */
    public final b4.e f1464e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1465f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f1466g;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f1467h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1468i;

    public FirebaseMessaging(g gVar, a aVar, a aVar2, d dVar, e eVar, b bVar) {
        gVar.a();
        Context context = gVar.f3231a;
        final s0 s0Var = new s0();
        final int i10 = 0;
        s0Var.f889b = 0;
        s0Var.f890c = context;
        gVar.a();
        l6.a aVar3 = new l6.a(gVar.f3231a);
        final m mVar = new m();
        mVar.f1797a = gVar;
        mVar.f1798b = s0Var;
        mVar.f1799c = aVar3;
        mVar.f1800d = aVar;
        mVar.f1801e = aVar2;
        mVar.f1802f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new u6.a("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new u6.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new u6.a("Firebase-Messaging-File-Io"));
        this.f1468i = false;
        f1458l = eVar;
        this.f1460a = gVar;
        this.f1464e = new b4.e(this, bVar);
        gVar.a();
        final Context context2 = gVar.f3231a;
        this.f1461b = context2;
        k kVar = new k();
        this.f1467h = s0Var;
        this.f1462c = mVar;
        this.f1463d = new j(newSingleThreadExecutor);
        this.f1465f = scheduledThreadPoolExecutor;
        this.f1466g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: d8.l

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f1796h;

            {
                this.f1796h = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                final boolean z10;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f1796h;
                        if (firebaseMessaging.f1464e.c() && firebaseMessaging.f(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f1468i) {
                                    firebaseMessaging.e(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = this.f1796h.f1461b;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        if (applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            applicationContext = context3.getApplicationContext();
                            packageManager = applicationContext.getPackageManager();
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT >= 29) {
                                i7.b.u(null);
                                return;
                            } else {
                                final g7.h hVar = new g7.h();
                                new Runnable() { // from class: d8.q
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String notificationDelegate;
                                        Context context4 = context3;
                                        g7.h hVar2 = hVar;
                                        try {
                                            if (Binder.getCallingUid() != context4.getApplicationInfo().uid) {
                                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context4.getPackageName());
                                                hVar2.c(null);
                                                return;
                                            }
                                            Context applicationContext3 = context4.getApplicationContext();
                                            if (applicationContext3 == null) {
                                                applicationContext3 = context4;
                                            }
                                            SharedPreferences.Editor edit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                                            edit.putBoolean("proxy_notification_initialized", true);
                                            edit.apply();
                                            NotificationManager notificationManager = (NotificationManager) context4.getSystemService(NotificationManager.class);
                                            if (z10) {
                                                notificationManager.setNotificationDelegate("com.google.android.gms");
                                            } else {
                                                notificationDelegate = notificationManager.getNotificationDelegate();
                                                if ("com.google.android.gms".equals(notificationDelegate)) {
                                                    notificationManager.setNotificationDelegate(null);
                                                }
                                            }
                                            hVar2.c(null);
                                        } catch (Throwable th) {
                                            hVar2.c(null);
                                            throw th;
                                        }
                                    }
                                }.run();
                                return;
                            }
                        }
                        z10 = true;
                        if (Build.VERSION.SDK_INT >= 29) {
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new u6.a("Firebase-Messaging-Topics-Io"));
        int i12 = b0.f1744j;
        i7.b.o(scheduledThreadPoolExecutor2, new Callable() { // from class: d8.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                z zVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                s0 s0Var2 = s0Var;
                m mVar2 = mVar;
                synchronized (z.class) {
                    try {
                        WeakReference weakReference = z.f1835b;
                        zVar = weakReference != null ? (z) weakReference.get() : null;
                        if (zVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            z zVar2 = new z();
                            synchronized (zVar2) {
                                zVar2.f1836a = t.i(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            z.f1835b = new WeakReference(zVar2);
                            zVar = zVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new b0(firebaseMessaging, s0Var2, zVar, mVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).c(scheduledThreadPoolExecutor, new f(4, this));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: d8.l

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f1796h;

            {
                this.f1796h = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                final boolean z10;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f1796h;
                        if (firebaseMessaging.f1464e.c() && firebaseMessaging.f(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f1468i) {
                                    firebaseMessaging.e(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = this.f1796h.f1461b;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        if (applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            applicationContext = context3.getApplicationContext();
                            packageManager = applicationContext.getPackageManager();
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT >= 29) {
                                i7.b.u(null);
                                return;
                            } else {
                                final g7.h hVar = new g7.h();
                                new Runnable() { // from class: d8.q
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String notificationDelegate;
                                        Context context4 = context3;
                                        g7.h hVar2 = hVar;
                                        try {
                                            if (Binder.getCallingUid() != context4.getApplicationInfo().uid) {
                                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context4.getPackageName());
                                                hVar2.c(null);
                                                return;
                                            }
                                            Context applicationContext3 = context4.getApplicationContext();
                                            if (applicationContext3 == null) {
                                                applicationContext3 = context4;
                                            }
                                            SharedPreferences.Editor edit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                                            edit.putBoolean("proxy_notification_initialized", true);
                                            edit.apply();
                                            NotificationManager notificationManager = (NotificationManager) context4.getSystemService(NotificationManager.class);
                                            if (z10) {
                                                notificationManager.setNotificationDelegate("com.google.android.gms");
                                            } else {
                                                notificationDelegate = notificationManager.getNotificationDelegate();
                                                if ("com.google.android.gms".equals(notificationDelegate)) {
                                                    notificationManager.setNotificationDelegate(null);
                                                }
                                            }
                                            hVar2.c(null);
                                        } catch (Throwable th) {
                                            hVar2.c(null);
                                            throw th;
                                        }
                                    }
                                }.run();
                                return;
                            }
                        }
                        z10 = true;
                        if (Build.VERSION.SDK_INT >= 29) {
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j3) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f1459m == null) {
                    f1459m = new ScheduledThreadPoolExecutor(1, new u6.a("TAG"));
                }
                f1459m.schedule(runnable, j3, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized v c(Context context) {
        v vVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f1457k == null) {
                    f1457k = new v(context);
                }
                vVar = f1457k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            gVar.a();
            firebaseMessaging = (FirebaseMessaging) gVar.f3234d.a(FirebaseMessaging.class);
            u.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        o oVar;
        d8.u d10 = d();
        if (!f(d10)) {
            return d10.f1822a;
        }
        String c3 = s0.c(this.f1460a);
        j jVar = this.f1463d;
        synchronized (jVar) {
            oVar = (o) ((s.f) jVar.f1793b).get(c3);
            if (oVar == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c3);
                }
                m mVar = this.f1462c;
                oVar = mVar.j(mVar.o(s0.c((g) mVar.f1797a), "*", new Bundle())).j(this.f1466g, new b6.b(this, c3, d10, 4)).e((Executor) jVar.f1792a, new c6.j(4, jVar, c3));
                ((s.f) jVar.f1793b).put(c3, oVar);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c3);
            }
        }
        try {
            return (String) i7.b.l(oVar);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final d8.u d() {
        d8.u b2;
        v c3 = c(this.f1461b);
        g gVar = this.f1460a;
        gVar.a();
        String c7 = "[DEFAULT]".equals(gVar.f3232b) ? "" : gVar.c();
        String c10 = s0.c(this.f1460a);
        synchronized (c3) {
            b2 = d8.u.b(c3.f1825a.getString(c7 + "|T|" + c10 + "|*", null));
        }
        return b2;
    }

    public final synchronized void e(long j3) {
        b(new x(this, Math.min(Math.max(30L, 2 * j3), f1456j)), j3);
        this.f1468i = true;
    }

    public final boolean f(d8.u uVar) {
        if (uVar != null) {
            return System.currentTimeMillis() > uVar.f1824c + d8.u.f1821d || !this.f1467h.b().equals(uVar.f1823b);
        }
        return true;
    }
}
