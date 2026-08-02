package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class znr0 {
    public final fga0 a;
    public final Map b = gw00.e(new Pair("corp_user", new qhq0(4, this)));

    public znr0(fga0 fga0Var) {
        this.a = fga0Var;
    }

    public final boolean a(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            sls slsVar = (sls) this.b.get((String) it.next());
            if (slsVar != null ? ((Boolean) slsVar.invoke()).booleanValue() : false) {
                return true;
            }
        }
        return false;
    }
}
