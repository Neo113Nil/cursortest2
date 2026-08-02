package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Gy implements Cy, Ay, My {

    /* renamed from: u, reason: collision with root package name */
    public static final S7 f25946u;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25947a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3832qy f25948b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f25949c;

    /* renamed from: d, reason: collision with root package name */
    public final C3778py f25950d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25951e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25952f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25953g;

    /* renamed from: h, reason: collision with root package name */
    public final long f25954h;
    public final double i;

    /* renamed from: j, reason: collision with root package name */
    public final String f25955j;

    /* renamed from: k, reason: collision with root package name */
    public final long f25956k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f25957l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final Object f25958m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final Object f25959n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final Object f25960o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final C3409j6 f25961p = C3463k6.A();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f25962q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f25963r = false;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f25964s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final int f25965t;

    static {
        R7 A9 = S7.A();
        A9.h();
        ((S7) A9.f28504u).B(17);
        f25946u = (S7) A9.j();
    }

    public Gy(Context context, InterfaceC3832qy interfaceC3832qy, ExecutorService executorService, C3778py c3778py, Random random, String str, long j6, long j9, double d9, String str2, int i, long j10) {
        this.f25947a = context;
        this.f25948b = interfaceC3832qy;
        this.f25949c = executorService;
        this.f25950d = c3778py;
        this.f25952f = str;
        this.f25953g = j6;
        this.f25954h = j9;
        this.i = d9;
        this.f25955j = str2;
        this.f25965t = i;
        this.f25956k = j10;
        this.f25951e = random.nextDouble() < d9;
    }

    public final void a(int i, long j6, Throwable th, String str) {
        long longValue;
        if (this.f25951e) {
            synchronized (this.f25959n) {
                try {
                    ArrayList arrayList = this.f25962q;
                    synchronized (this.f25960o) {
                        try {
                            HashMap hashMap = this.f25964s;
                            Integer valueOf = Integer.valueOf(i);
                            Long l9 = (Long) hashMap.get(valueOf);
                            if (l9 == null) {
                                l9 = 0L;
                            }
                            longValue = 1 + l9.longValue();
                            hashMap.put(valueOf, Long.valueOf(longValue));
                        } finally {
                        }
                    }
                    arrayList.add(new Ey(i, j6, th, str, longValue));
                    if (!this.f25963r) {
                        this.f25963r = true;
                        this.f25948b.a(new Fy(this, 1), this.f25954h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b(C3463k6 c3463k6) {
        try {
            Z7 A9 = C2929a8.A();
            S7 s72 = f25946u;
            A9.h();
            ((C2929a8) A9.f28504u).C(s72);
            X7 A10 = Y7.A();
            A10.h();
            ((Y7) A10.f28504u).B(c3463k6);
            Y7 y7 = (Y7) A10.j();
            A9.h();
            ((C2929a8) A9.f28504u).B(y7);
            C2929a8 c2929a8 = (C2929a8) A9.j();
            C3778py c3778py = this.f25950d;
            String str = this.f25952f;
            byte[] b9 = c2929a8.b();
            c3778py.getClass();
            com.bumptech.glide.g.j(new Xw(c3778py, str, true, "application/x-protobuf", b9));
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final P3.a c() {
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE(Executors.callable(new Fy(this, 0), null));
        this.f25949c.execute(runnableFutureC2989bE);
        return runnableFutureC2989bE;
    }
}
