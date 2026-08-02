package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class qyt implements b70 {
    public static final List a = scc.g("__typename", "colors");

    public static oyt c(xdx xdxVar, c cVar) {
        kyt kytVar;
        j70 j70Var = cVar.a;
        lyt lytVar = null;
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    break;
                }
                ep60 a2 = l80.a(pyt.a);
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    z.add(a2.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = z;
            }
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("LinearGradient"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            List list = syt.a;
            Double d = null;
            while (xdxVar.h2(syt.a) == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            }
            kytVar = new kyt(d.doubleValue());
        } else {
            kytVar = null;
        }
        if (a.a(a.b("RadialGradient"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            lytVar = tyt.c(xdxVar, cVar);
        }
        return new oyt(str, arrayList, kytVar, lytVar);
    }
}
