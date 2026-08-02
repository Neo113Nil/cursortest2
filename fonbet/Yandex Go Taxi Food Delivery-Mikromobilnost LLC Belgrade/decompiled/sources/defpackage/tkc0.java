package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.CORNER_SETTINGS;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class tkc0 implements b70 {
    public static final List a = scc.g("type", "heightFix");

    public static skc0 c(xdx xdxVar, c cVar) {
        CORNER_SETTINGS corner_settings;
        CORNER_SETTINGS corner_settings2 = null;
        Integer num = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                String nextString = xdxVar.nextString();
                CORNER_SETTINGS.Companion.getClass();
                CORNER_SETTINGS[] values = CORNER_SETTINGS.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        corner_settings = null;
                        break;
                    }
                    corner_settings = values[i];
                    if (jl40.l(corner_settings.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                corner_settings2 = corner_settings == null ? CORNER_SETTINGS.UNKNOWN__ : corner_settings;
            } else {
                if (h2 != 1) {
                    return new skc0(corner_settings2, num);
                }
                num = (Integer) l80.k.b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, skc0 skc0Var) {
        bfxVar.A1("type");
        bfxVar.r0(skc0Var.a.getRawValue());
        bfxVar.A1("heightFix");
        l80.k.a(bfxVar, cVar, skc0Var.b);
    }
}
