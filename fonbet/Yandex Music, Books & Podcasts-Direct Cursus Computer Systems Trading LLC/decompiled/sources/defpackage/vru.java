package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class vru implements pyc {
    public final /* synthetic */ int a;

    public /* synthetic */ vru(y1w y1wVar) {
        this.a = 3;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object g2wVar;
        switch (this.a) {
            case 0:
                wn5 wn5Var = ild.i;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(zknVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (Intrinsics.d(k, xr1.a) || (k instanceof zr1) || (k instanceof yr1)) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-106269517);
                    wn5Var.invoke(oq5Var2, 0);
                    oq5Var2.p(false);
                } else {
                    if (!(k instanceof as1)) {
                        throw vz1.i((oq5) hq5Var, -3433469, false);
                    }
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(-106149671);
                    irf.r(((as1) k).a, null, gdg.N(vci.a, gdg.B(oq5Var3), gdg.A(oq5Var3)), null, null, 0.0f, null, oq5Var3, 48, 120);
                    oq5Var3.p(false);
                }
                return Unit.a;
            case 1:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                ksk M = ffhVar.M(ga6.b(((ga6) obj3).a, (int) (ga6.k(r15.a) * 1.4f), (int) (ga6.i(r15.a) * 1.4f), 0, 0, 12));
                int i = M.a;
                if (i < 0) {
                    i = 0;
                }
                return mfh.m0(mfhVar, i, M.b, new zj(M, 11));
            case 2:
                eak eakVar = (eak) obj;
                eakVar.getClass();
                ((xof) obj3).getClass();
                ynn d = ywf.d(0L, ((nmq) obj2).a);
                bak bakVar = bak.a;
                nh0 nh0Var = (nh0) eakVar;
                if (nh0Var.b == null) {
                    nh0Var.b = new RectF();
                }
                RectF rectF = nh0Var.b;
                rectF.getClass();
                rectF.set(d.a, d.b, d.c, d.d);
                Path path = nh0Var.a;
                RectF rectF2 = nh0Var.b;
                rectF2.getClass();
                path.addOval(rectF2, ph0.b(bakVar));
                return Unit.a;
            case 3:
                Object obj4 = (j2w) obj;
                e2w e2wVar = (e2w) obj2;
                Map map = (Map) obj3;
                e2wVar.getClass();
                map.getClass();
                if (obj4 == null) {
                    obj4 = e2wVar;
                }
                if (obj4.equals(i2w.a) || obj4.equals(f2w.a) || obj4.equals(h2w.a) || obj4.equals(d2w.a)) {
                    return obj4;
                }
                if (obj4 instanceof c2w) {
                    g2wVar = new c2w(y1w.a(((c2w) obj4).a, map));
                } else {
                    if (!(obj4 instanceof g2w)) {
                        b6e.s();
                        return null;
                    }
                    g2wVar = new g2w(y1w.a(((g2w) obj4).a, map));
                }
                return g2wVar;
            default:
                ((Integer) obj2).intValue();
                ((Boolean) obj3).booleanValue();
                ((x1w) obj).getClass();
                return Unit.a;
        }
    }

    public /* synthetic */ vru(int i) {
        this.a = i;
    }
}
