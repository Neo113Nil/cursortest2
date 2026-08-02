package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public final class spc {
    public final as21 a;

    public spc(as21 as21Var) {
        this.a = as21Var;
    }

    public final boolean a(String str) {
        Collection values;
        if (str == null) {
            return true;
        }
        Map map = (Map) this.a.d("LAST_KNOWN_SUPPORT_SERVICES_BOT_GUID", uiw0.a);
        if (map != null && (values = map.values()) != null) {
            Collection collection = values;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (evu0.y((String) it.next(), str, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
