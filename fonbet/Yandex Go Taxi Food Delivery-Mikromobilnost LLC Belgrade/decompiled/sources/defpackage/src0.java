package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class src0 implements b70 {
    public static final List a = scc.g("text", "lineHeight");

    public static qrc0 c(xdx xdxVar, c cVar) {
        prc0 prc0Var = null;
        Integer num = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                prc0Var = (prc0) l80.a(trc0.a).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new qrc0(prc0Var, num);
                }
                num = (Integer) l80.k.b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, qrc0 qrc0Var) {
        bfxVar.A1("text");
        l80.a(trc0.a).a(bfxVar, cVar, qrc0Var.a);
        bfxVar.A1("lineHeight");
        l80.k.a(bfxVar, cVar, qrc0Var.b);
    }
}
