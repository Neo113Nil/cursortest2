package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zkc0 implements b70 {
    public static final List a = scc.g("count", "displayRules");

    public static wkc0 c(xdx xdxVar, c cVar) {
        Integer num = null;
        ukc0 ukc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                num = (Integer) l80.b.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new wkc0(num.intValue(), ukc0Var);
                }
                xkc0 xkc0Var = xkc0.a;
                foe foeVar = l80.a;
                ukc0Var = (ukc0) new ep60(xkc0Var, true).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, wkc0 wkc0Var) {
        bfxVar.A1("count");
        l80.b.a(bfxVar, cVar, Integer.valueOf(wkc0Var.a));
        bfxVar.A1("displayRules");
        xkc0 xkc0Var = xkc0.a;
        ukc0 ukc0Var = wkc0Var.b;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            xkc0Var.a(bfxVar, cVar, ukc0Var);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        xkc0Var.a(ek00Var2, cVar, ukc0Var);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }
}
