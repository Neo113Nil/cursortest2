package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes2.dex */
public final class U4 extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f27922z = AbstractC3346i5.f31315a;

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f27923n;

    /* renamed from: u, reason: collision with root package name */
    public final PriorityBlockingQueue f27924u;

    /* renamed from: v, reason: collision with root package name */
    public final C3614n5 f27925v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f27926w = false;

    /* renamed from: x, reason: collision with root package name */
    public final C2518Df f27927x;

    /* renamed from: y, reason: collision with root package name */
    public final Vx f27928y;

    public U4(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, C3614n5 c3614n5, Vx vx) {
        this.f27923n = priorityBlockingQueue;
        this.f27924u = priorityBlockingQueue2;
        this.f27925v = c3614n5;
        this.f27928y = vx;
        this.f27927x = new C2518Df(this, priorityBlockingQueue2, vx);
    }

    public final void a() {
        AbstractC3074d5 abstractC3074d5 = (AbstractC3074d5) this.f27923n.take();
        abstractC3074d5.a("cache-queue-take");
        abstractC3074d5.c();
        try {
            synchronized (abstractC3074d5.f29797x) {
            }
            C3614n5 c3614n5 = this.f27925v;
            T4 p6 = c3614n5.p(abstractC3074d5.d());
            if (p6 == null) {
                abstractC3074d5.a("cache-miss");
                if (!this.f27927x.v(abstractC3074d5)) {
                    this.f27924u.put(abstractC3074d5);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (p6.f27713e < currentTimeMillis) {
                    abstractC3074d5.a("cache-hit-expired");
                    abstractC3074d5.f29790C = p6;
                    if (!this.f27927x.v(abstractC3074d5)) {
                        this.f27924u.put(abstractC3074d5);
                    }
                } else {
                    abstractC3074d5.a("cache-hit");
                    byte[] bArr = p6.f27709a;
                    Map map = p6.f27715g;
                    com.bumptech.glide.manager.n h9 = abstractC3074d5.h(new C2965b5(200, bArr, map, C2965b5.a(map), false));
                    abstractC3074d5.a("cache-hit-parsed");
                    if (!(((C3183f5) h9.f23620w) == null)) {
                        abstractC3074d5.a("cache-parsing-failed");
                        String d2 = abstractC3074d5.d();
                        synchronized (c3614n5) {
                            try {
                                T4 p9 = c3614n5.p(d2);
                                if (p9 != null) {
                                    p9.f27714f = 0L;
                                    p9.f27713e = 0L;
                                    c3614n5.q(d2, p9);
                                }
                            } finally {
                            }
                        }
                        abstractC3074d5.f29790C = null;
                        if (!this.f27927x.v(abstractC3074d5)) {
                            this.f27924u.put(abstractC3074d5);
                        }
                    } else if (p6.f27714f < currentTimeMillis) {
                        abstractC3074d5.a("cache-hit-refresh-needed");
                        abstractC3074d5.f29790C = p6;
                        h9.f23617n = true;
                        if (this.f27927x.v(abstractC3074d5)) {
                            this.f27928y.n(abstractC3074d5, h9, null);
                        } else {
                            this.f27928y.n(abstractC3074d5, h9, new MD(this, abstractC3074d5));
                        }
                    } else {
                        this.f27928y.n(abstractC3074d5, h9, null);
                    }
                }
            }
            abstractC3074d5.c();
        } catch (Throwable th) {
            abstractC3074d5.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f27922z) {
            AbstractC3346i5.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f27925v.r();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f27926w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC3346i5.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
