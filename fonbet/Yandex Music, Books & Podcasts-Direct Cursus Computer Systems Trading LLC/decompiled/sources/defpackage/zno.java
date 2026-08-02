package defpackage;

import android.util.SparseArray;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* loaded from: classes.dex */
public class zno implements azs {
    public dsc A;
    public dsc B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final vno a;
    public final gra d;
    public final cra e;
    public yno f;
    public dsc g;
    public zqa h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final wx0 b = new wx0();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public zys[] o = new zys[1000];
    public final w2r c = new w2r(new e7o(8));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public zno(zi7 zi7Var, gra graVar, cra craVar) {
        this.d = graVar;
        this.e = craVar;
        this.a = new vno(zi7Var);
    }

    public final void A(boolean z) {
        vno vnoVar = this.a;
        vnoVar.a(vnoVar.d);
        yg3 yg3Var = vnoVar.d;
        int i = vnoVar.b;
        vq1.A(((l60) yg3Var.c) == null);
        yg3Var.a = 0L;
        yg3Var.b = i;
        yg3 yg3Var2 = vnoVar.d;
        vnoVar.e = yg3Var2;
        vnoVar.f = yg3Var2;
        vnoVar.g = 0L;
        vnoVar.a.c();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        w2r w2rVar = this.c;
        SparseArray sparseArray = (SparseArray) w2rVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((e7o) w2rVar.d).accept(sparseArray.valueAt(i2));
        }
        w2rVar.b = -1;
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
            vno vnoVar = this.a;
            vnoVar.e = vnoVar.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean C(long j, boolean z) {
        Throwable th;
        zno znoVar;
        long j2;
        int l;
        try {
            synchronized (this) {
                try {
                    try {
                        this.s = 0;
                        vno vnoVar = this.a;
                        vnoVar.e = vnoVar.d;
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
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } else if (!z) {
                                    l = -1;
                                }
                            }
                            znoVar = this;
                            j2 = j;
                        } else {
                            znoVar = this;
                            j2 = j;
                            l = znoVar.l(j2, q, i2 - i, true);
                        }
                        if (l == -1) {
                            return false;
                        }
                        znoVar.t = j2;
                        znoVar.s += l;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final synchronized void D(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    vq1.v(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        vq1.v(z);
        this.s += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        if (((defpackage.xno) r10.valueAt(r10.size() - 1)).a.equals(r9.B) == false) goto L80;
     */
    @Override // defpackage.azs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j, int i, int i2, int i3, zys zysVar) {
        boolean z;
        if (this.z) {
            dsc dscVar = this.A;
            vq1.B(dscVar);
            d(dscVar);
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
                    vq1.n0("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
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
                    vq1.v(this.k[q] + ((long) this.l[q]) <= j3);
                }
                this.w = (536870912 & i) != 0;
                this.v = Math.max(this.v, j2);
                int q2 = q(this.p);
                this.n[q2] = j2;
                this.k[q2] = j3;
                this.l[q2] = i2;
                this.m[q2] = i;
                this.o[q2] = zysVar;
                this.j[q2] = this.C;
                if (!(((SparseArray) this.c.c).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.c.c;
                }
                dsc dscVar2 = this.B;
                dscVar2.getClass();
                gra graVar = this.d;
                fra u = graVar != null ? graVar.u(this.e, dscVar2) : fra.e0;
                w2r w2rVar = this.c;
                int i6 = this.q + this.p;
                xno xnoVar = new xno(dscVar2, u);
                SparseArray sparseArray2 = (SparseArray) w2rVar.c;
                if (w2rVar.b == -1) {
                    vq1.A(sparseArray2.size() == 0);
                    w2rVar.b = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    vq1.v(i6 >= keyAt);
                    if (keyAt == i6) {
                        ((e7o) w2rVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i6, xnoVar);
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
                    zys[] zysVarArr = new zys[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr2, 0, i11);
                    System.arraycopy(this.n, this.r, jArr3, 0, i11);
                    System.arraycopy(this.m, this.r, iArr, 0, i11);
                    System.arraycopy(this.l, this.r, iArr2, 0, i11);
                    System.arraycopy(this.o, this.r, zysVarArr, 0, i11);
                    System.arraycopy(this.j, this.r, jArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i11, i12);
                    System.arraycopy(this.n, 0, jArr3, i11, i12);
                    System.arraycopy(this.m, 0, iArr, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.o, 0, zysVarArr, i11, i12);
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = zysVarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.azs
    public final void b(d7k d7kVar, int i, int i2) {
        while (true) {
            vno vnoVar = this.a;
            if (i <= 0) {
                vnoVar.getClass();
                return;
            }
            int c = vnoVar.c(i);
            yg3 yg3Var = vnoVar.f;
            l60 l60Var = (l60) yg3Var.c;
            d7kVar.f(l60Var.a, ((int) (vnoVar.g - yg3Var.a)) + l60Var.b, c);
            i -= c;
            long j = vnoVar.g + c;
            vnoVar.g = j;
            yg3 yg3Var2 = vnoVar.f;
            if (j == yg3Var2.b) {
                vnoVar.f = (yg3) yg3Var2.d;
            }
        }
    }

    @Override // defpackage.azs
    public final int c(ma7 ma7Var, int i, boolean z) {
        vno vnoVar = this.a;
        int c = vnoVar.c(i);
        yg3 yg3Var = vnoVar.f;
        l60 l60Var = (l60) yg3Var.c;
        int read = ma7Var.read(l60Var.a, ((int) (vnoVar.g - yg3Var.a)) + l60Var.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            xq0.v();
            return 0;
        }
        long j = vnoVar.g + read;
        vnoVar.g = j;
        yg3 yg3Var2 = vnoVar.f;
        if (j == yg3Var2.b) {
            vnoVar.f = (yg3) yg3Var2.d;
        }
        return read;
    }

    @Override // defpackage.azs
    public final void d(dsc dscVar) {
        dsc m = m(dscVar);
        boolean z = false;
        this.z = false;
        this.A = dscVar;
        synchronized (this) {
            try {
                this.y = false;
                if (!Objects.equals(m, this.B)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((xno) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(m)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.B = ((xno) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            boolean z2 = this.D;
                            dsc dscVar2 = this.B;
                            this.D = z2 & l5i.a(dscVar2.n, dscVar2.k);
                            this.E = false;
                            z = true;
                        }
                    }
                    this.B = m;
                    boolean z22 = this.D;
                    dsc dscVar22 = this.B;
                    this.D = z22 & l5i.a(dscVar22.n, dscVar22.k);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yno ynoVar = this.f;
        if (ynoVar == null || !z) {
            return;
        }
        ynoVar.b();
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
        w2r w2rVar = this.c;
        SparseArray sparseArray = (SparseArray) w2rVar.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((e7o) w2rVar.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = w2rVar.b;
            if (i8 > 0) {
                w2rVar.b = i8 - 1;
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
        Throwable th;
        vno vnoVar = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long j2 = -1;
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
                                    throw th;
                                }
                            }
                            int l = l(j, i2, i, z);
                            if (l != -1) {
                                j2 = f(l);
                            }
                            vnoVar.b(j2);
                        }
                    }
                    vnoVar.b(j2);
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
    }

    public final void h() {
        long f;
        vno vnoVar = this.a;
        synchronized (this) {
            int i = this.p;
            f = i == 0 ? -1L : f(i);
        }
        vnoVar.b(f);
    }

    public final void i(long j) {
        long max;
        if (this.p == 0) {
            return;
        }
        synchronized (this) {
            max = Math.max(this.u, o(this.s));
        }
        vq1.v(j > max);
        k(this.q + e(j));
    }

    public final long j(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        vq1.v(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, o(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        w2r w2rVar = this.c;
        SparseArray sparseArray = (SparseArray) w2rVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((e7o) w2rVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        w2rVar.b = sparseArray.size() > 0 ? Math.min(w2rVar.b, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[q(i6 - 1)] + this.l[r9];
    }

    public final void k(int i) {
        yg3 yg3Var;
        long j = j(i);
        vno vnoVar = this.a;
        int i2 = vnoVar.b;
        vq1.v(j <= vnoVar.g);
        vnoVar.g = j;
        if (j != 0) {
            yg3 yg3Var2 = vnoVar.d;
            if (j != yg3Var2.a) {
                while (true) {
                    long j2 = vnoVar.g;
                    long j3 = yg3Var2.b;
                    yg3Var = (yg3) yg3Var2.d;
                    if (j2 <= j3) {
                        break;
                    } else {
                        yg3Var2 = yg3Var;
                    }
                }
                yg3Var.getClass();
                vnoVar.a(yg3Var);
                yg3 yg3Var3 = new yg3(yg3Var2.b, i2);
                yg3Var2.d = yg3Var3;
                if (vnoVar.g == yg3Var2.b) {
                    yg3Var2 = yg3Var3;
                }
                vnoVar.f = yg3Var2;
                if (vnoVar.e == yg3Var) {
                    vnoVar.e = yg3Var3;
                    return;
                }
                return;
            }
        }
        vnoVar.a(vnoVar.d);
        yg3 yg3Var4 = new yg3(vnoVar.g, i2);
        vnoVar.d = yg3Var4;
        vnoVar.e = yg3Var4;
        vnoVar.f = yg3Var4;
    }

    public final int l(long j, int i, int i2, boolean z) {
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

    public dsc m(dsc dscVar) {
        if (this.F == 0 || dscVar.s == Long.MAX_VALUE) {
            return dscVar;
        }
        bsc a = dscVar.a();
        a.r = dscVar.s + this.F;
        return new dsc(a);
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
                int l = l(j, q, i2 - i, true);
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

    public final synchronized dsc s() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean t(boolean z) {
        dsc dscVar;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((xno) this.c.a(p())).a != this.g) {
                return true;
            }
            return u(q(this.s));
        }
        if (z || this.w || ((dscVar = this.B) != null && dscVar != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean u(int i) {
        zqa zqaVar = this.h;
        if (zqaVar == null || zqaVar.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.u();
    }

    public final void v() {
        zqa zqaVar = this.h;
        if (zqaVar == null || zqaVar.getState() != 1) {
            return;
        }
        yqa s = this.h.s();
        s.getClass();
        throw s;
    }

    public final void w(dsc dscVar, qdc qdcVar) {
        dsc dscVar2;
        dsc dscVar3 = this.g;
        boolean z = dscVar3 == null;
        pqa pqaVar = dscVar3 == null ? null : dscVar3.r;
        this.g = dscVar;
        pqa pqaVar2 = dscVar.r;
        gra graVar = this.d;
        if (graVar != null) {
            int t = graVar.t(dscVar);
            bsc a = dscVar.a();
            a.L = t;
            dscVar2 = new dsc(a);
        } else {
            dscVar2 = dscVar;
        }
        qdcVar.c = dscVar2;
        qdcVar.b = this.h;
        if (graVar == null) {
            return;
        }
        if (z || !Objects.equals(pqaVar, pqaVar2)) {
            zqa zqaVar = this.h;
            cra craVar = this.e;
            zqa r = graVar.r(craVar, dscVar);
            this.h = r;
            qdcVar.b = r;
            if (zqaVar != null) {
                zqaVar.x(craVar);
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

    public final int y(qdc qdcVar, qg7 qg7Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        wx0 wx0Var = this.b;
        synchronized (this) {
            try {
                qg7Var.j = false;
                i2 = -3;
                if (this.s != this.p) {
                    dsc dscVar = ((xno) this.c.a(p())).a;
                    if (!z2 && dscVar == this.g) {
                        int q = q(this.s);
                        if (u(q)) {
                            qg7Var.b = this.m[q];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                qg7Var.b(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                            }
                            qg7Var.k = this.n[q];
                            wx0Var.a = this.l[q];
                            wx0Var.b = this.k[q];
                            wx0Var.c = this.o[q];
                            i2 = -4;
                        } else {
                            qg7Var.j = true;
                        }
                    }
                    w(dscVar, qdcVar);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        dsc dscVar2 = this.B;
                        if (dscVar2 == null || (!z2 && dscVar2 == this.g)) {
                        }
                        w(dscVar2, qdcVar);
                        i2 = -5;
                    }
                    qg7Var.b = 4;
                    qg7Var.k = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !qg7Var.f(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                vno vnoVar = this.a;
                wx0 wx0Var2 = this.b;
                if (z3) {
                    vno.f(vnoVar.e, qg7Var, wx0Var2, vnoVar.c);
                } else {
                    vnoVar.e = vno.f(vnoVar.e, qg7Var, wx0Var2, vnoVar.c);
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
        zqa zqaVar = this.h;
        if (zqaVar != null) {
            zqaVar.x(this.e);
            this.h = null;
            this.g = null;
        }
    }
}
