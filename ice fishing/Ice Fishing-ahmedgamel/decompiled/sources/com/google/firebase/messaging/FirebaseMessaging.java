package com.google.firebase.messaging;

import C2.N;
import L2.d;
import L2.h;
import L2.n;
import O3.g;
import P2.w;
import R3.f;
import U2.a;
import X2.e;
import Z3.b;
import a.AbstractC0422a;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.fragment.app.C0461d;
import c4.InterfaceC0542a;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.C2545Eo;
import com.google.android.gms.internal.ads.RunnableC2807Ug;
import com.google.firebase.messaging.FirebaseMessaging;
import d4.InterfaceC4450d;
import e2.C4461a;
import g1.C4523c;
import j3.m;
import j4.j;
import j4.l;
import j4.r;
import j4.v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC4742a;
import q2.C4896n;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static C4523c f36190k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f36192m;

    /* renamed from: a, reason: collision with root package name */
    public final g f36193a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f36194b;

    /* renamed from: c, reason: collision with root package name */
    public final C4896n f36195c;

    /* renamed from: d, reason: collision with root package name */
    public final j f36196d;

    /* renamed from: e, reason: collision with root package name */
    public final o f36197e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f36198f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f36199g;

    /* renamed from: h, reason: collision with root package name */
    public final C2545Eo f36200h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f36189j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC0542a f36191l = new f(6);

    public FirebaseMessaging(g gVar, InterfaceC0542a interfaceC0542a, InterfaceC0542a interfaceC0542a2, InterfaceC4450d interfaceC4450d, InterfaceC0542a interfaceC0542a3, b bVar) {
        final int i = 1;
        final int i6 = 0;
        gVar.a();
        Context context = gVar.f2345a;
        final C2545Eo c2545Eo = new C2545Eo(context, 2);
        final C4896n c4896n = new C4896n(gVar, c2545Eo, interfaceC0542a, interfaceC0542a2, interfaceC4450d);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        this.i = false;
        f36191l = interfaceC0542a3;
        this.f36193a = gVar;
        this.f36197e = new o(this, bVar);
        gVar.a();
        final Context context2 = gVar.f2345a;
        this.f36194b = context2;
        com.bumptech.glide.b bVar2 = new com.bumptech.glide.b();
        this.f36200h = c2545Eo;
        this.f36195c = c4896n;
        this.f36196d = new j(newSingleThreadExecutor);
        this.f36198f = scheduledThreadPoolExecutor;
        this.f36199g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(bVar2);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: j4.k

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f38420u;

            {
                this.f38420u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j3.m h9;
                int i9;
                switch (i6) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f38420u;
                        if (firebaseMessaging.f36197e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f38420u;
                        final Context context3 = firebaseMessaging2.f36194b;
                        AbstractC0422a.n(context3);
                        final boolean f3 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences g4 = com.bumptech.glide.d.g(context3);
                            if (!g4.contains("proxy_retention") || g4.getBoolean("proxy_retention", false) != f3) {
                                L2.b bVar3 = (L2.b) firebaseMessaging2.f36195c.f40194w;
                                if (bVar3.f1625c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f3);
                                    L2.n c9 = L2.n.c(bVar3.f1624b);
                                    synchronized (c9) {
                                        i9 = c9.f1659a;
                                        c9.f1659a = i9 + 1;
                                    }
                                    h9 = c9.d(new L2.l(i9, 4, bundle, 0));
                                } else {
                                    h9 = S0.f.h(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                h9.c(new ExecutorC4742a(1), new j3.e() { // from class: j4.p
                                    @Override // j3.e
                                    public final void h(Object obj) {
                                        SharedPreferences.Editor edit = com.bumptech.glide.d.g(context3).edit();
                                        edit.putBoolean("proxy_retention", f3);
                                        edit.apply();
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
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
        int i9 = v.f38453j;
        S0.f.d(new Callable() { // from class: j4.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t tVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C2545Eo c2545Eo2 = c2545Eo;
                C4896n c4896n2 = c4896n;
                synchronized (t.class) {
                    try {
                        WeakReference weakReference = t.f38445c;
                        tVar = weakReference != null ? (t) weakReference.get() : null;
                        if (tVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            t tVar2 = new t(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (tVar2) {
                                tVar2.f38446a = N.i(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            t.f38445c = new WeakReference(tVar2);
                            tVar = tVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new v(firebaseMessaging, c2545Eo2, tVar, c4896n2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).c(scheduledThreadPoolExecutor, new l(this, i6));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: j4.k

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f38420u;

            {
                this.f38420u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j3.m h9;
                int i92;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f38420u;
                        if (firebaseMessaging.f36197e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f38420u;
                        final Context context3 = firebaseMessaging2.f36194b;
                        AbstractC0422a.n(context3);
                        final boolean f3 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences g4 = com.bumptech.glide.d.g(context3);
                            if (!g4.contains("proxy_retention") || g4.getBoolean("proxy_retention", false) != f3) {
                                L2.b bVar3 = (L2.b) firebaseMessaging2.f36195c.f40194w;
                                if (bVar3.f1625c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f3);
                                    L2.n c9 = L2.n.c(bVar3.f1624b);
                                    synchronized (c9) {
                                        i92 = c9.f1659a;
                                        c9.f1659a = i92 + 1;
                                    }
                                    h9 = c9.d(new L2.l(i92, 4, bundle, 0));
                                } else {
                                    h9 = S0.f.h(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                h9.c(new ExecutorC4742a(1), new j3.e() { // from class: j4.p
                                    @Override // j3.e
                                    public final void h(Object obj) {
                                        SharedPreferences.Editor edit = com.bumptech.glide.d.g(context3).edit();
                                        edit.putBoolean("proxy_retention", f3);
                                        edit.apply();
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

    public static void b(Runnable runnable, long j6) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36192m == null) {
                    f36192m = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                f36192m.schedule(runnable, j6, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C4523c c(Context context) {
        C4523c c4523c;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36190k == null) {
                    f36190k = new C4523c(context);
                }
                c4523c = f36190k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4523c;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            w.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        m mVar;
        r d2 = d();
        if (!h(d2)) {
            return d2.f38438a;
        }
        String b9 = C2545Eo.b(this.f36193a);
        j jVar = this.f36196d;
        synchronized (jVar) {
            mVar = (m) ((s.b) jVar.f38418b).getOrDefault(b9, null);
            if (mVar == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b9);
                }
                C4896n c4896n = this.f36195c;
                mVar = c4896n.e(c4896n.n(C2545Eo.b((g) c4896n.f40192u), new Bundle(), "*")).j(this.f36199g, new C4461a(4, this, b9, d2)).e((ExecutorService) jVar.f38417a, new C0461d(5, jVar, b9));
                ((s.b) jVar.f38418b).put(b9, mVar);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b9);
            }
        }
        try {
            return (String) S0.f.b(mVar);
        } catch (InterruptedException | ExecutionException e9) {
            throw new IOException(e9);
        }
    }

    public final r d() {
        r b9;
        C4523c c9 = c(this.f36194b);
        g gVar = this.f36193a;
        gVar.a();
        String d2 = "[DEFAULT]".equals(gVar.f2346b) ? "" : gVar.d();
        String b10 = C2545Eo.b(this.f36193a);
        synchronized (c9) {
            b9 = r.b(((SharedPreferences) c9.f37627u).getString(d2 + "|T|" + b10 + "|*", null));
        }
        return b9;
    }

    public final void e() {
        m h9;
        int i;
        L2.b bVar = (L2.b) this.f36195c.f40194w;
        if (bVar.f1625c.a() >= 241100000) {
            n c9 = n.c(bVar.f1624b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c9) {
                i = c9.f1659a;
                c9.f1659a = i + 1;
            }
            h9 = c9.d(new L2.l(i, 5, bundle, 1)).d(h.f1638v, d.f1632v);
        } else {
            h9 = S0.f.h(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        h9.c(this.f36198f, new l(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f36194b;
        AbstractC0422a.n(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if ("com.google.android.gms".equals(notificationDelegate)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f36193a.b(P3.a.class) != null || (e.F() && f36191l != null)) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public final synchronized void g(long j6) {
        b(new RunnableC2807Ug(this, Math.min(Math.max(30L, 2 * j6), f36189j)), j6);
        this.i = true;
    }

    public final boolean h(r rVar) {
        if (rVar != null) {
            return System.currentTimeMillis() > rVar.f38440c + r.f38437d || !this.f36200h.a().equals(rVar.f38439b);
        }
        return true;
    }
}
