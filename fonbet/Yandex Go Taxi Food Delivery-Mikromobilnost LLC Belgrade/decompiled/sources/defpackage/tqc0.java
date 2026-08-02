package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class tqc0 implements b70 {
    public static final List a = scc.g("leftTopCorner", "rightTopCorner", "leftBottomCorner", "rightBottomCorner");

    public static qqc0 c(xdx xdxVar, c cVar) {
        nqc0 nqc0Var = null;
        pqc0 pqc0Var = null;
        mqc0 mqc0Var = null;
        oqc0 oqc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                sqc0 sqc0Var = sqc0.a;
                foe foeVar = l80.a;
                nqc0Var = (nqc0) new ep60(sqc0Var, true).b(xdxVar, cVar);
            } else if (h2 == 1) {
                vqc0 vqc0Var = vqc0.a;
                foe foeVar2 = l80.a;
                pqc0Var = (pqc0) new ep60(vqc0Var, true).b(xdxVar, cVar);
            } else if (h2 == 2) {
                rqc0 rqc0Var = rqc0.a;
                foe foeVar3 = l80.a;
                mqc0Var = (mqc0) new ep60(rqc0Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 3) {
                    return new qqc0(nqc0Var, pqc0Var, mqc0Var, oqc0Var);
                }
                uqc0 uqc0Var = uqc0.a;
                foe foeVar4 = l80.a;
                oqc0Var = (oqc0) new ep60(uqc0Var, true).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, qqc0 qqc0Var) {
        bfxVar.A1("leftTopCorner");
        sqc0 sqc0Var = sqc0.a;
        foe foeVar = l80.a;
        nqc0 nqc0Var = qqc0Var.a;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            sqc0Var.a(bfxVar, cVar, nqc0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            sqc0Var.a(ek00Var2, cVar, nqc0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("rightTopCorner");
        vqc0 vqc0Var = vqc0.a;
        pqc0 pqc0Var = qqc0Var.b;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            vqc0Var.a(bfxVar, cVar, pqc0Var);
            ek00Var3.y();
        } else {
            ek00 ek00Var4 = new ek00();
            ek00Var4.u();
            vqc0Var.a(ek00Var4, cVar, pqc0Var);
            ek00Var4.y();
            uga1.f(bfxVar, ek00Var4.c());
        }
        bfxVar.A1("leftBottomCorner");
        rqc0 rqc0Var = rqc0.a;
        mqc0 mqc0Var = qqc0Var.c;
        if (z) {
            ek00 ek00Var5 = (ek00) bfxVar;
            ek00Var5.u();
            rqc0Var.a(bfxVar, cVar, mqc0Var);
            ek00Var5.y();
        } else {
            ek00 ek00Var6 = new ek00();
            ek00Var6.u();
            rqc0Var.a(ek00Var6, cVar, mqc0Var);
            ek00Var6.y();
            uga1.f(bfxVar, ek00Var6.c());
        }
        bfxVar.A1("rightBottomCorner");
        uqc0 uqc0Var = uqc0.a;
        oqc0 oqc0Var = qqc0Var.d;
        if (z) {
            ek00 ek00Var7 = (ek00) bfxVar;
            ek00Var7.u();
            uqc0Var.a(bfxVar, cVar, oqc0Var);
            ek00Var7.y();
            return;
        }
        ek00 ek00Var8 = new ek00();
        ek00Var8.u();
        uqc0Var.a(ek00Var8, cVar, oqc0Var);
        ek00Var8.y();
        uga1.f(bfxVar, ek00Var8.c());
    }
}
