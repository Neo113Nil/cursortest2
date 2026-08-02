package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class K1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26575a;

    /* renamed from: b, reason: collision with root package name */
    public final C3244g1 f26576b;

    /* renamed from: c, reason: collision with root package name */
    public FQ f26577c;

    /* renamed from: d, reason: collision with root package name */
    public Q0 f26578d;

    /* renamed from: e, reason: collision with root package name */
    public Pair f26579e;

    /* renamed from: f, reason: collision with root package name */
    public final Q0 f26580f;

    public K1(int i) {
        this.f26575a = i;
        switch (i) {
            case 1:
                this.f26576b = new C3244g1(65496, 2, "image/jpeg");
                this.f26580f = new L1();
                break;
            default:
                this.f26576b = new C3244g1(-1, -1, "image/heif");
                this.f26580f = new J1();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        switch (this.f26575a) {
            case 0:
                if (this.f26578d == null) {
                    Q0 q02 = (J1) this.f26580f;
                    if (!q02.d(r02)) {
                        q02 = this.f26576b;
                    }
                    this.f26578d = q02;
                    ((K0) r02).f26573y = 0;
                    Pair pair = this.f26579e;
                    if (pair != null) {
                        q02.c(((Long) pair.first).longValue(), ((Long) this.f26579e.second).longValue());
                        this.f26579e = null;
                    }
                    Q0 q03 = this.f26578d;
                    FQ fq = this.f26577c;
                    fq.getClass();
                    q03.b(fq);
                }
                break;
            default:
                if (this.f26578d == null) {
                    Q0 q04 = (L1) this.f26580f;
                    if (!q04.d(r02)) {
                        q04 = this.f26576b;
                    }
                    this.f26578d = q04;
                    ((K0) r02).f26573y = 0;
                    Pair pair2 = this.f26579e;
                    if (pair2 != null) {
                        q04.c(((Long) pair2.first).longValue(), ((Long) this.f26579e.second).longValue());
                        this.f26579e = null;
                    }
                    Q0 q05 = this.f26578d;
                    FQ fq2 = this.f26577c;
                    fq2.getClass();
                    q05.b(fq2);
                }
                break;
        }
        return this.f26578d.a(r02, u02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        switch (this.f26575a) {
            case 0:
                this.f26577c = (FQ) s02;
                break;
            default:
                this.f26577c = (FQ) s02;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        switch (this.f26575a) {
            case 0:
                Q0 q02 = this.f26578d;
                if (q02 == null) {
                    this.f26579e = Pair.create(Long.valueOf(j6), Long.valueOf(j9));
                    break;
                } else {
                    q02.c(j6, j9);
                    break;
                }
            default:
                Q0 q03 = this.f26578d;
                if (q03 == null) {
                    this.f26579e = Pair.create(Long.valueOf(j6), Long.valueOf(j9));
                    break;
                } else {
                    q03.c(j6, j9);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        switch (this.f26575a) {
            case 0:
                K0 k02 = (K0) r02;
                if (AbstractC3066cl.p(k02, true)) {
                    return true;
                }
                k02.f26573y = 0;
                return AbstractC3066cl.p(k02, false);
            default:
                if (((L1) this.f26580f).d(r02)) {
                    return true;
                }
                ((K0) r02).f26573y = 0;
                return this.f26576b.d(r02);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
        switch (this.f26575a) {
            case 0:
                ((J1) this.f26580f).e();
                break;
        }
    }

    private final void g() {
    }
}
