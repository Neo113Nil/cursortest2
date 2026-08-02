package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class rec implements b70 {
    public static final List a = scc.g("angle", "colors");

    public static eec c(xdx xdxVar, c cVar) {
        Object b;
        Double d = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new eec(d.doubleValue(), arrayList);
                }
                ep60 a2 = l80.a(nec.a);
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b = null;
                    } else {
                        b = a2.b(xdxVar, cVar);
                    }
                    z.add(b);
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, eec eecVar) {
        bfxVar.A1("angle");
        l80.c.a(bfxVar, cVar, Double.valueOf(eecVar.a));
        bfxVar.A1("colors");
        ep60 a2 = l80.a(nec.a);
        ArrayList arrayList = eecVar.b;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (obj == null) {
                bfxVar.k2();
            } else {
                a2.a(bfxVar, cVar, obj);
            }
        }
        bfxVar.j();
    }
}
