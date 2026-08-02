package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import com.google.android.gms.internal.measurement.zzlj;

/* loaded from: classes.dex */
public abstract class RuntimeUtilsKt {
    public static final zzlj unboundInternalLogger;

    static {
        InternalLogger.Companion.getClass();
        unboundInternalLogger = InternalLogger.Companion.UNBOUND;
    }
}
