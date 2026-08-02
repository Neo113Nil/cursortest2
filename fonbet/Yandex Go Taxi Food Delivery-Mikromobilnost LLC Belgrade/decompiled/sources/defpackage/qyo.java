package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class qyo {
    public static volatile qyo b;
    public static final qyo c = new qyo();
    public final Map a = Collections.EMPTY_MAP;

    public static qyo a() {
        qyo qyoVar;
        fvf0 fvf0Var = fvf0.c;
        qyo qyoVar2 = b;
        if (qyoVar2 != null) {
            return qyoVar2;
        }
        synchronized (qyo.class) {
            try {
                qyoVar = b;
                if (qyoVar == null) {
                    Class cls = kyo.a;
                    qyo qyoVar3 = null;
                    if (cls != null) {
                        try {
                            qyoVar3 = (qyo) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qyoVar = qyoVar3 != null ? qyoVar3 : c;
                    b = qyoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qyoVar;
    }
}
