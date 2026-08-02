package defpackage;

import com.adjust.sdk.Adjust;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ubr {
    public static volatile gb1 a;

    public static gb1 a() {
        if (a == null) {
            synchronized (ubr.class) {
                try {
                    if (a == null) {
                        a = new gb1();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public static void b(jb51 jb51Var) {
        HashMap hashMap;
        gb1 a2 = a();
        synchronized (a2) {
            qst a3 = gb1.a();
            Map map = a2.a;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            String str = jb51Var.a;
            if (map.containsKey(str)) {
                str = (String) map.get(str);
            }
            synchronized (jb51Var) {
                hashMap = new HashMap(jb51Var.b);
            }
            a3.c(str, hashMap);
        }
        Adjust.getDefaultInstance().trackEvent(jb51Var);
    }
}
