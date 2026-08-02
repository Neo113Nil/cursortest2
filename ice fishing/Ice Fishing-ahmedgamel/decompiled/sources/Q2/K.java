package Q2;

import R2.AbstractC0380f;
import R2.C0381g;
import R2.C0385k;
import R2.C0386l;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class K implements l3.c {

    /* renamed from: n, reason: collision with root package name */
    public final C0359d f2507n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2508u;

    /* renamed from: v, reason: collision with root package name */
    public final C0356a f2509v;

    /* renamed from: w, reason: collision with root package name */
    public final long f2510w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2511x;

    public K(C0359d c0359d, int i, C0356a c0356a, long j6, long j9) {
        this.f2507n = c0359d;
        this.f2508u = i;
        this.f2509v = c0356a;
        this.f2510w = j6;
        this.f2511x = j9;
    }

    public static C0381g a(C c9, AbstractC0380f abstractC0380f, int i) {
        R2.E e9 = abstractC0380f.f2793T;
        C0381g c0381g = e9 == null ? null : e9.f2750w;
        if (c0381g != null && c0381g.f2803u) {
            int[] iArr = c0381g.f2805w;
            int i4 = 0;
            if (iArr == null) {
                int[] iArr2 = c0381g.f2807y;
                if (iArr2 != null) {
                    while (i4 < iArr2.length) {
                        if (iArr2[i4] == i) {
                            return null;
                        }
                        i4++;
                    }
                }
            } else {
                while (i4 < iArr.length) {
                    if (iArr[i4] != i) {
                        i4++;
                    }
                }
            }
            if (c9.f2487E < c0381g.f2806x) {
                return c0381g;
            }
        }
        return null;
    }

    @Override // l3.c
    public final void r(l3.m mVar) {
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        long j6;
        long j9;
        int i11;
        if (this.f2507n.a()) {
            R2.m mVar2 = (R2.m) C0386l.a().f2836n;
            if (mVar2 == null || mVar2.f2838u) {
                C c9 = (C) this.f2507n.f2550C.get(this.f2509v);
                if (c9 != null) {
                    Object obj = c9.f2490u;
                    if (obj instanceof AbstractC0380f) {
                        AbstractC0380f abstractC0380f = (AbstractC0380f) obj;
                        int i12 = 0;
                        boolean z6 = this.f2510w > 0;
                        int i13 = abstractC0380f.f2788O;
                        if (mVar2 != null) {
                            z6 &= mVar2.f2839v;
                            int i14 = mVar2.f2840w;
                            int i15 = mVar2.f2841x;
                            i = mVar2.f2837n;
                            if (abstractC0380f.f2793T != null && !abstractC0380f.d()) {
                                C0381g a9 = a(c9, abstractC0380f, this.f2508u);
                                if (a9 == null) {
                                    return;
                                }
                                boolean z9 = a9.f2804v && this.f2510w > 0;
                                i15 = a9.f2806x;
                                z6 = z9;
                            }
                            i6 = i14;
                            i4 = i15;
                        } else {
                            i = 0;
                            i4 = 100;
                            i6 = 5000;
                        }
                        C0359d c0359d = this.f2507n;
                        if (mVar.i()) {
                            i9 = 0;
                        } else {
                            if (mVar.f38884d) {
                                i9 = 100;
                            } else {
                                Exception f2 = mVar.f();
                                if (f2 instanceof P2.f) {
                                    Status status = ((P2.f) f2).f2383n;
                                    int i16 = status.f24395n;
                                    O2.b bVar = status.f24398w;
                                    i12 = bVar == null ? -1 : bVar.f2256u;
                                    i9 = i16;
                                } else {
                                    i9 = 101;
                                }
                            }
                            i12 = -1;
                        }
                        if (z6) {
                            long j10 = this.f2510w;
                            long currentTimeMillis = System.currentTimeMillis();
                            i10 = i4;
                            i11 = (int) (SystemClock.elapsedRealtime() - this.f2511x);
                            j9 = currentTimeMillis;
                            j6 = j10;
                        } else {
                            i10 = i4;
                            j6 = 0;
                            j9 = 0;
                            i11 = -1;
                        }
                        c3.e eVar = c0359d.f2553F;
                        eVar.sendMessage(eVar.obtainMessage(18, new L(new C0385k(this.f2508u, i9, i12, j6, j9, null, null, i13, i11), i, i6, i10)));
                    }
                }
            }
        }
    }
}
