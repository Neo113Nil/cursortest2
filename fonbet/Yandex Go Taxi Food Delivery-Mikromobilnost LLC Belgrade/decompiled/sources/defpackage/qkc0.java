package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class qkc0 implements b70 {
    public static final List a = scc.g("text", "templates", "actionText", "accessibilityEnabled");

    public static pkc0 c(xdx xdxVar, c cVar) {
        Object b;
        String str = null;
        List list = null;
        String str2 = null;
        Boolean bool = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                lqy lqyVar = new lqy(l80.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b;
            } else if (h2 == 2) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else {
                if (h2 != 3) {
                    return new pkc0(bool, str, str2, list);
                }
                bool = (Boolean) l80.l.b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, pkc0 pkc0Var) {
        bfxVar.A1("text");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, pkc0Var.a);
        bfxVar.A1("templates");
        lqy lqyVar = new lqy(l80.a);
        List list = pkc0Var.b;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
        bfxVar.A1("actionText");
        om60Var.a(bfxVar, cVar, pkc0Var.c);
        bfxVar.A1("accessibilityEnabled");
        l80.l.a(bfxVar, cVar, pkc0Var.d);
    }
}
