package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class l1g {
    public final kll a;
    public final oq7 b;
    public final mm6 c;
    public final LinkedHashMap d;
    public zwk e;

    public l1g(kll kllVar, oq7 oq7Var, mm6 mm6Var) {
        mm6Var.getClass();
        this.a = kllVar;
        this.b = oq7Var;
        this.c = mm6Var;
        this.d = new LinkedHashMap();
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.d;
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            zwk zwkVar = (zwk) linkedHashMap.get((mwk) it.next());
            if (zwkVar != null) {
                zwkVar.f.a();
            }
        }
        linkedHashMap.clear();
    }

    public final pjc b(mwk mwkVar) {
        xdr xdrVar;
        if (mwkVar == null) {
            return new fs(15, eml.d);
        }
        zwk zwkVar = (zwk) this.d.get(mwkVar);
        return (zwkVar == null || (xdrVar = zwkVar.e) == null) ? new fs(15, eml.d) : xdrVar;
    }
}
