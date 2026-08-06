package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zq {
    public static volatile zq GWasM1elztuh;
    public static final zq Yi7zF1RB1;

    static {
        zq zqVar = new zq();
        Map map = Collections.EMPTY_MAP;
        Yi7zF1RB1 = zqVar;
    }

    public static zq GWasM1elztuh() {
        zq zqVar;
        ns0 ns0Var = ns0.X1lG3V04pd;
        zq zqVar2 = GWasM1elztuh;
        if (zqVar2 != null) {
            return zqVar2;
        }
        synchronized (zq.class) {
            try {
                zqVar = GWasM1elztuh;
                if (zqVar == null) {
                    Class cls = yq.GWasM1elztuh;
                    zq zqVar3 = null;
                    if (cls != null) {
                        try {
                            zqVar3 = (zq) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    zqVar = zqVar3 != null ? zqVar3 : Yi7zF1RB1;
                    GWasM1elztuh = zqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zqVar;
    }
}
