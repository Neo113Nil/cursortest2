package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* loaded from: classes2.dex */
public final class Rt {

    /* renamed from: a, reason: collision with root package name */
    public final T2.a f27364a;

    /* renamed from: b, reason: collision with root package name */
    public final C3153eo f27365b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27366c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f27368e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f27367d = 0;

    public Rt(T2.a aVar, C3153eo c3153eo) {
        this.f27364a = aVar;
        this.f27365b = c3153eo;
    }

    public final void a(boolean z3) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ge)).booleanValue()) {
            S0.e a9 = this.f27365b.a();
            a9.v(NativeAdvancedJsUtils.f17906p, "mbs_state");
            a9.v("mbs_state", true != z3 ? "0" : "1");
            a9.y();
        }
        if (z3) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        this.f27364a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f27366c) {
            try {
                if (this.f27368e == 3) {
                    if (this.f27367d + ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32121R6)).longValue() <= currentTimeMillis) {
                        this.f27368e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, int i6) {
        b();
        Object obj = this.f27366c;
        this.f27364a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f27368e != i) {
                    return;
                }
                this.f27368e = i6;
                if (this.f27368e == 3) {
                    this.f27367d = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
