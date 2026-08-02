package defpackage;

import androidx.compose.ui.graphics.a;

/* loaded from: classes.dex */
public abstract class qtr {
    public static final qs5 a = new qs5(wjp.z);

    public static final void a(yci yciVar, dup dupVar, long j, long j2, float f, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        long a2 = (i2 & 8) != 0 ? j95.a(j, hq5Var) : j2;
        float f2 = (i2 & 16) != 0 ? 0 : f;
        oq5 oq5Var = (oq5) hq5Var;
        qs5 qs5Var = a;
        float f3 = ((cma) oq5Var.j(qs5Var)).a + f2;
        etn.m(new qzm[]{rb6.a.a(new d85(a2)), qs5Var.a(new cma(f3))}, ild.C(-70914509, new ltr(yciVar, dupVar, j, f3, 0, wn5Var), oq5Var), oq5Var, 56);
    }

    public static final yci b(float f, long j, yci yciVar, dup dupVar) {
        dup dupVar2;
        yci yciVar2;
        vci vciVar = vci.a;
        if (f > 0.0f) {
            dupVar2 = dupVar;
            yciVar2 = a.b(vciVar, 0.0f, 0.0f, 0.0f, f, 0.0f, dupVar2, false, 124895);
        } else {
            dupVar2 = dupVar;
            yciVar2 = vciVar;
        }
        return xp3.u(androidx.compose.foundation.a.b(yciVar.f(yciVar2).f(vciVar), j, dupVar2), dupVar2);
    }

    public static final long c(long j, float f, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        i95 i95Var = (i95) oq5Var.j(j95.a);
        boolean booleanValue = ((Boolean) oq5Var.j(j95.b)).booleanValue();
        long j2 = i95Var.p;
        if (!d85.c(j, j2) || !booleanValue) {
            return j;
        }
        if (cma.a(f, 0)) {
            return j2;
        }
        return c3x.D(d85.b(i95Var.t, ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14), j2);
    }
}
