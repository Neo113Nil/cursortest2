package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class wmc0 implements b70 {
    public static final List a = scc.g("url", "displayRules");

    public static tmc0 c(xdx xdxVar, c cVar) {
        String str = null;
        rmc0 rmc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new tmc0(str, rmc0Var);
                }
                umc0 umc0Var = umc0.a;
                foe foeVar2 = l80.a;
                rmc0Var = (rmc0) new ep60(umc0Var, true).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, tmc0 tmc0Var) {
        bfxVar.A1("url");
        foe foeVar = l80.a;
        bfxVar.r0(tmc0Var.a);
        bfxVar.A1("displayRules");
        umc0 umc0Var = umc0.a;
        rmc0 rmc0Var = tmc0Var.b;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            umc0Var.a(bfxVar, cVar, rmc0Var);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        umc0Var.a(ek00Var2, cVar, rmc0Var);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }
}
