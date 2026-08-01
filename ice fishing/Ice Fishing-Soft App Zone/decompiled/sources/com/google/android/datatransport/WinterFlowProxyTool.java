package com.google.android.datatransport;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyTool implements ThreadFactory {
    public static final ThreadFactory WinterFlowVariableVersionControl = Executors.defaultThreadFactory();
    public final StrictMode.ThreadPolicy WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final AtomicLong WinterFlowRouterStructure = new AtomicLong();

    public WinterFlowProxyTool(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = WinterFlowVariableVersionControl.newThread(new WinterFlowControllerManager(6, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.WinterFlowHookDataSource + " Thread #" + this.WinterFlowRouterStructure.getAndIncrement());
        return newThread;
    }
}
