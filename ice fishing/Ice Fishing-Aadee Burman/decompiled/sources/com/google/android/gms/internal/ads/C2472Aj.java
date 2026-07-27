package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2472Aj implements InterfaceC2643Kk, InterfaceC3927t8, InterfaceC3312hl {

    /* renamed from: n, reason: collision with root package name */
    public final St f23717n;

    /* renamed from: u, reason: collision with root package name */
    public final C2507Ck f23718u;

    /* renamed from: v, reason: collision with root package name */
    public final C2711Ok f23719v;

    /* renamed from: y, reason: collision with root package name */
    public final C2811Uk f23722y;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f23720w = new AtomicBoolean();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f23721x = new AtomicBoolean();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f23723z = new AtomicBoolean();

    public C2472Aj(St st, C2507Ck c2507Ck, C2711Ok c2711Ok, C2811Uk c2811Uk) {
        this.f23717n = st;
        this.f23718u = c2507Ck;
        this.f23719v = c2711Ok;
        this.f23722y = c2811Uk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final void f(C3873s8 c3873s8) {
        int i = this.f23717n.f27614e;
        if (i == 1) {
            if (c3873s8.f33899j && this.f23720w.compareAndSet(false, true)) {
                this.f23718u.t();
            }
        } else if (i == 4 && c3873s8.f33899j && this.f23723z.compareAndSet(false, true)) {
            this.f23722y.t();
        }
        if (c3873s8.f33899j && this.f23721x.compareAndSet(false, true)) {
            C2711Ok c2711Ok = this.f23719v;
            synchronized (c2711Ok) {
                c2711Ok.M1(C2935ak.f29094F);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final synchronized void h() {
        int i = this.f23717n.f27614e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.f23720w.compareAndSet(false, true)) {
            this.f23718u.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final void s() {
        if (this.f23717n.f27614e == 4 && this.f23720w.compareAndSet(false, true)) {
            this.f23718u.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final void v() {
    }
}
