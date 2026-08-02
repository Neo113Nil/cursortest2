package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class x0c {
    public static volatile x0c a;
    public static final x0c b;

    static {
        x0c x0cVar = new x0c();
        Map map = Collections.EMPTY_MAP;
        b = x0cVar;
    }

    public static x0c a() {
        x0c x0cVar;
        zym zymVar = zym.c;
        x0c x0cVar2 = a;
        if (x0cVar2 != null) {
            return x0cVar2;
        }
        synchronized (x0c.class) {
            try {
                x0cVar = a;
                if (x0cVar == null) {
                    Class cls = t0c.a;
                    x0c x0cVar3 = null;
                    if (cls != null) {
                        try {
                            x0cVar3 = (x0c) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    x0cVar = x0cVar3 != null ? x0cVar3 : b;
                    a = x0cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x0cVar;
    }
}
