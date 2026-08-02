package defpackage;

import com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class wkz {
    public static boolean a(LogDisplayConfig logDisplayConfig, ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cez) obj).a == logDisplayConfig) {
                break;
            }
        }
        cez cezVar = (cez) obj;
        if (cezVar != null) {
            return cezVar.b;
        }
        return false;
    }
}
