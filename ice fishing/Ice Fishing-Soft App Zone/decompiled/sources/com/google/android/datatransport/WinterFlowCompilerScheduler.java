package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerScheduler implements ThreadFactory {
    public final Serializable WinterFlowCacheManagerAgent;
    public final ThreadFactory WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public WinterFlowCompilerScheduler() {
        this.WinterFlowRouterStructure = 0;
        this.WinterFlowHookDataSource = Executors.defaultThreadFactory();
        this.WinterFlowCacheManagerAgent = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.WinterFlowRouterStructure;
        Serializable serializable = this.WinterFlowCacheManagerAgent;
        ThreadFactory threadFactory = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Thread newThread = threadFactory.newThread(runnable);
                newThread.setDaemon(false);
                newThread.setName("connectionLostChecker-" + ((AtomicInteger) serializable));
                return newThread;
            default:
                Thread newThread2 = threadFactory.newThread(new WinterFlowDataSourceQuery(runnable, 2));
                newThread2.setName((String) serializable);
                return newThread2;
        }
    }

    public WinterFlowCompilerScheduler(String str) {
        this.WinterFlowRouterStructure = 1;
        this.WinterFlowHookDataSource = Executors.defaultThreadFactory();
        this.WinterFlowCacheManagerAgent = str;
    }
}
