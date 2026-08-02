package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class q4k0 implements b70 {
    public static final List a = scc.g("text", "color");

    public static e4k0 c(xdx xdxVar, c cVar) {
        String str = null;
        y3k0 y3k0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new e4k0(str, y3k0Var);
                }
                y3k0Var = (y3k0) l80.a(k4k0.a).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, e4k0 e4k0Var) {
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(e4k0Var.a);
        bfxVar.A1("color");
        l80.a(k4k0.a).a(bfxVar, cVar, e4k0Var.b);
    }
}
