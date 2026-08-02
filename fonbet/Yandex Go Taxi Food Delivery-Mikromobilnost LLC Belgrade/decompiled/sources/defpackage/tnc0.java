package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class tnc0 implements b70 {
    public static final List a = scc.g("colors", "startPoint", "endPoint");

    public static qnc0 c(xdx xdxVar, c cVar) {
        ArrayList arrayList = null;
        pnc0 pnc0Var = null;
        onc0 onc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                rnc0 rnc0Var = rnc0.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(rnc0Var, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            } else if (h2 == 1) {
                unc0 unc0Var = unc0.a;
                foe foeVar2 = l80.a;
                pnc0Var = (pnc0) new ep60(unc0Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new qnc0(arrayList, pnc0Var, onc0Var);
                }
                snc0 snc0Var = snc0.a;
                foe foeVar3 = l80.a;
                onc0Var = (onc0) new ep60(snc0Var, true).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, qnc0 qnc0Var) {
        bfxVar.A1("colors");
        rnc0 rnc0Var = rnc0.a;
        foe foeVar = l80.a;
        ArrayList arrayList = qnc0Var.a;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (bfxVar instanceof ek00) {
                ek00 ek00Var = (ek00) bfxVar;
                ek00Var.u();
                rnc0Var.a(bfxVar, cVar, obj);
                ek00Var.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                rnc0Var.a(ek00Var2, cVar, obj);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("startPoint");
        unc0 unc0Var = unc0.a;
        pnc0 pnc0Var = qnc0Var.b;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            unc0Var.a(bfxVar, cVar, pnc0Var);
            ek00Var3.y();
        } else {
            ek00 ek00Var4 = new ek00();
            ek00Var4.u();
            unc0Var.a(ek00Var4, cVar, pnc0Var);
            ek00Var4.y();
            uga1.f(bfxVar, ek00Var4.c());
        }
        bfxVar.A1("endPoint");
        snc0 snc0Var = snc0.a;
        onc0 onc0Var = qnc0Var.c;
        if (z) {
            ek00 ek00Var5 = (ek00) bfxVar;
            ek00Var5.u();
            snc0Var.a(bfxVar, cVar, onc0Var);
            ek00Var5.y();
            return;
        }
        ek00 ek00Var6 = new ek00();
        ek00Var6.u();
        snc0Var.a(ek00Var6, cVar, onc0Var);
        ek00Var6.y();
        uga1.f(bfxVar, ek00Var6.c());
    }
}
