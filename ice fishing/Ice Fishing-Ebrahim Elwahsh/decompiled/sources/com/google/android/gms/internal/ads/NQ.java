package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class NQ implements VQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f26545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PQ f26546b;

    public NQ(PQ pq, int i) {
        Objects.requireNonNull(pq);
        this.f26546b = pq;
        this.f26545a = i;
    }

    @Override // com.google.android.gms.internal.ads.VQ
    public final boolean a() {
        PQ pq = this.f26546b;
        return !pq.q() && pq.f26940L[this.f26545a].m(pq.f26960s0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r8 == (-1)) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.VQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(long j9) {
        boolean z8;
        int i;
        PQ pq = this.f26546b;
        int i4 = this.f26545a;
        if (pq.q()) {
            return 0;
        }
        pq.n(i4);
        UQ uq = pq.f26940L[i4];
        boolean z9 = pq.f26960s0;
        synchronized (uq) {
            int i9 = uq.f28026r;
            int j10 = uq.j(i9);
            int i10 = uq.f28026r;
            int i11 = uq.f28023o;
            z8 = true;
            if ((i10 != i11) && j9 >= uq.f28021m[j10]) {
                i = (j9 <= uq.f28030v || !z9) ? uq.h(j10, i11 - i9, j9, true) : i11 - i9;
            }
            i = 0;
        }
        synchronized (uq) {
            if (i >= 0) {
                try {
                    if (uq.f28026r + i <= uq.f28023o) {
                        PA.n(z8);
                        uq.f28026r += i;
                    }
                } finally {
                }
            }
            z8 = false;
            PA.n(z8);
            uq.f28026r += i;
        }
        if (i != 0) {
            return i;
        }
        pq.o(i4);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r7 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c5, code lost:
    
        if (r5.f28033y != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c7, code lost:
    
        if (r17 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        r7 = r5.f28007B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cd, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cf, code lost:
    
        if (r8 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        if (r7 == r5.f28015f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d5, code lost:
    
        r5.g(r7, r21);
     */
    @Override // com.google.android.gms.internal.ads.VQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(C4164xG c4164xG, IN in, int i) {
        int i4;
        int i9;
        int i10;
        boolean z8;
        int i11;
        PQ pq = this.f26546b;
        int i12 = this.f26545a;
        if (pq.q()) {
            return -3;
        }
        pq.n(i12);
        UQ uq = pq.f26940L[i12];
        boolean z9 = pq.f26960s0;
        uq.getClass();
        boolean z10 = (i & 2) != 0;
        X1.b bVar = uq.f28011b;
        synchronized (uq) {
            try {
                int i13 = uq.f28024p;
                int i14 = uq.f28026r;
                int i15 = i13 + i14;
                int i16 = uq.f28031w;
                boolean z11 = i16 != -1 && i15 >= i16;
                i4 = -4;
                if (i14 != uq.f28023o) {
                    if (!(i16 == -1 && (i11 = uq.f28032x) != -1 && i13 + i14 >= i11) && !z11) {
                        TP tp = ((TQ) uq.f28012c.e(i15)).f27788a;
                        if (!z10 && tp == uq.f28015f) {
                            int j9 = uq.j(uq.f28026r);
                            if (uq.f28016g != null) {
                                int i17 = uq.f28020l[j9];
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (z8) {
                                int i18 = uq.f28020l[j9];
                                in.f32624b = i18;
                                if (uq.f28026r == uq.f28023o - 1) {
                                    if (!z9) {
                                        if (uq.f28033y) {
                                        }
                                    }
                                    in.f32624b = 536870912 | i18;
                                }
                                in.f25553f = uq.f28021m[j9];
                                bVar.f3818v = uq.f28019k[j9];
                                bVar.f3817u = uq.f28018j[j9];
                                bVar.f3819w = uq.f28022n[j9];
                                i10 = -4;
                                i9 = 4;
                            }
                            i9 = 4;
                            i10 = -3;
                        }
                        uq.g(tp, c4164xG);
                        i10 = -5;
                        i9 = 4;
                    }
                }
                i9 = 4;
                in.f32624b = 4;
                in.f25553f = Long.MIN_VALUE;
                i10 = -4;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 != -4) {
            i4 = i10;
        } else if (!in.h(i9)) {
            int i19 = i & 1;
            if ((i & 4) == 0) {
                if (i19 != 0) {
                    SQ sq = uq.f28010a;
                    SQ.c(sq.f27569d, in, bVar, sq.f27567b);
                } else {
                    SQ sq2 = uq.f28010a;
                    sq2.f27569d = SQ.c(sq2.f27569d, in, bVar, sq2.f27567b);
                    uq.f28026r++;
                }
            }
        }
        if (i4 == -3) {
            pq.o(i12);
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.VQ
    public final void d() {
        IOException iOException;
        PQ pq = this.f26546b;
        Mu mu = pq.f26940L[this.f26545a].f28016g;
        if (mu != null) {
            throw ((LP) mu.f26395u);
        }
        int i = pq.f26950V == 7 ? 6 : 3;
        C4017ue c4017ue = pq.f26932C;
        IOException iOException2 = (IOException) c4017ue.f34632w;
        if (iOException2 != null) {
            throw iOException2;
        }
        D d2 = (D) c4017ue.f34631v;
        if (d2 != null && (iOException = d2.f24290v) != null && d2.f24291w > i) {
            throw iOException;
        }
    }
}
