package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class efb {
    public final LinkedHashMap a = new LinkedHashMap();

    public final dfb a(rv8 rv8Var, dw8 dw8Var) {
        Object obj;
        dfb dfbVar;
        synchronized (this.a) {
            try {
                LinkedHashMap linkedHashMap = this.a;
                String str = dw8Var.a;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(str, obj2);
                }
                List list = (List) obj2;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((dfb) obj).b == rv8Var) {
                        break;
                    }
                }
                dfbVar = (dfb) obj;
                if (dfbVar == null) {
                    dfbVar = new dfb(rv8Var, dw8Var);
                    list.add(dfbVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dfbVar.b();
        return dfbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dfb b(rv8 rv8Var, dw8 dw8Var) {
        dfb dfbVar;
        synchronized (this.a) {
            try {
                List list = (List) this.a.get(dw8Var.a);
                dfbVar = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((dfb) next).b == rv8Var) {
                            dfbVar = next;
                            break;
                        }
                    }
                    dfbVar = dfbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dfbVar != null) {
            dfbVar.b();
        }
        return dfbVar;
    }
}
