package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2492Aj implements InterfaceC2663Kk, InterfaceC3950t8, InterfaceC3335hl {

    /* renamed from: n, reason: collision with root package name */
    public final St f24499n;

    /* renamed from: u, reason: collision with root package name */
    public final C2527Ck f24500u;

    /* renamed from: v, reason: collision with root package name */
    public final C2731Ok f24501v;

    /* renamed from: y, reason: collision with root package name */
    public final C2833Uk f24504y;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f24502w = new AtomicBoolean();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f24503x = new AtomicBoolean();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f24505z = new AtomicBoolean();

    public C2492Aj(St st, C2527Ck c2527Ck, C2731Ok c2731Ok, C2833Uk c2833Uk) {
        this.f24499n = st;
        this.f24500u = c2527Ck;
        this.f24501v = c2731Ok;
        this.f24504y = c2833Uk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final void f(C3896s8 c3896s8) {
        int i = this.f24499n.f28397e;
        if (i == 1) {
            if (c3896s8.f34667j && this.f24502w.compareAndSet(false, true)) {
                this.f24500u.t();
            }
        } else if (i == 4 && c3896s8.f34667j && this.f24505z.compareAndSet(false, true)) {
            this.f24504y.t();
        }
        if (c3896s8.f34667j && this.f24503x.compareAndSet(false, true)) {
            C2731Ok c2731Ok = this.f24501v;
            synchronized (c2731Ok) {
                c2731Ok.M1(C2958ak.f29869F);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final synchronized void h() {
        int i = this.f24499n.f28397e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.f24502w.compareAndSet(false, true)) {
            this.f24500u.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final void s() {
        if (this.f24499n.f28397e == 4 && this.f24502w.compareAndSet(false, true)) {
            this.f24500u.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final void w() {
    }
}
