package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public final class xvd {
    public final Map a;

    static {
        e5b.a.getClass();
    }

    public xvd(Map map) {
        this.a = map;
    }

    public final String a(String str) {
        Map map = this.a;
        if (!map.containsKey(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                String str2 = (String) it.next();
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (lowerCase2.equals(lowerCase)) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public final String toString() {
        return "Headers(keyValues=" + this.a + ")";
    }
}
