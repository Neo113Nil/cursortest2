package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.HORIZONTAL_RULE;
import com.yandex.plus.core.graphql.type.VERTICAL_RULE;
import com.yandex.plus.core.graphql.type.WIDTH_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class ztc0 implements b70 {
    public static final List a = scc.g("displayRules", "opacity", "horizontalRule", "verticalRule", "widthFix", "widthType");

    public static xtc0 c(xdx xdxVar, c cVar) {
        WIDTH_TYPE width_type;
        Object obj;
        Object obj2;
        wtc0 wtc0Var = null;
        Integer num = null;
        HORIZONTAL_RULE horizontal_rule = null;
        VERTICAL_RULE vertical_rule = null;
        Integer num2 = null;
        WIDTH_TYPE width_type2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                ytc0 ytc0Var = ytc0.a;
                foe foeVar = l80.a;
                wtc0Var = (wtc0) new ep60(ytc0Var, true).b(xdxVar, cVar);
            } else if (h2 == 1) {
                num = (Integer) l80.k.b(xdxVar, cVar);
            } else if (h2 == 2) {
                foe foeVar2 = foe.c;
                foe foeVar3 = l80.a;
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = foeVar2.b(xdxVar, cVar);
                }
                horizontal_rule = (HORIZONTAL_RULE) obj2;
            } else if (h2 == 3) {
                foe foeVar4 = foe.j;
                foe foeVar5 = l80.a;
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = foeVar4.b(xdxVar, cVar);
                }
                vertical_rule = (VERTICAL_RULE) obj;
            } else if (h2 == 4) {
                num2 = (Integer) l80.k.b(xdxVar, cVar);
            } else {
                if (h2 != 5) {
                    return new xtc0(wtc0Var, num, horizontal_rule, vertical_rule, num2, width_type2);
                }
                String nextString = xdxVar.nextString();
                WIDTH_TYPE.Companion.getClass();
                WIDTH_TYPE[] values = WIDTH_TYPE.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        width_type = null;
                        break;
                    }
                    width_type = values[i];
                    if (jl40.l(width_type.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                width_type2 = width_type == null ? WIDTH_TYPE.UNKNOWN__ : width_type;
            }
        }
    }
}
