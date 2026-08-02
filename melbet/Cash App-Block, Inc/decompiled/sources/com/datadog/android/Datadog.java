package com.datadog.android;

import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.NoOpInternalSdkCore;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.google.android.gms.dynamite.zzh;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class Datadog {
    public static final WorkLauncherImpl registry = new WorkLauncherImpl((InternalLogger) RuntimeUtilsKt.unboundInternalLogger);
    public static final zzh hashGenerator = new zzh(10);
    public static final int libraryVerbosity = Integer.MAX_VALUE;

    public static final InternalSdkCore getInstance(String str) {
        InternalSdkCore internalSdkCore;
        WorkLauncherImpl workLauncherImpl = registry;
        synchronized (workLauncherImpl) {
            if (str == null) {
                str = "_dd.sdk_core.default";
            }
            try {
                internalSdkCore = (InternalSdkCore) ((LinkedHashMap) workLauncherImpl.workTaskExecutor).get(str);
                if (internalSdkCore == null) {
                    DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 4, InternalLogger.Target.USER, new Datadog$getInstance$1$1(0, str, new Throwable().fillInStackTrace()), null, false, 56);
                    internalSdkCore = NoOpInternalSdkCore.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return internalSdkCore;
    }

    public static final boolean isInitialized() {
        boolean z;
        WorkLauncherImpl workLauncherImpl = registry;
        synchronized (workLauncherImpl) {
            z = ((InternalSdkCore) ((LinkedHashMap) workLauncherImpl.workTaskExecutor).get("_dd.sdk_core.default")) != null;
        }
        return z;
    }
}
