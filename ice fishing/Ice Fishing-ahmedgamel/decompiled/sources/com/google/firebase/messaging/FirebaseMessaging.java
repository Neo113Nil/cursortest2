package com.google.firebase.messaging;

import E2.M;
import N2.h;
import N2.o;
import Q3.g;
import R2.w;
import T3.f;
import W2.a;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.fragment.app.C0465d;
import b4.InterfaceC0525b;
import com.bumptech.glide.b;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.C2582Fo;
import com.google.android.gms.internal.ads.RunnableC2829Ug;
import com.google.firebase.messaging.FirebaseMessaging;
import e4.InterfaceC4481a;
import f4.d;
import i1.C4586c;
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
import l3.m;
import l4.j;
import l4.l;
import l4.r;
import l4.v;
import n.ExecutorC4756a;
import s2.C4945n;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static C4586c f36957k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f36959m;

    /* renamed from: a, reason: collision with root package name */
    public final g f36960a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f36961b;

    /* renamed from: c, reason: collision with root package name */
    public final C4945n f36962c;

    /* renamed from: d, reason: collision with root package name */
    public final j f36963d;

    /* renamed from: e, reason: collision with root package name */
    public final n f36964e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f36965f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f36966g;

    /* renamed from: h, reason: collision with root package name */
    public final C2582Fo f36967h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f36956j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC4481a f36958l = new f(6);

    public FirebaseMessaging(g gVar, InterfaceC4481a interfaceC4481a, InterfaceC4481a interfaceC4481a2, d dVar, InterfaceC4481a interfaceC4481a3, InterfaceC0525b interfaceC0525b) {
        final int i = 1;
        final int i4 = 0;
        gVar.a();
        Context context = gVar.f2661a;
        final C2582Fo c2582Fo = new C2582Fo(context, 2);
        final C4945n c4945n = new C4945n(gVar, c2582Fo, interfaceC4481a, interfaceC4481a2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        this.i = false;
        f36958l = interfaceC4481a3;
        this.f36960a = gVar;
        this.f36964e = new n(this, interfaceC0525b);
        gVar.a();
        final Context context2 = gVar.f2661a;
        this.f36961b = context2;
        b bVar = new b();
        this.f36967h = c2582Fo;
        this.f36962c = c4945n;
        this.f36963d = new j(newSingleThreadExecutor);
        this.f36965f = scheduledThreadPoolExecutor;
        this.f36966g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(bVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: l4.k

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f38932u;

            {
                this.f38932u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l3.m q8;
                int i6;
                switch (i4) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f38932u;
                        if (firebaseMessaging.f36964e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f38932u;
                        final Context context3 = firebaseMessaging2.f36961b;
                        com.bumptech.glide.g.r(context3);
                        final boolean f2 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences g9 = com.bumptech.glide.h.g(context3);
                            if (!g9.contains("proxy_retention") || g9.getBoolean("proxy_retention", false) != f2) {
                                N2.b bVar2 = (N2.b) firebaseMessaging2.f36962c.f40493w;
                                if (bVar2.f1914c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f2);
                                    N2.o c9 = N2.o.c(bVar2.f1913b);
                                    synchronized (c9) {
                                        i6 = c9.f1949a;
                                        c9.f1949a = i6 + 1;
                                    }
                                    q8 = c9.d(new N2.m(i6, 4, bundle, 0));
                                } else {
                                    q8 = com.bumptech.glide.d.q(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                q8.c(new ExecutorC4756a(1), new l3.e() { // from class: l4.p
                                    @Override // l3.e
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor edit = com.bumptech.glide.h.g(context3).edit();
                                        edit.putBoolean("proxy_retention", f2);
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
        int i6 = v.f38965j;
        com.bumptech.glide.d.g(new Callable() { // from class: l4.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t tVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C2582Fo c2582Fo2 = c2582Fo;
                C4945n c4945n2 = c4945n;
                synchronized (t.class) {
                    try {
                        WeakReference weakReference = t.f38957c;
                        tVar = weakReference != null ? (t) weakReference.get() : null;
                        if (tVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            t tVar2 = new t(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (tVar2) {
                                tVar2.f38958a = M.i(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            t.f38957c = new WeakReference(tVar2);
                            tVar = tVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new v(firebaseMessaging, c2582Fo2, tVar, c4945n2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).c(scheduledThreadPoolExecutor, new l(this, i4));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: l4.k

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f38932u;

            {
                this.f38932u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l3.m q8;
                int i62;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f38932u;
                        if (firebaseMessaging.f36964e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f38932u;
                        final Context context3 = firebaseMessaging2.f36961b;
                        com.bumptech.glide.g.r(context3);
                        final boolean f2 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences g9 = com.bumptech.glide.h.g(context3);
                            if (!g9.contains("proxy_retention") || g9.getBoolean("proxy_retention", false) != f2) {
                                N2.b bVar2 = (N2.b) firebaseMessaging2.f36962c.f40493w;
                                if (bVar2.f1914c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f2);
                                    N2.o c9 = N2.o.c(bVar2.f1913b);
                                    synchronized (c9) {
                                        i62 = c9.f1949a;
                                        c9.f1949a = i62 + 1;
                                    }
                                    q8 = c9.d(new N2.m(i62, 4, bundle, 0));
                                } else {
                                    q8 = com.bumptech.glide.d.q(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                q8.c(new ExecutorC4756a(1), new l3.e() { // from class: l4.p
                                    @Override // l3.e
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor edit = com.bumptech.glide.h.g(context3).edit();
                                        edit.putBoolean("proxy_retention", f2);
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
                if (f36959m == null) {
                    f36959m = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                f36959m.schedule(runnable, j6, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C4586c c(Context context) {
        C4586c c4586c;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36957k == null) {
                    f36957k = new C4586c(context);
                }
                c4586c = f36957k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4586c;
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
        r d9 = d();
        if (!h(d9)) {
            return d9.f38950a;
        }
        String c9 = C2582Fo.c(this.f36960a);
        j jVar = this.f36963d;
        synchronized (jVar) {
            mVar = (m) ((s.b) jVar.f38930b).getOrDefault(c9, null);
            if (mVar == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c9);
                }
                C4945n c4945n = this.f36962c;
                mVar = c4945n.e(c4945n.n(C2582Fo.c((g) c4945n.f40491u), new Bundle(), "*")).j(this.f36966g, new g2.a(4, this, c9, d9)).e((ExecutorService) jVar.f38929a, new C0465d(5, jVar, c9));
                ((s.b) jVar.f38930b).put(c9, mVar);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c9);
            }
        }
        try {
            return (String) com.bumptech.glide.d.d(mVar);
        } catch (InterruptedException | ExecutionException e9) {
            throw new IOException(e9);
        }
    }

    public final r d() {
        r b9;
        C4586c c9 = c(this.f36961b);
        g gVar = this.f36960a;
        gVar.a();
        String d9 = "[DEFAULT]".equals(gVar.f2662b) ? "" : gVar.d();
        String c10 = C2582Fo.c(this.f36960a);
        synchronized (c9) {
            b9 = r.b(((SharedPreferences) c9.f38154u).getString(d9 + "|T|" + c10 + "|*", null));
        }
        return b9;
    }

    public final void e() {
        m q8;
        int i;
        N2.b bVar = (N2.b) this.f36962c.f40493w;
        if (bVar.f1914c.a() >= 241100000) {
            o c9 = o.c(bVar.f1913b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c9) {
                i = c9.f1949a;
                c9.f1949a = i + 1;
            }
            q8 = c9.d(new N2.m(i, 5, bundle, 1)).d(h.f1927v, N2.d.f1921v);
        } else {
            q8 = com.bumptech.glide.d.q(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        q8.c(this.f36965f, new l(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f36961b;
        com.bumptech.glide.g.r(context);
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
                if (this.f36960a.b(R3.a.class) != null || (com.bumptech.glide.f.h() && f36958l != null)) {
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
        b(new RunnableC2829Ug(this, Math.min(Math.max(30L, 2 * j6), f36956j)), j6);
        this.i = true;
    }

    public final boolean h(r rVar) {
        if (rVar != null) {
            return System.currentTimeMillis() > rVar.f38952c + r.f38949d || !this.f36967h.a().equals(rVar.f38951b);
        }
        return true;
    }
}
