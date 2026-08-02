package com.netcetera.threeds.sdk.infrastructure;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes5.dex */
public class ol {
    public static Date ThreeDS2Service(Date date, int i) {
        return ThreeDS2ServiceInstance(date, 5, i);
    }

    private static Date ThreeDS2ServiceInstance(Date date, int i, int i2) {
        ThreeDS2ServiceInstance(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i, i2);
        return calendar.getTime();
    }

    private static void ThreeDS2ServiceInstance(Date date) {
        oi.getWarnings(date != null, "The date must not be null", new Object[0]);
    }
}
