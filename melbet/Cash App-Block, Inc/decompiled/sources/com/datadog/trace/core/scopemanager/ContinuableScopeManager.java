package com.datadog.trace.core.scopemanager;

import androidx.camera.core.impl.utils.Exif;
import com.datadog.android.api.InternalLogger;
import com.datadog.trace.api.Config;
import com.datadog.trace.relocate.api.RatelimitedLogger;
import com.google.android.gms.auth.api.zbc;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class ContinuableScopeManager {
    public final zbc log;
    public final CopyOnWriteArrayList scopeListeners = new CopyOnWriteArrayList();
    public final Exif.AnonymousClass1 tlsScopeStack;

    static {
        int i = Config.INSTANCE.scopeIterationKeepAlive;
    }

    public ContinuableScopeManager(InternalLogger internalLogger) {
        new CopyOnWriteArrayList();
        zbc zbcVar = new zbc(4, "ContinuableScopeManager", internalLogger);
        this.log = zbcVar;
        new RatelimitedLogger(zbcVar, 1, TimeUnit.SECONDS);
        this.tlsScopeStack = new Exif.AnonymousClass1(5);
    }
}
