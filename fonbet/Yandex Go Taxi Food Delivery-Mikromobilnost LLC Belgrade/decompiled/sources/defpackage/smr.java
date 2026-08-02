package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class smr implements hs31 {
    public final Map a;

    public smr(Map map) {
        this.a = map;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        Object obj;
        Map map = this.a;
        yvf0 yvf0Var = (yvf0) map.get(cls);
        if (yvf0Var == null) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (cls.isAssignableFrom((Class) ((Map.Entry) obj).getKey())) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            yvf0Var = entry != null ? (yvf0) entry.getValue() : null;
            if (yvf0Var == null) {
                ny61.g(qv10.l(cls, "unknown model class "));
                return null;
            }
        }
        try {
            return (yr31) yvf0Var.get();
        } catch (Exception e) {
            LinkedHashMap linkedHashMap = zdz.a;
            ogb1.b("Error creating viewmodel " + cls + Extension.COLON_SPACE + e.getMessage());
            xfo.h(e.getMessage());
            return null;
        }
    }
}
