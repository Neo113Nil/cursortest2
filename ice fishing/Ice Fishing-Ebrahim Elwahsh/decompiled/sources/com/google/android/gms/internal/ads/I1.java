package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class I1 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25504a;

    /* renamed from: b, reason: collision with root package name */
    public final C3124e1 f25505b;

    /* renamed from: c, reason: collision with root package name */
    public PQ f25506c;

    /* renamed from: d, reason: collision with root package name */
    public O0 f25507d;

    /* renamed from: e, reason: collision with root package name */
    public Pair f25508e;

    /* renamed from: f, reason: collision with root package name */
    public final O0 f25509f;

    public I1(int i) {
        this.f25504a = i;
        switch (i) {
            case 1:
                this.f25505b = new C3124e1(65496, 2, "image/jpeg");
                this.f25509f = new J1();
                break;
            default:
                this.f25505b = new C3124e1(-1, -1, "image/heif");
                this.f25509f = new H1();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        switch (this.f25504a) {
            case 0:
                this.f25506c = (PQ) q02;
                break;
            default:
                this.f25506c = (PQ) q02;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        switch (this.f25504a) {
            case 0:
                J0 j02 = (J0) p02;
                if (AbstractC3035cL.n(j02, true)) {
                    return true;
                }
                j02.f25677y = 0;
                return AbstractC3035cL.n(j02, false);
            default:
                if (((J1) this.f25509f).b(p02)) {
                    return true;
                }
                ((J0) p02).f25677y = 0;
                return this.f25505b.b(p02);
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        switch (this.f25504a) {
            case 0:
                O0 o02 = this.f25507d;
                if (o02 == null) {
                    this.f25508e = Pair.create(Long.valueOf(j9), Long.valueOf(j10));
                    break;
                } else {
                    o02.c(j9, j10);
                    break;
                }
            default:
                O0 o03 = this.f25507d;
                if (o03 == null) {
                    this.f25508e = Pair.create(Long.valueOf(j9), Long.valueOf(j10));
                    break;
                } else {
                    o03.c(j9, j10);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        switch (this.f25504a) {
            case 0:
                if (this.f25507d == null) {
                    O0 o02 = (H1) this.f25509f;
                    if (!o02.b(p02)) {
                        o02 = this.f25505b;
                    }
                    this.f25507d = o02;
                    ((J0) p02).f25677y = 0;
                    Pair pair = this.f25508e;
                    if (pair != null) {
                        o02.c(((Long) pair.first).longValue(), ((Long) this.f25508e.second).longValue());
                        this.f25508e = null;
                    }
                    O0 o03 = this.f25507d;
                    PQ pq = this.f25506c;
                    pq.getClass();
                    o03.a(pq);
                }
                break;
            default:
                if (this.f25507d == null) {
                    O0 o04 = (J1) this.f25509f;
                    if (!o04.b(p02)) {
                        o04 = this.f25505b;
                    }
                    this.f25507d = o04;
                    ((J0) p02).f25677y = 0;
                    Pair pair2 = this.f25508e;
                    if (pair2 != null) {
                        o04.c(((Long) pair2.first).longValue(), ((Long) this.f25508e.second).longValue());
                        this.f25508e = null;
                    }
                    O0 o05 = this.f25507d;
                    PQ pq2 = this.f25506c;
                    pq2.getClass();
                    o05.a(pq2);
                }
                break;
        }
        return this.f25507d.e(p02, s02);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
        switch (this.f25504a) {
            case 0:
                ((H1) this.f25509f).f();
                break;
        }
    }

    private final void g() {
    }
}
