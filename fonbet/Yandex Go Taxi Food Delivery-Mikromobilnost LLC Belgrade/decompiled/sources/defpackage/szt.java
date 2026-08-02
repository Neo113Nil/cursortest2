package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class szt {
    public final w53 a = new w53();

    public static void b(g0c g0cVar, String str) {
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m("Graph");
        e5z0Var.a(g8e.p(str, Extension.COLON_SPACE, g0cVar.d()), new Object[0]);
    }

    public final void a() {
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m("Graph");
        e5z0Var.a("start", new Object[0]);
        for (Map.Entry entry : this.a.entrySet()) {
            lfx lfxVar = (lfx) entry.getKey();
            d0u d0uVar = (d0u) entry.getValue();
            e5z0 e5z0Var2 = i5z0.a;
            e5z0Var2.m("Graph");
            e5z0Var2.a(qv10.h(d0uVar.b, ((g0c) lfxVar).d(), " count="), new Object[0]);
        }
        e5z0 e5z0Var3 = i5z0.a;
        e5z0Var3.m("Graph");
        e5z0Var3.a("end", new Object[0]);
    }
}
