package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.AbstractList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t9r implements woh, zgp {
    public final r0o a;
    public final t6t b;
    public final ogg c;
    public final gra d;
    public final cra e;
    public final xeg f;
    public final x0 g;
    public final zi7 h;
    public final yvs i;
    public final rwd j;
    public voh k;
    public n9r l;
    public wk4[] m;
    public qr5 n;

    public t9r(n9r n9rVar, r0o r0oVar, t6t t6tVar, rwd rwdVar, gra graVar, cra craVar, xeg xegVar, x0 x0Var, ogg oggVar, zi7 zi7Var) {
        this.l = n9rVar;
        this.a = r0oVar;
        this.b = t6tVar;
        this.c = oggVar;
        this.d = graVar;
        this.e = craVar;
        this.f = xegVar;
        this.g = x0Var;
        this.h = zi7Var;
        this.j = rwdVar;
        xvs[] xvsVarArr = new xvs[n9rVar.f.length];
        int i = 0;
        while (true) {
            m9r[] m9rVarArr = n9rVar.f;
            if (i >= m9rVarArr.length) {
                this.i = new yvs(xvsVarArr);
                this.m = new wk4[0];
                rwdVar.getClass();
                ude udeVar = yde.b;
                qsn qsnVar = qsn.e;
                this.n = new qr5(qsnVar, qsnVar);
                return;
            }
            dsc[] dscVarArr = m9rVarArr[i].j;
            dsc[] dscVarArr2 = new dsc[dscVarArr.length];
            for (int i2 = 0; i2 < dscVarArr.length; i2++) {
                dsc dscVar = dscVarArr[i2];
                bsc a = dscVar.a();
                a.L = graVar.t(dscVar);
                dsc dscVar2 = new dsc(a);
                if (r0oVar.b && ((mvt) r0oVar.d).d(dscVar2)) {
                    bsc a2 = dscVar2.a();
                    a2.m = l5i.p("application/x-media3-cues");
                    a2.I = ((mvt) r0oVar.d).l(dscVar2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(dscVar2.n);
                    String str = dscVar2.k;
                    sb.append(str != null ? StringUtil.SPACE.concat(str) : "");
                    a2.j = sb.toString();
                    a2.r = Long.MAX_VALUE;
                    dscVar2 = new dsc(a2);
                }
                dscVarArr2[i2] = dscVar2;
            }
            xvsVarArr[i] = new xvs(Integer.toString(i), dscVarArr2);
            i++;
        }
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        int i;
        zsb zsbVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < zsbVarArr.length) {
            aoo aooVar = aooVarArr[i2];
            if (aooVar != null) {
                wk4 wk4Var = (wk4) aooVar;
                zsb zsbVar2 = zsbVarArr[i2];
                if (zsbVar2 == null || !zArr[i2]) {
                    wk4Var.C(null);
                    aooVarArr[i2] = null;
                } else {
                    ((vr7) wk4Var.e).e = zsbVar2;
                    arrayList.add(wk4Var);
                }
            }
            if (aooVarArr[i2] != null || (zsbVar = zsbVarArr[i2]) == null) {
                i = i2;
            } else {
                int b = this.i.b(zsbVar.n());
                n9r n9rVar = this.l;
                r0o r0oVar = this.a;
                db7 a = ((va7) r0oVar.c).a();
                t6t t6tVar = this.b;
                if (t6tVar != null) {
                    a.q(t6tVar);
                }
                i = i2;
                wk4 wk4Var2 = new wk4(this.l.f[b].a, null, null, new vr7(this.c, n9rVar, b, zsbVar, a, (mvt) r0oVar.d, r0oVar.b), this, this.h, j, this.d, this.e, this.f, this.g, false);
                arrayList.add(wk4Var2);
                aooVarArr[i] = wk4Var2;
                zArr2[i] = true;
            }
            i2 = i + 1;
        }
        wk4[] wk4VarArr = new wk4[arrayList.size()];
        this.m = wk4VarArr;
        arrayList.toArray(wk4VarArr);
        AbstractList O = ldg.O(new e7o(17), arrayList);
        this.j.getClass();
        this.n = new qr5(arrayList, O);
        return j;
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        voh vohVar = this.k;
        vohVar.getClass();
        vohVar.b(this);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        for (wk4 wk4Var : this.m) {
            if (wk4Var.a == 2) {
                return wk4Var.e.c(j, hapVar);
            }
        }
        return j;
    }

    @Override // defpackage.ahp
    public final long e() {
        return this.n.e();
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.n.f();
    }

    @Override // defpackage.woh
    public final long h(long j) {
        for (wk4 wk4Var : this.m) {
            wk4Var.D(j);
        }
        return j;
    }

    @Override // defpackage.woh
    public final long i() {
        return -9223372036854775807L;
    }

    @Override // defpackage.woh
    public final void k() {
        this.c.b();
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        this.k = vohVar;
        vohVar.g(this);
    }

    @Override // defpackage.woh
    public final yvs m() {
        return this.i;
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        return this.n.n(dhgVar);
    }

    @Override // defpackage.ahp
    public final long r() {
        return this.n.r();
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        for (wk4 wk4Var : this.m) {
            wk4Var.s(j, z);
        }
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        this.n.t(j);
    }
}
