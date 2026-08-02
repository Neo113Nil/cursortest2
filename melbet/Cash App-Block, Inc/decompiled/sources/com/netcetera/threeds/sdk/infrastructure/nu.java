package com.netcetera.threeds.sdk.infrastructure;

import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public final class nu {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;

    private static /* synthetic */ Object get(Object[] objArr) {
        nw nwVar = new nw(LoggerFactory.getLogger((Class<?>) objArr[0]));
        int i = ThreeDS2Service;
        int i2 = i & 89;
        int i3 = (i ^ 89) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            return nwVar;
        }
        throw null;
    }

    public static no getWarnings(Class<?> cls) {
        return (no) initialize(new Object[]{cls}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }
}
