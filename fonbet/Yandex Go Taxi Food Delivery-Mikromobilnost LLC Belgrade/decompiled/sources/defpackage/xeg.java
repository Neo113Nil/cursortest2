package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class xeg implements b70 {
    public static final List a = scc.g("textStyle", C0553n3.g, "commonOverlays", "actions");

    public static reg c(xdx xdxVar, c cVar) {
        Object b;
        Object b2;
        Object b3;
        qeg qegVar = null;
        leg legVar = null;
        List list = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                ep60 a2 = l80.a(zeg.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b3 = null;
                } else {
                    b3 = a2.b(xdxVar, cVar);
                }
                qegVar = (qeg) b3;
            } else if (h2 == 1) {
                ep60 a3 = l80.a(teg.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a3.b(xdxVar, cVar);
                }
                legVar = (leg) b2;
            } else if (h2 == 2) {
                weg wegVar = weg.a;
                foe foeVar = l80.a;
                lqy lqyVar = new lqy(new ep60(wegVar, true));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b;
            } else {
                if (h2 != 3) {
                    return new reg(qegVar, legVar, list, arrayList);
                }
                seg segVar = seg.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(segVar, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            }
        }
    }
}
