package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class KQ implements InterfaceC3566m1 {

    /* renamed from: B, reason: collision with root package name */
    public DP f26676B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f26678D;

    /* renamed from: a, reason: collision with root package name */
    public final IQ f26679a;

    /* renamed from: d, reason: collision with root package name */
    public final V2 f26682d;

    /* renamed from: e, reason: collision with root package name */
    public FQ f26683e;

    /* renamed from: f, reason: collision with root package name */
    public DP f26684f;

    /* renamed from: g, reason: collision with root package name */
    public C3128du f26685g;

    /* renamed from: o, reason: collision with root package name */
    public int f26692o;

    /* renamed from: p, reason: collision with root package name */
    public int f26693p;

    /* renamed from: q, reason: collision with root package name */
    public int f26694q;

    /* renamed from: r, reason: collision with root package name */
    public int f26695r;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26702y;

    /* renamed from: b, reason: collision with root package name */
    public final Z1.b f26680b = new Z1.b();

    /* renamed from: h, reason: collision with root package name */
    public int f26686h = 1000;
    public long[] i = new long[1000];

    /* renamed from: j, reason: collision with root package name */
    public long[] f26687j = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public long[] f26690m = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f26689l = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    public int[] f26688k = new int[1000];

    /* renamed from: n, reason: collision with root package name */
    public C3512l1[] f26691n = new C3512l1[1000];

    /* renamed from: c, reason: collision with root package name */
    public final C3516l5 f26681c = new C3516l5(9, false);

    /* renamed from: s, reason: collision with root package name */
    public long f26696s = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f26698u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f26699v = Long.MIN_VALUE;

    /* renamed from: A, reason: collision with root package name */
    public boolean f26675A = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26703z = true;

    /* renamed from: C, reason: collision with root package name */
    public boolean f26677C = true;

    /* renamed from: t, reason: collision with root package name */
    public long f26697t = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public int f26700w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f26701x = -1;

    public KQ(InterfaceC4049v interfaceC4049v, V2 v22, AP ap) {
        this.f26682d = v22;
        this.f26679a = new IQ(interfaceC4049v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final int b(InterfaceC4073vN interfaceC4073vN, int i, boolean z6) {
        IQ iq = this.f26679a;
        int b9 = iq.b(i);
        G2 g22 = iq.f26262e;
        C3995u c3995u = (C3995u) g22.f25699v;
        byte[] bArr = c3995u.f35219a;
        long j6 = iq.f26263f - g22.f25697n;
        c3995u.getClass();
        int r9 = interfaceC4073vN.r(bArr, (int) j6, b9);
        if (r9 == -1) {
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
        long j9 = iq.f26263f + r9;
        iq.f26263f = j9;
        G2 g23 = iq.f26262e;
        if (j9 == g23.f25698u) {
            iq.f26262e = (G2) g23.f25700w;
        }
        return r9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (((com.google.android.gms.internal.ads.JQ) ((android.util.SparseArray) r0.f32488u).valueAt(r2.size() - 1)).f26438a.equals(r17.f26676B) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j6, int i, int i4, int i6, C3512l1 c3512l1) {
        int i9;
        int i10;
        if (this.f26703z) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f26703z = false;
            }
        }
        if (this.f26677C) {
            if (j6 < this.f26696s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.f26678D) {
                    AbstractC2991bG.y("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f26676B)));
                    this.f26678D = true;
                }
                i9 = i | 1;
                long j9 = (this.f26679a.f26263f - i4) - i6;
                synchronized (this) {
                    try {
                        int i11 = this.f26692o;
                        if (i11 > 0) {
                            int j10 = j(i11 - 1);
                            AbstractC2792Sd.i(this.f26687j[j10] + ((long) this.f26688k[j10]) <= j9);
                        }
                        int i12 = 536870912 & i9;
                        this.f26702y = i12 != 0;
                        this.f26699v = Math.max(this.f26699v, j6);
                        int i13 = this.f26693p;
                        int i14 = this.f26692o;
                        int i15 = i13 + i14;
                        long j11 = this.f26697t;
                        if (j11 != Long.MIN_VALUE && this.f26700w == -1) {
                            if (j6 >= j11) {
                                int i16 = this.f26701x;
                                if (i16 == -1) {
                                    this.f26701x = i15;
                                    i16 = i15;
                                }
                                int i17 = (i15 - i16) + 1;
                                int i18 = i9 & 1;
                                DP dp = this.f26676B;
                                int i19 = 16;
                                if (dp != null && (i10 = dp.f25178q) != -1) {
                                    i19 = i10;
                                }
                                if (i17 >= i19 + 1 || i18 != 0 || i12 != 0) {
                                    this.f26700w = i16;
                                }
                            }
                            this.f26701x = -1;
                        }
                        int j12 = j(i14);
                        this.f26690m[j12] = j6;
                        this.f26687j[j12] = j9;
                        this.f26688k[j12] = i4;
                        this.f26689l[j12] = i9;
                        this.f26691n[j12] = c3512l1;
                        this.i[j12] = 0;
                        C3516l5 c3516l5 = this.f26681c;
                        if (!(((SparseArray) c3516l5.f32488u).size() == 0)) {
                        }
                        DP dp2 = this.f26676B;
                        if (dp2 == null) {
                            throw null;
                        }
                        int i20 = this.f26693p + this.f26692o;
                        JQ jq = new JQ(dp2);
                        int i21 = c3516l5.f32487n;
                        SparseArray sparseArray = (SparseArray) c3516l5.f32488u;
                        if (i21 == -1) {
                            AbstractC2792Sd.H(sparseArray.size() == 0);
                            c3516l5.f32487n = 0;
                        }
                        if (sparseArray.size() > 0) {
                            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            AbstractC2792Sd.i(i20 >= keyAt);
                            if (keyAt == i20) {
                                ((C3107dP) c3516l5.f32489v).mo5a(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i20, jq);
                        int i22 = this.f26692o + 1;
                        this.f26692o = i22;
                        int i23 = this.f26686h;
                        if (i22 == i23) {
                            int i24 = i23 + 1000;
                            long[] jArr = new long[i24];
                            long[] jArr2 = new long[i24];
                            long[] jArr3 = new long[i24];
                            int[] iArr = new int[i24];
                            int[] iArr2 = new int[i24];
                            C3512l1[] c3512l1Arr = new C3512l1[i24];
                            int i25 = this.f26694q;
                            int i26 = i23 - i25;
                            System.arraycopy(this.f26687j, i25, jArr2, 0, i26);
                            System.arraycopy(this.f26690m, this.f26694q, jArr3, 0, i26);
                            System.arraycopy(this.f26689l, this.f26694q, iArr, 0, i26);
                            System.arraycopy(this.f26688k, this.f26694q, iArr2, 0, i26);
                            System.arraycopy(this.f26691n, this.f26694q, c3512l1Arr, 0, i26);
                            System.arraycopy(this.i, this.f26694q, jArr, 0, i26);
                            int i27 = this.f26694q;
                            System.arraycopy(this.f26687j, 0, jArr2, i26, i27);
                            System.arraycopy(this.f26690m, 0, jArr3, i26, i27);
                            System.arraycopy(this.f26689l, 0, iArr, i26, i27);
                            System.arraycopy(this.f26688k, 0, iArr2, i26, i27);
                            System.arraycopy(this.f26691n, 0, c3512l1Arr, i26, i27);
                            System.arraycopy(this.i, 0, jArr, i26, i27);
                            this.f26687j = jArr2;
                            this.f26690m = jArr3;
                            this.f26689l = iArr;
                            this.f26688k = iArr2;
                            this.f26691n = c3512l1Arr;
                            this.i = jArr;
                            this.f26694q = 0;
                            this.f26686h = i24;
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        i9 = i;
        long j92 = (this.f26679a.f26263f - i4) - i6;
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void e(DP dp) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            try {
                this.f26675A = false;
                if (!Objects.equals(dp, this.f26676B)) {
                    C3516l5 c3516l5 = this.f26681c;
                    if (!(((SparseArray) c3516l5.f32488u).size() == 0)) {
                        if (((JQ) ((SparseArray) c3516l5.f32488u).valueAt(r2.size() - 1)).f26438a.equals(dp)) {
                            this.f26676B = ((JQ) ((SparseArray) c3516l5.f32488u).valueAt(r6.size() - 1)).f26438a;
                            boolean z9 = this.f26677C;
                            DP dp2 = this.f26676B;
                            String str = dp2.f25176o;
                            this.f26677C = z9 & (H4.f(str) != 1 && H4.d(str, dp2.f25172k));
                            this.f26678D = false;
                            z6 = true;
                        }
                    }
                    this.f26676B = dp;
                    boolean z92 = this.f26677C;
                    DP dp22 = this.f26676B;
                    String str2 = dp22.f25176o;
                    this.f26677C = z92 & (H4.f(str2) != 1 && H4.d(str2, dp22.f25172k));
                    this.f26678D = false;
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FQ fq = this.f26683e;
        if (fq == null || !z6) {
            return;
        }
        fq.f25564H.post(fq.f25562F);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3566m1
    public final void f(Cr cr, int i, int i4) {
        while (true) {
            IQ iq = this.f26679a;
            if (i <= 0) {
                iq.getClass();
                return;
            }
            int b9 = iq.b(i);
            G2 g22 = iq.f26262e;
            C3995u c3995u = (C3995u) g22.f25699v;
            byte[] bArr = c3995u.f35219a;
            long j6 = iq.f26263f - g22.f25697n;
            c3995u.getClass();
            cr.H(bArr, (int) j6, b9);
            i -= b9;
            long j9 = iq.f26263f + b9;
            iq.f26263f = j9;
            G2 g23 = iq.f26262e;
            if (j9 == g23.f25698u) {
                iq.f26262e = (G2) g23.f25700w;
            }
        }
    }

    public final void g(DP dp, S0.l lVar) {
        DP dp2 = this.f26684f;
        EO eo = dp2 == null ? null : dp2.f25180s;
        this.f26684f = dp;
        EO eo2 = dp.f25180s;
        this.f26682d.getClass();
        EO eo3 = dp.f25180s;
        int i = eo3 != null ? 1 : 0;
        C3322hP c3322hP = new C3322hP(dp);
        c3322hP.f31545O = i;
        lVar.f2927v = new DP(c3322hP);
        lVar.f2926u = this.f26685g;
        if (dp2 == null || !Objects.equals(eo, eo2)) {
            C3128du c3128du = eo3 != null ? new C3128du(13, new C4237yP(new CP())) : null;
            this.f26685g = c3128du;
            lVar.f2926u = c3128du;
        }
    }

    public final int h(int i, int i4, long j6, boolean z6) {
        int i6 = -1;
        for (int i9 = 0; i9 < i4; i9++) {
            long j9 = this.f26690m[i];
            if (j9 > j6) {
                break;
            }
            if (!z6 || (this.f26689l[i] & 1) != 0) {
                if (j9 == j6) {
                    return i9;
                }
                i6 = i9;
            }
            i++;
            if (i == this.f26686h) {
                i = 0;
            }
        }
        return i6;
    }

    public final long i(int i) {
        long j6 = this.f26698u;
        long j9 = Long.MIN_VALUE;
        int i4 = 0;
        if (i != 0) {
            int j10 = j(i - 1);
            for (int i6 = 0; i6 < i; i6++) {
                j9 = Math.max(j9, this.f26690m[j10]);
                if ((this.f26689l[j10] & 1) != 0) {
                    break;
                }
                j10--;
                if (j10 == -1) {
                    j10 = this.f26686h - 1;
                }
            }
        }
        this.f26698u = Math.max(j6, j9);
        this.f26692o -= i;
        int i9 = this.f26693p + i;
        this.f26693p = i9;
        int i10 = this.f26694q + i;
        this.f26694q = i10;
        int i11 = this.f26686h;
        if (i10 >= i11) {
            this.f26694q = i10 - i11;
        }
        int i12 = this.f26695r - i;
        this.f26695r = i12;
        if (i12 < 0) {
            this.f26695r = 0;
        }
        while (true) {
            C3516l5 c3516l5 = this.f26681c;
            SparseArray sparseArray = (SparseArray) c3516l5.f32488u;
            if (i4 >= sparseArray.size() - 1) {
                break;
            }
            int i13 = i4 + 1;
            if (i9 < sparseArray.keyAt(i13)) {
                break;
            }
            ((C3107dP) c3516l5.f32489v).mo5a(sparseArray.valueAt(i4));
            sparseArray.removeAt(i4);
            int i14 = c3516l5.f32487n;
            if (i14 > 0) {
                c3516l5.f32487n = i14 - 1;
            }
            i4 = i13;
        }
        if (this.f26692o != 0) {
            return this.f26687j[this.f26694q];
        }
        int i15 = this.f26694q;
        if (i15 == 0) {
            i15 = this.f26686h;
        }
        return this.f26687j[i15 - 1] + this.f26688k[r12];
    }

    public final int j(int i) {
        int i4 = this.f26694q + i;
        int i6 = this.f26686h;
        return i4 < i6 ? i4 : i4 - i6;
    }

    public final void k(boolean z6) {
        C3516l5 c3516l5;
        SparseArray sparseArray;
        IQ iq = this.f26679a;
        G2 g22 = iq.f26260c;
        C3995u c3995u = (C3995u) g22.f25699v;
        InterfaceC4049v interfaceC4049v = iq.f26258a;
        if (c3995u != null) {
            interfaceC4049v.q(g22);
            g22.f25699v = null;
            g22.f25700w = null;
        }
        G2 g23 = iq.f26260c;
        int i = 0;
        AbstractC2792Sd.H(((C3995u) g23.f25699v) == null);
        g23.f25697n = 0L;
        g23.f25698u = 65536L;
        G2 g24 = iq.f26260c;
        iq.f26261d = g24;
        iq.f26262e = g24;
        iq.f26263f = 0L;
        interfaceC4049v.o();
        this.f26692o = 0;
        this.f26693p = 0;
        this.f26694q = 0;
        this.f26695r = 0;
        this.f26700w = -1;
        this.f26701x = -1;
        this.f26703z = true;
        this.f26696s = Long.MIN_VALUE;
        this.f26698u = Long.MIN_VALUE;
        this.f26699v = Long.MIN_VALUE;
        this.f26702y = false;
        while (true) {
            c3516l5 = this.f26681c;
            sparseArray = (SparseArray) c3516l5.f32488u;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C3107dP) c3516l5.f32489v).mo5a(sparseArray.valueAt(i));
            i++;
        }
        c3516l5.f32487n = -1;
        sparseArray.clear();
        if (z6) {
            this.f26676B = null;
            this.f26675A = true;
            this.f26677C = true;
        }
    }

    public final synchronized DP l() {
        if (this.f26675A) {
            return null;
        }
        return this.f26676B;
    }

    public final synchronized boolean m(boolean z6) {
        int i;
        int i4 = this.f26693p;
        int i6 = this.f26695r;
        int i9 = i4 + i6;
        int i10 = this.f26700w;
        boolean z9 = true;
        if (i10 != -1 && i9 >= i10) {
            return true;
        }
        if (i6 != this.f26692o) {
            if (!(i10 == -1 && (i = this.f26701x) != -1 && i4 + i6 >= i)) {
                if (((JQ) this.f26681c.d(i9)).f26438a != this.f26684f) {
                    return true;
                }
                int j6 = j(this.f26695r);
                if (this.f26685g != null) {
                    int i11 = this.f26689l[j6];
                    z9 = false;
                }
                return z9;
            }
        }
        if (!z6 && !this.f26702y) {
            DP dp = this.f26676B;
            if (dp == null) {
                z9 = false;
            } else if (dp == this.f26684f) {
                return false;
            }
        }
        return z9;
    }

    public final synchronized boolean n(long j6, boolean z6) {
        long min;
        KQ kq;
        long j9;
        int h3;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f26695r = 0;
                        IQ iq = this.f26679a;
                        iq.f26261d = iq.f26260c;
                        int j10 = j(0);
                        long j11 = this.f26697t;
                        if (j11 != Long.MIN_VALUE) {
                            try {
                                min = Math.min(this.f26699v, j11);
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                throw th2;
                            }
                        } else {
                            min = this.f26699v;
                        }
                        int i = this.f26695r;
                        int i4 = this.f26692o;
                        if ((i != i4) && j6 >= this.f26690m[j10]) {
                            if (j6 > min) {
                                if (z6) {
                                    z6 = true;
                                }
                            }
                            if (this.f26677C) {
                                h3 = i4 - i;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= h3) {
                                        kq = this;
                                        j9 = j6;
                                        if (!z6) {
                                            h3 = -1;
                                        }
                                    } else {
                                        if (this.f26690m[j10] >= j6) {
                                            kq = this;
                                            j9 = j6;
                                            h3 = i6;
                                            break;
                                        }
                                        j10++;
                                        if (j10 == this.f26686h) {
                                            j10 = 0;
                                        }
                                        i6++;
                                    }
                                }
                            } else {
                                int i9 = i4 - i;
                                kq = this;
                                j9 = j6;
                                h3 = kq.h(j10, i9, j9, true);
                            }
                            if (h3 == -1) {
                                return false;
                            }
                            kq.f26696s = j9;
                            kq.f26695r += h3;
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
        IQ iq = this.f26679a;
        synchronized (this) {
            int i4 = this.f26692o;
            i = i4 == 0 ? -1L : i(i4);
        }
        iq.a(i);
    }
}
