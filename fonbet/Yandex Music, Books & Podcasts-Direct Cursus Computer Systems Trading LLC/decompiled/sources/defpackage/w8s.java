package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w8s {
    public final LinkedHashMap a = new LinkedHashMap();

    public final String a(String str, String str2) {
        String str3;
        synchronized (this.a) {
            Map map = (Map) this.a.get(str);
            str3 = map != null ? (String) map.get(str2) : null;
        }
        return str3;
    }

    public final void b(String str, String str2, String str3) {
        synchronized (this.a) {
            try {
                LinkedHashMap linkedHashMap = this.a;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new LinkedHashMap();
                    linkedHashMap.put(str, obj);
                }
                ((Map) obj).put(str2, str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
