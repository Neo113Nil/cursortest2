package com.anythink.core.common.v.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16691a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16692b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f16693c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f16694d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f16695e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f16696f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f16697g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f16698h = 8;
    public static final int i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f16699j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f16700k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f16701l = 12;

    /* renamed from: m, reason: collision with root package name */
    public static final int f16702m = 13;

    /* renamed from: n, reason: collision with root package name */
    public static final int f16703n = 14;

    /* renamed from: o, reason: collision with root package name */
    public static final int f16704o = 15;

    /* renamed from: p, reason: collision with root package name */
    public static final int f16705p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f16706q = 17;

    /* renamed from: r, reason: collision with root package name */
    public static final int f16707r = 18;

    /* renamed from: s, reason: collision with root package name */
    private static volatile b f16708s;

    /* renamed from: t, reason: collision with root package name */
    private final a f16709t = new a();

    private b() {
    }

    public static b a() {
        if (f16708s == null) {
            synchronized (b.class) {
                try {
                    if (f16708s == null) {
                        f16708s = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16708s;
    }

    private void d(Runnable runnable) {
        c(runnable, 13);
    }

    private static void e() {
    }

    private void f(Runnable runnable) {
        a(runnable, 0L, 2);
    }

    public final void b(Runnable runnable, int i6) {
        a(runnable, 0L, i6);
    }

    public final void c(Runnable runnable, int i6) {
        if (b()) {
            a(runnable, i6);
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
        a aVar = this.f16709t;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public final void c(Runnable runnable) {
        a(runnable, 1000L, 2);
    }

    public final Executor c() {
        a aVar = this.f16709t;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public final void a(d dVar, int i6) {
        try {
            this.f16709t.a(dVar, i6);
        } catch (Throwable unused) {
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final void a(Runnable runnable, long j6) {
        a(runnable, j6, 2);
    }

    public final void a(final Runnable runnable, final long j6, int i6) {
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
            a(dVar, i6);
        }
    }

    public final Handler a(int i6) {
        return this.f16709t.a(i6);
    }

    public final void a(Runnable runnable) {
        a(runnable, 0L, 2);
    }

    public final void a(Runnable runnable, int i6) {
        a(runnable, 0L, i6);
    }
}
