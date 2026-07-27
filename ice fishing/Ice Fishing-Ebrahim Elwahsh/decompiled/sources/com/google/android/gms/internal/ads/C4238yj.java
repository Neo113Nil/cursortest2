package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4238yj implements InterfaceC2608Ik, InterfaceC3725p8, InterfaceC3271gl {

    /* renamed from: n, reason: collision with root package name */
    public final Ut f35386n;

    /* renamed from: u, reason: collision with root package name */
    public final C2489Bk f35387u;

    /* renamed from: v, reason: collision with root package name */
    public final C2676Mk f35388v;

    /* renamed from: y, reason: collision with root package name */
    public final C2778Sk f35391y;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f35389w = new AtomicBoolean();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f35390x = new AtomicBoolean();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f35392z = new AtomicBoolean();

    public C4238yj(Ut ut, C2489Bk c2489Bk, C2676Mk c2676Mk, C2778Sk c2778Sk) {
        this.f35386n = ut;
        this.f35387u = c2489Bk;
        this.f35388v = c2676Mk;
        this.f35391y = c2778Sk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final void A(C3671o8 c3671o8) {
        int i = this.f35386n.f28147e;
        if (i == 1) {
            if (c3671o8.f33111j && this.f35389w.compareAndSet(false, true)) {
                this.f35387u.a();
            }
        } else if (i == 4 && c3671o8.f33111j && this.f35392z.compareAndSet(false, true)) {
            this.f35391y.a();
        }
        if (c3671o8.f33111j && this.f35390x.compareAndSet(false, true)) {
            C2676Mk c2676Mk = this.f35388v;
            synchronized (c2676Mk) {
                c2676Mk.u1(C2943ak.f29276F);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final synchronized void e() {
        int i = this.f35386n.f28147e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.f35389w.compareAndSet(false, true)) {
            this.f35387u.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final void o() {
        if (this.f35386n.f28147e == 4 && this.f35389w.compareAndSet(false, true)) {
            this.f35387u.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final void t() {
    }
}
