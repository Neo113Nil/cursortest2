package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wk4 implements aoo, ahp, hgg, kgg {
    public final int a;
    public final int[] b;
    public final dsc[] c;
    public final boolean[] d;
    public final xk4 e;
    public final Object f;
    public final x0 g;
    public final xeg h;
    public final osh i;
    public final bz2 j;
    public final ArrayList k;
    public final List l;
    public final zno m;
    public final zno[] n;
    public final le3 o;
    public sk4 p;
    public dsc q;
    public i97 r;
    public long s;
    public long t;
    public int u;
    public fs2 v;
    public boolean w;
    public boolean x;
    public boolean y;

    public wk4(int i, int[] iArr, dsc[] dscVarArr, xk4 xk4Var, zgp zgpVar, zi7 zi7Var, long j, gra graVar, cra craVar, xeg xegVar, x0 x0Var, boolean z) {
        this.a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.b = iArr;
        this.c = dscVarArr == null ? new dsc[0] : dscVarArr;
        this.e = xk4Var;
        this.f = zgpVar;
        this.g = x0Var;
        this.h = xegVar;
        this.w = z;
        this.i = new osh("ChunkSampleStream");
        this.j = new bz2(6, false);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new zno[length];
        this.d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        zno[] znoVarArr = new zno[i3];
        graVar.getClass();
        zno znoVar = new zno(zi7Var, graVar, craVar);
        this.m = znoVar;
        iArr2[0] = i;
        znoVarArr[0] = znoVar;
        while (i2 < length) {
            zno znoVar2 = new zno(zi7Var, null, null);
            this.n[i2] = znoVar2;
            int i4 = i2 + 1;
            znoVarArr[i4] = znoVar2;
            iArr2[i4] = this.b[i2];
            i2 = i4;
        }
        this.o = new le3(iArr2, znoVarArr);
        this.s = j;
        this.t = j;
    }

    public final void A() {
        int B = B(this.m.p(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > B) {
                return;
            }
            this.u = i + 1;
            fs2 fs2Var = (fs2) this.k.get(i);
            dsc dscVar = fs2Var.d;
            if (!dscVar.equals(this.q)) {
                this.g.y(this.a, dscVar, fs2Var.e, fs2Var.f, fs2Var.g);
            }
            this.q = dscVar;
        }
    }

    public final int B(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((fs2) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void C(i97 i97Var) {
        this.r = i97Var;
        zno znoVar = this.m;
        znoVar.h();
        zqa zqaVar = znoVar.h;
        if (zqaVar != null) {
            zqaVar.x(znoVar.e);
            znoVar.h = null;
            znoVar.g = null;
        }
        for (zno znoVar2 : this.n) {
            znoVar2.h();
            zqa zqaVar2 = znoVar2.h;
            if (zqaVar2 != null) {
                zqaVar2.x(znoVar2.e);
                znoVar2.h = null;
                znoVar2.g = null;
            }
        }
        this.i.P(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(long j) {
        ArrayList arrayList;
        fs2 fs2Var;
        this.t = j;
        int i = 0;
        this.w = false;
        if (z()) {
            this.s = j;
            return;
        }
        int i2 = 0;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            fs2Var = (fs2) arrayList.get(i2);
            long j2 = fs2Var.g;
            if (j2 == j && fs2Var.k == -9223372036854775807L) {
                break;
            } else if (j2 > j) {
                break;
            } else {
                i2++;
            }
        }
        zno znoVar = this.m;
        boolean B = fs2Var != null ? znoVar.B(fs2Var.d(0)) : znoVar.C(j, j < e());
        zno[] znoVarArr = this.n;
        if (B) {
            this.u = B(znoVar.p(), 0);
            int length = znoVarArr.length;
            while (i < length) {
                znoVarArr[i].C(j, true);
                i++;
            }
            return;
        }
        this.s = j;
        this.y = false;
        arrayList.clear();
        this.u = 0;
        osh oshVar = this.i;
        if (oshVar.I()) {
            znoVar.h();
            int length2 = znoVarArr.length;
            while (i < length2) {
                znoVarArr[i].h();
                i++;
            }
            oshVar.w();
            return;
        }
        oshVar.c = null;
        znoVar.A(false);
        for (zno znoVar2 : znoVarArr) {
            znoVar2.A(false);
        }
    }

    @Override // defpackage.aoo
    public final void b() {
        osh oshVar = this.i;
        oshVar.b();
        this.m.v();
        if (oshVar.I()) {
            return;
        }
        this.e.b();
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, zgp] */
    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        sk4 sk4Var = (sk4) jggVar;
        this.p = null;
        this.v = null;
        long j3 = sk4Var.a;
        nb7 nb7Var = sk4Var.b;
        ngr ngrVar = sk4Var.i;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.h.getClass();
        this.g.L(cfgVar, sk4Var.c, this.a, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h);
        if (z) {
            return;
        }
        if (z()) {
            this.m.A(false);
            for (zno znoVar : this.n) {
                znoVar.A(false);
            }
        } else if (sk4Var instanceof fs2) {
            ArrayList arrayList = this.k;
            u(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f.b(this);
    }

    @Override // defpackage.ahp
    public final long e() {
        if (z()) {
            return this.s;
        }
        if (this.y) {
            return Long.MIN_VALUE;
        }
        return w().h;
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.i.I();
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, zgp] */
    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        sk4 sk4Var = (sk4) jggVar;
        this.p = null;
        this.e.d(sk4Var);
        long j3 = sk4Var.a;
        nb7 nb7Var = sk4Var.b;
        ngr ngrVar = sk4Var.i;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.h.getClass();
        this.g.N(cfgVar, sk4Var.c, this.a, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h);
        this.f.b(this);
    }

    @Override // defpackage.kgg
    public final void j() {
        this.m.z();
        for (zno znoVar : this.n) {
            znoVar.z();
        }
        this.e.a();
        i97 i97Var = this.r;
        if (i97Var != null) {
            synchronized (i97Var) {
                pcl pclVar = (pcl) i97Var.n.remove(this);
                if (pclVar != null) {
                    pclVar.a.z();
                }
            }
        }
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        long j;
        List list;
        if (!this.y) {
            osh oshVar = this.i;
            if (!oshVar.I() && !oshVar.H()) {
                boolean z = z();
                if (z) {
                    list = Collections.EMPTY_LIST;
                    j = this.s;
                } else {
                    j = w().h;
                    list = this.l;
                }
                this.e.i(dhgVar, j, list, this.j);
                bz2 bz2Var = this.j;
                boolean z2 = bz2Var.b;
                sk4 sk4Var = (sk4) bz2Var.c;
                bz2Var.c = null;
                bz2Var.b = false;
                if (z2) {
                    this.s = -9223372036854775807L;
                    this.y = true;
                    return true;
                }
                if (sk4Var != null) {
                    this.p = sk4Var;
                    boolean z3 = sk4Var instanceof fs2;
                    le3 le3Var = this.o;
                    if (z3) {
                        fs2 fs2Var = (fs2) sk4Var;
                        if (z) {
                            long j2 = fs2Var.g;
                            long j3 = this.s;
                            if (j2 < j3) {
                                this.m.t = j3;
                                for (zno znoVar : this.n) {
                                    znoVar.t = this.s;
                                }
                                if (this.w) {
                                    dsc dscVar = fs2Var.d;
                                    this.x = !l5i.a(dscVar.n, dscVar.k);
                                }
                            }
                            this.w = false;
                            this.s = -9223372036854775807L;
                        }
                        fs2Var.m = le3Var;
                        zno[] znoVarArr = (zno[]) le3Var.b;
                        int[] iArr = new int[znoVarArr.length];
                        for (int i = 0; i < znoVarArr.length; i++) {
                            zno znoVar2 = znoVarArr[i];
                            iArr[i] = znoVar2.q + znoVar2.p;
                        }
                        fs2Var.n = iArr;
                        this.k.add(fs2Var);
                    } else if (sk4Var instanceof hme) {
                        ((hme) sk4Var).k = le3Var;
                    }
                    oshVar.X(sk4Var, this, this.h.r(sk4Var.c));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hgg
    public final void o(jgg jggVar, long j, long j2, int i) {
        cfg cfgVar;
        sk4 sk4Var = (sk4) jggVar;
        if (i == 0) {
            long j3 = sk4Var.a;
            cfgVar = new cfg(sk4Var.b);
        } else {
            long j4 = sk4Var.a;
            nb7 nb7Var = sk4Var.b;
            ngr ngrVar = sk4Var.i;
            cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        }
        this.g.R(cfgVar, sk4Var.c, this.a, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h, i);
    }

    @Override // defpackage.aoo
    public final boolean p() {
        return !z() && this.m.t(this.y);
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        if (z()) {
            return -3;
        }
        fs2 fs2Var = this.v;
        zno znoVar = this.m;
        if (fs2Var != null && fs2Var.d(0) <= znoVar.p()) {
            return -3;
        }
        A();
        return znoVar.y(qdcVar, qg7Var, i, this.y);
    }

    @Override // defpackage.ahp
    public final long r() {
        if (this.y) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.s;
        }
        long j = this.t;
        fs2 w = w();
        if (!w.c()) {
            ArrayList arrayList = this.k;
            w = arrayList.size() > 1 ? (fs2) vz1.m(arrayList, 2) : null;
        }
        if (w != null) {
            j = Math.max(j, w.h);
        }
        return Math.max(j, this.m.n());
    }

    public final void s(long j, boolean z) {
        long j2;
        if (z()) {
            return;
        }
        zno znoVar = this.m;
        int i = znoVar.q;
        znoVar.g(j, z, true);
        zno znoVar2 = this.m;
        int i2 = znoVar2.q;
        if (i2 > i) {
            synchronized (znoVar2) {
                j2 = znoVar2.p == 0 ? Long.MIN_VALUE : znoVar2.n[znoVar2.r];
            }
            int i3 = 0;
            while (true) {
                zno[] znoVarArr = this.n;
                if (i3 >= znoVarArr.length) {
                    break;
                }
                znoVarArr[i3].g(j2, z, this.d[i3]);
                i3++;
            }
        }
        int min = Math.min(B(i2, 0), this.u);
        if (min > 0) {
            dvt.d0(0, min, this.k);
            this.u -= min;
        }
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        osh oshVar = this.i;
        if (oshVar.H() || z()) {
            return;
        }
        boolean I = oshVar.I();
        List list = this.l;
        xk4 xk4Var = this.e;
        ArrayList arrayList = this.k;
        if (I) {
            sk4 sk4Var = this.p;
            sk4Var.getClass();
            boolean z = sk4Var instanceof fs2;
            if (!(z && y(arrayList.size() - 1)) && xk4Var.f(j, sk4Var, list)) {
                oshVar.w();
                if (z) {
                    this.v = (fs2) sk4Var;
                    return;
                }
                return;
            }
            return;
        }
        int g = xk4Var.g(list, j);
        if (g < arrayList.size()) {
            vq1.A(!oshVar.I());
            int size = arrayList.size();
            while (true) {
                if (g >= size) {
                    g = -1;
                    break;
                } else if (!y(g)) {
                    break;
                } else {
                    g++;
                }
            }
            if (g == -1) {
                return;
            }
            long j2 = w().h;
            fs2 u = u(g);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
            this.y = false;
            this.g.e0(this.a, u.g, j2);
        }
    }

    public final fs2 u(int i) {
        ArrayList arrayList = this.k;
        fs2 fs2Var = (fs2) arrayList.get(i);
        dvt.d0(i, arrayList.size(), arrayList);
        this.u = Math.max(this.u, arrayList.size());
        int i2 = 0;
        this.m.k(fs2Var.d(0));
        while (true) {
            zno[] znoVarArr = this.n;
            if (i2 >= znoVarArr.length) {
                return fs2Var;
            }
            zno znoVar = znoVarArr[i2];
            i2++;
            znoVar.k(fs2Var.d(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zgp] */
    @Override // defpackage.hgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        mdr mdrVar;
        boolean b;
        sk4 sk4Var = (sk4) jggVar;
        long j3 = sk4Var.i.b;
        boolean z = sk4Var instanceof fs2;
        ArrayList arrayList = this.k;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && y(size)) ? false : true;
        nb7 nb7Var = sk4Var.b;
        ngr ngrVar = sk4Var.i;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, j3);
        dvt.m0(sk4Var.g);
        dvt.m0(sk4Var.h);
        j4x j4xVar = new j4x(iOException, i, 9);
        xk4 xk4Var = this.e;
        xeg xegVar = this.h;
        if (xk4Var.e(sk4Var, z2, j4xVar, xegVar)) {
            if (z2) {
                mdrVar = osh.l;
                if (z) {
                    vq1.A(u(size) == sk4Var);
                    if (arrayList.isEmpty()) {
                        this.s = this.t;
                    }
                }
                if (mdrVar == null) {
                    long C = xegVar.C(j4xVar);
                    mdrVar = C != -9223372036854775807L ? new mdr(0, C, false) : osh.m;
                }
                b = mdrVar.b();
                this.g.O(cfgVar, sk4Var.c, this.a, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h, iOException, !b);
                if (!b) {
                    this.p = null;
                    xegVar.getClass();
                    this.f.b(this);
                }
                return mdrVar;
            }
            vq1.n0("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
        }
        mdrVar = null;
        if (mdrVar == null) {
        }
        b = mdrVar.b();
        this.g.O(cfgVar, sk4Var.c, this.a, sk4Var.d, sk4Var.e, sk4Var.f, sk4Var.g, sk4Var.h, iOException, !b);
        if (!b) {
        }
        return mdrVar;
    }

    public final fs2 w() {
        return (fs2) vz1.m(this.k, 1);
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        if (z()) {
            return 0;
        }
        boolean z = this.y;
        zno znoVar = this.m;
        int r = znoVar.r(j, z);
        fs2 fs2Var = this.v;
        if (fs2Var != null) {
            r = Math.min(r, fs2Var.d(0) - znoVar.p());
        }
        znoVar.D(r);
        A();
        return r;
    }

    public final boolean y(int i) {
        int p;
        fs2 fs2Var = (fs2) this.k.get(i);
        if (this.m.p() > fs2Var.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            zno[] znoVarArr = this.n;
            if (i2 >= znoVarArr.length) {
                return false;
            }
            p = znoVarArr[i2].p();
            i2++;
        } while (p <= fs2Var.d(i2));
        return true;
    }

    public final boolean z() {
        return this.s != -9223372036854775807L;
    }
}
