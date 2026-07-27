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
    public static final S7 f25174u;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25175a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3809qy f25176b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f25177c;

    /* renamed from: d, reason: collision with root package name */
    public final C3755py f25178d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25179e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25180f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25181g;

    /* renamed from: h, reason: collision with root package name */
    public final long f25182h;
    public final double i;

    /* renamed from: j, reason: collision with root package name */
    public final String f25183j;

    /* renamed from: k, reason: collision with root package name */
    public final long f25184k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f25185l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final Object f25186m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final Object f25187n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final Object f25188o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final C3386j6 f25189p = C3440k6.A();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f25190q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f25191r = false;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f25192s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final int f25193t;

    static {
        R7 A9 = S7.A();
        A9.h();
        ((S7) A9.f27721u).B(17);
        f25174u = (S7) A9.j();
    }

    public Gy(Context context, InterfaceC3809qy interfaceC3809qy, ExecutorService executorService, C3755py c3755py, Random random, String str, long j6, long j9, double d2, String str2, int i, long j10) {
        this.f25175a = context;
        this.f25176b = interfaceC3809qy;
        this.f25177c = executorService;
        this.f25178d = c3755py;
        this.f25180f = str;
        this.f25181g = j6;
        this.f25182h = j9;
        this.i = d2;
        this.f25183j = str2;
        this.f25193t = i;
        this.f25184k = j10;
        this.f25179e = random.nextDouble() < d2;
    }

    public final void a(int i, long j6, Throwable th, String str) {
        long longValue;
        if (this.f25179e) {
            synchronized (this.f25187n) {
                try {
                    ArrayList arrayList = this.f25190q;
                    synchronized (this.f25188o) {
                        try {
                            HashMap hashMap = this.f25192s;
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
                    if (!this.f25191r) {
                        this.f25191r = true;
                        this.f25176b.a(new Fy(this, 1), this.f25182h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b(C3440k6 c3440k6) {
        try {
            Z7 A9 = C2906a8.A();
            S7 s72 = f25174u;
            A9.h();
            ((C2906a8) A9.f27721u).C(s72);
            X7 A10 = Y7.A();
            A10.h();
            ((Y7) A10.f27721u).B(c3440k6);
            Y7 y7 = (Y7) A10.j();
            A9.h();
            ((C2906a8) A9.f27721u).B(y7);
            C2906a8 c2906a8 = (C2906a8) A9.j();
            C3755py c3755py = this.f25178d;
            String str = this.f25180f;
            byte[] b9 = c2906a8.b();
            c3755py.getClass();
            com.bumptech.glide.g.f(new Xw(c3755py, str, true, "application/x-protobuf", b9));
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final N3.a c() {
        RunnableFutureC2966bE runnableFutureC2966bE = new RunnableFutureC2966bE(Executors.callable(new Fy(this, 0), null));
        this.f25177c.execute(runnableFutureC2966bE);
        return runnableFutureC2966bE;
    }
}
