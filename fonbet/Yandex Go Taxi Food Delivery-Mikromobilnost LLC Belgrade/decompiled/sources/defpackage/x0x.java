package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class x0x implements okx {
    public final LinkedHashMap a = new LinkedHashMap();

    public x0x(l1o l1oVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i4q0 i4q0Var = (i4q0) it.next();
            Iterator it2 = i4q0Var.f.iterator();
            while (it2.hasNext()) {
                this.a.put(it2.next(), i4q0Var.e.invoke(l1oVar));
            }
        }
    }

    @Override // defpackage.okx
    public final v0x a(Object obj) {
        okx okxVar = (okx) this.a.get(obj);
        if (okxVar != null) {
            return okxVar.a(obj);
        }
        return null;
    }
}
