package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class w71 {
    public static final b9xEq24R1 EljAMC1QTz;
    public static final String GWasM1elztuh;
    public static final long OOA6hdeuvCS;
    public static final int X1lG3V04pd;
    public static final long Yi7zF1RB1;
    public static final int xqGvceK5x;

    static {
        String str;
        int i = p71.GWasM1elztuh;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        GWasM1elztuh = str;
        Yi7zF1RB1 = o50.YZjbz8VdP5("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = p71.GWasM1elztuh;
        if (i2 < 2) {
            i2 = 2;
        }
        X1lG3V04pd = o50.eUH21U3apd(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        xqGvceK5x = o50.eUH21U3apd(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        OOA6hdeuvCS = TimeUnit.SECONDS.toNanos(o50.YZjbz8VdP5("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        EljAMC1QTz = b9xEq24R1.CMh55RymNfS;
    }
}
