package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class yic0 implements b70 {
    public static final List a = scc.g("title", "subtitle", "balance");

    public static tic0 c(xdx xdxVar, c cVar) {
        Object b;
        Object b2;
        sic0 sic0Var = null;
        ric0 ric0Var = null;
        nic0 nic0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                ep60 a2 = l80.a(ajc0.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a2.b(xdxVar, cVar);
                }
                sic0Var = (sic0) b2;
            } else if (h2 == 1) {
                ep60 a3 = l80.a(zic0.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = a3.b(xdxVar, cVar);
                }
                ric0Var = (ric0) b;
            } else {
                if (h2 != 2) {
                    return new tic0(sic0Var, ric0Var, nic0Var);
                }
                nic0Var = (nic0) l80.a(uic0.a).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, tic0 tic0Var) {
        bfxVar.A1("title");
        ep60 a2 = l80.a(ajc0.a);
        sic0 sic0Var = tic0Var.a;
        if (sic0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, sic0Var);
        }
        bfxVar.A1("subtitle");
        ep60 a3 = l80.a(zic0.a);
        ric0 ric0Var = tic0Var.b;
        if (ric0Var == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, ric0Var);
        }
        bfxVar.A1("balance");
        l80.a(uic0.a).a(bfxVar, cVar, tic0Var.c);
    }
}
