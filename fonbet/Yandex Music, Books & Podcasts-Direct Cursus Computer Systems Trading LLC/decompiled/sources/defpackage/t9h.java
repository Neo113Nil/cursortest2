package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t9h {
    public static void a(Object obj, Object obj2) {
        q9h q9hVar = (q9h) obj;
        if (obj2 != null) {
            l1j.f();
            return;
        }
        if (q9hVar.isEmpty()) {
            return;
        }
        Iterator it = q9hVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static q9h b(Object obj, Object obj2) {
        q9h q9hVar = (q9h) obj;
        q9h q9hVar2 = (q9h) obj2;
        if (!q9hVar2.isEmpty()) {
            if (!q9hVar.a) {
                q9hVar = q9hVar.d();
            }
            q9hVar.c();
            if (!q9hVar2.isEmpty()) {
                q9hVar.putAll(q9hVar2);
            }
        }
        return q9hVar;
    }
}
