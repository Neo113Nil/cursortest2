package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* loaded from: classes2.dex */
public final class Rt {

    /* renamed from: a, reason: collision with root package name */
    public final V2.a f28078a;

    /* renamed from: b, reason: collision with root package name */
    public final C3230fo f28079b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28080c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f28082e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f28081d = 0;

    public Rt(V2.a aVar, C3230fo c3230fo) {
        this.f28078a = aVar;
        this.f28079b = c3230fo;
    }

    public final void a(boolean z6) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ge)).booleanValue()) {
            S0.e a9 = this.f28079b.a();
            a9.M(NativeAdvancedJsUtils.f18693p, "mbs_state");
            a9.M("mbs_state", true != z6 ? "0" : "1");
            a9.N();
        }
        if (z6) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        this.f28078a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f28080c) {
            try {
                if (this.f28082e == 3) {
                    if (this.f28081d + ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32900R6)).longValue() <= currentTimeMillis) {
                        this.f28082e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, int i4) {
        b();
        Object obj = this.f28080c;
        this.f28078a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f28082e != i) {
                    return;
                }
                this.f28082e = i4;
                if (this.f28082e == 3) {
                    this.f28081d = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
