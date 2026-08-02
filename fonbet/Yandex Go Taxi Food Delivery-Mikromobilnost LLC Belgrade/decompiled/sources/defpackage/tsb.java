package defpackage;

import androidx.media3.exoplayer.upstream.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class tsb implements xyl0, urq0, oyy, qyy {
    public final twy A;
    public final a B;
    public final psb C;
    public final ArrayList D;
    public final List E;
    public final uyl0 F;
    public final uyl0[] G;
    public final ymu H;
    public nsb I;
    public androidx.media3.common.a J;
    public igg K;
    public long L;
    public long M;
    public int N;
    public z35 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final int a;
    public final int[] b;
    public final androidx.media3.common.a[] c;
    public final boolean[] w;
    public final usb x;
    public final trq0 y;
    public final xf10 z;

    public tsb(int i, int[] iArr, androidx.media3.common.a[] aVarArr, usb usbVar, trq0 trq0Var, au1 au1Var, long j, qmm qmmVar, mmm mmmVar, twy twyVar, xf10 xf10Var, boolean z) {
        this.a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.b = iArr;
        this.c = aVarArr == null ? new androidx.media3.common.a[0] : aVarArr;
        this.x = usbVar;
        this.y = trq0Var;
        this.z = xf10Var;
        this.A = twyVar;
        this.P = z;
        this.B = new a("ChunkSampleStream");
        this.C = new psb();
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.G = new uyl0[length];
        this.w = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        uyl0[] uyl0VarArr = new uyl0[i3];
        qmmVar.getClass();
        uyl0 uyl0Var = new uyl0(au1Var, qmmVar, mmmVar);
        this.F = uyl0Var;
        iArr2[0] = i;
        uyl0VarArr[0] = uyl0Var;
        while (i2 < length) {
            uyl0 uyl0Var2 = new uyl0(au1Var, null, null);
            this.G[i2] = uyl0Var2;
            int i4 = i2 + 1;
            uyl0VarArr[i4] = uyl0Var2;
            iArr2[i4] = this.b[i2];
            i2 = i4;
        }
        this.H = new ymu(18, iArr2, uyl0VarArr);
        this.L = j;
        this.M = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(long j) {
        ArrayList arrayList;
        z35 z35Var;
        this.M = j;
        int i = 0;
        this.P = false;
        if (w()) {
            this.L = j;
            return;
        }
        int i2 = 0;
        while (true) {
            arrayList = this.D;
            if (i2 >= arrayList.size()) {
                break;
            }
            z35Var = (z35) arrayList.get(i2);
            long j2 = z35Var.z;
            if (j2 == j && z35Var.D == -9223372036854775807L) {
                break;
            } else if (j2 > j) {
                break;
            } else {
                i2++;
            }
        }
        uyl0 uyl0Var = this.F;
        boolean B = z35Var != null ? uyl0Var.B(z35Var.c(0)) : uyl0Var.C(j, j < i());
        uyl0[] uyl0VarArr = this.G;
        if (B) {
            this.N = y(uyl0Var.p(), 0);
            int length = uyl0VarArr.length;
            while (i < length) {
                uyl0VarArr[i].C(j, true);
                i++;
            }
            return;
        }
        this.L = j;
        this.R = false;
        arrayList.clear();
        this.N = 0;
        a aVar = this.B;
        if (aVar.d()) {
            uyl0Var.h();
            int length2 = uyl0VarArr.length;
            while (i < length2) {
                uyl0VarArr[i].h();
                i++;
            }
            aVar.a();
            return;
        }
        aVar.c = null;
        uyl0Var.A(false);
        for (uyl0 uyl0Var2 : uyl0VarArr) {
            uyl0Var2.A(false);
        }
    }

    @Override // defpackage.qyy
    public final void a() {
        this.F.z();
        for (uyl0 uyl0Var : this.G) {
            uyl0Var.z();
        }
        this.x.release();
        igg iggVar = this.K;
        if (iggVar != null) {
            synchronized (iggVar) {
                syc0 syc0Var = (syc0) iggVar.G.remove(this);
                if (syc0Var != null) {
                    syc0Var.a.z();
                }
            }
        }
    }

    @Override // defpackage.xyl0
    public final void b() {
        a aVar = this.B;
        aVar.b();
        this.F.v();
        if (aVar.d()) {
            return;
        }
        this.x.b();
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        nsb nsbVar = (nsb) pyyVar;
        this.I = null;
        this.O = null;
        long j3 = nsbVar.a;
        npg npgVar = nsbVar.b;
        x7u0 x7u0Var = nsbVar.B;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.A.onLoadTaskConcluded(j3);
        this.z.c(uwyVar, nsbVar.c, this.a, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A);
        if (z) {
            return;
        }
        if (w()) {
            this.F.A(false);
            for (uyl0 uyl0Var : this.G) {
                uyl0Var.A(false);
            }
        } else if (nsbVar instanceof z35) {
            ArrayList arrayList = this.D;
            t(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.L = this.M;
            }
        }
        this.y.onContinueLoadingRequested(this);
    }

    @Override // defpackage.urq0
    public final long g() {
        if (this.R) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.L;
        }
        long j = this.M;
        z35 u = u();
        if (!u.b()) {
            ArrayList arrayList = this.D;
            u = arrayList.size() > 1 ? (z35) unr0.k(2, arrayList) : null;
        }
        if (u != null) {
            j = Math.max(j, u.A);
        }
        return Math.max(j, this.F.n());
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        a aVar = this.B;
        if (aVar.c() || w()) {
            return;
        }
        boolean d = aVar.d();
        List list = this.E;
        usb usbVar = this.x;
        ArrayList arrayList = this.D;
        if (d) {
            nsb nsbVar = this.I;
            nsbVar.getClass();
            boolean z = nsbVar instanceof z35;
            if (!(z && v(arrayList.size() - 1)) && usbVar.e(j, nsbVar, list)) {
                aVar.a();
                if (z) {
                    this.O = (z35) nsbVar;
                    return;
                }
                return;
            }
            return;
        }
        int f = usbVar.f(j, list);
        if (f < arrayList.size()) {
            d6z.x(!aVar.d());
            int size = arrayList.size();
            while (true) {
                if (f >= size) {
                    f = -1;
                    break;
                } else if (!v(f)) {
                    break;
                } else {
                    f++;
                }
            }
            if (f == -1) {
                return;
            }
            long j2 = u().A;
            z35 t = t(f);
            if (arrayList.isEmpty()) {
                this.L = this.M;
            }
            this.R = false;
            this.z.i(this.a, t.z, j2);
        }
    }

    @Override // defpackage.urq0
    public final long i() {
        if (w()) {
            return this.L;
        }
        if (this.R) {
            return Long.MIN_VALUE;
        }
        return u().A;
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.B.d();
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        return !w() && this.F.t(this.R);
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        nsb nsbVar = (nsb) pyyVar;
        this.I = null;
        this.x.g(nsbVar);
        long j3 = nsbVar.a;
        npg npgVar = nsbVar.b;
        x7u0 x7u0Var = nsbVar.B;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.A.onLoadTaskConcluded(j3);
        this.z.e(uwyVar, nsbVar.c, this.a, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A);
        this.y.onContinueLoadingRequested(this);
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        long j;
        List list;
        if (!this.R) {
            a aVar = this.B;
            if (!aVar.d() && !aVar.c()) {
                boolean w = w();
                if (w) {
                    list = Collections.EMPTY_LIST;
                    j = this.L;
                } else {
                    j = u().A;
                    list = this.E;
                }
                this.x.h(xzyVar, j, list, this.C);
                psb psbVar = this.C;
                boolean z = psbVar.b;
                nsb nsbVar = psbVar.a;
                psbVar.a = null;
                psbVar.b = false;
                if (z) {
                    this.L = -9223372036854775807L;
                    this.R = true;
                    return true;
                }
                if (nsbVar != null) {
                    this.I = nsbVar;
                    boolean z2 = nsbVar instanceof z35;
                    ymu ymuVar = this.H;
                    if (z2) {
                        z35 z35Var = (z35) nsbVar;
                        if (w) {
                            long j2 = z35Var.z;
                            long j3 = this.L;
                            if (j2 < j3) {
                                this.F.t = j3;
                                for (uyl0 uyl0Var : this.G) {
                                    uyl0Var.t = this.L;
                                }
                                if (this.P) {
                                    androidx.media3.common.a aVar2 = z35Var.w;
                                    this.Q = !eh20.a(aVar2.n, aVar2.k);
                                }
                            }
                            this.P = false;
                            this.L = -9223372036854775807L;
                        }
                        z35Var.F = ymuVar;
                        uyl0[] uyl0VarArr = (uyl0[]) ymuVar.c;
                        int[] iArr = new int[uyl0VarArr.length];
                        for (int i = 0; i < uyl0VarArr.length; i++) {
                            uyl0 uyl0Var2 = uyl0VarArr[i];
                            iArr[i] = uyl0Var2.q + uyl0Var2.p;
                        }
                        z35Var.G = iArr;
                        this.D.add(z35Var);
                    } else if (nsbVar instanceof swv) {
                        ((swv) nsbVar).D = ymuVar;
                    }
                    aVar.g(nsbVar, this, this.A.getMinimumLoadableRetryCount(nsbVar.c));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.oyy
    public final void o(pyy pyyVar, long j, long j2, int i) {
        uwy uwyVar;
        nsb nsbVar = (nsb) pyyVar;
        if (i == 0) {
            long j3 = nsbVar.a;
            uwyVar = new uwy(nsbVar.b);
        } else {
            long j4 = nsbVar.a;
            npg npgVar = nsbVar.b;
            x7u0 x7u0Var = nsbVar.B;
            uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        }
        this.z.h(uwyVar, nsbVar.c, this.a, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    @Override // defpackage.oyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        h0n h0nVar;
        boolean b;
        nsb nsbVar = (nsb) pyyVar;
        long j3 = nsbVar.B.b;
        boolean z = nsbVar instanceof z35;
        ArrayList arrayList = this.D;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && v(size)) ? false : true;
        npg npgVar = nsbVar.b;
        x7u0 x7u0Var = nsbVar.B;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, j3);
        tw21.l0(nsbVar.z);
        tw21.l0(nsbVar.A);
        swy swyVar = new swy(iOException, i);
        usb usbVar = this.x;
        twy twyVar = this.A;
        if (usbVar.d(nsbVar, z2, swyVar, twyVar)) {
            if (z2) {
                if (z) {
                    d6z.x(t(size) == nsbVar);
                    if (arrayList.isEmpty()) {
                        this.L = this.M;
                    }
                }
                h0nVar = a.e;
                if (h0nVar == null) {
                    long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
                    h0nVar = retryDelayMsFor != -9223372036854775807L ? new h0n(false, 0, retryDelayMsFor) : a.f;
                }
                b = h0nVar.b();
                this.z.f(uwyVar, nsbVar.c, this.a, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A, iOException, !b);
                if (!b) {
                    this.I = null;
                    twyVar.onLoadTaskConcluded(nsbVar.a);
                    this.y.onContinueLoadingRequested(this);
                }
                return h0nVar;
            }
            lk91.j("Ignoring attempt to cancel non-cancelable load.");
        }
        h0nVar = null;
        if (h0nVar == null) {
        }
        b = h0nVar.b();
        this.z.f(uwyVar, nsbVar.c, this.a, nsbVar.w, nsbVar.x, nsbVar.y, nsbVar.z, nsbVar.A, iOException, !b);
        if (!b) {
        }
        return h0nVar;
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        if (w()) {
            return -3;
        }
        z35 z35Var = this.O;
        uyl0 uyl0Var = this.F;
        if (z35Var != null && z35Var.c(0) <= uyl0Var.p()) {
            return -3;
        }
        x();
        return uyl0Var.y(o7sVar, nygVar, i, this.R);
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        if (w()) {
            return 0;
        }
        boolean z = this.R;
        uyl0 uyl0Var = this.F;
        int r = uyl0Var.r(j, z);
        z35 z35Var = this.O;
        if (z35Var != null) {
            r = Math.min(r, z35Var.c(0) - uyl0Var.p());
        }
        uyl0Var.D(r);
        x();
        return r;
    }

    public final void s(long j, boolean z) {
        long j2;
        if (w()) {
            return;
        }
        uyl0 uyl0Var = this.F;
        int i = uyl0Var.q;
        uyl0Var.g(j, z, true);
        uyl0 uyl0Var2 = this.F;
        int i2 = uyl0Var2.q;
        if (i2 > i) {
            synchronized (uyl0Var2) {
                j2 = uyl0Var2.p == 0 ? Long.MIN_VALUE : uyl0Var2.n[uyl0Var2.r];
            }
            int i3 = 0;
            while (true) {
                uyl0[] uyl0VarArr = this.G;
                if (i3 >= uyl0VarArr.length) {
                    break;
                }
                uyl0VarArr[i3].g(j2, z, this.w[i3]);
                i3++;
            }
        }
        int min = Math.min(y(i2, 0), this.N);
        if (min > 0) {
            tw21.b0(0, min, this.D);
            this.N -= min;
        }
    }

    public final z35 t(int i) {
        ArrayList arrayList = this.D;
        z35 z35Var = (z35) arrayList.get(i);
        tw21.b0(i, arrayList.size(), arrayList);
        this.N = Math.max(this.N, arrayList.size());
        int i2 = 0;
        this.F.k(z35Var.c(0));
        while (true) {
            uyl0[] uyl0VarArr = this.G;
            if (i2 >= uyl0VarArr.length) {
                return z35Var;
            }
            uyl0 uyl0Var = uyl0VarArr[i2];
            i2++;
            uyl0Var.k(z35Var.c(i2));
        }
    }

    public final z35 u() {
        return (z35) unr0.k(1, this.D);
    }

    public final boolean v(int i) {
        int p;
        z35 z35Var = (z35) this.D.get(i);
        if (this.F.p() > z35Var.c(0)) {
            return true;
        }
        int i2 = 0;
        do {
            uyl0[] uyl0VarArr = this.G;
            if (i2 >= uyl0VarArr.length) {
                return false;
            }
            p = uyl0VarArr[i2].p();
            i2++;
        } while (p <= z35Var.c(i2));
        return true;
    }

    public final boolean w() {
        return this.L != -9223372036854775807L;
    }

    public final void x() {
        int y = y(this.F.p(), this.N - 1);
        while (true) {
            int i = this.N;
            if (i > y) {
                return;
            }
            this.N = i + 1;
            z35 z35Var = (z35) this.D.get(i);
            androidx.media3.common.a aVar = z35Var.w;
            if (!aVar.equals(this.J)) {
                this.z.b(this.a, aVar, z35Var.x, z35Var.y, z35Var.z);
            }
            this.J = aVar;
        }
    }

    public final int y(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.D;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((z35) arrayList.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    public final void z(igg iggVar) {
        this.K = iggVar;
        uyl0 uyl0Var = this.F;
        uyl0Var.h();
        jmm jmmVar = uyl0Var.h;
        if (jmmVar != null) {
            jmmVar.h(uyl0Var.e);
            uyl0Var.h = null;
            uyl0Var.g = null;
        }
        for (uyl0 uyl0Var2 : this.G) {
            uyl0Var2.h();
            jmm jmmVar2 = uyl0Var2.h;
            if (jmmVar2 != null) {
                jmmVar2.h(uyl0Var2.e);
                uyl0Var2.h = null;
                uyl0Var2.g = null;
            }
        }
        this.B.f(this);
    }
}
