package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.GRADIENT_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class wjc0 implements b70 {
    public static final List a = scc.g("type", "linear", "radial");

    public static ujc0 c(xdx xdxVar, c cVar) {
        Object b;
        Object b2;
        GRADIENT_TYPE gradient_type;
        GRADIENT_TYPE gradient_type2 = null;
        sjc0 sjc0Var = null;
        tjc0 tjc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                String nextString = xdxVar.nextString();
                GRADIENT_TYPE.Companion.getClass();
                GRADIENT_TYPE[] values = GRADIENT_TYPE.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        gradient_type = null;
                        break;
                    }
                    gradient_type = values[i];
                    if (jl40.l(gradient_type.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                gradient_type2 = gradient_type == null ? GRADIENT_TYPE.UNKNOWN__ : gradient_type;
            } else if (h2 == 1) {
                vjc0 vjc0Var = vjc0.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(vjc0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = ep60Var.b(xdxVar, cVar);
                }
                sjc0Var = (sjc0) b2;
            } else {
                if (h2 != 2) {
                    return new ujc0(gradient_type2, sjc0Var, tjc0Var);
                }
                xjc0 xjc0Var = xjc0.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var2 = new ep60(xjc0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = ep60Var2.b(xdxVar, cVar);
                }
                tjc0Var = (tjc0) b;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, ujc0 ujc0Var) {
        bfxVar.A1("type");
        bfxVar.r0(ujc0Var.a.getRawValue());
        bfxVar.A1("linear");
        vjc0 vjc0Var = vjc0.a;
        foe foeVar = l80.a;
        ep60 ep60Var = new ep60(vjc0Var, true);
        sjc0 sjc0Var = ujc0Var.b;
        if (sjc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, sjc0Var);
        }
        bfxVar.A1("radial");
        ep60 ep60Var2 = new ep60(xjc0.a, true);
        tjc0 tjc0Var = ujc0Var.c;
        if (tjc0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, tjc0Var);
        }
    }
}
