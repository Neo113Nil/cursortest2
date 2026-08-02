package com.datadog.android.rum;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.internal.monitor.NoOpAdvancedRumMonitor;
import com.squareup.contour.ContourLayout$geometry$1;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class GlobalRumMonitor {
    public static final LinkedHashMap registeredMonitors = new LinkedHashMap();

    public static final RumMonitor get(InternalSdkCore internalSdkCore) {
        RumMonitor rumMonitor;
        InternalLogger internalLogger;
        internalSdkCore.getClass();
        LinkedHashMap linkedHashMap = registeredMonitors;
        synchronized (linkedHashMap) {
            try {
                rumMonitor = (RumMonitor) linkedHashMap.get(internalSdkCore);
                if (rumMonitor == null) {
                    InternalSdkCore internalSdkCore2 = internalSdkCore instanceof InternalSdkCore ? internalSdkCore : null;
                    if (internalSdkCore2 != null && (internalLogger = internalSdkCore2.getInternalLogger()) != null) {
                        DBUtil.log$default(internalLogger, 4, InternalLogger.Target.USER, new ContourLayout$geometry$1(internalSdkCore, 15), null, false, 56);
                    }
                    rumMonitor = new NoOpAdvancedRumMonitor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rumMonitor;
    }
}
