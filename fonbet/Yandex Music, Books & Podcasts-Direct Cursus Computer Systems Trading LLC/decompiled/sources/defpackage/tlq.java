package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tlq implements woh, hgg {
    public final nb7 a;
    public final va7 b;
    public final t6t c;
    public final xeg d;
    public final x0 e;
    public final yvs f;
    public final ArrayList g = new ArrayList();
    public final long h;
    public final osh i;
    public final dsc j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;

    public tlq(nb7 nb7Var, va7 va7Var, t6t t6tVar, dsc dscVar, long j, xeg xegVar, x0 x0Var, boolean z, z7h z7hVar) {
        this.a = nb7Var;
        this.b = va7Var;
        this.c = t6tVar;
        this.j = dscVar;
        this.h = j;
        this.d = xegVar;
        this.e = x0Var;
        this.k = z;
        this.f = new yvs(new xvs("", dscVar));
        this.i = z7hVar != null ? new osh(z7hVar) : new osh("SingleSampleMediaPeriod");
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < zsbVarArr.length; i++) {
            aoo aooVar = aooVarArr[i];
            ArrayList arrayList = this.g;
            if (aooVar != null && (zsbVarArr[i] == null || !zArr[i])) {
                arrayList.remove(aooVar);
                aooVarArr[i] = null;
            }
            if (aooVarArr[i] == null && zsbVarArr[i] != null) {
                rlq rlqVar = new rlq(this);
                arrayList.add(rlqVar);
                aooVarArr[i] = rlqVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        slq slqVar = (slq) jggVar;
        ngr ngrVar = slqVar.b;
        cfg cfgVar = new cfg(slqVar.a, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.d.getClass();
        this.e.L(cfgVar, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // defpackage.ahp
    public final long e() {
        return (this.l || this.i.I()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.i.I();
    }

    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        slq slqVar = (slq) jggVar;
        this.n = (int) slqVar.b.b;
        byte[] bArr = slqVar.c;
        bArr.getClass();
        this.m = bArr;
        this.l = true;
        ngr ngrVar = slqVar.b;
        cfg cfgVar = new cfg(slqVar.a, ngrVar.c, ngrVar.d, j2, this.n);
        this.d.getClass();
        this.e.N(cfgVar, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // defpackage.woh
    public final long h(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return j;
            }
            rlq rlqVar = (rlq) arrayList.get(i);
            if (rlqVar.a == 2) {
                rlqVar.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.woh
    public final long i() {
        return -9223372036854775807L;
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        vohVar.g(this);
    }

    @Override // defpackage.woh
    public final yvs m() {
        return this.f;
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        if (this.l) {
            return false;
        }
        osh oshVar = this.i;
        if (oshVar.I() || oshVar.H()) {
            return false;
        }
        db7 a = this.b.a();
        t6t t6tVar = this.c;
        if (t6tVar != null) {
            a.q(t6tVar);
        }
        oshVar.X(new slq(a, this.a), this, this.d.r(1));
        return true;
    }

    @Override // defpackage.hgg
    public final void o(jgg jggVar, long j, long j2, int i) {
        slq slqVar = (slq) jggVar;
        ngr ngrVar = slqVar.b;
        this.e.R(i == 0 ? new cfg(slqVar.a) : new cfg(slqVar.a, ngrVar.c, ngrVar.d, j2, ngrVar.b), 1, -1, this.j, 0, null, 0L, this.h, i);
    }

    @Override // defpackage.ahp
    public final long r() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.hgg
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        mdr mdrVar;
        slq slqVar = (slq) jggVar;
        ngr ngrVar = slqVar.b;
        cfg cfgVar = new cfg(slqVar.a, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        dvt.m0(this.h);
        j4x j4xVar = new j4x(iOException, i, 9);
        xeg xegVar = this.d;
        long C = xegVar.C(j4xVar);
        boolean z = C == -9223372036854775807L || i >= xegVar.r(1);
        if (this.k && z) {
            vq1.o0("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.l = true;
            mdrVar = osh.l;
        } else {
            mdrVar = C != -9223372036854775807L ? new mdr(0, C, false) : osh.m;
        }
        this.e.O(cfgVar, 1, -1, this.j, 0, null, 0L, this.h, iOException, !mdrVar.b());
        return mdrVar;
    }

    @Override // defpackage.woh
    public final void k() {
    }

    @Override // defpackage.ahp
    public final void t(long j) {
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        return j;
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
    }
}
