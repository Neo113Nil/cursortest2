package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class HQ implements InterfaceC3543m1 {

    /* renamed from: B, reason: collision with root package name */
    public DP f25299B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f25301D;

    /* renamed from: a, reason: collision with root package name */
    public final FQ f25302a;

    /* renamed from: d, reason: collision with root package name */
    public final V2 f25305d;

    /* renamed from: e, reason: collision with root package name */
    public CQ f25306e;

    /* renamed from: f, reason: collision with root package name */
    public DP f25307f;

    /* renamed from: g, reason: collision with root package name */
    public C3105du f25308g;

    /* renamed from: o, reason: collision with root package name */
    public int f25315o;

    /* renamed from: p, reason: collision with root package name */
    public int f25316p;

    /* renamed from: q, reason: collision with root package name */
    public int f25317q;

    /* renamed from: r, reason: collision with root package name */
    public int f25318r;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25325y;

    /* renamed from: b, reason: collision with root package name */
    public final X1.b f25303b = new X1.b();

    /* renamed from: h, reason: collision with root package name */
    public int f25309h = 1000;
    public long[] i = new long[1000];

    /* renamed from: j, reason: collision with root package name */
    public long[] f25310j = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public long[] f25313m = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f25312l = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    public int[] f25311k = new int[1000];

    /* renamed from: n, reason: collision with root package name */
    public C3489l1[] f25314n = new C3489l1[1000];

    /* renamed from: c, reason: collision with root package name */
    public final C3493l5 f25304c = new C3493l5(9, false);

    /* renamed from: s, reason: collision with root package name */
    public long f25319s = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f25321u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f25322v = Long.MIN_VALUE;

    /* renamed from: A, reason: collision with root package name */
    public boolean f25298A = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25326z = true;

    /* renamed from: C, reason: collision with root package name */
    public boolean f25300C = true;

    /* renamed from: t, reason: collision with root package name */
    public long f25320t = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public int f25323w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f25324x = -1;

    public HQ(InterfaceC4026v interfaceC4026v, V2 v22, AP ap) {
        this.f25305d = v22;
        this.f25302a = new FQ(interfaceC4026v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final int b(InterfaceC4050vN interfaceC4050vN, int i, boolean z3) {
        FQ fq = this.f25302a;
        int b9 = fq.b(i);
        G2 g22 = fq.f24803e;
        C3972u c3972u = (C3972u) g22.f24909v;
        byte[] bArr = c3972u.f34445a;
        long j6 = fq.f24804f - g22.f24907n;
        c3972u.getClass();
        int m4 = interfaceC4050vN.m(bArr, (int) j6, b9);
        if (m4 == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        long j9 = fq.f24804f + m4;
        fq.f24804f = j9;
        G2 g23 = fq.f24803e;
        if (j9 == g23.f24908u) {
            fq.f24803e = (G2) g23.f24910w;
        }
        return m4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (((com.google.android.gms.internal.ads.GQ) ((android.util.SparseArray) r0.f31708u).valueAt(r2.size() - 1)).f24976a.equals(r17.f25299B) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j6, int i, int i6, int i9, C3489l1 c3489l1) {
        int i10;
        int i11;
        if (this.f25326z) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f25326z = false;
            }
        }
        if (this.f25300C) {
            if (j6 < this.f25319s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.f25301D) {
                    AbstractC2968bG.y("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f25299B)));
                    this.f25301D = true;
                }
                i10 = i | 1;
                long j9 = (this.f25302a.f24804f - i6) - i9;
                synchronized (this) {
                    try {
                        int i12 = this.f25315o;
                        if (i12 > 0) {
                            int j10 = j(i12 - 1);
                            AbstractC2772Sd.i(this.f25310j[j10] + ((long) this.f25311k[j10]) <= j9);
                        }
                        int i13 = 536870912 & i10;
                        this.f25325y = i13 != 0;
                        this.f25322v = Math.max(this.f25322v, j6);
                        int i14 = this.f25316p;
                        int i15 = this.f25315o;
                        int i16 = i14 + i15;
                        long j11 = this.f25320t;
                        if (j11 != Long.MIN_VALUE && this.f25323w == -1) {
                            if (j6 >= j11) {
                                int i17 = this.f25324x;
                                if (i17 == -1) {
                                    this.f25324x = i16;
                                    i17 = i16;
                                }
                                int i18 = (i16 - i17) + 1;
                                int i19 = i10 & 1;
                                DP dp = this.f25299B;
                                int i20 = 16;
                                if (dp != null && (i11 = dp.f24433q) != -1) {
                                    i20 = i11;
                                }
                                if (i18 >= i20 + 1 || i19 != 0 || i13 != 0) {
                                    this.f25323w = i17;
                                }
                            }
                            this.f25324x = -1;
                        }
                        int j12 = j(i15);
                        this.f25313m[j12] = j6;
                        this.f25310j[j12] = j9;
                        this.f25311k[j12] = i6;
                        this.f25312l[j12] = i10;
                        this.f25314n[j12] = c3489l1;
                        this.i[j12] = 0;
                        C3493l5 c3493l5 = this.f25304c;
                        if (!(((SparseArray) c3493l5.f31708u).size() == 0)) {
                        }
                        DP dp2 = this.f25299B;
                        if (dp2 == null) {
                            throw null;
                        }
                        int i21 = this.f25316p + this.f25315o;
                        GQ gq = new GQ(dp2);
                        int i22 = c3493l5.f31707n;
                        SparseArray sparseArray = (SparseArray) c3493l5.f31708u;
                        if (i22 == -1) {
                            AbstractC2772Sd.H(sparseArray.size() == 0);
                            c3493l5.f31707n = 0;
                        }
                        if (sparseArray.size() > 0) {
                            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            AbstractC2772Sd.i(i21 >= keyAt);
                            if (keyAt == i21) {
                                ((C3084dP) c3493l5.f31709v).mo1a(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i21, gq);
                        int i23 = this.f25315o + 1;
                        this.f25315o = i23;
                        int i24 = this.f25309h;
                        if (i23 == i24) {
                            int i25 = i24 + 1000;
                            long[] jArr = new long[i25];
                            long[] jArr2 = new long[i25];
                            long[] jArr3 = new long[i25];
                            int[] iArr = new int[i25];
                            int[] iArr2 = new int[i25];
                            C3489l1[] c3489l1Arr = new C3489l1[i25];
                            int i26 = this.f25317q;
                            int i27 = i24 - i26;
                            System.arraycopy(this.f25310j, i26, jArr2, 0, i27);
                            System.arraycopy(this.f25313m, this.f25317q, jArr3, 0, i27);
                            System.arraycopy(this.f25312l, this.f25317q, iArr, 0, i27);
                            System.arraycopy(this.f25311k, this.f25317q, iArr2, 0, i27);
                            System.arraycopy(this.f25314n, this.f25317q, c3489l1Arr, 0, i27);
                            System.arraycopy(this.i, this.f25317q, jArr, 0, i27);
                            int i28 = this.f25317q;
                            System.arraycopy(this.f25310j, 0, jArr2, i27, i28);
                            System.arraycopy(this.f25313m, 0, jArr3, i27, i28);
                            System.arraycopy(this.f25312l, 0, iArr, i27, i28);
                            System.arraycopy(this.f25311k, 0, iArr2, i27, i28);
                            System.arraycopy(this.f25314n, 0, c3489l1Arr, i27, i28);
                            System.arraycopy(this.i, 0, jArr, i27, i28);
                            this.f25310j = jArr2;
                            this.f25313m = jArr3;
                            this.f25312l = iArr;
                            this.f25311k = iArr2;
                            this.f25314n = c3489l1Arr;
                            this.i = jArr;
                            this.f25317q = 0;
                            this.f25309h = i25;
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
        long j92 = (this.f25302a.f24804f - i6) - i9;
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void e(DP dp) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            try {
                this.f25298A = false;
                if (!Objects.equals(dp, this.f25299B)) {
                    C3493l5 c3493l5 = this.f25304c;
                    if (!(((SparseArray) c3493l5.f31708u).size() == 0)) {
                        if (((GQ) ((SparseArray) c3493l5.f31708u).valueAt(r2.size() - 1)).f24976a.equals(dp)) {
                            this.f25299B = ((GQ) ((SparseArray) c3493l5.f31708u).valueAt(r6.size() - 1)).f24976a;
                            boolean z6 = this.f25300C;
                            DP dp2 = this.f25299B;
                            String str = dp2.f24431o;
                            this.f25300C = z6 & (H4.f(str) != 1 && H4.d(str, dp2.f24427k));
                            this.f25301D = false;
                            z3 = true;
                        }
                    }
                    this.f25299B = dp;
                    boolean z62 = this.f25300C;
                    DP dp22 = this.f25299B;
                    String str2 = dp22.f24431o;
                    this.f25300C = z62 & (H4.f(str2) != 1 && H4.d(str2, dp22.f24427k));
                    this.f25301D = false;
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        CQ cq = this.f25306e;
        if (cq == null || !z3) {
            return;
        }
        cq.f24125H.post(cq.f24123F);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3543m1
    public final void f(Cr cr, int i, int i6) {
        while (true) {
            FQ fq = this.f25302a;
            if (i <= 0) {
                fq.getClass();
                return;
            }
            int b9 = fq.b(i);
            G2 g22 = fq.f24803e;
            C3972u c3972u = (C3972u) g22.f24909v;
            byte[] bArr = c3972u.f34445a;
            long j6 = fq.f24804f - g22.f24907n;
            c3972u.getClass();
            cr.H(bArr, (int) j6, b9);
            i -= b9;
            long j9 = fq.f24804f + b9;
            fq.f24804f = j9;
            G2 g23 = fq.f24803e;
            if (j9 == g23.f24908u) {
                fq.f24803e = (G2) g23.f24910w;
            }
        }
    }

    public final void g(DP dp, S0.l lVar) {
        DP dp2 = this.f25307f;
        EO eo = dp2 == null ? null : dp2.f24435s;
        this.f25307f = dp;
        EO eo2 = dp.f24435s;
        this.f25305d.getClass();
        EO eo3 = dp.f24435s;
        int i = eo3 != null ? 1 : 0;
        C3299hP c3299hP = new C3299hP(dp);
        c3299hP.f30779O = i;
        lVar.f2798v = new DP(c3299hP);
        lVar.f2797u = this.f25308g;
        if (dp2 == null || !Objects.equals(eo, eo2)) {
            C3105du c3105du = eo3 != null ? new C3105du(13, new C4214yP(new CP())) : null;
            this.f25308g = c3105du;
            lVar.f2797u = c3105du;
        }
    }

    public final int h(int i, int i6, long j6, boolean z3) {
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            long j9 = this.f25313m[i];
            if (j9 > j6) {
                break;
            }
            if (!z3 || (this.f25312l[i] & 1) != 0) {
                if (j9 == j6) {
                    return i10;
                }
                i9 = i10;
            }
            i++;
            if (i == this.f25309h) {
                i = 0;
            }
        }
        return i9;
    }

    public final long i(int i) {
        long j6 = this.f25321u;
        long j9 = Long.MIN_VALUE;
        int i6 = 0;
        if (i != 0) {
            int j10 = j(i - 1);
            for (int i9 = 0; i9 < i; i9++) {
                j9 = Math.max(j9, this.f25313m[j10]);
                if ((this.f25312l[j10] & 1) != 0) {
                    break;
                }
                j10--;
                if (j10 == -1) {
                    j10 = this.f25309h - 1;
                }
            }
        }
        this.f25321u = Math.max(j6, j9);
        this.f25315o -= i;
        int i10 = this.f25316p + i;
        this.f25316p = i10;
        int i11 = this.f25317q + i;
        this.f25317q = i11;
        int i12 = this.f25309h;
        if (i11 >= i12) {
            this.f25317q = i11 - i12;
        }
        int i13 = this.f25318r - i;
        this.f25318r = i13;
        if (i13 < 0) {
            this.f25318r = 0;
        }
        while (true) {
            C3493l5 c3493l5 = this.f25304c;
            SparseArray sparseArray = (SparseArray) c3493l5.f31708u;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i14 = i6 + 1;
            if (i10 < sparseArray.keyAt(i14)) {
                break;
            }
            ((C3084dP) c3493l5.f31709v).mo1a(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i15 = c3493l5.f31707n;
            if (i15 > 0) {
                c3493l5.f31707n = i15 - 1;
            }
            i6 = i14;
        }
        if (this.f25315o != 0) {
            return this.f25310j[this.f25317q];
        }
        int i16 = this.f25317q;
        if (i16 == 0) {
            i16 = this.f25309h;
        }
        return this.f25310j[i16 - 1] + this.f25311k[r12];
    }

    public final int j(int i) {
        int i6 = this.f25317q + i;
        int i9 = this.f25309h;
        return i6 < i9 ? i6 : i6 - i9;
    }

    public final void k(boolean z3) {
        C3493l5 c3493l5;
        SparseArray sparseArray;
        FQ fq = this.f25302a;
        G2 g22 = fq.f24801c;
        C3972u c3972u = (C3972u) g22.f24909v;
        InterfaceC4026v interfaceC4026v = fq.f24799a;
        if (c3972u != null) {
            interfaceC4026v.q(g22);
            g22.f24909v = null;
            g22.f24910w = null;
        }
        G2 g23 = fq.f24801c;
        int i = 0;
        AbstractC2772Sd.H(((C3972u) g23.f24909v) == null);
        g23.f24907n = 0L;
        g23.f24908u = 65536L;
        G2 g24 = fq.f24801c;
        fq.f24802d = g24;
        fq.f24803e = g24;
        fq.f24804f = 0L;
        interfaceC4026v.o();
        this.f25315o = 0;
        this.f25316p = 0;
        this.f25317q = 0;
        this.f25318r = 0;
        this.f25323w = -1;
        this.f25324x = -1;
        this.f25326z = true;
        this.f25319s = Long.MIN_VALUE;
        this.f25321u = Long.MIN_VALUE;
        this.f25322v = Long.MIN_VALUE;
        this.f25325y = false;
        while (true) {
            c3493l5 = this.f25304c;
            sparseArray = (SparseArray) c3493l5.f31708u;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C3084dP) c3493l5.f31709v).mo1a(sparseArray.valueAt(i));
            i++;
        }
        c3493l5.f31707n = -1;
        sparseArray.clear();
        if (z3) {
            this.f25299B = null;
            this.f25298A = true;
            this.f25300C = true;
        }
    }

    public final synchronized DP l() {
        if (this.f25298A) {
            return null;
        }
        return this.f25299B;
    }

    public final synchronized boolean m(boolean z3) {
        int i;
        int i6 = this.f25316p;
        int i9 = this.f25318r;
        int i10 = i6 + i9;
        int i11 = this.f25323w;
        boolean z6 = true;
        if (i11 != -1 && i10 >= i11) {
            return true;
        }
        if (i9 != this.f25315o) {
            if (!(i11 == -1 && (i = this.f25324x) != -1 && i6 + i9 >= i)) {
                if (((GQ) this.f25304c.d(i10)).f24976a != this.f25307f) {
                    return true;
                }
                int j6 = j(this.f25318r);
                if (this.f25308g != null) {
                    int i12 = this.f25312l[j6];
                    z6 = false;
                }
                return z6;
            }
        }
        if (!z3 && !this.f25325y) {
            DP dp = this.f25299B;
            if (dp == null) {
                z6 = false;
            } else if (dp == this.f25307f) {
                return false;
            }
        }
        return z6;
    }

    public final synchronized boolean n(long j6, boolean z3) {
        long min;
        HQ hq;
        long j9;
        int h9;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f25318r = 0;
                        FQ fq = this.f25302a;
                        fq.f24802d = fq.f24801c;
                        int j10 = j(0);
                        long j11 = this.f25320t;
                        if (j11 != Long.MIN_VALUE) {
                            try {
                                min = Math.min(this.f25322v, j11);
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                throw th2;
                            }
                        } else {
                            min = this.f25322v;
                        }
                        int i = this.f25318r;
                        int i6 = this.f25315o;
                        if ((i != i6) && j6 >= this.f25313m[j10]) {
                            if (j6 > min) {
                                if (z3) {
                                    z3 = true;
                                }
                            }
                            if (this.f25300C) {
                                h9 = i6 - i;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= h9) {
                                        hq = this;
                                        j9 = j6;
                                        if (!z3) {
                                            h9 = -1;
                                        }
                                    } else {
                                        if (this.f25313m[j10] >= j6) {
                                            hq = this;
                                            j9 = j6;
                                            h9 = i9;
                                            break;
                                        }
                                        j10++;
                                        if (j10 == this.f25309h) {
                                            j10 = 0;
                                        }
                                        i9++;
                                    }
                                }
                            } else {
                                int i10 = i6 - i;
                                hq = this;
                                j9 = j6;
                                h9 = hq.h(j10, i10, j9, true);
                            }
                            if (h9 == -1) {
                                return false;
                            }
                            hq.f25319s = j9;
                            hq.f25318r += h9;
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
        FQ fq = this.f25302a;
        synchronized (this) {
            int i6 = this.f25315o;
            i = i6 == 0 ? -1L : i(i6);
        }
        fq.a(i);
    }
}
