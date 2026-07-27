package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final class K1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25823a;

    /* renamed from: b, reason: collision with root package name */
    public final C3221g1 f25824b;

    /* renamed from: c, reason: collision with root package name */
    public CQ f25825c;

    /* renamed from: d, reason: collision with root package name */
    public Q0 f25826d;

    /* renamed from: e, reason: collision with root package name */
    public Pair f25827e;

    /* renamed from: f, reason: collision with root package name */
    public final Q0 f25828f;

    public K1(int i) {
        this.f25823a = i;
        switch (i) {
            case 1:
                this.f25824b = new C3221g1(65496, 2, "image/jpeg");
                this.f25828f = new L1();
                break;
            default:
                this.f25824b = new C3221g1(-1, -1, "image/heif");
                this.f25828f = new J1();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final int a(R0 r02, U0 u02) {
        switch (this.f25823a) {
            case 0:
                if (this.f25826d == null) {
                    Q0 q02 = (J1) this.f25828f;
                    if (!q02.d(r02)) {
                        q02 = this.f25824b;
                    }
                    this.f25826d = q02;
                    ((K0) r02).f25821y = 0;
                    Pair pair = this.f25827e;
                    if (pair != null) {
                        q02.c(((Long) pair.first).longValue(), ((Long) this.f25827e.second).longValue());
                        this.f25827e = null;
                    }
                    Q0 q03 = this.f25826d;
                    CQ cq = this.f25825c;
                    cq.getClass();
                    q03.b(cq);
                }
                break;
            default:
                if (this.f25826d == null) {
                    Q0 q04 = (L1) this.f25828f;
                    if (!q04.d(r02)) {
                        q04 = this.f25824b;
                    }
                    this.f25826d = q04;
                    ((K0) r02).f25821y = 0;
                    Pair pair2 = this.f25827e;
                    if (pair2 != null) {
                        q04.c(((Long) pair2.first).longValue(), ((Long) this.f25827e.second).longValue());
                        this.f25827e = null;
                    }
                    Q0 q05 = this.f25826d;
                    CQ cq2 = this.f25825c;
                    cq2.getClass();
                    q05.b(cq2);
                }
                break;
        }
        return this.f25826d.a(r02, u02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        switch (this.f25823a) {
            case 0:
                this.f25825c = (CQ) s02;
                break;
            default:
                this.f25825c = (CQ) s02;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        switch (this.f25823a) {
            case 0:
                Q0 q02 = this.f25826d;
                if (q02 == null) {
                    this.f25827e = Pair.create(Long.valueOf(j6), Long.valueOf(j9));
                    break;
                } else {
                    q02.c(j6, j9);
                    break;
                }
            default:
                Q0 q03 = this.f25826d;
                if (q03 == null) {
                    this.f25827e = Pair.create(Long.valueOf(j6), Long.valueOf(j9));
                    break;
                } else {
                    q03.c(j6, j9);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        switch (this.f25823a) {
            case 0:
                K0 k02 = (K0) r02;
                if (AbstractC3043cl.p(k02, true)) {
                    return true;
                }
                k02.f25821y = 0;
                return AbstractC3043cl.p(k02, false);
            default:
                if (((L1) this.f25828f).d(r02)) {
                    return true;
                }
                ((K0) r02).f25821y = 0;
                return this.f25824b.d(r02);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
        switch (this.f25823a) {
            case 0:
                ((J1) this.f25828f).e();
                break;
        }
    }

    private final void g() {
    }
}
