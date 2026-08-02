package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class qsu0 implements b70 {
    public static final List a = scc.g("actionId", "actionToken", "actionMeta");

    public static ksu0 c(xdx xdxVar, c cVar) {
        Object b;
        String str = null;
        String str2 = null;
        Map map = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new ksu0(str, str2, map);
                }
                b70 d = cVar.d(ju00.a);
                foe foeVar3 = l80.a;
                if (d instanceof om60) {
                    ny61.r("The adapter is already nullable");
                    return null;
                }
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = d.b(xdxVar, cVar);
                }
                map = (Map) b;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, ksu0 ksu0Var) {
        bfxVar.A1("actionId");
        foe foeVar = l80.a;
        bfxVar.r0(ksu0Var.a);
        bfxVar.A1("actionToken");
        bfxVar.r0(ksu0Var.b);
        bfxVar.A1("actionMeta");
        b70 d = cVar.d(ju00.a);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        Map map = ksu0Var.c;
        if (map == null) {
            bfxVar.k2();
        } else {
            d.a(bfxVar, cVar, map);
        }
    }
}
