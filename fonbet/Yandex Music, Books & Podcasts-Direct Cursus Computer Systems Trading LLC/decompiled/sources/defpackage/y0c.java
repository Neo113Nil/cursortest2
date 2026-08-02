package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y0c {
    public static volatile y0c a;
    public static final y0c b;

    static {
        y0c y0cVar = new y0c();
        Map map = Collections.EMPTY_MAP;
        b = y0cVar;
    }

    public static y0c a() {
        y0c y0cVar;
        y0c y0cVar2 = a;
        if (y0cVar2 != null) {
            return y0cVar2;
        }
        synchronized (y0c.class) {
            try {
                y0cVar = a;
                if (y0cVar == null) {
                    Class cls = u0c.a;
                    y0c y0cVar3 = null;
                    if (cls != null) {
                        try {
                            y0cVar3 = (y0c) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    y0cVar = y0cVar3 != null ? y0cVar3 : b;
                    a = y0cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y0cVar;
    }
}
