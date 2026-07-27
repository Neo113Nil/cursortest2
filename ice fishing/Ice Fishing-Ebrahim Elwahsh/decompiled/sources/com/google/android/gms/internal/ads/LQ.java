package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class LQ implements InterfaceC3448k1 {

    /* renamed from: a, reason: collision with root package name */
    public final UQ f26159a;

    /* renamed from: b, reason: collision with root package name */
    public final UQ f26160b;

    /* renamed from: c, reason: collision with root package name */
    public final M0 f26161c = new M0();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f26162d = new AtomicReference(KQ.f25974n);

    public LQ(UQ uq) {
        this.f26159a = uq;
        this.f26160b = uq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void a(int i, Lr lr) {
        g().a(i, lr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void b(long j9, int i, int i4, int i9, C3394j1 c3394j1) {
        g().b(j9, i, i4, i9, c3394j1);
        AtomicReference atomicReference = this.f26162d;
        if (atomicReference.get() == KQ.f25975u) {
            this.f26160b.k(false);
            atomicReference.set(KQ.f25976v);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final int c(JN jn, int i, boolean z8) {
        return g().c(jn, i, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final int d(JN jn, int i, boolean z8) {
        return g().d(jn, i, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void e(TP tp) {
        this.f26159a.e(tp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void f(Lr lr, int i, int i4) {
        g().f(lr, i, i4);
    }

    public final InterfaceC3448k1 g() {
        return this.f26162d.get() == KQ.f25976v ? this.f26161c : this.f26160b;
    }
}
