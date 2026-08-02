package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import java.util.AbstractList;
import java.util.ArrayList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class txt0 implements xe10, trq0 {
    public final au1 A;
    public final yzz0 B;
    public final z8h C;
    public we10 D;
    public pxt0 E;
    public tsb[] F;
    public fsd G;
    public final tis0 a;
    public final cj01 b;
    public final tyy c;
    public final qmm w;
    public final mmm x;
    public final twy y;
    public final xf10 z;

    public txt0(pxt0 pxt0Var, tis0 tis0Var, cj01 cj01Var, z8h z8hVar, qmm qmmVar, mmm mmmVar, twy twyVar, xf10 xf10Var, tyy tyyVar, au1 au1Var) {
        this.E = pxt0Var;
        this.a = tis0Var;
        this.b = cj01Var;
        this.c = tyyVar;
        this.w = qmmVar;
        this.x = mmmVar;
        this.y = twyVar;
        this.z = xf10Var;
        this.A = au1Var;
        this.C = z8hVar;
        xzz0[] xzz0VarArr = new xzz0[pxt0Var.f.length];
        int i = 0;
        while (true) {
            oxt0[] oxt0VarArr = pxt0Var.f;
            if (i >= oxt0VarArr.length) {
                this.B = new yzz0(xzz0VarArr);
                this.F = new tsb[0];
                z8hVar.getClass();
                this.G = new fsd(ImmutableList.p(), ImmutableList.p());
                return;
            }
            a[] aVarArr = oxt0VarArr[i].j;
            a[] aVarArr2 = new a[aVarArr.length];
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                a aVar = aVarArr[i2];
                f7s a = aVar.a();
                a.L = qmmVar.getCryptoType(aVar);
                a aVar2 = new a(a);
                if (tis0Var.b && ((dlh) tis0Var.w).supportsFormat(aVar2)) {
                    f7s a2 = aVar2.a();
                    a2.m = eh20.q("application/x-media3-cues");
                    a2.I = ((dlh) tis0Var.w).a(aVar2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar2.n);
                    String str = aVar2.k;
                    sb.append(str != null ? " ".concat(str) : "");
                    a2.j = sb.toString();
                    a2.r = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                    aVar2 = new a(a2);
                }
                aVarArr2[i2] = aVar2;
            }
            xzz0VarArr[i] = new xzz0(Integer.toString(i), aVarArr2);
            i++;
        }
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        for (tsb tsbVar : this.F) {
            if (tsbVar.a == 2) {
                return tsbVar.x.c(j, g7q0Var);
            }
        }
        return j;
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        for (tsb tsbVar : this.F) {
            tsbVar.A(j);
        }
        return j;
    }

    @Override // defpackage.xe10
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // defpackage.urq0
    public final long g() {
        return this.G.g();
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        return this.B;
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        this.G.h(j);
    }

    @Override // defpackage.urq0
    public final long i() {
        return this.G.i();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.G.isLoading();
    }

    @Override // defpackage.xe10
    public final void j() {
        this.c.b();
    }

    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        int i;
        loo looVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < looVarArr.length) {
            xyl0 xyl0Var = xyl0VarArr[i2];
            if (xyl0Var != null) {
                tsb tsbVar = (tsb) xyl0Var;
                loo looVar2 = looVarArr[i2];
                if (looVar2 == null || !zArr[i2]) {
                    tsbVar.z(null);
                    xyl0VarArr[i2] = null;
                } else {
                    ((tkh) tsbVar.x).e = looVar2;
                    arrayList.add(tsbVar);
                }
            }
            if (xyl0VarArr[i2] != null || (looVar = looVarArr[i2]) == null) {
                i = i2;
            } else {
                int b = this.B.b(looVar.getTrackGroup());
                pxt0 pxt0Var = this.E;
                tis0 tis0Var = this.a;
                kpg createDataSource = ((ipg) tis0Var.c).createDataSource();
                cj01 cj01Var = this.b;
                if (cj01Var != null) {
                    createDataSource.addTransferListener(cj01Var);
                }
                i = i2;
                tsb tsbVar2 = new tsb(this.E.f[b].a, null, null, new tkh(this.c, pxt0Var, b, looVar, createDataSource, (dlh) tis0Var.w, tis0Var.b), this, this.A, j, this.w, this.x, this.y, this.z, false);
                arrayList.add(tsbVar2);
                xyl0VarArr[i] = tsbVar2;
                zArr2[i] = true;
            }
            i2 = i + 1;
        }
        tsb[] tsbVarArr = new tsb[arrayList.size()];
        this.F = tsbVarArr;
        arrayList.toArray(tsbVarArr);
        AbstractList b2 = u.b(arrayList, new d7g0(29));
        this.C.getClass();
        this.G = new fsd(arrayList, b2);
        return j;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        this.D = we10Var;
        we10Var.onPrepared(this);
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        return this.G.n(xzyVar);
    }

    @Override // defpackage.trq0
    public final void onContinueLoadingRequested(urq0 urq0Var) {
        we10 we10Var = this.D;
        we10Var.getClass();
        we10Var.onContinueLoadingRequested(this);
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        for (tsb tsbVar : this.F) {
            tsbVar.s(j, z);
        }
    }
}
