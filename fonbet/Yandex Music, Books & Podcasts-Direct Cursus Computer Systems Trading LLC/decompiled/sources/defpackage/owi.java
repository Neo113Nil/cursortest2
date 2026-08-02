package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class owi {
    public static final Logger d = Logger.getLogger(owi.class.getName());
    public static owi e;
    public String a = "unknown";
    public final LinkedHashSet b = new LinkedHashSet();
    public cee c = vsn.g;

    public final synchronized void a() {
        try {
            HashMap hashMap = new HashMap();
            String str = "unknown";
            Iterator it = this.b.iterator();
            char c = 0;
            while (it.hasNext()) {
                nwi nwiVar = (nwi) it.next();
                nwiVar.getClass();
                if (((nwi) hashMap.get("dns")) == null) {
                    hashMap.put("dns", nwiVar);
                }
                if (c < 5) {
                    str = "dns";
                    c = 5;
                }
            }
            this.c = cee.a(hashMap);
            this.a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
