package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AQ implements IQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f23677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CQ f23678b;

    public AQ(CQ cq, int i) {
        Objects.requireNonNull(cq);
        this.f23678b = cq;
        this.f23677a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r8 == (-1)) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.IQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j6) {
        boolean z3;
        int i;
        CQ cq = this.f23678b;
        int i6 = this.f23677a;
        if (cq.n()) {
            return 0;
        }
        cq.l(i6);
        HQ hq = cq.f24128L[i6];
        boolean z6 = cq.f24148s0;
        synchronized (hq) {
            int i9 = hq.f25318r;
            int j9 = hq.j(i9);
            int i10 = hq.f25318r;
            int i11 = hq.f25315o;
            z3 = true;
            if ((i10 != i11) && j6 >= hq.f25313m[j9]) {
                i = (j6 <= hq.f25322v || !z6) ? hq.h(j9, i11 - i9, j6, true) : i11 - i9;
            }
            i = 0;
        }
        synchronized (hq) {
            if (i >= 0) {
                try {
                    if (hq.f25318r + i <= hq.f25315o) {
                        AbstractC2772Sd.i(z3);
                        hq.f25318r += i;
                    }
                } finally {
                }
            }
            z3 = false;
            AbstractC2772Sd.i(z3);
            hq.f25318r += i;
        }
        if (i != 0) {
            return i;
        }
        cq.m(i6);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r7 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c5, code lost:
    
        if (r5.f25325y != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c7, code lost:
    
        if (r17 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        r7 = r5.f25299B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cd, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cf, code lost:
    
        if (r8 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        if (r7 == r5.f25307f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d5, code lost:
    
        r5.g(r7, r21);
     */
    @Override // com.google.android.gms.internal.ads.IQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(S0.l lVar, C3996uN c3996uN, int i) {
        int i6;
        int i9;
        int i10;
        boolean z3;
        int i11;
        CQ cq = this.f23678b;
        int i12 = this.f23677a;
        if (cq.n()) {
            return -3;
        }
        cq.l(i12);
        HQ hq = cq.f24128L[i12];
        boolean z6 = cq.f24148s0;
        hq.getClass();
        boolean z9 = (i & 2) != 0;
        X1.b bVar = hq.f25303b;
        synchronized (hq) {
            try {
                int i13 = hq.f25316p;
                int i14 = hq.f25318r;
                int i15 = i13 + i14;
                int i16 = hq.f25323w;
                boolean z10 = i16 != -1 && i15 >= i16;
                i6 = -4;
                if (i14 != hq.f25315o) {
                    if (!(i16 == -1 && (i11 = hq.f25324x) != -1 && i13 + i14 >= i11) && !z10) {
                        DP dp = ((GQ) hq.f25304c.d(i15)).f24976a;
                        if (!z9 && dp == hq.f25307f) {
                            int j6 = hq.j(hq.f25318r);
                            if (hq.f25308g != null) {
                                int i17 = hq.f25312l[j6];
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                int i18 = hq.f25312l[j6];
                                c3996uN.f31138b = i18;
                                if (hq.f25318r == hq.f25315o - 1) {
                                    if (!z6) {
                                        if (hq.f25325y) {
                                        }
                                    }
                                    c3996uN.f31138b = 536870912 | i18;
                                }
                                c3996uN.f34529f = hq.f25313m[j6];
                                bVar.f3762v = hq.f25311k[j6];
                                bVar.f3761u = hq.f25310j[j6];
                                bVar.f3763w = hq.f25314n[j6];
                                i10 = -4;
                                i9 = 4;
                            }
                            i9 = 4;
                            i10 = -3;
                        }
                        hq.g(dp, lVar);
                        i10 = -5;
                        i9 = 4;
                    }
                }
                i9 = 4;
                c3996uN.f31138b = 4;
                c3996uN.f34529f = Long.MIN_VALUE;
                i10 = -4;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 != -4) {
            i6 = i10;
        } else if (!c3996uN.h(i9)) {
            int i19 = i & 1;
            if ((i & 4) == 0) {
                if (i19 != 0) {
                    FQ fq = hq.f25302a;
                    FQ.c(fq.f24802d, c3996uN, bVar, fq.f24800b);
                } else {
                    FQ fq2 = hq.f25302a;
                    fq2.f24802d = FQ.c(fq2.f24802d, c3996uN, bVar, fq2.f24800b);
                    hq.f25318r++;
                }
            }
        }
        if (i6 == -3) {
            cq.m(i12);
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.IQ
    public final boolean c() {
        CQ cq = this.f23678b;
        return !cq.n() && cq.f24128L[this.f23677a].m(cq.f24148s0);
    }

    @Override // com.google.android.gms.internal.ads.IQ
    public final void f() {
        IOException iOException;
        CQ cq = this.f23678b;
        C3105du c3105du = cq.f24128L[this.f23677a].f25308g;
        if (c3105du != null) {
            throw ((C4214yP) c3105du.f29859u);
        }
        int i = cq.f24138V == 7 ? 6 : 3;
        C4274ze c4274ze = cq.f24120C;
        IOException iOException2 = (IOException) c4274ze.f35362w;
        if (iOException2 != null) {
            throw iOException2;
        }
        E e9 = (E) c4274ze.f35361v;
        if (e9 != null && (iOException = e9.f24512v) != null && e9.f24513w > i) {
            throw iOException;
        }
    }
}
