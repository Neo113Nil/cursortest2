package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class BQ implements InterfaceC3566m1 {

    /* renamed from: a, reason: collision with root package name */
    public final KQ f24674a;

    /* renamed from: b, reason: collision with root package name */
    public final KQ f24675b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f24676c = new O0();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f24677d = new AtomicReference(AQ.f24457n);

    public BQ(KQ kq) {
        this.f24674a = kq;
        this.f24675b = kq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void a(int i, Cr cr) {
        g().a(i, cr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final int b(InterfaceC4073vN interfaceC4073vN, int i, boolean z6) {
        return g().b(interfaceC4073vN, i, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void c(long j6, int i, int i4, int i6, C3512l1 c3512l1) {
        g().c(j6, i, i4, i6, c3512l1);
        AtomicReference atomicReference = this.f24677d;
        if (atomicReference.get() == AQ.f24458u) {
            this.f24675b.k(false);
            atomicReference.set(AQ.f24459v);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final int d(InterfaceC4073vN interfaceC4073vN, int i, boolean z6) {
        return g().d(interfaceC4073vN, i, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void e(DP dp) {
        this.f24674a.e(dp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void f(Cr cr, int i, int i4) {
        g().f(cr, i, i4);
    }

    public final InterfaceC3566m1 g() {
        return this.f24677d.get() == AQ.f24459v ? this.f24676c : this.f24675b;
    }
}
