package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class UQ implements InterfaceC3448k1 {

    /* renamed from: B, reason: collision with root package name */
    public TP f28007B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f28009D;

    /* renamed from: a, reason: collision with root package name */
    public final SQ f28010a;

    /* renamed from: d, reason: collision with root package name */
    public final T2 f28013d;

    /* renamed from: e, reason: collision with root package name */
    public PQ f28014e;

    /* renamed from: f, reason: collision with root package name */
    public TP f28015f;

    /* renamed from: g, reason: collision with root package name */
    public Mu f28016g;

    /* renamed from: o, reason: collision with root package name */
    public int f28023o;

    /* renamed from: p, reason: collision with root package name */
    public int f28024p;

    /* renamed from: q, reason: collision with root package name */
    public int f28025q;

    /* renamed from: r, reason: collision with root package name */
    public int f28026r;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28033y;

    /* renamed from: b, reason: collision with root package name */
    public final X1.b f28011b = new X1.b();

    /* renamed from: h, reason: collision with root package name */
    public int f28017h = 1000;
    public long[] i = new long[1000];

    /* renamed from: j, reason: collision with root package name */
    public long[] f28018j = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public long[] f28021m = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f28020l = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    public int[] f28019k = new int[1000];

    /* renamed from: n, reason: collision with root package name */
    public C3394j1[] f28022n = new C3394j1[1000];

    /* renamed from: c, reason: collision with root package name */
    public final C3398j5 f28012c = new C3398j5(9, false);

    /* renamed from: s, reason: collision with root package name */
    public long f28027s = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f28029u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f28030v = Long.MIN_VALUE;

    /* renamed from: A, reason: collision with root package name */
    public boolean f28006A = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28034z = true;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28008C = true;

    /* renamed from: t, reason: collision with root package name */
    public long f28028t = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public int f28031w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f28032x = -1;

    public UQ(InterfaceC3985u interfaceC3985u, T2 t22, NP np) {
        this.f28013d = t22;
        this.f28010a = new SQ(interfaceC3985u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (((com.google.android.gms.internal.ads.TQ) ((android.util.SparseArray) r0.f32084u).valueAt(r2.size() - 1)).f27788a.equals(r17.f28007B) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j9, int i, int i4, int i9, C3394j1 c3394j1) {
        int i10;
        int i11;
        if (this.f28034z) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f28034z = false;
            }
        }
        if (this.f28008C) {
            if (j9 < this.f28027s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.f28009D) {
                    AbstractC3217fl.I("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f28007B)));
                    this.f28009D = true;
                }
                i10 = i | 1;
                long j10 = (this.f28010a.f27571f - i4) - i9;
                synchronized (this) {
                    try {
                        int i12 = this.f28023o;
                        if (i12 > 0) {
                            int j11 = j(i12 - 1);
                            PA.n(this.f28018j[j11] + ((long) this.f28019k[j11]) <= j10);
                        }
                        int i13 = 536870912 & i10;
                        this.f28033y = i13 != 0;
                        this.f28030v = Math.max(this.f28030v, j9);
                        int i14 = this.f28024p;
                        int i15 = this.f28023o;
                        int i16 = i14 + i15;
                        long j12 = this.f28028t;
                        if (j12 != Long.MIN_VALUE && this.f28031w == -1) {
                            if (j9 >= j12) {
                                int i17 = this.f28032x;
                                if (i17 == -1) {
                                    this.f28032x = i16;
                                    i17 = i16;
                                }
                                int i18 = (i16 - i17) + 1;
                                int i19 = i10 & 1;
                                TP tp = this.f28007B;
                                int i20 = 16;
                                if (tp != null && (i11 = tp.f27778q) != -1) {
                                    i20 = i11;
                                }
                                if (i18 >= i20 + 1 || i19 != 0 || i13 != 0) {
                                    this.f28031w = i17;
                                }
                            }
                            this.f28032x = -1;
                        }
                        int j13 = j(i15);
                        this.f28021m[j13] = j9;
                        this.f28018j[j13] = j10;
                        this.f28019k[j13] = i4;
                        this.f28020l[j13] = i10;
                        this.f28022n[j13] = c3394j1;
                        this.i[j13] = 0;
                        C3398j5 c3398j5 = this.f28012c;
                        if (!(((SparseArray) c3398j5.f32084u).size() == 0)) {
                        }
                        TP tp2 = this.f28007B;
                        if (tp2 == null) {
                            throw null;
                        }
                        int i21 = this.f28024p + this.f28023o;
                        TQ tq = new TQ(tp2);
                        int i22 = c3398j5.f32083n;
                        SparseArray sparseArray = (SparseArray) c3398j5.f32084u;
                        if (i22 == -1) {
                            PA.T(sparseArray.size() == 0);
                            c3398j5.f32083n = 0;
                        }
                        if (sparseArray.size() > 0) {
                            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            PA.n(i21 >= keyAt);
                            if (keyAt == i21) {
                                ((C3796qP) c3398j5.f32085v).mo2b(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i21, tq);
                        int i23 = this.f28023o + 1;
                        this.f28023o = i23;
                        int i24 = this.f28017h;
                        if (i23 == i24) {
                            int i25 = i24 + 1000;
                            long[] jArr = new long[i25];
                            long[] jArr2 = new long[i25];
                            long[] jArr3 = new long[i25];
                            int[] iArr = new int[i25];
                            int[] iArr2 = new int[i25];
                            C3394j1[] c3394j1Arr = new C3394j1[i25];
                            int i26 = this.f28025q;
                            int i27 = i24 - i26;
                            System.arraycopy(this.f28018j, i26, jArr2, 0, i27);
                            System.arraycopy(this.f28021m, this.f28025q, jArr3, 0, i27);
                            System.arraycopy(this.f28020l, this.f28025q, iArr, 0, i27);
                            System.arraycopy(this.f28019k, this.f28025q, iArr2, 0, i27);
                            System.arraycopy(this.f28022n, this.f28025q, c3394j1Arr, 0, i27);
                            System.arraycopy(this.i, this.f28025q, jArr, 0, i27);
                            int i28 = this.f28025q;
                            System.arraycopy(this.f28018j, 0, jArr2, i27, i28);
                            System.arraycopy(this.f28021m, 0, jArr3, i27, i28);
                            System.arraycopy(this.f28020l, 0, iArr, i27, i28);
                            System.arraycopy(this.f28019k, 0, iArr2, i27, i28);
                            System.arraycopy(this.f28022n, 0, c3394j1Arr, i27, i28);
                            System.arraycopy(this.i, 0, jArr, i27, i28);
                            this.f28018j = jArr2;
                            this.f28021m = jArr3;
                            this.f28020l = iArr;
                            this.f28019k = iArr2;
                            this.f28022n = c3394j1Arr;
                            this.i = jArr;
                            this.f28025q = 0;
                            this.f28017h = i25;
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        i10 = i;
        long j102 = (this.f28010a.f27571f - i4) - i9;
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final int c(JN jn, int i, boolean z8) {
        SQ sq = this.f28010a;
        int b9 = sq.b(i);
        E2 e22 = sq.f27570e;
        C3931t c3931t = (C3931t) e22.f24634v;
        byte[] bArr = c3931t.f34331a;
        long j9 = sq.f27571f - e22.f24632n;
        c3931t.getClass();
        int z9 = jn.z(bArr, (int) j9, b9);
        if (z9 == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = sq.f27571f + z9;
        sq.f27571f = j10;
        E2 e23 = sq.f27570e;
        if (j10 == e23.f24633u) {
            sq.f27570e = (E2) e23.f24635w;
        }
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void e(TP tp) {
        boolean z8;
        synchronized (this) {
            z8 = false;
            try {
                this.f28006A = false;
                if (!Objects.equals(tp, this.f28007B)) {
                    C3398j5 c3398j5 = this.f28012c;
                    if (!(((SparseArray) c3398j5.f32084u).size() == 0)) {
                        if (((TQ) ((SparseArray) c3398j5.f32084u).valueAt(r2.size() - 1)).f27788a.equals(tp)) {
                            this.f28007B = ((TQ) ((SparseArray) c3398j5.f32084u).valueAt(r6.size() - 1)).f27788a;
                            boolean z9 = this.f28008C;
                            TP tp2 = this.f28007B;
                            String str = tp2.f27776o;
                            this.f28008C = z9 & (K4.f(str) != 1 && K4.d(str, tp2.f27772k));
                            this.f28009D = false;
                            z8 = true;
                        }
                    }
                    this.f28007B = tp;
                    boolean z92 = this.f28008C;
                    TP tp22 = this.f28007B;
                    String str2 = tp22.f27776o;
                    this.f28008C = z92 & (K4.f(str2) != 1 && K4.d(str2, tp22.f27772k));
                    this.f28009D = false;
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        PQ pq = this.f28014e;
        if (pq == null || !z8) {
            return;
        }
        pq.f26937H.post(pq.f26935F);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void f(Lr lr, int i, int i4) {
        while (true) {
            SQ sq = this.f28010a;
            if (i <= 0) {
                sq.getClass();
                return;
            }
            int b9 = sq.b(i);
            E2 e22 = sq.f27570e;
            C3931t c3931t = (C3931t) e22.f24634v;
            byte[] bArr = c3931t.f34331a;
            long j9 = sq.f27571f - e22.f24632n;
            c3931t.getClass();
            lr.H(bArr, (int) j9, b9);
            i -= b9;
            long j10 = sq.f27571f + b9;
            sq.f27571f = j10;
            E2 e23 = sq.f27570e;
            if (j10 == e23.f24633u) {
                sq.f27570e = (E2) e23.f24635w;
            }
        }
    }

    public final void g(TP tp, C4164xG c4164xG) {
        TP tp2 = this.f28015f;
        RO ro = tp2 == null ? null : tp2.f27780s;
        this.f28015f = tp;
        RO ro2 = tp.f27780s;
        this.f28013d.getClass();
        RO ro3 = tp.f27780s;
        int i = ro3 != null ? 1 : 0;
        C4065vP c4065vP = new C4065vP(tp);
        c4065vP.f34772N = i;
        c4164xG.f35133v = new TP(c4065vP);
        c4164xG.f35132u = this.f28016g;
        if (tp2 == null || !Objects.equals(ro, ro2)) {
            Mu mu = ro3 != null ? new Mu(12, new LP(new PP())) : null;
            this.f28016g = mu;
            c4164xG.f35132u = mu;
        }
    }

    public final int h(int i, int i4, long j9, boolean z8) {
        int i9 = -1;
        for (int i10 = 0; i10 < i4; i10++) {
            long j10 = this.f28021m[i];
            if (j10 > j9) {
                break;
            }
            if (!z8 || (this.f28020l[i] & 1) != 0) {
                if (j10 == j9) {
                    return i10;
                }
                i9 = i10;
            }
            i++;
            if (i == this.f28017h) {
                i = 0;
            }
        }
        return i9;
    }

    public final long i(int i) {
        long j9 = this.f28029u;
        long j10 = Long.MIN_VALUE;
        int i4 = 0;
        if (i != 0) {
            int j11 = j(i - 1);
            for (int i9 = 0; i9 < i; i9++) {
                j10 = Math.max(j10, this.f28021m[j11]);
                if ((this.f28020l[j11] & 1) != 0) {
                    break;
                }
                j11--;
                if (j11 == -1) {
                    j11 = this.f28017h - 1;
                }
            }
        }
        this.f28029u = Math.max(j9, j10);
        this.f28023o -= i;
        int i10 = this.f28024p + i;
        this.f28024p = i10;
        int i11 = this.f28025q + i;
        this.f28025q = i11;
        int i12 = this.f28017h;
        if (i11 >= i12) {
            this.f28025q = i11 - i12;
        }
        int i13 = this.f28026r - i;
        this.f28026r = i13;
        if (i13 < 0) {
            this.f28026r = 0;
        }
        while (true) {
            C3398j5 c3398j5 = this.f28012c;
            SparseArray sparseArray = (SparseArray) c3398j5.f32084u;
            if (i4 >= sparseArray.size() - 1) {
                break;
            }
            int i14 = i4 + 1;
            if (i10 < sparseArray.keyAt(i14)) {
                break;
            }
            ((C3796qP) c3398j5.f32085v).mo2b(sparseArray.valueAt(i4));
            sparseArray.removeAt(i4);
            int i15 = c3398j5.f32083n;
            if (i15 > 0) {
                c3398j5.f32083n = i15 - 1;
            }
            i4 = i14;
        }
        if (this.f28023o != 0) {
            return this.f28018j[this.f28025q];
        }
        int i16 = this.f28025q;
        if (i16 == 0) {
            i16 = this.f28017h;
        }
        return this.f28018j[i16 - 1] + this.f28019k[r12];
    }

    public final int j(int i) {
        int i4 = this.f28025q + i;
        int i9 = this.f28017h;
        return i4 < i9 ? i4 : i4 - i9;
    }

    public final void k(boolean z8) {
        C3398j5 c3398j5;
        SparseArray sparseArray;
        SQ sq = this.f28010a;
        E2 e22 = sq.f27568c;
        C3931t c3931t = (C3931t) e22.f24634v;
        InterfaceC3985u interfaceC3985u = sq.f27566a;
        if (c3931t != null) {
            interfaceC3985u.q(e22);
            e22.f24634v = null;
            e22.f24635w = null;
        }
        E2 e23 = sq.f27568c;
        int i = 0;
        PA.T(((C3931t) e23.f24634v) == null);
        e23.f24632n = 0L;
        e23.f24633u = 65536L;
        E2 e24 = sq.f27568c;
        sq.f27569d = e24;
        sq.f27570e = e24;
        sq.f27571f = 0L;
        interfaceC3985u.o();
        this.f28023o = 0;
        this.f28024p = 0;
        this.f28025q = 0;
        this.f28026r = 0;
        this.f28031w = -1;
        this.f28032x = -1;
        this.f28034z = true;
        this.f28027s = Long.MIN_VALUE;
        this.f28029u = Long.MIN_VALUE;
        this.f28030v = Long.MIN_VALUE;
        this.f28033y = false;
        while (true) {
            c3398j5 = this.f28012c;
            sparseArray = (SparseArray) c3398j5.f32084u;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C3796qP) c3398j5.f32085v).mo2b(sparseArray.valueAt(i));
            i++;
        }
        c3398j5.f32083n = -1;
        sparseArray.clear();
        if (z8) {
            this.f28007B = null;
            this.f28006A = true;
            this.f28008C = true;
        }
    }

    public final synchronized TP l() {
        if (this.f28006A) {
            return null;
        }
        return this.f28007B;
    }

    public final synchronized boolean m(boolean z8) {
        int i;
        int i4 = this.f28024p;
        int i9 = this.f28026r;
        int i10 = i4 + i9;
        int i11 = this.f28031w;
        boolean z9 = true;
        if (i11 != -1 && i10 >= i11) {
            return true;
        }
        if (i9 != this.f28023o) {
            if (!(i11 == -1 && (i = this.f28032x) != -1 && i4 + i9 >= i)) {
                if (((TQ) this.f28012c.e(i10)).f27788a != this.f28015f) {
                    return true;
                }
                int j9 = j(this.f28026r);
                if (this.f28016g != null) {
                    int i12 = this.f28020l[j9];
                    z9 = false;
                }
                return z9;
            }
        }
        if (!z8 && !this.f28033y) {
            TP tp = this.f28007B;
            if (tp == null) {
                z9 = false;
            } else if (tp == this.f28015f) {
                return false;
            }
        }
        return z9;
    }

    public final synchronized boolean n(long j9, boolean z8) {
        long min;
        UQ uq;
        long j10;
        int h9;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f28026r = 0;
                        SQ sq = this.f28010a;
                        sq.f27569d = sq.f27568c;
                        int j11 = j(0);
                        long j12 = this.f28028t;
                        if (j12 != Long.MIN_VALUE) {
                            try {
                                min = Math.min(this.f28030v, j12);
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                throw th2;
                            }
                        } else {
                            min = this.f28030v;
                        }
                        int i = this.f28026r;
                        int i4 = this.f28023o;
                        if ((i != i4) && j9 >= this.f28021m[j11]) {
                            if (j9 > min) {
                                if (z8) {
                                    z8 = true;
                                }
                            }
                            if (this.f28008C) {
                                h9 = i4 - i;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= h9) {
                                        uq = this;
                                        j10 = j9;
                                        if (!z8) {
                                            h9 = -1;
                                        }
                                    } else {
                                        if (this.f28021m[j11] >= j9) {
                                            uq = this;
                                            j10 = j9;
                                            h9 = i9;
                                            break;
                                        }
                                        j11++;
                                        if (j11 == this.f28017h) {
                                            j11 = 0;
                                        }
                                        i9++;
                                    }
                                }
                            } else {
                                int i10 = i4 - i;
                                uq = this;
                                j10 = j9;
                                h9 = uq.h(j11, i10, j10, true);
                            }
                            if (h9 == -1) {
                                return false;
                            }
                            uq.f28027s = j10;
                            uq.f28026r += h9;
                            return true;
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th3 = th;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th2;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void o() {
        long i;
        SQ sq = this.f28010a;
        synchronized (this) {
            int i4 = this.f28023o;
            i = i4 == 0 ? -1L : i(i4);
        }
        sq.a(i);
    }
}
