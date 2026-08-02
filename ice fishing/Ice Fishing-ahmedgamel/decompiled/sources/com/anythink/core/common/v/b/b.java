package com.anythink.core.common.v.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17478a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17479b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17480c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f17481d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17482e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17483f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17484g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f17485h = 8;
    public static final int i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f17486j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17487k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17488l = 12;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17489m = 13;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17490n = 14;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17491o = 15;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17492p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f17493q = 17;

    /* renamed from: r, reason: collision with root package name */
    public static final int f17494r = 18;

    /* renamed from: s, reason: collision with root package name */
    private static volatile b f17495s;

    /* renamed from: t, reason: collision with root package name */
    private final a f17496t = new a();

    private b() {
    }

    public static b a() {
        if (f17495s == null) {
            synchronized (b.class) {
                try {
                    if (f17495s == null) {
                        f17495s = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17495s;
    }

    private void d(Runnable runnable) {
        c(runnable, 13);
    }

    private static void e() {
    }

    private void f(Runnable runnable) {
        a(runnable, 0L, 2);
    }

    public final void b(Runnable runnable, int i4) {
        a(runnable, 0L, i4);
    }

    public final void c(Runnable runnable, int i4) {
        if (b()) {
            a(runnable, i4);
        } else {
            runnable.run();
        }
    }

    private void e(Runnable runnable) {
        a(runnable, 0L, 2);
    }

    public final void b(final Runnable runnable) {
        if (TextUtils.equals(Thread.currentThread().getName(), a.b(6))) {
            runnable.run();
        } else if (runnable != null) {
            d dVar = new d() { // from class: com.anythink.core.common.v.b.b.2
                @Override // com.anythink.core.common.v.b.d
                public final void a() {
                    runnable.run();
                }
            };
            dVar.a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            a(dVar, 6);
        }
    }

    public final ExecutorService d() {
        a aVar = this.f17496t;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public final void c(Runnable runnable) {
        a(runnable, 1000L, 2);
    }

    public final Executor c() {
        a aVar = this.f17496t;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public final void a(d dVar, int i4) {
        try {
            this.f17496t.a(dVar, i4);
        } catch (Throwable unused) {
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final void a(Runnable runnable, long j6) {
        a(runnable, j6, 2);
    }

    public final void a(final Runnable runnable, final long j6, int i4) {
        if (runnable != null) {
            d dVar = new d() { // from class: com.anythink.core.common.v.b.b.1
                @Override // com.anythink.core.common.v.b.d
                public final void a() {
                    long j9 = j6;
                    if (j9 > 0) {
                        try {
                            Thread.sleep(j9);
                        } catch (InterruptedException unused) {
                        }
                    }
                    b();
                    runnable.run();
                }
            };
            dVar.a(Long.valueOf(System.currentTimeMillis() / 1000).intValue());
            a(dVar, i4);
        }
    }

    public final Handler a(int i4) {
        return this.f17496t.a(i4);
    }

    public final void a(Runnable runnable) {
        a(runnable, 0L, 2);
    }

    public final void a(Runnable runnable, int i4) {
        a(runnable, 0L, i4);
    }
}
