package com.gamericefishpro.space.q4;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static volatile k a;
    public static final k b;

    static {
        k kVar = new k();
        Map map = Collections.EMPTY_MAP;
        b = kVar;
    }

    public static k a() {
        k kVar;
        q0 q0Var = q0.c;
        k kVar2 = a;
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (k.class) {
            try {
                kVar = a;
                if (kVar == null) {
                    Class cls = j.a;
                    k kVar3 = null;
                    if (cls != null) {
                        try {
                            kVar3 = (k) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    kVar = kVar3 != null ? kVar3 : b;
                    a = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }
}
