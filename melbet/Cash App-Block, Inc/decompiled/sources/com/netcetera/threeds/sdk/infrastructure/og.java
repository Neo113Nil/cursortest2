package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class og {
    public static boolean ThreeDS2Service(Object... objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean getWarnings(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static <T> T ThreeDS2Service(T t, T t2) {
        return t != null ? t : t2;
    }
}
