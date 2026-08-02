package com.datadog.trace.util;

import com.datadog.trace.api.Platform;
import com.datadog.trace.core.CoreTracer$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public abstract class PidHelper {
    public static final long PID_AS_LONG;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        String trim;
        long parseLong;
        if (Platform.isJavaVersionAtLeast(9, 0)) {
            try {
                trim = Strings.trim((String) ((CoreTracer$$ExternalSyntheticLambda1) Class.forName("com.datadog.trace.util.JDK9PidSupplier").getDeclaredConstructor(null).newInstance(null)).f$0.dynamicConfig.currentSnapshot);
            } catch (Throwable unused) {
            }
            trim.getClass();
            if (!trim.isEmpty()) {
                try {
                    parseLong = Long.parseLong(trim);
                } catch (NumberFormatException unused2) {
                }
                PID_AS_LONG = parseLong;
            }
            parseLong = 0;
            PID_AS_LONG = parseLong;
        }
        trim = "";
        trim.getClass();
        if (!trim.isEmpty()) {
        }
        parseLong = 0;
        PID_AS_LONG = parseLong;
    }
}
