package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ewd implements bse {
    public final hwd a;
    public final g06 b;

    public ewd(hwd hwdVar, g06 g06Var) {
        hwdVar.getClass();
        this.a = hwdVar;
        this.b = g06Var;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        d0o d0oVar = (d0o) uknVar.i;
        f9h n = this.b.n();
        b0o b = d0oVar.b();
        Iterator it = ((g9h) n.entrySet()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            b.d(str, (String) entry.getValue());
            if (str.equals("Authorization")) {
                z = true;
            }
        }
        if (z) {
            hwd hwdVar = this.a;
            hwdVar.getClass();
            b = (b0o) hwdVar.e.invoke(b, d0oVar);
        }
        return uknVar.f(b.b());
    }
}
