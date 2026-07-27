package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.yQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4215yQ implements InterfaceC3543m1 {

    /* renamed from: a, reason: collision with root package name */
    public final HQ f35158a;

    /* renamed from: b, reason: collision with root package name */
    public final HQ f35159b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f35160c = new O0();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f35161d = new AtomicReference(EnumC4161xQ.f35019n);

    public C4215yQ(HQ hq) {
        this.f35158a = hq;
        this.f35159b = hq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void a(int i, Cr cr) {
        g().a(i, cr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final int b(InterfaceC4050vN interfaceC4050vN, int i, boolean z3) {
        return g().b(interfaceC4050vN, i, z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void c(long j6, int i, int i6, int i9, C3489l1 c3489l1) {
        g().c(j6, i, i6, i9, c3489l1);
        AtomicReference atomicReference = this.f35161d;
        if (atomicReference.get() == EnumC4161xQ.f35020u) {
            this.f35159b.k(false);
            atomicReference.set(EnumC4161xQ.f35021v);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final int d(InterfaceC4050vN interfaceC4050vN, int i, boolean z3) {
        return g().d(interfaceC4050vN, i, z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void e(DP dp) {
        this.f35158a.e(dp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void f(Cr cr, int i, int i6) {
        g().f(cr, i, i6);
    }

    public final InterfaceC3543m1 g() {
        return this.f35161d.get() == EnumC4161xQ.f35021v ? this.f35160c : this.f35159b;
    }
}
