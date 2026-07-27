package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Hy implements Dy, By, Oy {

    /* renamed from: u, reason: collision with root package name */
    public static final C3415jM f25471u;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25472a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3929sy f25473b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f25474c;

    /* renamed from: d, reason: collision with root package name */
    public final C3875ry f25475d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25476e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25477f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25478g;

    /* renamed from: h, reason: collision with root package name */
    public final long f25479h;
    public final double i;

    /* renamed from: j, reason: collision with root package name */
    public final String f25480j;

    /* renamed from: k, reason: collision with root package name */
    public final long f25481k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f25482l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final Object f25483m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final Object f25484n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final Object f25485o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final C3184f6 f25486p = C3239g6.A();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f25487q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f25488r = false;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f25489s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final int f25490t;

    static {
        C3363iM A8 = C3415jM.A();
        A8.h();
        ((C3415jM) A8.f30000u).B(17);
        f25471u = (C3415jM) A8.j();
    }

    public Hy(Context context, InterfaceC3929sy interfaceC3929sy, ExecutorService executorService, C3875ry c3875ry, Random random, String str, long j9, long j10, double d2, String str2, int i, long j11) {
        this.f25472a = context;
        this.f25473b = interfaceC3929sy;
        this.f25474c = executorService;
        this.f25475d = c3875ry;
        this.f25477f = str;
        this.f25478g = j9;
        this.f25479h = j10;
        this.i = d2;
        this.f25480j = str2;
        this.f25490t = i;
        this.f25481k = j11;
        this.f25476e = random.nextDouble() < d2;
    }

    @Override // com.google.android.gms.internal.ads.By
    public final J3.a a() {
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE(Executors.callable(new Gy(this, 0), null));
        this.f25474c.execute(runnableFutureC3083dE);
        return runnableFutureC3083dE;
    }

    public final void b(int i, long j9, Throwable th, String str) {
        long longValue;
        if (this.f25476e) {
            synchronized (this.f25484n) {
                try {
                    ArrayList arrayList = this.f25487q;
                    synchronized (this.f25485o) {
                        try {
                            HashMap hashMap = this.f25489s;
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
                    arrayList.add(new Fy(i, j9, th, str, longValue));
                    if (!this.f25488r) {
                        this.f25488r = true;
                        this.f25473b.a(new Gy(this, 1), this.f25479h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(C3239g6 c3239g6) {
        try {
            V7 A8 = W7.A();
            C3415jM c3415jM = f25471u;
            A8.h();
            ((W7) A8.f30000u).C(c3415jM);
            T7 A9 = U7.A();
            A9.h();
            ((U7) A9.f30000u).B(c3239g6);
            U7 u7 = (U7) A9.j();
            A8.h();
            ((W7) A8.f30000u).B(u7);
            W7 w72 = (W7) A8.j();
            C3875ry c3875ry = this.f25475d;
            String str = this.f25477f;
            byte[] b9 = w72.b();
            c3875ry.getClass();
            com.bumptech.glide.f.i(new Zw(c3875ry, str, true, "application/x-protobuf", b9));
        } catch (RuntimeException unused) {
        }
    }
}
