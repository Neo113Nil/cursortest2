package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import java.util.Date;

/* loaded from: classes5.dex */
public abstract class X {
    public final Date a = new Date();

    public static CrashLogLevel a(int i) {
        switch (i) {
            case 2:
                return CrashLogLevel.INFO;
            case 3:
                return CrashLogLevel.DEBUG;
            case 4:
                return CrashLogLevel.INFO;
            case 5:
                return CrashLogLevel.WARNING;
            case 6:
                return CrashLogLevel.ERROR;
            case 7:
                return CrashLogLevel.DEBUG;
            default:
                return CrashLogLevel.ERROR;
        }
    }
}
