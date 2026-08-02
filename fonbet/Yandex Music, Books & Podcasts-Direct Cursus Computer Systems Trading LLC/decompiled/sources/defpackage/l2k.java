package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l2k {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();

    public final void a() {
        synchronized (this.a) {
            try {
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    oc9 oc9Var = (oc9) ((Map.Entry) it.next()).getValue();
                    ArrayList arrayList = oc9Var.e;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        oc9Var.getViewPager().g((dgu) it2.next());
                    }
                    arrayList.clear();
                }
                Iterator it3 = this.c.iterator();
                while (it3.hasNext()) {
                    k2k k2kVar = (k2k) it3.next();
                    oc9 oc9Var2 = (oc9) this.b.get(k2kVar.b);
                    if (oc9Var2 != null) {
                        k2kVar.a.c(oc9Var2);
                    }
                }
                this.b.clear();
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
