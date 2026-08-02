package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class z0c {
    public static volatile z0c a;
    public static final z0c b;

    static {
        z0c z0cVar = new z0c();
        Map map = Collections.EMPTY_MAP;
        b = z0cVar;
    }

    public static z0c a() {
        z0c z0cVar;
        yym yymVar = yym.c;
        z0c z0cVar2 = a;
        if (z0cVar2 != null) {
            return z0cVar2;
        }
        synchronized (z0c.class) {
            try {
                z0cVar = a;
                if (z0cVar == null) {
                    Class cls = v0c.a;
                    z0c z0cVar3 = null;
                    if (cls != null) {
                        try {
                            z0cVar3 = (z0c) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    z0cVar = z0cVar3 != null ? z0cVar3 : b;
                    a = z0cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z0cVar;
    }
}
