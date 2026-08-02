package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public abstract class zxw implements b70 {
    public static final List a = scc.g("id", "respCode", "respDesc", ACSPConstants.STATUS);

    public static yxw c(xdx xdxVar, c cVar) {
        String str = null;
        Object obj = null;
        String str2 = null;
        Object obj2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                obj = l80.m.b(xdxVar, cVar);
            } else if (h2 == 2) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else {
                if (h2 != 3) {
                    return new yxw(str, obj, str2, obj2);
                }
                foe foeVar2 = l80.a;
                obj2 = ooc.y(xdxVar);
            }
        }
    }
}
