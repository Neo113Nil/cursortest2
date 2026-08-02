package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class qec implements b70 {
    public static final List a = scc.g("name", "fallback");

    public static dec c(xdx xdxVar, c cVar) {
        String str = null;
        cec cecVar = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new dec(str, cecVar);
                }
                cecVar = (cec) l80.a(pec.a).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, dec decVar) {
        bfxVar.A1("name");
        foe foeVar = l80.a;
        bfxVar.r0(decVar.a);
        bfxVar.A1("fallback");
        l80.a(pec.a).a(bfxVar, cVar, decVar.b);
    }
}
