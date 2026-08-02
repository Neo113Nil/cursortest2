package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DQ implements LQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f25188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FQ f25189b;

    public DQ(FQ fq, int i) {
        Objects.requireNonNull(fq);
        this.f25189b = fq;
        this.f25188a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r8 == (-1)) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.LQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j6) {
        boolean z6;
        int i;
        FQ fq = this.f25189b;
        int i4 = this.f25188a;
        if (fq.n()) {
            return 0;
        }
        fq.l(i4);
        KQ kq = fq.f25567L[i4];
        boolean z9 = fq.f25586n0;
        synchronized (kq) {
            int i6 = kq.f26695r;
            int j9 = kq.j(i6);
            int i9 = kq.f26695r;
            int i10 = kq.f26692o;
            z6 = true;
            if ((i9 != i10) && j6 >= kq.f26690m[j9]) {
                i = (j6 <= kq.f26699v || !z9) ? kq.h(j9, i10 - i6, j6, true) : i10 - i6;
            }
            i = 0;
        }
        synchronized (kq) {
            if (i >= 0) {
                try {
                    if (kq.f26695r + i <= kq.f26692o) {
                        AbstractC2792Sd.i(z6);
                        kq.f26695r += i;
                    }
                } finally {
                }
            }
            z6 = false;
            AbstractC2792Sd.i(z6);
            kq.f26695r += i;
        }
        if (i != 0) {
            return i;
        }
        fq.m(i4);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r7 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c5, code lost:
    
        if (r5.f26702y != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c7, code lost:
    
        if (r17 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        r7 = r5.f26676B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cd, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cf, code lost:
    
        if (r8 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        if (r7 == r5.f26684f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d5, code lost:
    
        r5.g(r7, r21);
     */
    @Override // com.google.android.gms.internal.ads.LQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(S0.l lVar, C4019uN c4019uN, int i) {
        int i4;
        int i6;
        int i9;
        boolean z6;
        int i10;
        FQ fq = this.f25189b;
        int i11 = this.f25188a;
        if (fq.n()) {
            return -3;
        }
        fq.l(i11);
        KQ kq = fq.f25567L[i11];
        boolean z9 = fq.f25586n0;
        kq.getClass();
        boolean z10 = (i & 2) != 0;
        Z1.b bVar = kq.f26680b;
        synchronized (kq) {
            try {
                int i12 = kq.f26693p;
                int i13 = kq.f26695r;
                int i14 = i12 + i13;
                int i15 = kq.f26700w;
                boolean z11 = i15 != -1 && i14 >= i15;
                i4 = -4;
                if (i13 != kq.f26692o) {
                    if (!(i15 == -1 && (i10 = kq.f26701x) != -1 && i12 + i13 >= i10) && !z11) {
                        DP dp = ((JQ) kq.f26681c.d(i14)).f26438a;
                        if (!z10 && dp == kq.f26684f) {
                            int j6 = kq.j(kq.f26695r);
                            if (kq.f26685g != null) {
                                int i16 = kq.f26689l[j6];
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (z6) {
                                int i17 = kq.f26689l[j6];
                                c4019uN.f31925b = i17;
                                if (kq.f26695r == kq.f26692o - 1) {
                                    if (!z9) {
                                        if (kq.f26702y) {
                                        }
                                    }
                                    c4019uN.f31925b = 536870912 | i17;
                                }
                                c4019uN.f35303f = kq.f26690m[j6];
                                bVar.f4113v = kq.f26688k[j6];
                                bVar.f4112u = kq.f26687j[j6];
                                bVar.f4114w = kq.f26691n[j6];
                                i9 = -4;
                                i6 = 4;
                            }
                            i6 = 4;
                            i9 = -3;
                        }
                        kq.g(dp, lVar);
                        i9 = -5;
                        i6 = 4;
                    }
                }
                i6 = 4;
                c4019uN.f31925b = 4;
                c4019uN.f35303f = Long.MIN_VALUE;
                i9 = -4;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i9 != -4) {
            i4 = i9;
        } else if (!c4019uN.h(i6)) {
            int i18 = i & 1;
            if ((i & 4) == 0) {
                if (i18 != 0) {
                    IQ iq = kq.f26679a;
                    IQ.c(iq.f26261d, c4019uN, bVar, iq.f26259b);
                } else {
                    IQ iq2 = kq.f26679a;
                    iq2.f26261d = IQ.c(iq2.f26261d, c4019uN, bVar, iq2.f26259b);
                    kq.f26695r++;
                }
            }
        }
        if (i4 == -3) {
            fq.m(i11);
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.LQ
    public final boolean c() {
        FQ fq = this.f25189b;
        return !fq.n() && fq.f25567L[this.f25188a].m(fq.f25586n0);
    }

    @Override // com.google.android.gms.internal.ads.LQ
    public final void f() {
        IOException iOException;
        FQ fq = this.f25189b;
        C3128du c3128du = fq.f25567L[this.f25188a].f26685g;
        if (c3128du != null) {
            throw ((C4237yP) c3128du.f30647u);
        }
        int i = fq.f25577V == 7 ? 6 : 3;
        C4297ze c4297ze = fq.f25559C;
        IOException iOException2 = (IOException) c4297ze.f36135w;
        if (iOException2 != null) {
            throw iOException2;
        }
        E e9 = (E) c4297ze.f36134v;
        if (e9 != null && (iOException = e9.f25273v) != null && e9.f25274w > i) {
            throw iOException;
        }
    }
}
