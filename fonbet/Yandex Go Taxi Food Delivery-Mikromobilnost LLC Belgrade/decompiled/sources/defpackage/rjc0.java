package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class rjc0 implements b70 {
    public static final List a = scc.g("color", "opacity", "position");

    public static qjc0 c(xdx xdxVar, c cVar) {
        String str = null;
        Integer num = null;
        Double d = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                num = (Integer) l80.k.b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new qjc0(str, num, d.doubleValue());
                }
                d = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, qjc0 qjc0Var) {
        bfxVar.A1("color");
        foe foeVar = l80.a;
        bfxVar.r0(qjc0Var.a);
        bfxVar.A1("opacity");
        l80.k.a(bfxVar, cVar, qjc0Var.b);
        bfxVar.A1("position");
        l80.c.a(bfxVar, cVar, Double.valueOf(qjc0Var.c));
    }
}
