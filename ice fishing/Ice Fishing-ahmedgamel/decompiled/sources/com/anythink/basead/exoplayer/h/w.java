package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.e.m;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8622a = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int f8630j;

    /* renamed from: k, reason: collision with root package name */
    private int f8631k;

    /* renamed from: l, reason: collision with root package name */
    private int f8632l;

    /* renamed from: m, reason: collision with root package name */
    private int f8633m;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f8638r;

    /* renamed from: s, reason: collision with root package name */
    private int f8639s;

    /* renamed from: b, reason: collision with root package name */
    private int f8623b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private int[] f8624c = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    private long[] f8625d = new long[1000];

    /* renamed from: g, reason: collision with root package name */
    private long[] f8628g = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    private int[] f8627f = new int[1000];

    /* renamed from: e, reason: collision with root package name */
    private int[] f8626e = new int[1000];

    /* renamed from: h, reason: collision with root package name */
    private m.a[] f8629h = new m.a[1000];
    private com.anythink.basead.exoplayer.m[] i = new com.anythink.basead.exoplayer.m[1000];

    /* renamed from: n, reason: collision with root package name */
    private long f8634n = Long.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    private long f8635o = Long.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8637q = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8636p = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8640a;

        /* renamed from: b, reason: collision with root package name */
        public long f8641b;

        /* renamed from: c, reason: collision with root package name */
        public m.a f8642c;
    }

    public final void a() {
        this.f8630j = 0;
        this.f8631k = 0;
        this.f8632l = 0;
        this.f8633m = 0;
        this.f8636p = true;
        this.f8634n = Long.MIN_VALUE;
        this.f8635o = Long.MIN_VALUE;
    }

    public final int b() {
        return this.f8631k + this.f8630j;
    }

    public final int c() {
        return this.f8631k;
    }

    public final int d() {
        return this.f8631k + this.f8633m;
    }

    public final int e() {
        return f() ? this.f8624c[f(this.f8633m)] : this.f8639s;
    }

    public final synchronized boolean f() {
        return this.f8633m != this.f8630j;
    }

    public final synchronized com.anythink.basead.exoplayer.m g() {
        if (this.f8637q) {
            return null;
        }
        return this.f8638r;
    }

    public final synchronized long h() {
        return this.f8635o;
    }

    public final synchronized long i() {
        if (this.f8630j == 0) {
            return Long.MIN_VALUE;
        }
        return this.f8628g[this.f8632l];
    }

    public final synchronized void j() {
        this.f8633m = 0;
    }

    public final synchronized int k() {
        int i;
        int i4 = this.f8630j;
        i = i4 - this.f8633m;
        this.f8633m = i4;
        return i;
    }

    public final synchronized long l() {
        int i = this.f8633m;
        if (i == 0) {
            return -1L;
        }
        return d(i);
    }

    public final synchronized long m() {
        int i = this.f8630j;
        if (i == 0) {
            return -1L;
        }
        return d(i);
    }

    private long d(int i) {
        this.f8634n = Math.max(this.f8634n, e(i));
        int i4 = this.f8630j - i;
        this.f8630j = i4;
        this.f8631k += i;
        int i6 = this.f8632l + i;
        this.f8632l = i6;
        int i9 = this.f8623b;
        if (i6 >= i9) {
            this.f8632l = i6 - i9;
        }
        int i10 = this.f8633m - i;
        this.f8633m = i10;
        if (i10 < 0) {
            this.f8633m = 0;
        }
        if (i4 != 0) {
            return this.f8625d[this.f8632l];
        }
        int i11 = this.f8632l;
        if (i11 != 0) {
            i9 = i11;
        }
        return this.f8625d[i9 - 1] + this.f8626e[r2];
    }

    private int f(int i) {
        int i4 = this.f8632l + i;
        int i6 = this.f8623b;
        return i4 < i6 ? i4 : i4 - i6;
    }

    public final void b(int i) {
        this.f8639s = i;
    }

    public final synchronized boolean c(int i) {
        int i4 = this.f8631k;
        if (i4 > i || i > this.f8630j + i4) {
            return false;
        }
        this.f8633m = i - i4;
        return true;
    }

    private synchronized void b(long j6) {
        this.f8635o = Math.max(this.f8635o, j6);
    }

    private long e(int i) {
        long j6 = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int f2 = f(i - 1);
        for (int i4 = 0; i4 < i; i4++) {
            j6 = Math.max(j6, this.f8628g[f2]);
            if ((this.f8627f[f2] & 1) != 0) {
                break;
            }
            f2--;
            if (f2 == -1) {
                f2 = this.f8623b - 1;
            }
        }
        return j6;
    }

    public final long a(int i) {
        int b9 = b() - i;
        com.anythink.basead.exoplayer.k.a.a(b9 >= 0 && b9 <= this.f8630j - this.f8633m);
        int i4 = this.f8630j - b9;
        this.f8630j = i4;
        this.f8635o = Math.max(this.f8634n, e(i4));
        int i6 = this.f8630j;
        if (i6 == 0) {
            return 0L;
        }
        return this.f8625d[f(i6 - 1)] + this.f8626e[r6];
    }

    public final synchronized int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6, boolean z9, com.anythink.basead.exoplayer.m mVar, a aVar) {
        if (!f()) {
            if (z9) {
                eVar.a(4);
                return -4;
            }
            com.anythink.basead.exoplayer.m mVar2 = this.f8638r;
            if (mVar2 == null || (!z6 && mVar2 == mVar)) {
                return -3;
            }
            nVar.f9469a = mVar2;
            return -5;
        }
        int f2 = f(this.f8633m);
        if (!z6 && this.i[f2] == mVar) {
            if (eVar.f()) {
                return -3;
            }
            eVar.f7529f = this.f8628g[f2];
            eVar.a(this.f8627f[f2]);
            aVar.f8640a = this.f8626e[f2];
            aVar.f8641b = this.f8625d[f2];
            aVar.f8642c = this.f8629h[f2];
            this.f8633m++;
            return -4;
        }
        nVar.f9469a = this.i[f2];
        return -5;
    }

    public final synchronized int a(long j6, boolean z6) {
        try {
            try {
                int f2 = f(this.f8633m);
                if (!f() || j6 < this.f8628g[f2] || (j6 > this.f8635o && !z6)) {
                    return -1;
                }
                int a9 = a(f2, this.f8630j - this.f8633m, j6, true);
                if (a9 == -1) {
                    return -1;
                }
                this.f8633m += a9;
                return a9;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized long a(long j6, boolean z6, boolean z9) {
        Throwable th;
        try {
            try {
                int i = this.f8630j;
                if (i != 0) {
                    long[] jArr = this.f8628g;
                    int i4 = this.f8632l;
                    if (j6 >= jArr[i4]) {
                        if (z9) {
                            try {
                                int i6 = this.f8633m;
                                if (i6 != i) {
                                    i = i6 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int a9 = a(i4, i, j6, z6);
                        if (a9 == -1) {
                            return -1L;
                        }
                        return d(a9);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized boolean a(com.anythink.basead.exoplayer.m mVar) {
        if (mVar == null) {
            this.f8637q = true;
            return false;
        }
        this.f8637q = false;
        if (com.anythink.basead.exoplayer.k.af.a(mVar, this.f8638r)) {
            return false;
        }
        this.f8638r = mVar;
        return true;
    }

    public final synchronized void a(long j6, int i, long j9, int i4, m.a aVar) {
        try {
            if (this.f8636p) {
                if ((i & 1) == 0) {
                    return;
                } else {
                    this.f8636p = false;
                }
            }
            com.anythink.basead.exoplayer.k.a.b(!this.f8637q);
            b(j6);
            int f2 = f(this.f8630j);
            this.f8628g[f2] = j6;
            long[] jArr = this.f8625d;
            jArr[f2] = j9;
            this.f8626e[f2] = i4;
            this.f8627f[f2] = i;
            this.f8629h[f2] = aVar;
            this.i[f2] = this.f8638r;
            this.f8624c[f2] = this.f8639s;
            int i6 = this.f8630j + 1;
            this.f8630j = i6;
            int i9 = this.f8623b;
            if (i6 == i9) {
                int i10 = i9 + 1000;
                int[] iArr = new int[i10];
                long[] jArr2 = new long[i10];
                long[] jArr3 = new long[i10];
                int[] iArr2 = new int[i10];
                int[] iArr3 = new int[i10];
                m.a[] aVarArr = new m.a[i10];
                com.anythink.basead.exoplayer.m[] mVarArr = new com.anythink.basead.exoplayer.m[i10];
                int i11 = this.f8632l;
                int i12 = i9 - i11;
                System.arraycopy(jArr, i11, jArr2, 0, i12);
                System.arraycopy(this.f8628g, this.f8632l, jArr3, 0, i12);
                System.arraycopy(this.f8627f, this.f8632l, iArr2, 0, i12);
                System.arraycopy(this.f8626e, this.f8632l, iArr3, 0, i12);
                System.arraycopy(this.f8629h, this.f8632l, aVarArr, 0, i12);
                System.arraycopy(this.i, this.f8632l, mVarArr, 0, i12);
                System.arraycopy(this.f8624c, this.f8632l, iArr, 0, i12);
                int i13 = this.f8632l;
                System.arraycopy(this.f8625d, 0, jArr2, i12, i13);
                System.arraycopy(this.f8628g, 0, jArr3, i12, i13);
                System.arraycopy(this.f8627f, 0, iArr2, i12, i13);
                System.arraycopy(this.f8626e, 0, iArr3, i12, i13);
                System.arraycopy(this.f8629h, 0, aVarArr, i12, i13);
                System.arraycopy(this.i, 0, mVarArr, i12, i13);
                System.arraycopy(this.f8624c, 0, iArr, i12, i13);
                this.f8625d = jArr2;
                this.f8628g = jArr3;
                this.f8627f = iArr2;
                this.f8626e = iArr3;
                this.f8629h = aVarArr;
                this.i = mVarArr;
                this.f8624c = iArr;
                this.f8632l = 0;
                this.f8630j = this.f8623b;
                this.f8623b = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(long j6) {
        if (this.f8630j == 0) {
            return j6 > this.f8634n;
        }
        if (Math.max(this.f8634n, e(this.f8633m)) >= j6) {
            return false;
        }
        int i = this.f8630j;
        int f2 = f(i - 1);
        while (i > this.f8633m && this.f8628g[f2] >= j6) {
            i--;
            f2--;
            if (f2 == -1) {
                f2 = this.f8623b - 1;
            }
        }
        a(this.f8631k + i);
        return true;
    }

    private int a(int i, int i4, long j6, boolean z6) {
        int i6 = -1;
        for (int i9 = 0; i9 < i4 && this.f8628g[i] <= j6; i9++) {
            if (!z6 || (this.f8627f[i] & 1) != 0) {
                i6 = i9;
            }
            i++;
            if (i == this.f8623b) {
                i = 0;
            }
        }
        return i6;
    }
}
