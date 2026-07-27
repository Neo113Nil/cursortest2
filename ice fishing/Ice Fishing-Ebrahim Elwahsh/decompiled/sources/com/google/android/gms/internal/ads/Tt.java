package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* loaded from: classes2.dex */
public final class Tt {

    /* renamed from: a, reason: collision with root package name */
    public final S2.a f27872a;

    /* renamed from: b, reason: collision with root package name */
    public final C3165eo f27873b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27874c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f27876e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f27875d = 0;

    public Tt(S2.a aVar, C3165eo c3165eo) {
        this.f27872a = aVar;
        this.f27873b = c3165eo;
    }

    public final void a(boolean z8) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ae)).booleanValue()) {
            C2593Hm a9 = this.f27873b.a();
            a9.r(NativeAdvancedJsUtils.f18064p, "mbs_state");
            a9.r("mbs_state", true != z8 ? "0" : "1");
            a9.s();
        }
        if (z8) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        this.f27872a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f27874c) {
            try {
                if (this.f27876e == 3) {
                    if (this.f27875d + ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31541R6)).longValue() <= currentTimeMillis) {
                        this.f27876e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, int i4) {
        b();
        Object obj = this.f27874c;
        this.f27872a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f27876e != i) {
                    return;
                }
                this.f27876e = i4;
                if (this.f27876e == 3) {
                    this.f27875d = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
