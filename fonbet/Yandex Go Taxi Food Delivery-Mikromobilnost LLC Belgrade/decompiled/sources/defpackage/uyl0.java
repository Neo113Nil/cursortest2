package defpackage;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.Objects;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public class uyl0 implements g001 {
    public a A;
    public a B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final qyl0 a;
    public final qmm d;
    public final mmm e;
    public tyl0 f;
    public a g;
    public jmm h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final os7 b = new os7();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public f001[] o = new f001[1000];
    public final ant0 c = new ant0(new d7g0(17));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public uyl0(au1 au1Var, qmm qmmVar, mmm mmmVar) {
        this.d = qmmVar;
        this.e = mmmVar;
        this.a = new qyl0(au1Var);
    }

    public final void A(boolean z) {
        qyl0 qyl0Var = this.a;
        qyl0Var.a(qyl0Var.d);
        zer zerVar = qyl0Var.d;
        int i = qyl0Var.b;
        d6z.x(((zt1) zerVar.c) == null);
        zerVar.a = 0L;
        zerVar.b = i;
        zer zerVar2 = qyl0Var.d;
        qyl0Var.e = zerVar2;
        qyl0Var.f = zerVar2;
        qyl0Var.g = 0L;
        ((k4h) qyl0Var.a).c();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        ant0 ant0Var = this.c;
        SparseArray sparseArray = ant0Var.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ant0Var.c.accept(sparseArray.valueAt(i2));
        }
        ant0Var.a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean B(int i) {
        synchronized (this) {
            this.s = 0;
            qyl0 qyl0Var = this.a;
            qyl0Var.e = qyl0Var.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean C(long j, boolean z) {
        Throwable th;
        uyl0 uyl0Var;
        uyl0 uyl0Var2;
        long j2;
        int l;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                qyl0 qyl0Var = this.a;
                                qyl0Var.e = qyl0Var.d;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    uyl0Var = this;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                uyl0Var = this;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        uyl0Var = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int q = q(0);
            int i = this.s;
            int i2 = this.p;
            if (!(i != i2) || j < this.n[q] || (j > this.v && !z)) {
                return false;
            }
            if (this.D) {
                l = i2 - i;
                int i3 = 0;
                while (true) {
                    if (i3 < l) {
                        try {
                            if (this.n[q] >= j) {
                                l = i3;
                                break;
                            }
                            q++;
                            if (q == this.i) {
                                q = 0;
                            }
                            i3++;
                        } catch (Throwable th8) {
                            th = th8;
                            uyl0Var = this;
                            throw th;
                        }
                    } else if (!z) {
                        l = -1;
                    }
                }
                uyl0Var2 = this;
                j2 = j;
            } else {
                uyl0Var2 = this;
                j2 = j;
                l = uyl0Var2.l(q, i2 - i, j2, true);
            }
            if (l == -1) {
                return false;
            }
            uyl0Var2.t = j2;
            uyl0Var2.s += l;
            return true;
        } catch (Throwable th9) {
            th = th9;
            uyl0Var = this;
            th = th;
            throw th;
        }
    }

    public final synchronized void D(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    d6z.l(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        d6z.l(z);
        this.s += i;
    }

    @Override // defpackage.g001
    public final void a(ef90 ef90Var, int i, int i2) {
        while (true) {
            qyl0 qyl0Var = this.a;
            if (i <= 0) {
                qyl0Var.getClass();
                return;
            }
            int c = qyl0Var.c(i);
            zer zerVar = qyl0Var.f;
            zt1 zt1Var = (zt1) zerVar.c;
            ef90Var.i(((int) (qyl0Var.g - zerVar.a)) + zt1Var.b, c, zt1Var.a);
            i -= c;
            long j = qyl0Var.g + c;
            qyl0Var.g = j;
            zer zerVar2 = qyl0Var.f;
            if (j == zerVar2.b) {
                qyl0Var.f = (zer) zerVar2.w;
            }
        }
    }

    @Override // defpackage.g001
    public final int b(apg apgVar, int i, boolean z) {
        qyl0 qyl0Var = this.a;
        int c = qyl0Var.c(i);
        zer zerVar = qyl0Var.f;
        zt1 zt1Var = (zt1) zerVar.c;
        int read = apgVar.read(zt1Var.a, ((int) (qyl0Var.g - zerVar.a)) + zt1Var.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            ny61.b();
            return 0;
        }
        long j = qyl0Var.g + read;
        qyl0Var.g = j;
        zer zerVar2 = qyl0Var.f;
        if (j == zerVar2.b) {
            qyl0Var.f = (zer) zerVar2.w;
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0112, code lost:
    
        if (((defpackage.syl0) r10.valueAt(r10.size() - 1)).a.equals(r9.B) == false) goto L80;
     */
    @Override // defpackage.g001
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j, int i, int i2, int i3, f001 f001Var) {
        boolean z;
        if (this.z) {
            a aVar = this.A;
            d6z.z(aVar);
            d(aVar);
        }
        int i4 = i & 1;
        boolean z2 = i4 != 0;
        if (this.x) {
            if (!z2) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = j + this.F;
        if (this.D) {
            if (j2 < this.t) {
                return;
            }
            if (i4 == 0) {
                if (!this.E) {
                    lk91.j("Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i |= 1;
            }
        }
        if (this.G) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z = j2 > this.u;
                } else {
                    synchronized (this) {
                        long max = Math.max(this.u, o(this.s));
                        if (max >= j2) {
                            z = false;
                        } else {
                            j(this.q + e(j2));
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                return;
            } else {
                this.G = false;
            }
        }
        long j3 = (this.a.g - i2) - i3;
        synchronized (this) {
            try {
                int i5 = this.p;
                if (i5 > 0) {
                    int q = q(i5 - 1);
                    d6z.l(this.k[q] + ((long) this.l[q]) <= j3);
                }
                this.w = (536870912 & i) != 0;
                this.v = Math.max(this.v, j2);
                int q2 = q(this.p);
                this.n[q2] = j2;
                this.k[q2] = j3;
                this.l[q2] = i2;
                this.m[q2] = i;
                this.o[q2] = f001Var;
                this.j[q2] = this.C;
                if (!(this.c.b.size() == 0)) {
                    SparseArray sparseArray = this.c.b;
                }
                a aVar2 = this.B;
                aVar2.getClass();
                qmm qmmVar = this.d;
                pmm preacquireSession = qmmVar != null ? qmmVar.preacquireSession(this.e, aVar2) : pmm.Y1;
                ant0 ant0Var = this.c;
                int i6 = this.q + this.p;
                syl0 syl0Var = new syl0(aVar2, preacquireSession);
                SparseArray sparseArray2 = ant0Var.b;
                if (ant0Var.a == -1) {
                    d6z.x(sparseArray2.size() == 0);
                    ant0Var.a = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    d6z.l(i6 >= keyAt);
                    if (keyAt == i6) {
                        ant0Var.c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i6, syl0Var);
                int i7 = this.p + 1;
                this.p = i7;
                int i8 = this.i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    f001[] f001VarArr = new f001[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr2, 0, i11);
                    System.arraycopy(this.n, this.r, jArr3, 0, i11);
                    System.arraycopy(this.m, this.r, iArr, 0, i11);
                    System.arraycopy(this.l, this.r, iArr2, 0, i11);
                    System.arraycopy(this.o, this.r, f001VarArr, 0, i11);
                    System.arraycopy(this.j, this.r, jArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i11, i12);
                    System.arraycopy(this.n, 0, jArr3, i11, i12);
                    System.arraycopy(this.m, 0, iArr, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.o, 0, f001VarArr, i11, i12);
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = f001VarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g001
    public final void d(a aVar) {
        a m = m(aVar);
        boolean z = false;
        this.z = false;
        this.A = aVar;
        synchronized (this) {
            try {
                this.y = false;
                if (!Objects.equals(m, this.B)) {
                    if (!(this.c.b.size() == 0)) {
                        SparseArray sparseArray = this.c.b;
                        if (((syl0) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(m)) {
                            SparseArray sparseArray2 = this.c.b;
                            this.B = ((syl0) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            boolean z2 = this.D;
                            a aVar2 = this.B;
                            this.D = z2 & eh20.a(aVar2.n, aVar2.k);
                            this.E = false;
                            z = true;
                        }
                    }
                    this.B = m;
                    boolean z22 = this.D;
                    a aVar22 = this.B;
                    this.D = z22 & eh20.a(aVar22.n, aVar22.k);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        tyl0 tyl0Var = this.f;
        if (tyl0Var == null || !z) {
            return;
        }
        tyl0Var.b();
    }

    public final int e(long j) {
        int i = this.p;
        int q = q(i - 1);
        while (i > this.s && this.n[q] >= j) {
            i--;
            q--;
            if (q == -1) {
                q = this.i - 1;
            }
        }
        return i;
    }

    public final long f(int i) {
        this.u = Math.max(this.u, o(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        ant0 ant0Var = this.c;
        SparseArray sparseArray = ant0Var.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ant0Var.c.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = ant0Var.a;
            if (i8 > 0) {
                ant0Var.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    public final void g(long j, boolean z, boolean z2) {
        uyl0 uyl0Var;
        Throwable th;
        long j2;
        qyl0 qyl0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z2) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    uyl0Var = this;
                                    throw th;
                                }
                            }
                            int l = l(i2, i, j, z);
                            if (l != -1) {
                                j2 = f(l);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                uyl0Var = this;
                th = th;
                throw th;
            }
        }
        qyl0Var.b(j2);
    }

    public final void h() {
        long f;
        qyl0 qyl0Var = this.a;
        synchronized (this) {
            int i = this.p;
            f = i == 0 ? -1L : f(i);
        }
        qyl0Var.b(f);
    }

    public final void i(long j) {
        long max;
        if (this.p == 0) {
            return;
        }
        synchronized (this) {
            max = Math.max(this.u, o(this.s));
        }
        d6z.l(j > max);
        k(this.q + e(j));
    }

    public final long j(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        d6z.l(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, o(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        ant0 ant0Var = this.c;
        SparseArray sparseArray = ant0Var.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ant0Var.c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        ant0Var.a = sparseArray.size() > 0 ? Math.min(ant0Var.a, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[q(i6 - 1)] + this.l[r9];
    }

    public final void k(int i) {
        zer zerVar;
        long j = j(i);
        qyl0 qyl0Var = this.a;
        int i2 = qyl0Var.b;
        d6z.l(j <= qyl0Var.g);
        qyl0Var.g = j;
        if (j != 0) {
            zer zerVar2 = qyl0Var.d;
            if (j != zerVar2.a) {
                while (true) {
                    long j2 = qyl0Var.g;
                    long j3 = zerVar2.b;
                    zerVar = (zer) zerVar2.w;
                    if (j2 <= j3) {
                        break;
                    } else {
                        zerVar2 = zerVar;
                    }
                }
                zerVar.getClass();
                qyl0Var.a(zerVar);
                zer zerVar3 = new zer(zerVar2.b, i2);
                zerVar2.w = zerVar3;
                if (qyl0Var.g == zerVar2.b) {
                    zerVar2 = zerVar3;
                }
                qyl0Var.f = zerVar2;
                if (qyl0Var.e == zerVar) {
                    qyl0Var.e = zerVar3;
                    return;
                }
                return;
            }
        }
        qyl0Var.a(qyl0Var.d);
        zer zerVar4 = new zer(qyl0Var.g, i2);
        qyl0Var.d = zerVar4;
        qyl0Var.e = zerVar4;
        qyl0Var.f = zerVar4;
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public a m(a aVar) {
        if (this.F == 0 || aVar.s == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return aVar;
        }
        f7s a = aVar.a();
        a.r = aVar.s + this.F;
        return new a(a);
    }

    public final synchronized long n() {
        return this.v;
    }

    public final long o(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int q = q(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[q]);
            if ((this.m[q] & 1) != 0) {
                return j;
            }
            q--;
            if (q == -1) {
                q = this.i - 1;
            }
        }
        return j;
    }

    public final int p() {
        return this.q + this.s;
    }

    public final int q(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int r(long j, boolean z) {
        try {
            try {
                int q = q(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[q]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int l = l(q, i2 - i, j, true);
                if (l == -1) {
                    return 0;
                }
                return l;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized a s() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean t(boolean z) {
        a aVar;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((syl0) this.c.a(p())).a != this.g) {
                return true;
            }
            return u(q(this.s));
        }
        if (z || this.w || ((aVar = this.B) != null && aVar != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean u(int i) {
        jmm jmmVar = this.h;
        if (jmmVar == null || jmmVar.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.a();
    }

    public final void v() {
        jmm jmmVar = this.h;
        if (jmmVar == null || jmmVar.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException error = this.h.getError();
        error.getClass();
        throw error;
    }

    public final void w(a aVar, o7s o7sVar) {
        a aVar2;
        a aVar3 = this.g;
        boolean z = aVar3 == null;
        DrmInitData drmInitData = aVar3 == null ? null : aVar3.r;
        this.g = aVar;
        DrmInitData drmInitData2 = aVar.r;
        qmm qmmVar = this.d;
        if (qmmVar != null) {
            int cryptoType = qmmVar.getCryptoType(aVar);
            f7s a = aVar.a();
            a.L = cryptoType;
            aVar2 = new a(a);
        } else {
            aVar2 = aVar;
        }
        o7sVar.b = aVar2;
        o7sVar.a = this.h;
        if (qmmVar == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            jmm jmmVar = this.h;
            mmm mmmVar = this.e;
            jmm acquireSession = qmmVar.acquireSession(mmmVar, aVar);
            this.h = acquireSession;
            o7sVar.a = acquireSession;
            if (jmmVar != null) {
                jmmVar.h(mmmVar);
            }
        }
    }

    public final synchronized long x() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[q(this.s)] : this.C;
    }

    public final int y(o7s o7sVar, nyg nygVar, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        os7 os7Var = this.b;
        synchronized (this) {
            try {
                nygVar.x = false;
                i2 = -3;
                if (this.s != this.p) {
                    a aVar = ((syl0) this.c.a(p())).a;
                    if (!z2 && aVar == this.g) {
                        int q = q(this.s);
                        if (u(q)) {
                            nygVar.a = this.m[q];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                nygVar.a(536870912);
                            }
                            nygVar.y = this.n[q];
                            os7Var.a = this.l[q];
                            os7Var.b = this.k[q];
                            os7Var.c = this.o[q];
                            i2 = -4;
                        } else {
                            nygVar.x = true;
                        }
                    }
                    w(aVar, o7sVar);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        a aVar2 = this.B;
                        if (aVar2 == null || (!z2 && aVar2 == this.g)) {
                        }
                        w(aVar2, o7sVar);
                        i2 = -5;
                    }
                    nygVar.a = 4;
                    nygVar.y = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !nygVar.b(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                qyl0 qyl0Var = this.a;
                os7 os7Var2 = this.b;
                if (z3) {
                    qyl0.f(qyl0Var.e, nygVar, os7Var2, qyl0Var.c);
                } else {
                    qyl0Var.e = qyl0.f(qyl0Var.e, nygVar, os7Var2, qyl0Var.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void z() {
        A(true);
        jmm jmmVar = this.h;
        if (jmmVar != null) {
            jmmVar.h(this.e);
            this.h = null;
            this.g = null;
        }
    }
}
