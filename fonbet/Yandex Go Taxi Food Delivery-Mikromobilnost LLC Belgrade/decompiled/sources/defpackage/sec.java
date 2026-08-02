package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class sec implements b70 {
    public static final List a = scc.g("angle", "relativeCenter", "relativeRadius", "colors");

    public static fec c(xdx xdxVar, c cVar) {
        Object b;
        Double d = null;
        hec hecVar = null;
        iec iecVar = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else if (h2 == 1) {
                hecVar = (hec) l80.a(uec.a).b(xdxVar, cVar);
            } else if (h2 == 2) {
                iecVar = (iec) l80.a(vec.a).b(xdxVar, cVar);
            } else {
                if (h2 != 3) {
                    return new fec(d.doubleValue(), hecVar, iecVar, arrayList);
                }
                ep60 a2 = l80.a(lec.a);
                arrayList = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b = null;
                    } else {
                        b = a2.b(xdxVar, cVar);
                    }
                    arrayList.add(b);
                }
                xdxVar.j();
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, fec fecVar) {
        bfxVar.A1("angle");
        l80.c.a(bfxVar, cVar, Double.valueOf(fecVar.a));
        bfxVar.A1("relativeCenter");
        l80.a(uec.a).a(bfxVar, cVar, fecVar.b);
        bfxVar.A1("relativeRadius");
        l80.a(vec.a).a(bfxVar, cVar, fecVar.c);
        bfxVar.A1("colors");
        ep60 a2 = l80.a(lec.a);
        ArrayList arrayList = fecVar.d;
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
