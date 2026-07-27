package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.e.m;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7836a = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int f7844j;

    /* renamed from: k, reason: collision with root package name */
    private int f7845k;

    /* renamed from: l, reason: collision with root package name */
    private int f7846l;

    /* renamed from: m, reason: collision with root package name */
    private int f7847m;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f7852r;

    /* renamed from: s, reason: collision with root package name */
    private int f7853s;

    /* renamed from: b, reason: collision with root package name */
    private int f7837b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private int[] f7838c = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    private long[] f7839d = new long[1000];

    /* renamed from: g, reason: collision with root package name */
    private long[] f7842g = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    private int[] f7841f = new int[1000];

    /* renamed from: e, reason: collision with root package name */
    private int[] f7840e = new int[1000];

    /* renamed from: h, reason: collision with root package name */
    private m.a[] f7843h = new m.a[1000];
    private com.anythink.basead.exoplayer.m[] i = new com.anythink.basead.exoplayer.m[1000];

    /* renamed from: n, reason: collision with root package name */
    private long f7848n = Long.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    private long f7849o = Long.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7851q = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7850p = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f7854a;

        /* renamed from: b, reason: collision with root package name */
        public long f7855b;

        /* renamed from: c, reason: collision with root package name */
        public m.a f7856c;
    }

    public final void a() {
        this.f7844j = 0;
        this.f7845k = 0;
        this.f7846l = 0;
        this.f7847m = 0;
        this.f7850p = true;
        this.f7848n = Long.MIN_VALUE;
        this.f7849o = Long.MIN_VALUE;
    }

    public final int b() {
        return this.f7845k + this.f7844j;
    }

    public final int c() {
        return this.f7845k;
    }

    public final int d() {
        return this.f7845k + this.f7847m;
    }

    public final int e() {
        return f() ? this.f7838c[f(this.f7847m)] : this.f7853s;
    }

    public final synchronized boolean f() {
        return this.f7847m != this.f7844j;
    }

    public final synchronized com.anythink.basead.exoplayer.m g() {
        if (this.f7851q) {
            return null;
        }
        return this.f7852r;
    }

    public final synchronized long h() {
        return this.f7849o;
    }

    public final synchronized long i() {
        if (this.f7844j == 0) {
            return Long.MIN_VALUE;
        }
        return this.f7842g[this.f7846l];
    }

    public final synchronized void j() {
        this.f7847m = 0;
    }

    public final synchronized int k() {
        int i;
        int i6 = this.f7844j;
        i = i6 - this.f7847m;
        this.f7847m = i6;
        return i;
    }

    public final synchronized long l() {
        int i = this.f7847m;
        if (i == 0) {
            return -1L;
        }
        return d(i);
    }

    public final synchronized long m() {
        int i = this.f7844j;
        if (i == 0) {
            return -1L;
        }
        return d(i);
    }

    private long d(int i) {
        this.f7848n = Math.max(this.f7848n, e(i));
        int i6 = this.f7844j - i;
        this.f7844j = i6;
        this.f7845k += i;
        int i9 = this.f7846l + i;
        this.f7846l = i9;
        int i10 = this.f7837b;
        if (i9 >= i10) {
            this.f7846l = i9 - i10;
        }
        int i11 = this.f7847m - i;
        this.f7847m = i11;
        if (i11 < 0) {
            this.f7847m = 0;
        }
        if (i6 != 0) {
            return this.f7839d[this.f7846l];
        }
        int i12 = this.f7846l;
        if (i12 != 0) {
            i10 = i12;
        }
        return this.f7839d[i10 - 1] + this.f7840e[r2];
    }

    private int f(int i) {
        int i6 = this.f7846l + i;
        int i9 = this.f7837b;
        return i6 < i9 ? i6 : i6 - i9;
    }

    public final void b(int i) {
        this.f7853s = i;
    }

    public final synchronized boolean c(int i) {
        int i6 = this.f7845k;
        if (i6 > i || i > this.f7844j + i6) {
            return false;
        }
        this.f7847m = i - i6;
        return true;
    }

    private synchronized void b(long j6) {
        this.f7849o = Math.max(this.f7849o, j6);
    }

    private long e(int i) {
        long j6 = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int f3 = f(i - 1);
        for (int i6 = 0; i6 < i; i6++) {
            j6 = Math.max(j6, this.f7842g[f3]);
            if ((this.f7841f[f3] & 1) != 0) {
                break;
            }
            f3--;
            if (f3 == -1) {
                f3 = this.f7837b - 1;
            }
        }
        return j6;
    }

    public final long a(int i) {
        int b9 = b() - i;
        com.anythink.basead.exoplayer.k.a.a(b9 >= 0 && b9 <= this.f7844j - this.f7847m);
        int i6 = this.f7844j - b9;
        this.f7844j = i6;
        this.f7849o = Math.max(this.f7848n, e(i6));
        int i9 = this.f7844j;
        if (i9 == 0) {
            return 0L;
        }
        return this.f7839d[f(i9 - 1)] + this.f7840e[r6];
    }

    public final synchronized int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3, boolean z6, com.anythink.basead.exoplayer.m mVar, a aVar) {
        if (!f()) {
            if (z6) {
                eVar.a(4);
                return -4;
            }
            com.anythink.basead.exoplayer.m mVar2 = this.f7852r;
            if (mVar2 == null || (!z3 && mVar2 == mVar)) {
                return -3;
            }
            nVar.f8683a = mVar2;
            return -5;
        }
        int f3 = f(this.f7847m);
        if (!z3 && this.i[f3] == mVar) {
            if (eVar.f()) {
                return -3;
            }
            eVar.f6743f = this.f7842g[f3];
            eVar.a(this.f7841f[f3]);
            aVar.f7854a = this.f7840e[f3];
            aVar.f7855b = this.f7839d[f3];
            aVar.f7856c = this.f7843h[f3];
            this.f7847m++;
            return -4;
        }
        nVar.f8683a = this.i[f3];
        return -5;
    }

    public final synchronized int a(long j6, boolean z3) {
        try {
            try {
                int f3 = f(this.f7847m);
                if (!f() || j6 < this.f7842g[f3] || (j6 > this.f7849o && !z3)) {
                    return -1;
                }
                int a9 = a(f3, this.f7844j - this.f7847m, j6, true);
                if (a9 == -1) {
                    return -1;
                }
                this.f7847m += a9;
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

    public final synchronized long a(long j6, boolean z3, boolean z6) {
        Throwable th;
        try {
            try {
                int i = this.f7844j;
                if (i != 0) {
                    long[] jArr = this.f7842g;
                    int i6 = this.f7846l;
                    if (j6 >= jArr[i6]) {
                        if (z6) {
                            try {
                                int i9 = this.f7847m;
                                if (i9 != i) {
                                    i = i9 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int a9 = a(i6, i, j6, z3);
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
            this.f7851q = true;
            return false;
        }
        this.f7851q = false;
        if (com.anythink.basead.exoplayer.k.af.a(mVar, this.f7852r)) {
            return false;
        }
        this.f7852r = mVar;
        return true;
    }

    public final synchronized void a(long j6, int i, long j9, int i6, m.a aVar) {
        try {
            if (this.f7850p) {
                if ((i & 1) == 0) {
                    return;
                } else {
                    this.f7850p = false;
                }
            }
            com.anythink.basead.exoplayer.k.a.b(!this.f7851q);
            b(j6);
            int f3 = f(this.f7844j);
            this.f7842g[f3] = j6;
            long[] jArr = this.f7839d;
            jArr[f3] = j9;
            this.f7840e[f3] = i6;
            this.f7841f[f3] = i;
            this.f7843h[f3] = aVar;
            this.i[f3] = this.f7852r;
            this.f7838c[f3] = this.f7853s;
            int i9 = this.f7844j + 1;
            this.f7844j = i9;
            int i10 = this.f7837b;
            if (i9 == i10) {
                int i11 = i10 + 1000;
                int[] iArr = new int[i11];
                long[] jArr2 = new long[i11];
                long[] jArr3 = new long[i11];
                int[] iArr2 = new int[i11];
                int[] iArr3 = new int[i11];
                m.a[] aVarArr = new m.a[i11];
                com.anythink.basead.exoplayer.m[] mVarArr = new com.anythink.basead.exoplayer.m[i11];
                int i12 = this.f7846l;
                int i13 = i10 - i12;
                System.arraycopy(jArr, i12, jArr2, 0, i13);
                System.arraycopy(this.f7842g, this.f7846l, jArr3, 0, i13);
                System.arraycopy(this.f7841f, this.f7846l, iArr2, 0, i13);
                System.arraycopy(this.f7840e, this.f7846l, iArr3, 0, i13);
                System.arraycopy(this.f7843h, this.f7846l, aVarArr, 0, i13);
                System.arraycopy(this.i, this.f7846l, mVarArr, 0, i13);
                System.arraycopy(this.f7838c, this.f7846l, iArr, 0, i13);
                int i14 = this.f7846l;
                System.arraycopy(this.f7839d, 0, jArr2, i13, i14);
                System.arraycopy(this.f7842g, 0, jArr3, i13, i14);
                System.arraycopy(this.f7841f, 0, iArr2, i13, i14);
                System.arraycopy(this.f7840e, 0, iArr3, i13, i14);
                System.arraycopy(this.f7843h, 0, aVarArr, i13, i14);
                System.arraycopy(this.i, 0, mVarArr, i13, i14);
                System.arraycopy(this.f7838c, 0, iArr, i13, i14);
                this.f7839d = jArr2;
                this.f7842g = jArr3;
                this.f7841f = iArr2;
                this.f7840e = iArr3;
                this.f7843h = aVarArr;
                this.i = mVarArr;
                this.f7838c = iArr;
                this.f7846l = 0;
                this.f7844j = this.f7837b;
                this.f7837b = i11;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(long j6) {
        if (this.f7844j == 0) {
            return j6 > this.f7848n;
        }
        if (Math.max(this.f7848n, e(this.f7847m)) >= j6) {
            return false;
        }
        int i = this.f7844j;
        int f3 = f(i - 1);
        while (i > this.f7847m && this.f7842g[f3] >= j6) {
            i--;
            f3--;
            if (f3 == -1) {
                f3 = this.f7837b - 1;
            }
        }
        a(this.f7845k + i);
        return true;
    }

    private int a(int i, int i6, long j6, boolean z3) {
        int i9 = -1;
        for (int i10 = 0; i10 < i6 && this.f7842g[i] <= j6; i10++) {
            if (!z3 || (this.f7841f[i] & 1) != 0) {
                i9 = i10;
            }
            i++;
            if (i == this.f7837b) {
                i = 0;
            }
        }
        return i9;
    }
}
