package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class tsu0 implements b70 {
    public static final List a = scc.g("type", "params");

    public static nsu0 c(xdx xdxVar, c cVar) {
        Object b;
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new nsu0(str, arrayList);
                }
                ep60 a2 = l80.a(usu0.a);
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

    public static void d(bfx bfxVar, c cVar, nsu0 nsu0Var) {
        bfxVar.A1("type");
        foe foeVar = l80.a;
        bfxVar.r0(nsu0Var.a);
        bfxVar.A1("params");
        om60 om60Var = new om60(l80.a(usu0.a));
        ArrayList arrayList = nsu0Var.b;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            om60Var.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }
}
