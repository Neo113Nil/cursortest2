package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.SECTION_VIEW_TYPE;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class s1e implements b70 {
    public static final List a = scc.g("metaShortcuts", "shortcuts", "viewType");

    public static r1e c(xdx xdxVar, c cVar) {
        SECTION_VIEW_TYPE section_view_type;
        Object b;
        Object b2;
        List list = null;
        List list2 = null;
        SECTION_VIEW_TYPE section_view_type2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                t1e t1eVar = t1e.a;
                foe foeVar = l80.a;
                lqy lqyVar = new lqy(new ep60(t1eVar, true));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b2;
            } else if (h2 == 1) {
                u1e u1eVar = u1e.a;
                foe foeVar2 = l80.a;
                lqy lqyVar2 = new lqy(new ep60(u1eVar, true));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = lqyVar2.b(xdxVar, cVar);
                }
                list2 = (List) b;
            } else {
                if (h2 != 2) {
                    return new r1e(list, list2, section_view_type2);
                }
                String nextString = xdxVar.nextString();
                SECTION_VIEW_TYPE.Companion.getClass();
                SECTION_VIEW_TYPE[] values = SECTION_VIEW_TYPE.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        section_view_type = null;
                        break;
                    }
                    section_view_type = values[i];
                    if (jl40.l(section_view_type.getRawValue(), nextString)) {
                        break;
                    }
                    i++;
                }
                section_view_type2 = section_view_type == null ? SECTION_VIEW_TYPE.UNKNOWN__ : section_view_type;
            }
        }
    }
}
